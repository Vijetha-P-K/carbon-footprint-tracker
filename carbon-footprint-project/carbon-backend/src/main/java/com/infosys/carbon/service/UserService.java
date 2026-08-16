package com.infosys.carbon.service;

import com.infosys.carbon.entity.User;
import com.infosys.carbon.repository.UserRepository;
import com.infosys.carbon.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Register
    public User registerUser(User user) {

        // Encrypt password before saving it to the database
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    // Login
    public String login(String email, String password) {

        Optional<User> userOpt = userRepository.findByEmail(email);

        if (userOpt.isPresent() &&
                passwordEncoder.matches(password, userOpt.get().getPassword())) {

            return jwtUtil.generateToken(email);
        }

        throw new RuntimeException("Invalid email or password");
    }
}