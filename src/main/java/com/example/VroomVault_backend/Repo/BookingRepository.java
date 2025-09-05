package com.example.VroomVault_backend.Repo;


 import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.VroomVault_backend.entities.Booking;
public interface BookingRepository extends JpaRepository <Booking, Long> {

}
