package com.example.VroomVault_backend.Repo;
 
 import org.springframework.data.jpa.repository.JpaRepository;

import com.example.VroomVault_backend.entities.OwnerDetails;

public interface OwnerDetailsRepository extends JpaRepository<OwnerDetails, Long> {
    OwnerDetails findByUserId(Long userId);
}
