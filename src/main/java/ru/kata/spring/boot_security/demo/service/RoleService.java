package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRoles();
    public List<Role> findByIdRoles(List<Long> id);
}
