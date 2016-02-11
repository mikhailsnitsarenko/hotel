package com.epam.mikhail.hotel.model.factory;

import com.epam.mikhail.hotel.model.Order;

import java.util.UUID;

public class OrderFactory {

    public static Order createOrder () {
        Order order = new Order(UUID.randomUUID());
        return order;
    }
}
