package mk.finki.ukim.mk.demo.service;

import mk.finki.ukim.mk.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import mk.finki.ukim.mk.demo.model.enumarations.Role;

public interface UserService extends UserDetailsService {
    User register(String username, String password, String repeatPassword, String name, String surname, Role role);
}
