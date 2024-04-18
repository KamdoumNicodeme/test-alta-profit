package org.nicodeme.sections;

import org.nicodeme.Moto;
import org.nicodeme.Voiture;
import org.nicodeme.contracts.SectionStrategy;
import org.nicodeme.contracts.Vehicule;

import java.util.HashSet;

public class GarageSection implements SectionStrategy {


    @Override
    public long compterVehicules(HashSet<Vehicule> vehicules) {
        return vehicules.stream()
            .filter(vehicule -> vehicule instanceof Voiture || vehicule instanceof Moto)
            .count();
    }


}
