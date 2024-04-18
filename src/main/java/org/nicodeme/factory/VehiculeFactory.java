package org.nicodeme.factory;

import org.nicodeme.*;
import org.nicodeme.contracts.Vehicule;

public class VehiculeFactory {
    public static Vehicule createVehicule(VehiculeType type) {
        return switch (type) {
            case AVION -> new Avion();
            case BATEAU -> new Bateau();
            case MOTO -> new Moto();
            case HELICOPTERE -> new Helicoptere();
            case JETSKI -> new JetSki();
            case VOITURE -> new Voiture();

        };
    }

}
