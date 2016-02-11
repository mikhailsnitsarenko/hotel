package com.epam.mikhail.hotel.model;

import java.util.Random;
import java.util.UUID;

public class RoomType extends BaseEntity {

    public static final RoomType STANDART = new RoomType(UUID.randomUUID(), "STANDART");
    public static final RoomType SUPERIOR = new RoomType(UUID.randomUUID(), "SUPERIOR");
    public static final RoomType LUXE = new RoomType(UUID.randomUUID(), "LUXE");
    public static final RoomType APARTMENT = new RoomType(UUID.randomUUID(), "APARTMENT");
    public static final RoomType VIPSUITE = new RoomType(UUID.randomUUID(), "VIPSUITE");
    public static final RoomType FAMILYROOM = new RoomType(UUID.randomUUID(), "FAMILYROOM");
    private static final Random RANDOM = new Random();
    String title;

    public RoomType() {
    }

    public RoomType(UUID uuid, String title) {
        super(uuid);
        this.title = title;
    }

    public static RoomType createRandomRoomType() {
        int value = RANDOM.nextInt(6);
        if (value == 0) return RoomType.STANDART;
        if (value == 1) return RoomType.SUPERIOR;
        if (value == 2) return RoomType.LUXE;
        if (value == 3) return RoomType.APARTMENT;
        if (value == 4) return RoomType.VIPSUITE;
        if (value == 5) return RoomType.FAMILYROOM;
        return null;
    }
}

