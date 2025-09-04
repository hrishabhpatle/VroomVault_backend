package com.example.VroomVault_backend.Services;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.VroomVault_backend.Repo.UserRepository;
import com.example.VroomVault_backend.entities.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Find user by email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    // Save user without touching password
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Save user with password update
    public User saveUserWithPassword(User user, String rawPassword, BCryptPasswordEncoder encoder) {
        user.setPassword(encoder.encode(rawPassword));
        return userRepository.save(user);
    }
}
