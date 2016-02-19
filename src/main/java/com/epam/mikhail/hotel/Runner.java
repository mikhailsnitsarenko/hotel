package com.epam.mikhail.hotel;


import com.epam.mikhail.hotel.model.Room;
import com.epam.mikhail.hotel.model.compare.SortedRoomsById;
import com.epam.mikhail.hotel.model.factory.RoomFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

        List<Room> rooms = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Room room = RoomFactory.createRoom();
            rooms.add(room);
        }

        rooms.forEach(System.out::println);
        Collections.sort(rooms, new SortedRoomsById());
        rooms.forEach(System.out::println);
    }

}
