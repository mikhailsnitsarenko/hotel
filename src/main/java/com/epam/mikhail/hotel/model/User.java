package com.epam.mikhail.hotel.model;

import java.util.UUID;

public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String telephoneNumber;

    //Role - class or enum or something else?

    public User() {
    }

    public User(UUID uuid) {
        super(uuid);
    }
}
