package org.example.rest_api;

import org.example.rest_api.model.User;
import org.example.rest_api.repository.UserRepository;
import org.example.rest_api.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddUser() {
        User user = new User();
        // Установка параметров пользователя

        when(userRepository.save(user)).thenReturn(user);
        User createdUser = userService.addUser(user);

        assertNotNull(createdUser);
    }
}
