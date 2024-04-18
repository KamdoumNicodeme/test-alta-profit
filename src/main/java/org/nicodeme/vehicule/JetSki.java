package org.nicodeme.vehicule;


public class JetSki extends Vehicule {

    public JetSki(Long id) {
        super(id);
    }

    @Override
    public String getDetails() {
        return "Vehicule de type "+getType();
    }

    @Override
    public String getType() {
        return VehiculeType.JETSKI.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Navigue";
    }
}
