package com.prince.material.service.app.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long materialId;

    private String model;
    private String manufacturer;

    @Column(nullable = false, unique = true)
    private String serialNumber;
    private Long userId;



}
