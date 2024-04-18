package org.nicodeme.vehicule;


public abstract class Vehicule {
    public Vehicule(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }


    public abstract String getDetails();

    public abstract String getType();


    public abstract String seDeplacer();
}
