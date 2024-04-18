package org.nicodeme.vehicule;

public enum VehiculeType {

    AVION("Avion"),
    HELICOPTERE("Helicoptere"),
    BATEAU("Bateau"),
    JETSKI("JetSki"),
    MOTO("Moto"),
    VOITURE("Voiture"),
    HYDRAVION("Hydravion");

    private final String typeValue;

    VehiculeType(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeValue() {
        return typeValue;
}

}
