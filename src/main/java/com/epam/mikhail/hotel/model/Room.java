package com.epam.mikhail.hotel.model;


import java.util.Comparator;
import java.util.UUID;

public class Room extends BaseEntity {

    private int roomId;
    private RoomType roomType;
    private int numberOfRooms;
    private int numberOfPersons;
    private int roomSize;

    public static final Comparator<Room> ROOM_ID_ORDER = Comparator.comparing(Room::getRoomId);
    public static final Comparator<Room> NUMBER_OF_PERSONS_ORDER = Comparator.comparing(Room::getNumberOfPersons);

    public Room() {
    }

    public Room(UUID uuid, RoomType roomType) {
        super(uuid);
        this.roomType = roomType;
    }

    public Room(UUID uuid, int numberOfRooms, int numberOfPersons, int roomSize) {
        super(uuid);
        this.numberOfRooms = numberOfRooms;
        this.numberOfPersons = numberOfPersons;
        this.roomSize = roomSize;
    }

    public Room(UUID uuid, int roomId) {
        super(uuid);
        this.roomId = roomId;
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

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + getRoomId() +
                ", roomType=" + roomType.getTitle() +
                ", numberOfRooms=" + roomType.getNumberOfRooms() +
                ", numberOfPersons=" + getNumberOfPersons() +
                ", roomSize=" + roomType.getRoomSize() +
                '}';
    }


}
