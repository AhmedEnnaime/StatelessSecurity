package com.youcode.springsecuritylab.security;

import java.util.Collection;

import com.youcode.springsecuritylab.models.entities.User;
import com.youcode.springsecuritylab.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SecurityPrincipal {
    private static SecurityPrincipal securityPrincipal = null;

    private Authentication principal = SecurityContextHolder.getContext().getAuthentication();

    private static UserServiceImpl userService;

    @Autowired
    private SecurityPrincipal(UserServiceImpl userService) {
        this.userService = userService;
    }

    public static SecurityPrincipal getInstance() {
        securityPrincipal = new SecurityPrincipal(userService);
        return securityPrincipal;
    }

    public User getLoggedInPrincipal() {
        if (principal != null) {
            UserDetails loggedInPrincipal = (UserDetails) principal.getPrincipal();
            return userService.findByUsername(loggedInPrincipal.getUsername());
        }
        return null;
    }

    public Collection<?> getLoggedInPrincipalAuthorities() {
        return ((UserDetails) principal.getPrincipal()).getAuthorities();
    }
}
