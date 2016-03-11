package com.epam.mikhail.hotel.model.factory;

import com.epam.mikhail.hotel.model.Role;

import java.util.Random;

public class RoleFactory {

    private static final Random RANDOM = new Random();

    public static Role createRandomRole () {
        int value = RANDOM.nextInt(3);
        if (value == 0) return Role.ADMIN;
        if (value == 1) return Role.REGISTERED_USER;
        if (value == 2) return Role.GUEST;
        return null;
    }
}
