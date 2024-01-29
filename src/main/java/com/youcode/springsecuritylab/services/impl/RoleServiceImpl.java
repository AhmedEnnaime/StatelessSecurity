package com.youcode.springsecuritylab.services.impl;

import com.youcode.springsecuritylab.models.entities.Role;
import com.youcode.springsecuritylab.repositories.RoleRepository;
import com.youcode.springsecuritylab.services.RoleService;

import java.util.List;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private static final Logger LOG = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> findAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Role findDefaultRole() {
        return findAllRole().stream().findFirst().orElse(null);
    }

    @Override
    public Role findRoleByName(String role) {
        return findAllRole().stream().filter(r -> r.getName().equals(role)).findFirst().orElse(null);
    }
}
