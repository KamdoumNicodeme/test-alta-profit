package org.nicodeme.vehicule;


import org.nicodeme.contracts.Volant;

public class Helicoptere extends Vehicule implements Volant {


    public Helicoptere(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type " + getType();
    }

    @Override
    public String getType() {
        return VehiculeType.HELICOPTERE.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Vole";
    }

    @Override
    public boolean peutVoler() {
        return true;
    }
}
