package ru.ivmit.repositories;

import ru.ivmit.models.User;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    void safe(User user);
    boolean isExists(String name, String password);
}
