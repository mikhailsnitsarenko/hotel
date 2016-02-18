package com.epam.mikhail.hotel;


import com.epam.mikhail.hotel.model.Room;
import com.epam.mikhail.hotel.model.factory.RoomFactory;

public class Runner {


    public static void main(String[] args) {

        Room room = RoomFactory.createRoom();
        System.out.println(room);
    }

}
