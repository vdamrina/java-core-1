package ru.damrina.hometask;

/**
 * Представить в виде классов и их композиции следующую модель.
 *
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 *
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 *
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 *
 * - Каждая комната содержит поле проходная она или нет (boolean).
 *
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 *
 * Например, метод print класса этаж должен выводить на консоль:
 *
 * “Этаж 2, количество квартир 18”
 *
 * Создание всех объектов вынести в отдельный класс с методом main.
 *
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class HomeTaskRunner {
    public static void main(String[] args) {

        Room room1 = new Room(true);
        Room room2 = new Room(false );
        Room[] roomsFirst = new Room[]{room1, room2};

        Flat flat1 = new Flat(1, roomsFirst);

        Room room3 = new Room(true);
        Room room4 = new Room(true);
        Room[] roomsSecond = new Room[]{room3, room4};

        Flat flat2 = new Flat(2, roomsSecond);

        Room room5 = new Room(true);
        Room room6 = new Room(true);
        Room[] roomsThird = new Room[]{room5, room6};

        Flat flat3 = new Flat(3, roomsThird);

        Flat[] flats = new Flat[]{flat1, flat2, flat3};

        Floor floor = new Floor(1, flats);

        Floor[] floors = new Floor[]{floor};

        Home home = new Home(18, floors);

        home.print();
        printAllInformation(home);
    }

    public static void printAllInformation(Home home){
        System.out.println(home.toString());
    }
}
