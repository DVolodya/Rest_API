package org.example.rest_api.service;


import org.example.rest_api.model.User;
import org.example.rest_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        // Валидация и добавление пользователя
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User user) {
        // Обновление информации о пользователе
        user.setId(id);
        return userRepository.save(user);
    }
}

