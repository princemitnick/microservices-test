package com.prince.user.service.vo;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {


    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
