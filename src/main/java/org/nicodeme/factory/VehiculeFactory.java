package org.nicodeme.factory;

import org.nicodeme.vehicule.Vehicule;
import org.nicodeme.vehicule.*;

public class VehiculeFactory {
    private static long nextId = 1;

    public static Vehicule createVehicule(VehiculeType type) {
        Vehicule vehicule = switch (type) {
            case AVION -> new Avion(nextId);
            case BATEAU -> new Bateau(nextId);
            case MOTO -> new Moto(nextId);
            case HELICOPTERE -> new Helicoptere(nextId);
            case JETSKI -> new JetSki(nextId);
            case VOITURE -> new Voiture(nextId);
            case HYDRAVION -> new Hydravion(nextId);
        };
        nextId++;
        return vehicule;
    }
}
