package org.nicodeme.vehicule;


import org.nicodeme.contracts.Roulant;

public class Moto extends Vehicule implements Roulant {

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

    @Override
    public boolean peutRouler() {
        return true;
    }
}
