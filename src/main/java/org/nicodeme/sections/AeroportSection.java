package org.nicodeme.sections;

import org.nicodeme.vehicule.Avion;
import org.nicodeme.vehicule.Helicoptere;
import org.nicodeme.vehicule.Vehicule;

import java.util.Set;

public class AeroportSection extends BaseStrategy {


    @Override
    public Set<Class<? extends Vehicule>> getVehicules() {
        return Set.of(Avion.class, Helicoptere.class);
    }
}
