package com.epam.mikhail.hotel.model.factory;


import com.epam.mikhail.hotel.model.Room;
import com.epam.mikhail.hotel.model.RoomType;

import java.util.Random;
import java.util.UUID;

public class RoomFactory {

    static Random random = new Random();

    public static Room createRoom() {
        Room room = new Room(UUID.randomUUID(), random.nextInt(100) + 1);
        room.setRoomType(RoomType.createRandomRoomType());
        return room;
    }
}
