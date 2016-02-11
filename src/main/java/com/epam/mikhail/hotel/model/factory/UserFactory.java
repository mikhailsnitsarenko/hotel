package com.epam.mikhail.hotel.model.factory;

import com.epam.mikhail.hotel.model.User;
import com.thedeanda.lorem.Lorem;

import java.util.Date;
import java.util.UUID;

public class UserFactory {

    private static final Date REGISTER_START = new Date(100, 0, 1);
    private static final Date REGISTER_END = new Date(116, 0, 1);

    public static User createUser() {
        User user = new User(UUID.randomUUID());
        String firstName = Lorem.getFirstName();
        String lastName = Lorem.getLastName();
        String phoneNumber = Lorem.getPhone();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(firstName.toLowerCase() + "@" + lastName.toLowerCase() + ".com");
        user.setPhoneNumber(phoneNumber);
        user.setRegisterDate(Dates.randomDateBetween(REGISTER_START, REGISTER_END));
        user.setRole(RoleFactory.createRandomRole());
        return user;
    }
}
