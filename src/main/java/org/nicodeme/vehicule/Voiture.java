package org.nicodeme.vehicule;


public class Voiture extends Vehicule {

    public Voiture(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.VOITURE.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Roule";
    }
}
