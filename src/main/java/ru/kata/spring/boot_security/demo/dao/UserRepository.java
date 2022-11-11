package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;


public interface UserRepository {

    public List<User> getAll();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long id);
    public User getUser(long id);
    public User findByUsername(String username);
}
