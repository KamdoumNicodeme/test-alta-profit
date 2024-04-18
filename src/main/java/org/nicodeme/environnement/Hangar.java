package org.nicodeme.environnement;

import org.nicodeme.contracts.*;
import org.nicodeme.vehicule.Vehicule;
import org.nicodeme.sections.AeroportSection;
import org.nicodeme.sections.GarageSection;
import org.nicodeme.sections.PortSection;

import java.util.*;

public class Hangar {

    private final HashSet<Vehicule> vehicules = new HashSet<>();
    private final SectionStrategy aeroportStrategy = new AeroportSection();
    private final SectionStrategy portStrategy = new PortSection();
    private final SectionStrategy garageStrategy = new GarageSection();

    public void entre(Vehicule v) {
        vehicules.add(v);
    }

    public long nombreDeVehicules() {
        return vehicules.size();
    }

    public long nombreDeVehiculesAeroport() {
        return aeroportStrategy.compterVehicules(vehicules);
    }

    public long nombreDeVehiculesPort() {
        return portStrategy.compterVehicules(vehicules);
    }

    public long nombreDeVehiculesGarage() {
        return garageStrategy.compterVehicules(vehicules);
    }


    public void imprimerStats(IOutpuManager output) {
        output.print("****************************************************************");
        output.print("****************************************************************");
        output.print("                          STATISTIQUES                                ");
        output.print("****************************************************************");
        output.print("****************************************************************");
        output.print("Nombre total de véhicules: " + nombreDeVehicules());
        output.print("Nombre de véhicules dans l'aéroport: " + nombreDeVehiculesAeroport());
        output.print("Nombre de véhicules dans le port: " + nombreDeVehiculesPort());
        output.print("Nombre de véhicules dans le garage:" + nombreDeVehiculesGarage() + " \n");
    }

    public void imprimerTout(IOutpuManager outputManager) {
        outputManager.print("****************************************************************");
        outputManager.print("LISTE DES VEHICULES DANS LE HANGAR");
        vehicules.forEach(outputManager::imprimer);
    }

    public void recenserCapacites(IOutpuManager outputManager) {
        for (Vehicule vehicule : vehicules) {
            outputManager.print(vehicule.getType() + " " + vehicule.seDeplacer());
        }
    }

}
