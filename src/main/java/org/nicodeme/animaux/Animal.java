package org.nicodeme.animaux;

public abstract class Animal {

    private Long id;

    public Long getId() {
        return id;
    }

    public Animal(Long id) {
        this.id = id;
    }

    public abstract String getType();
}
