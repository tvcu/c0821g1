package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.model.User;

import java.io.IOException;
import java.util.List;

public interface IUserRepository {
    User getById(long id);

    List<User> getUsers() throws IOException;

    boolean exist(long id);

    void add(User newUser) throws IOException;

   //void delete(long id);

    void update(User user);

}
