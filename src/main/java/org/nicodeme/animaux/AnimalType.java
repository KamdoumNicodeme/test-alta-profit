package org.nicodeme.animaux;

public enum AnimalType {


    OISEAUX("Oiseaux"),
    ANIMAL_SUR_LEAU("animal sur l'eau");

    private final String typeValue;

    AnimalType(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeValue() {
        return typeValue;
    }
}
