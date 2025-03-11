package com.rd.abstraction.service;


import com.rd.abstraction.model.User;
import com.rd.abstraction.repository.UserRepository;

public class UserService extends BaseService {
    private UserRepository userRepository = new UserRepository();

    public void registerUser(String username, String password) {
        userRepository.save(new User(username, password));
    }

    public User loginUser(String username, String password) {
        User user = userRepository.getUser(username);
        return (user != null && user.getPassword().equals(password)) ? user : null;
    }

    @Override
    public void execute() {
        System.out.println("UserService is running...");
    }
}
