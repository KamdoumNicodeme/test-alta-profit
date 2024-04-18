package org.nicodeme.vehicule;


public class Bateau extends Vehicule {

    public Bateau(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.BATEAU.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Navigue";
    }
}
