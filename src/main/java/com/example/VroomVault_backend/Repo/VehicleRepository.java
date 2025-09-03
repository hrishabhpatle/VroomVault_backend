package com.example.VroomVault_backend.Repo;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.VroomVault_backend.entities.Vehicle;
import com.example.VroomVault_backend.entities.VehicleStatus;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByOwnerId(Long ownerId);
    List<Vehicle> findByStatus(VehicleStatus status);
}
