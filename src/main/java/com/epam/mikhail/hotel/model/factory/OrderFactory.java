package com.epam.mikhail.hotel.model.factory;

import com.epam.mikhail.hotel.model.Order;
import com.epam.mikhail.hotel.model.RoomType;
import com.thedeanda.lorem.Lorem;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class OrderFactory {

    private static final Date THIS_DATE = new Date(116, 0, 1);
    private static final Date FUTURE_DATE = new Date(117, 0, 1);
    private static Random RANDOM = new Random();

    public static Order createOrder () {
        Order order = new Order(UUID.randomUUID());
        String firstName = Lorem.getFirstName();
        String lastName = Lorem.getLastName();
        String phoneNumber = Lorem.getPhone();
        order.setCustomerName(firstName);
        order.setCustomerLastName(lastName);
        order.setCustomerPhoneNumber(phoneNumber);
        order.setCustomerEmail(firstName.toLowerCase() + "@" + lastName.toLowerCase() + ".com");
        order.setNumberOfPersons(RANDOM.nextInt(4)+1);
        order.setRoomType(RoomType.createRandomRoomType());
        order.setArrivalDate(Dates.randomDateBetween(THIS_DATE, FUTURE_DATE));
        order.setDepartureDate(Dates.randomDateBetween(order.getArrivalDate(), FUTURE_DATE));
        order.setPrice(RANDOM.nextInt(450) + 90);
        order.setPaymentType(checkPaymentType());
        order.setCustomer(UserFactory.createUser());
        return order;
    }

    private static String checkPaymentType () {
        int value = RANDOM.nextInt(2)+1;
        if (value == 1) return "VISA";
        return "MasterCard";
    }
}
