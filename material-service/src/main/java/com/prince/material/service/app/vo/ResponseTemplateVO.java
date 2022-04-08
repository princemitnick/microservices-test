package com.prince.material.service.app.vo;


import com.prince.material.service.app.entity.Material;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseTemplateVO {

    {
        materials = new ArrayList<>();
    }
    private User user;

    private List<Material> materials;
}
