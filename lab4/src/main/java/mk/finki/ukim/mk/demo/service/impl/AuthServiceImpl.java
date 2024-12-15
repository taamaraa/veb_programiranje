package mk.finki.ukim.mk.demo.service.impl;

import mk.finki.ukim.mk.demo.model.User;
import mk.finki.ukim.mk.demo.repository.jpa.UserRepository;
import mk.finki.ukim.mk.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password).get();
    }
}
