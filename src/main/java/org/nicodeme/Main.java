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
import org.nicodeme.vehicule.Vehicule;
import org.nicodeme.vehicule.VehiculeType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Hangar hangar = new Hangar();
        Set<VehiculeType> vehiculeTypes = Set.of(VehiculeType.AVION,
            VehiculeType.BATEAU,
            VehiculeType.VOITURE,
            VehiculeType.MOTO,
            VehiculeType.HELICOPTERE,
            VehiculeType.JETSKI,
            VehiculeType.HYDRAVION);

        vehiculeTypes.forEach(vehiculeType -> hangar.entre(VehiculeFactory.createVehicule(vehiculeType)));

        IOutpuManager consoleOutput = new OutputConsoleManager();
        hangar.imprimerStats(consoleOutput);
        hangar.imprimerTout(consoleOutput);
        hangar.nombreDeVehicules();


        File file = new File("vehicules.txt");
        IOutpuManager fileOutput = new OutputFileManager(file);
        hangar.imprimerStats(fileOutput);
        hangar.imprimerTout(fileOutput);

        Ferme ferme = new Ferme();
        Set<AnimalType> animalTypes = Set.of(AnimalType.OISEAUX,
            AnimalType.ANIMAL_SUR_LEAU);
        animalTypes.forEach(animalType -> ferme.ajouterAnimal(AnimalFactory.createAnimal(animalType)));
        Environnement environnement = new Environnement(hangar,ferme);
        environnement.recenserToutesCapacites(fileOutput);
        environnement.recenserToutesCapacites(consoleOutput);










    }

}
