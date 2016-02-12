package com.epam.mikhail.hotel.model;

import java.util.UUID;

public class Room extends BaseEntity {

    private RoomType roomType;
    private int numberOfRooms;
    private int numberOfPersons;
    private int roomSize;

    public Room() {
    }

    public Room(UUID uuid) {
        super(uuid);
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        if (!super.equals(o)) return false;

        Room room = (Room) o;

        if (numberOfRooms != room.numberOfRooms) return false;
        if (numberOfPersons != room.numberOfPersons) return false;
        if (roomSize != room.roomSize) return false;
        return roomType != null ? roomType.equals(room.roomType) : room.roomType == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
        result = 31 * result + numberOfRooms;
        result = 31 * result + numberOfPersons;
        result = 31 * result + roomSize;
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfPersons=" + numberOfPersons +
                ", roomSize=" + roomSize +
                '}';
    }
}
