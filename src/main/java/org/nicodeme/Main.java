package org.nicodeme;

import org.nicodeme.animaux.AnimalType;
import org.nicodeme.contracts.IOutpuManager;
import org.nicodeme.environnement.Environnement;
import org.nicodeme.environnement.Ferme;
import org.nicodeme.environnement.Hangar;
import org.nicodeme.factory.AnimalFactory;
import org.nicodeme.factory.VehiculeFactory;
import org.nicodeme.outputs.OutputConsoleManager;
import org.nicodeme.outputs.OutputFileManager;
import org.nicodeme.vehicule.VehiculeType;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Hangar hangar = new Hangar();
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.AVION));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.BATEAU));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.VOITURE));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.MOTO));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.HELICOPTERE));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.JETSKI));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.HYDRAVION));


        IOutpuManager consoleOutput = new OutputConsoleManager();
        hangar.imprimerStats(consoleOutput);
        hangar.imprimerTout(consoleOutput);
        hangar.nombreDeVehicules();


        File file = new File("vehicules.txt");
        IOutpuManager fileOutput = new OutputFileManager(file);
        hangar.imprimerStats(fileOutput);
        hangar.imprimerTout(fileOutput);

        Ferme ferme = new Ferme();
        ferme.ajouterAnimal(AnimalFactory.createAnimal(AnimalType.OISEAUX));
        ferme.ajouterAnimal(AnimalFactory.createAnimal(AnimalType.ANIMAL_SUR_LEAU));
        Environnement environnement = new Environnement(hangar,ferme);
        environnement.recenserToutesCapacites(fileOutput);
        environnement.recenserToutesCapacites(consoleOutput);










    }

}
