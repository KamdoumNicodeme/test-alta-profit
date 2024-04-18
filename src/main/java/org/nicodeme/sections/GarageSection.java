package org.nicodeme.sections;

import org.nicodeme.vehicule.Helicoptere;
import org.nicodeme.vehicule.Moto;
import org.nicodeme.vehicule.Voiture;
import org.nicodeme.contracts.SectionStrategy;
import org.nicodeme.vehicule.Vehicule;

import java.util.HashSet;
import java.util.Set;

public class GarageSection extends BaseStrategy {



    @Override
    public Set<Class<? extends Vehicule>> getVehicules() {
        return Set.of(Voiture.class, Moto.class);
    }


}
