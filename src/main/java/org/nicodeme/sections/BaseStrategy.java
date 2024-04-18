package org.nicodeme.sections;

import org.nicodeme.contracts.SectionStrategy;
import org.nicodeme.vehicule.Vehicule;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseStrategy implements SectionStrategy {
    @Override
    public long compterVehicules(HashSet<Vehicule> vehicules) {
        return vehicules.stream()
            .filter(vehicule -> getVehicules().contains(vehicule.getClass()))
            .count();
    }

    public abstract Set<Class<? extends Vehicule>> getVehicules();
}
