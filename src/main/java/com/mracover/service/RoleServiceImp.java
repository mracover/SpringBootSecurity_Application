package com.mracover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mracover.dao.RoleRepository;
import com.mracover.dao.RoleRepositoryImp;
import com.mracover.entity.Role;

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
