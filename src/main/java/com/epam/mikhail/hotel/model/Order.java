package com.epam.mikhail.hotel.model;

import java.util.Date;
import java.util.UUID;

public class Order extends BaseEntity {

    private String customerName;
    private String customerLastName;
    private String customerPhoneNumber;
    private String customerEmail;
    private int numberOfPersons;
    private RoomType roomType;
    private Date arrivalDate;
    private Date departureDate;
    private int price;
    private String paymentType;
    private User customer;

    public Order() {
    }

    public Order(UUID uuid) {
        super(uuid);
    }

}
