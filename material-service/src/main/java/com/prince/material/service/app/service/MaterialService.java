package com.prince.material.service.app.service;

import com.prince.material.service.app.entity.Material;
import com.prince.material.service.app.vo.ResponseTemplateVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface MaterialService {

    Material saveMaterial(Material material);

    Material getOneMaterial(Long materialId);

    List<Material> getAllMaterials();

    ResponseTemplateVO getMaterialWithUser(Long userId);
}
