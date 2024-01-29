package com.youcode.springsecuritylab.services;

import com.youcode.springsecuritylab.models.entities.Role;

import java.util.List;

public interface RoleService {
    Role save(Role role);
    List<Role> findAllRole();
    Role findDefaultRole();
    Role findRoleByName(String role);
}
