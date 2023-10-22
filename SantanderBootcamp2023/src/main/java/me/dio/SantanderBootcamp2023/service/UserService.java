package me.dio.SantanderBootcamp2023.service;

import me.dio.SantanderBootcamp2023.model.User;

public interface UserService {
    User findById (Long id);

    User create (User userToCreate);
}
