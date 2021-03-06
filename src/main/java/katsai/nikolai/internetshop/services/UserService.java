package katsai.nikolai.internetshop.services;

import java.util.List;
import java.util.Optional;

import katsai.nikolai.internetshop.exceptions.AuthenticationException;
import katsai.nikolai.internetshop.models.User;

public interface UserService {
    User add(User user);

    User get(Long userId);

    User update(User user);

    User delete(Long userId);

    User login(String login, String password) throws AuthenticationException;

    List<User> getAllUsers();

    Optional<User> getByToken(String token);
}
