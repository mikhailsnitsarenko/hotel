package com.epam.mikhail.hotel.model;

import java.util.UUID;

public class Room extends BaseEntity {

    private String roomType;
    private int numberOfRooms;
    private int numberOfPersons;
    private int roomSize;

    public Room() {
    }

    public Room(UUID uuid) {
        super(uuid);
    }
}
