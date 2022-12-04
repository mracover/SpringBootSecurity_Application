package com.mracover.service;

import com.mracover.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User getById(long id);
    public void deleteUser(long id);
    public void saveUser(User user);
    public void updateUser(User user);
    public User findByUsername(String username);
}
