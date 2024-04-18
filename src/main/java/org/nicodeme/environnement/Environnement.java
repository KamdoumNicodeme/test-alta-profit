package org.nicodeme.environnement;

import org.nicodeme.contracts.IOutpuManager;

public class Environnement {
    private Hangar hangar;
    private Ferme ferme;

    public Environnement(Hangar hangar, Ferme ferme) {
        this.hangar = hangar;
        this.ferme = ferme;
    }

    public void recenserToutesCapacites(IOutpuManager outputManager) {
        outputManager.print("**********************************************************");
        outputManager.print("*******************Recensement*****************************\n");
        hangar.recenserCapacites(outputManager);
        ferme.recenserCapacites(outputManager);
    }
}
