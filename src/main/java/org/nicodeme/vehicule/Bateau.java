package org.nicodeme.vehicule;


import org.nicodeme.contracts.Navigant;

public class Bateau extends Vehicule implements Navigant {

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

    @Override
    public boolean peutNaviguer() {
        return true;
    }
}
