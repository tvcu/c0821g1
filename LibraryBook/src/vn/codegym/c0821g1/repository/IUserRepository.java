package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.model.User;

public interface IUserRepository {
    User getById(long id);

    void add(User user);

}
