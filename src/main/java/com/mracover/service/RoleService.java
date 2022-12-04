package com.mracover.service;

import com.mracover.entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRoles();
    public List<Role> findByIdRoles(List<Long> id);
}
