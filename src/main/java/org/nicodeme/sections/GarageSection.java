package org.nicodeme.sections;

import org.nicodeme.vehicule.Helicoptere;
import org.nicodeme.vehicule.Voiture;
import org.nicodeme.contracts.SectionStrategy;
import org.nicodeme.vehicule.Vehicule;

import java.util.HashSet;
import java.util.Set;

public class GarageSection implements SectionStrategy {

    private final Set<Class<? extends Vehicule>> typesAdmissibles;

    public GarageSection() {
        typesAdmissibles = new HashSet<>();
        typesAdmissibles.add(Voiture.class);
        typesAdmissibles.add(Helicoptere.class);
    }

    @Override
    public long compterVehicules(HashSet<Vehicule> vehicules) {
        return vehicules.stream()
            .filter(vehicule -> typesAdmissibles.contains(vehicule.getClass()))
            .count();
    }


}
