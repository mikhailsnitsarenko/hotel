package com.epam.mikhail.hotel.model;

import java.util.UUID;

public abstract class BaseEntity {

    private final UUID uuid;
    private boolean deleted;

    public BaseEntity() {
        uuid = UUID.randomUUID();
    }

    public BaseEntity(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;

        BaseEntity that = (BaseEntity) o;

        if (deleted != that.deleted) return false;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        int result = uuid.hashCode();
        result = 31 * result + (deleted ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "uuid=" + uuid +
                '}';
    }
}
