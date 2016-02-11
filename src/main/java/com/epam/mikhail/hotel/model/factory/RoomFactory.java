package com.epam.mikhail.hotel.model.factory;


import com.epam.mikhail.hotel.model.Room;
import com.epam.mikhail.hotel.model.RoomType;

import java.util.Random;
import java.util.UUID;

public class RoomFactory {

    public static Room createRoom() {
        Random random = new Random();
        Room room = new Room(UUID.randomUUID());
        room.setRoomType(RoomType.createRandomRoomType());
        room.setNumberOfRooms(checkNumberOfRooms(room.getRoomType()));
        room.setRoomSize(checkRoomSize(room.getRoomType()));
        room.setNumberOfPersons(random.nextInt(6) + 1);
        return room;
    }

    private static int checkNumberOfRooms(RoomType roomType) {
        if (roomType == RoomType.STANDART || roomType == RoomType.SUPERIOR) return 1;
        if (roomType == RoomType.LUXE || roomType == RoomType.FAMILYROOM) return 2;
        if (roomType == RoomType.APARTMENT) return 3;
        if (roomType == RoomType.VIPSUITE) return 4;
        return 0;
    }

    private static int checkRoomSize(RoomType roomType) {
        if (roomType == RoomType.STANDART) return 15;
        if (roomType == RoomType.SUPERIOR) return 18;
        if (roomType == RoomType.LUXE) return 30;
        if (roomType == RoomType.FAMILYROOM) return 32;
        if (roomType == RoomType.APARTMENT) return 45;
        if (roomType == RoomType.VIPSUITE) return 60;
        return 0;
    }
}
