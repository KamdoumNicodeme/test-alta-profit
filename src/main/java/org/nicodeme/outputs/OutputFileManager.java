package org.nicodeme.outputs;

import org.nicodeme.contracts.IOutpuManager;
import org.nicodeme.contracts.Vehicule;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class OutputFileManager implements IOutpuManager {
    private final PrintStream stream;

    public OutputFileManager(File file) throws FileNotFoundException {
        this.stream = new PrintStream(new FileOutputStream(file, false));
    }

    public void imprimer(Vehicule v) {

        stream.println(v.getDetails());
    }

    @Override
    public void print(String message) {
        stream.println(message);
    }
}
