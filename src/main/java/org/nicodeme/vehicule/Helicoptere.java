package org.nicodeme.vehicule;


public class Helicoptere extends Vehicule {


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
}
