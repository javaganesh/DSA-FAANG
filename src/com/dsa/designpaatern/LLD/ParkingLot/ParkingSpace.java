package com.dsa.designpaatern.LLD.ParkingLot;

public class ParkingSpace {
    private int number;
    private ParkingType type;

    public ParkingSpace(int number, ParkingType type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingType getType() {
        return type;
    }

    public void setType(ParkingType type) {
        this.type = type;
    }
}
