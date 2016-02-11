package com.epam.mikhail.hotel.model.factory;


import com.epam.mikhail.hotel.model.Room;
import com.epam.mikhail.hotel.model.RoomType;

import java.util.Random;
import java.util.UUID;

public class RoomFactory {

    private static Random RANDOM = new Random();

    public static Room createRoom() {
        Room room = new Room(UUID.randomUUID());
        room.setRoomType(RoomType.createRandomRoomType());
        room.setNumberOfRooms(checkNumberOfRooms(room.getRoomType()));
        room.setRoomSize(checkRoomSize(room.getRoomType()));
        room.setNumberOfPersons(checkNumberOfPersons(room.getRoomType()));
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

    private static int checkNumberOfPersons(RoomType roomType) {
        if (roomType == RoomType.STANDART || roomType == RoomType.SUPERIOR || roomType == RoomType.LUXE || roomType == RoomType.APARTMENT)
            return RANDOM.nextInt(2) + 1;
        if (roomType == RoomType.FAMILYROOM || roomType == RoomType.VIPSUITE)
            return RANDOM.nextInt(4) + 1;
        return 0;
    }
}
