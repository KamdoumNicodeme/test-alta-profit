package org.nicodeme.factory;

import org.nicodeme.animaux.Animal;
import org.nicodeme.animaux.AnimalSurLeau;
import org.nicodeme.animaux.AnimalType;
import org.nicodeme.animaux.Oiseaux;

public class AnimalFactory {
    public  static  long nextId = 1;

    public static Animal createAnimal(AnimalType type) {
        Animal animal = switch (type){
            case OISEAUX -> new Oiseaux(nextId);
            case ANIMAL_SUR_LEAU-> new AnimalSurLeau(nextId);


        };
        nextId++;
        return animal;
    }
}
