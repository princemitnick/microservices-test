package com.prince.material.service.app.vo;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;

}
