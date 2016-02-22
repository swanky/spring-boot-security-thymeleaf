package io.github.swanky.service.user;

import java.util.Collection;
import java.util.Optional;

import io.github.swanky.domain.User;
import io.github.swanky.domain.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}