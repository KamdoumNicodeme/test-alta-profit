package org.nicodeme.vehicule;


public class Moto extends Vehicule {

    public Moto(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.MOTO.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Roule";
    }
}
