package ru.damrina.hometask;

import java.util.Arrays;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat(int roomNumber, Room[] rooms) {
        this.flatNumber = roomNumber;
        this.rooms = rooms;
    }

    public int getRoomNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print(){
        System.out.println("Квартира номер: " + flatNumber + " " + "\nКоличество комнат: " + rooms.length);
    }


    @Override
    public String toString() {
        return "Flat{" +
                "flatNumber=" + flatNumber +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
