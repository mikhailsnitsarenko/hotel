package com.epam.mikhail.hotel.model;

import java.util.UUID;

public class Role extends BaseEntity {

    public static final Role ADMIN = new Role(UUID.randomUUID(), "admin");
    public static final Role REGISTERED_USER = new Role(UUID.randomUUID(), "registered user");
    public static final Role GUEST = new Role(UUID.randomUUID(), "guest");
    private String title;

    public Role() {
    }

    public Role(UUID uuid, String title) {
        super(uuid);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Role{" +
                "title='" + title + '\'' +
                '}';
    }
}
