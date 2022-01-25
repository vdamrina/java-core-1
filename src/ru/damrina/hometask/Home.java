package ru.damrina.hometask;

import java.util.Arrays;

public class Home {
    private int homeNumber;
    private Floor[] floors;

    public Home(int homeNumber, Floor[] floors) {
        this.homeNumber = homeNumber;
        this.floors = floors;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print(){
        System.out.println("Дом номер: " + homeNumber + " " + "\nКоличество этажей: " + floors.length);
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeNumber=" + homeNumber +
                ", floors=" + Arrays.toString(floors) +
                '}';
    }
}
