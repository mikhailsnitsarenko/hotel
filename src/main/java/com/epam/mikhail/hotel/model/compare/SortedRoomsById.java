package com.epam.mikhail.hotel.model.compare;

import com.epam.mikhail.hotel.model.Room;

import java.util.Comparator;

public class SortedRoomsById implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        int res = o1.getRoomId() - o2.getRoomId();
        if (res != 0) return res;
        else return 0;
    }
}
