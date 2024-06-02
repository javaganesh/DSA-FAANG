package com.dsa.designpaatern.LLD.ParkingLot;


import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double parkingFee;

    public ParkingTicket(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    // Method to calculate parking duration in hours
    public double calculateParkingDurationInHours() {
        if (entryTime != null && exitTime != null) {
            Duration duration = Duration.between(entryTime, exitTime);
            return duration.toHours(); // Convert Duration to hours
        } else {
            return 0; // Handle invalid times
        }
    }

    // Method to calculate parking fee based on duration and rate
    public double calculateParkingFee(double hourlyRate) {
        double durationInHours = calculateParkingDurationInHours();
        return durationInHours * hourlyRate;
    }
}

