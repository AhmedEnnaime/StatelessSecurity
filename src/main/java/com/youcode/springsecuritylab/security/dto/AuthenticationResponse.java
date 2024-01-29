package com.youcode.springsecuritylab.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class AuthenticationResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;

    private String token;
    private String refresh;

    public AuthenticationResponse(String token) {
        this.token = token;
        this.refresh = null;
    }
}
