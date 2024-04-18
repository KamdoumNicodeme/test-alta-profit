package org.nicodeme.vehicule;

import org.nicodeme.contracts.Navigant;
import org.nicodeme.contracts.Volant;

public class Hydravion extends Vehicule implements Volant, Navigant {


    public Hydravion(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.HYDRAVION.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Décolle de l'eau et vole.";
    }

    @Override
    public boolean navigue() {
        return true;
    }

    @Override
    public boolean vole() {
        return true;
    }
}
