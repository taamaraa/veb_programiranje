package mk.finki.ukim.mk.demo.service;

import mk.finki.ukim.mk.demo.model.User;

public interface AuthService {
    User login(String username, String password);
}
