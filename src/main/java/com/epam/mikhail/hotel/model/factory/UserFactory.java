package com.epam.mikhail.hotel.model.factory;

import com.epam.mikhail.hotel.model.User;
import com.thedeanda.lorem.Lorem;

import java.time.LocalDate;
import java.util.UUID;

public class UserFactory {

    public static User createUser() {
        User user = new User(UUID.randomUUID());
        String firstName = Lorem.getFirstName();
        String lastName = Lorem.getLastName();
        String phoneNumber = Lorem.getPhone();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(firstName.toLowerCase() + "@" + lastName.toLowerCase() + ".com");
        user.setPhoneNumber(phoneNumber);
        user.setRegisterDate(LocalDate.now());
        user.setRole(RoleFactory.createRandomRole());
        return user;
    }
}
