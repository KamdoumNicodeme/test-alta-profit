package org.nicodeme.sections;


import org.nicodeme.vehicule.*;
import org.nicodeme.contracts.SectionStrategy;

import java.util.HashSet;
import java.util.Set;

public class PortSection implements SectionStrategy {

    private final Set<Class<? extends Vehicule>> typesAdmissibles;

    public PortSection() {
        typesAdmissibles = new HashSet<>();
        typesAdmissibles.add(Bateau.class);
        typesAdmissibles.add(JetSki.class);
        typesAdmissibles.add(Hydravion.class);
    }
    @Override
    public long compterVehicules(HashSet<Vehicule> vehicules) {
        return vehicules.stream()
            .filter(vehicule -> typesAdmissibles.contains(vehicule.getClass()))
            .count();
    }
}
