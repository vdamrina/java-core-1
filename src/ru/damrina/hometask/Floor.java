package ru.damrina.hometask;

import java.util.Arrays;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print(){
        System.out.println("Этаж номер: " + floorNumber + " " + "\nКоличество квартир: " + flats.length);
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorNumber=" + floorNumber +
                ", flats=" + Arrays.toString(flats) +
                '}';
    }
}
