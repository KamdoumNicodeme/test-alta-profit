package org.nicodeme.outputs;

import org.nicodeme.contracts.IOutpuManager;
import org.nicodeme.vehicule.Vehicule;

public class OutputConsoleManager implements IOutpuManager {
    @Override
    public void imprimer(Vehicule v) {
        System.out.println(v.getDetails());
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
