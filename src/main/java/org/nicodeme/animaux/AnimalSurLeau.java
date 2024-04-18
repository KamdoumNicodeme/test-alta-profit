package org.nicodeme.animaux;

import org.nicodeme.contracts.Navigant;

public class AnimalSurLeau extends Animal implements Navigant {
    public AnimalSurLeau(Long id) {
        super(id);
    }

    @Override
    public boolean peutNaviguer() {
        return true;
    }

    @Override
    public String getType() {
        return AnimalType.ANIMAL_SUR_LEAU.getTypeValue();
    }
}
