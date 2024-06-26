package com.allesys.findmeworks.service.UserService;

import java.util.List;
import java.util.UUID;

import com.allesys.findmeworks.entity.User;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(UUID id);
    User updateUser(UUID id, User user);
    void deleteUser(UUID id);
    void removeLocationFromUser(UUID userId, UUID locationId);
}
