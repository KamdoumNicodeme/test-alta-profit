package org.nicodeme.animaux;

import org.nicodeme.contracts.Volant;

public class Oiseaux extends Animal implements Volant {
    public Oiseaux(Long id) {
        super(id);
    }

    @Override
    public boolean vole() {
        return true;
    }

    @Override
    public String getType() {
        return AnimalType.OISEAUX.getTypeValue();
    }

    @Override
    public String seDeplacer() {
        return "Vole";
    }
}
