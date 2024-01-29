package com.youcode.springsecuritylab.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "user_roles")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRole implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = true, updatable = true)
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id", insertable = true, updatable = true)
    private Role role;

}
