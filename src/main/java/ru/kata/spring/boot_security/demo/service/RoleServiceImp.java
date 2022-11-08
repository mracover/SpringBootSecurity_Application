package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleRepository;
import ru.kata.spring.boot_security.demo.dao.RoleRepositoryImp;
import ru.kata.spring.boot_security.demo.entity.Role;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
    private final RoleRepository roleRepository;
    @Autowired
    public RoleServiceImp(RoleRepositoryImp roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional
    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    @Transactional
    public List<Role> findByIdRoles(List<Long> id) {
        return roleRepository.findByIdRoles(id);
    }
}
