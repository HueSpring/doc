package com.demo.role;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by Hue on 11/3/2016.
 */
public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);
}
