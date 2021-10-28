package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.exception.LibraryBookException;
import vn.codegym.c0821g1.model.Role;
import vn.codegym.c0821g1.model.User;
import vn.codegym.c0821g1.model.UserStatus;
import vn.codegym.c0821g1.utils.CSVFile;
import vn.codegym.c0821g1.utils.DateUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class UserRepository implements IUserRepository {
    private List<User> userList;
    private final String USER_PATH = "data\\users.csv";

    public UserRepository() {
        userList = getUsers();
    }

    @Override
    public User getById(long id) {
        for (User user : userList) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
        List<User> newUserList = new ArrayList<>();
        try {
            List<String> records = CSVFile.read(USER_PATH);
            for (String record : records) {
                newUserList.add(new User(record));
            }
            return userList = newUserList;
        } catch (IOException ex) {
            throw new LibraryBookException("getUsers error");
        }

    }

    @Override
    public boolean exist(long id) {
        return getById(id) != null;
    }

    @Override
    public void add(User newUser) throws IOException {
        userList.add(newUser);
        CSVFile.write(USER_PATH, userList);
    }

    @Override
    public void update(User user) {
        User oldUser = getById(user.getId());
        User.transferFields(oldUser, user);
    }

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        try {
            userRepository.add(new User(System.currentTimeMillis(), "CU Tran", UserStatus.AVAILABLE, Role.USER, DateUtils.stringToDate("12-10-2021 00:00:00"), "0987654321", "Ha Tinh"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<User> list = userRepository.getUsers();
        System.out.println(list);
    }
}
