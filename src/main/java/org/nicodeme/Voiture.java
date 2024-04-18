package org.nicodeme;

import org.nicodeme.contracts.Vehicule;



public class Voiture extends Vehicule {

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.VOITURE.getTypeValue();
    }
}
