package com.prince.user.service.vo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Material {

    private Long materialId;

    private String model;
    private String manufacturer;

    private String serialNumber;
}
