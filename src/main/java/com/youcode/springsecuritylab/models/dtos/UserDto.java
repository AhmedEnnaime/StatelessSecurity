package com.youcode.springsecuritylab.models.dtos;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private String username;

    private String password;

    private String entityNo;

    private String firstname;

    private String lastname;

    private String initial;

    private String idNumber;

    private Date startDate;

    private Date endDate;

    private String email;

    private String mobile;

    private List<String> roleList = new ArrayList<>();
}
