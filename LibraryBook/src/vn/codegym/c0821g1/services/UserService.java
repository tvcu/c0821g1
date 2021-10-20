package vn.codegym.c0821g1.services;

import vn.codegym.c0821g1.model.User;
import vn.codegym.c0821g1.repository.IUserRepository;
import vn.codegym.c0821g1.repository.UserRepository;

public class UserService implements IUserService {
    private IUserRepository userRepository;

    public UserService() {
        userRepository = new UserRepository();
    }


    @Override
    public void addUser(User newUser) throws Exception {
       User user = userRepository.getById(newUser.getId());
        if (user != null)
            throw new Exception("Nguoi ton tai nguoi dung");
        userRepository.add(newUser);
    }
}
