package com.rob;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rob.entity.PlantPhoto;

public interface PlantRepository extends JpaRepository<PlantPhoto, Long> {

}
