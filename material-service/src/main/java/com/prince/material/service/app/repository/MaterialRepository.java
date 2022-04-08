package com.prince.material.service.app.repository;

import com.prince.material.service.app.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {

    List<Material> getMaterialsByUserId(Long userId);
}
