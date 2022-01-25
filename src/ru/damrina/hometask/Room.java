package ru.damrina.hometask;

public class Room {
    private boolean isPassage;

    public Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public boolean isPassage() {
        return isPassage;
    }

    @Override
    public String toString() {
        return "Комната {" +
                "isPassage=" + isPassage +
                '}';
    }
}
