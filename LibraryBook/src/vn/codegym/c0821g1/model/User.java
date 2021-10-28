package vn.codegym.c0821g1.model;

import vn.codegym.c0821g1.utils.DateUtils;

import java.util.Date;

public class User {
    private long id;
    private String fullName;
    private UserStatus status;
    private Role role;
    private Date birthDay;
    private String phoneNumber;
    private String address;

    public User(long id, String fullName, Date birthDay, String phoneNumber, String address) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(long id, String fullName, UserStatus status, Role role, Date birthDay, String phoneNumber, String address) {
        this.id = id;
        this.fullName = fullName;
        this.status = status;
        this.role = role;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(String raw) {
        String[] fields = raw.split(",");
        id = Long.parseLong(fields[0]);
        fullName = fields[1];
        status = UserStatus.fromValue(Integer.parseInt(fields[2]));
        role = Role.fromValue(fields[3]);
        birthDay = DateUtils.stringToDate(fields[4]);
        phoneNumber = fields[5];
        address = fields[6];
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%d,%s,%s,%s,%s",
                id,
                fullName,
                status.getValue(),
                role.getValue(),
                DateUtils.dateToString(birthDay),
                phoneNumber, address);
    }

    public static void transferFields(User oldUser, User newUser) {
        oldUser.id = newUser.id;
        oldUser.status = newUser.status;
        oldUser.fullName = newUser.fullName;
        oldUser.birthDay = newUser.birthDay;
        oldUser.phoneNumber = newUser.phoneNumber;
        oldUser.address = newUser.address;

    }
}
