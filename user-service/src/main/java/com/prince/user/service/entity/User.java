package com.prince.user.service.entity;


import com.prince.user.service.vo.Material;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @SequenceGenerator(
            sequenceName = "user_sequence",
            name = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long userId;
    private String firstName;
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private Long departmentId;


}
