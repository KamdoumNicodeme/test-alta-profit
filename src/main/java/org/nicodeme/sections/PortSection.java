package org.nicodeme.sections;


import org.nicodeme.Bateau;
import org.nicodeme.JetSki;
import org.nicodeme.contracts.SectionStrategy;
import org.nicodeme.contracts.Vehicule;

import java.util.HashSet;

public class PortSection implements SectionStrategy {

    @Override
    public long compterVehicules(HashSet<Vehicule> vehicules) {
        return vehicules.stream()
            .filter(vehicule -> vehicule instanceof Bateau || vehicule instanceof JetSki)
            .count();
    }
}
