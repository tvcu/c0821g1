package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private List<User> userList;

    public UserRepository() {
        userList = new ArrayList<>();
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
    public void add(User user) {
        userList.add(user);
    }

}
