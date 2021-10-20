package vn.codegym.c0821g1.services;

import vn.codegym.c0821g1.model.User;
import vn.codegym.c0821g1.repository.IUserRepository;
import vn.codegym.c0821g1.repository.UserRepository;

public interface IUserService {
    void addUser(User user) throws Exception;
    
}
