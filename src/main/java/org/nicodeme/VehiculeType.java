package org.nicodeme;

public enum VehiculeType {

    AVION("Avion"),
    HELICOPTERE("Helicoptere"),
    BATEAU("Bateau"),
    JETSKI("JetSki"),
    MOTO("Moto"),
    VOITURE("Voiture");

    private final String typeValue;

    VehiculeType(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeValue() {
        return typeValue;
}

}
