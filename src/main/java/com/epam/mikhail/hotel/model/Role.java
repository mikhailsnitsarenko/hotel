package com.epam.mikhail.hotel.model;

import java.util.UUID;

public class Role extends BaseEntity {

    public static final Role ADMIN = new Role(UUID.randomUUID(), "admin");
    public static final Role REGISTEREDUSER = new Role(UUID.randomUUID(), "registered user");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        if (!super.equals(o)) return false;

        Role role = (Role) o;

        return title != null ? title.equals(role.title) : role.title == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "title='" + title + '\'' +
                '}';
    }
}
