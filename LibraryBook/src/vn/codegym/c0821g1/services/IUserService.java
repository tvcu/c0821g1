package vn.codegym.c0821g1.services;

import vn.codegym.c0821g1.model.User;
import vn.codegym.c0821g1.repository.IUserRepository;
import vn.codegym.c0821g1.repository.UserRepository;

import java.util.List;

public interface IUserService {

    User getById(long id) throws Exception;

    List<User> getUsers() throws Exception;

    void addUser(User user) throws Exception;


    void updateUser(User user) throws Exception;
}
