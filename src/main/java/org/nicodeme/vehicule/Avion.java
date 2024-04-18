package org.nicodeme.vehicule;


public class Avion extends Vehicule {


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
}
