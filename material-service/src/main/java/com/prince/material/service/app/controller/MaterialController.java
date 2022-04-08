package com.prince.material.service.app.controller;


import com.prince.material.service.app.entity.Material;
import com.prince.material.service.app.service.MaterialService;
import com.prince.material.service.app.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/materials")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> getAllMaterials(){
        return materialService.getAllMaterials();
    }

    @PostMapping("/save")
    public Material saveMaterial(@RequestBody Material material){
        return materialService.saveMaterial(material);
    }

    @GetMapping("/{id}")
    public Material getOneMaterial(@PathVariable("id") Long id){
        return materialService.getOneMaterial(id);
    }

    @GetMapping("/w-m/{id}")
    public ResponseTemplateVO getUserWithMaterials(@PathVariable("id") Long id){
        return materialService.getMaterialWithUser(id);
    }
}

