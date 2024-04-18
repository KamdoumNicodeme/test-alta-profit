package org.nicodeme.sections;



import org.nicodeme.Avion;
import org.nicodeme.Helicoptere;
import org.nicodeme.contracts.SectionStrategy;
import org.nicodeme.contracts.Vehicule;

import java.util.HashSet;
import java.util.List;


public class AeroportSection implements SectionStrategy {

    private List<Vehicule> intances = List.of(new Avion(),new Helicoptere());

    @Override
    public long compterVehicules(HashSet<Vehicule> vehicules) {
        return vehicules.stream()
            .filter(vehicule -> vehicule instanceof Avion || vehicule instanceof Helicoptere)
            .count();
    }
}
