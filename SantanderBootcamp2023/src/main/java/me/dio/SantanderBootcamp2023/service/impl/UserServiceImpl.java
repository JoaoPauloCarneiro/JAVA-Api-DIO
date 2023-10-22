package me.dio.SantanderBootcamp2023.service.impl;

import me.dio.SantanderBootcamp2023.Repository.UserRepository;
import me.dio.SantanderBootcamp2023.model.User;
import me.dio.SantanderBootcamp2023.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("Usuário já Existe!!!!!!");
        }
        return userRepository.save(userToCreate);
    }
}
