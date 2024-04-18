package org.nicodeme.vehicule;


import org.nicodeme.contracts.Volant;

public class Avion extends Vehicule implements Volant {


    public Avion(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.AVION.getTypeValue();
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
