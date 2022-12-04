package com.mracover.dao;

import com.mracover.entity.Role;

import java.util.List;


public interface RoleRepository {

    public List<Role> getAllRoles();
    public List<Role> findByIdRoles(List<Long> id);
}
