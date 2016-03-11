package com.epam.mikhail.hotel.model;

import java.util.Random;
import java.util.UUID;

public class RoomType extends Room {

    public static final RoomType STANDART = new RoomType(UUID.randomUUID(), 1, 2, 15, "STANDART");
    public static final RoomType SUPERIOR = new RoomType(UUID.randomUUID(), 1, 2, 18, "SUPERIOR");
    public static final RoomType LUXE = new RoomType(UUID.randomUUID(), 2, 2, 30, "LUXE");
    public static final RoomType APARTMENT = new RoomType(UUID.randomUUID(), 3, 2, 45, "APARTMENT");
    public static final RoomType VIPSUITE = new RoomType(UUID.randomUUID(), 4, 4, 60, "VIPSUITE");
    public static final RoomType FAMILYROOM = new RoomType(UUID.randomUUID(), 2, 4, 32, "FAMILYROOM");
    private static final Random RANDOM = new Random();
    private String title;

    public RoomType() {
    }

    public RoomType(UUID uuid, int numberOfRooms, int numberOfPersons, int roomSize, String title) {
        super(uuid, numberOfRooms, numberOfPersons, roomSize);
        this.title = title;
    }

    public static RoomType createRandomRoomType() {
        int value = RANDOM.nextInt(6);
        if (value == 0) return RoomType.STANDART;
        else if (value == 1) return RoomType.SUPERIOR;
        else if (value == 2) return RoomType.LUXE;
        else if (value == 3) return RoomType.APARTMENT;
        else if (value == 4) return RoomType.VIPSUITE;
        else if (value == 5) return RoomType.FAMILYROOM;
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

