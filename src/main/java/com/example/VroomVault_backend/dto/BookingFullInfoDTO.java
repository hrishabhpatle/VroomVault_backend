package com.example.VroomVault_backend.dto;
 
import lombok.Data;

import java.time.LocalDate;

import com.example.VroomVault_backend.entities.BookingStatus;

@Data
public class BookingFullInfoDTO {

    // Booking Info
    private Long bookingId;
    private LocalDate startDate;
    private LocalDate endDate;
    private BookingStatus status;

    // User Info (Renter)
    private String renterName;
    private String renterPhone;
    private String renterEmail;

    // Vehicle Info
    private String vehicleTitle;
    private String vehicleNumberPlate;
}
