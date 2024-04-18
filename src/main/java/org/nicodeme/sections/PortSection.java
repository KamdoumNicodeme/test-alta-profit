package org.nicodeme.sections;


import org.nicodeme.vehicule.*;

import java.util.Set;

public class PortSection extends BaseStrategy {


    @Override
    public Set<Class<? extends Vehicule>> getVehicules() {
        return Set.of(Bateau.class, JetSki.class, Hydravion.class);
    }
}
