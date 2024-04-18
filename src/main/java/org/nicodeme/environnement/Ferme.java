package org.nicodeme.environnement;

import org.nicodeme.animaux.Animal;
import org.nicodeme.contracts.IOutpuManager;
import org.nicodeme.contracts.Navigant;
import org.nicodeme.contracts.Volant;

import java.util.HashSet;
import java.util.Set;

public class Ferme {

    private final Set<Animal> animals = new HashSet<>();

    public void ajouterAnimal(Animal animal) {
        animals.add(animal);
    }

    public void recenserCapacites(IOutpuManager outputManager) {
        for (Animal animal : animals) {
            if (animal instanceof Volant) {
                outputManager.print(animal.getType() + " peut voler.");
            }

            if (animal instanceof Navigant) {
                outputManager.print(animal.getType() + " peut nager.");
            }
        }
    }
}