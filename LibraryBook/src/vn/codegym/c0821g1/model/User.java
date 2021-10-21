package vn.codegym.c0821g1.model;

public class User {
    private long id;
    private String fullName;
    private UserStatus status;
    private Role role;
    private int birthDay;
    private String phoneNumber;
    private String address;

    public User(long id, String fullName, int birthDay, String phoneNumber, String address) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(long id, String fullName, UserStatus status, Role role, int birthDay, String phoneNumber, String address) {
        this.id = id;
        this.fullName = fullName;
        this.status = status;
        this.role = role;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
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
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", status=" + status +
                ", role=" + role +
                ", birthDay=" + birthDay +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
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
