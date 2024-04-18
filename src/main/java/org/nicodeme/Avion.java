package org.nicodeme;

import org.nicodeme.contracts.Vehicule;



public class Avion extends Vehicule {


    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.AVION.getTypeValue();
    }
}
