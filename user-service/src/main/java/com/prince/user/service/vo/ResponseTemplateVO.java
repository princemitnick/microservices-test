package com.prince.user.service.vo;

import com.prince.user.service.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;
    private Material material;

}
