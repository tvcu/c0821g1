package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.model.User;

import java.util.List;

public interface IUserRepository {
    User getById(long id);

    List<User> getUsers();

    boolean exist(long id);

    void add(User newUser);

   //void delete(long id);

    void update(User user);

}
