package com.epam.mikhail.hotel;


import com.epam.mikhail.hotel.model.Room;
import com.epam.mikhail.hotel.model.factory.RoomFactory;
import com.epam.mikhail.hotel.model.service.Service;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Room> rooms = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Room room = RoomFactory.createRoom();
            rooms.add(room);
        }

        Service service = new Service();

        /*for (Room room : rooms) LOGGER.info(String.valueOf(room));
        for (Room room : service.sort(rooms, Room.NUMBER_OF_PERSONS_ORDER)) LOGGER.info(String.valueOf(room));*/

        service.showRoomList(service.sort(rooms, Room.NUMBER_OF_PERSONS_ORDER));

    }

}
