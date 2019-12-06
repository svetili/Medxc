package com.dxc.medic;
@SuppressWarnings("javadoc")
public class Doctor {
    private final int id;
    private final String name;
    private final int rating;
    private final boolean active;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean isActive() {
        return this.active;
    }

    public Doctor(final int id_new, final String name_new, final int rating_new, final boolean active_new) {
        this.id = id_new;
        this.name = name_new;
        this.rating = rating_new;
        this.active = active_new;
    }

}
