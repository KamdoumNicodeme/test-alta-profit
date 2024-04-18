package org.nicodeme.vehicule;


import org.nicodeme.contracts.Navigant;

public class JetSki extends Vehicule implements Navigant {

    public JetSki(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.JETSKI.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Navigue";
    }

    @Override
    public boolean navigue() {
        return false;
    }
}
