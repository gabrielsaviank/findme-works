package com.allesys.findmeworks.service.UserService;

import java.util.List;
import java.util.UUID;

import com.allesys.findmeworks.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allesys.findmeworks.entity.User;
import com.allesys.findmeworks.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(UUID id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser == null) {
            return null;
        }
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setPhone(user.getPhone());
        existingUser.setIsServiceProvider(user.getIsServiceProvider());
        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
