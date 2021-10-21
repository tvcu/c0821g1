package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private List<User> userList;

    public UserRepository() {
        userList = new ArrayList<>();
        userList.add(new User(1,"Cu Tran",1992,"0387747909","Ha Tinh"));
        userList.add(new User(2,"Cu Tran",1992,"0387747909","Ha Tinh"));
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
        return userList;
    }

    @Override
    public boolean exist(long id) {
        return getById(id) != null;
    }

    @Override
    public void add(User newUser) {
        userList.add(newUser);
    }

    @Override
    public void update(User user) {
        User oldUser = getById(user.getId());
        User.transferFields(oldUser, user);
    }

}
