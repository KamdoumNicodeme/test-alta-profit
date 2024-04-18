package org.nicodeme;

import org.nicodeme.contracts.IOutpuManager;
import org.nicodeme.factory.VehiculeFactory;
import org.nicodeme.outputs.OutputConsoleManager;
import org.nicodeme.outputs.OutputFileManager;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Hanga2 hangar = new Hanga2();
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.AVION));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.BATEAU));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.VOITURE));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.MOTO));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.HELICOPTERE));
        hangar.entre(VehiculeFactory.createVehicule(VehiculeType.JETSKI));


        IOutpuManager consoleOutput = new OutputConsoleManager();
        hangar.imprimerStats(consoleOutput);
        hangar.imprimerTout(consoleOutput);
        hangar.nombreDeVehicules();


        File file = new File("vehicules.txt");
        IOutpuManager fileOutput = new OutputFileManager(file);
        hangar.imprimerStats(fileOutput);
        hangar.imprimerTout(fileOutput);







    }

}
