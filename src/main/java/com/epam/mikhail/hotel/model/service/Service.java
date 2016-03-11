package com.epam.mikhail.hotel.model.service;


import com.epam.mikhail.hotel.model.Order;
import com.epam.mikhail.hotel.model.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {

    static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    public List<Room> sort(List<Room> rooms, Comparator comparator) {
        ArrayList<Room> roomsCopy = new ArrayList<>(rooms);
        Collections.sort(roomsCopy, comparator);
        return roomsCopy;
    }

    public List<Order> filterPaymentType(List<Order> orders, String value) {
        List<Order> ordersValuePaymentType = new ArrayList<>();
        for (Order order : orders) {
            if (order.getPaymentType() == null) {
                LOGGER.info("Field paymentType is not filled");
            } else if (order.getPaymentType().equals(value)) {
                ordersValuePaymentType.add(order);
            }
        }
        return ordersValuePaymentType;
    }

    public void showRoomList(List<Room> list) {
        if (list != null) {
            for (Room room : list) LOGGER.info(String.valueOf(room));
        } else {
            LOGGER.info("This collection is not elements");
        }
    }
}
