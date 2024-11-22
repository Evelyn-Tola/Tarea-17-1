package modelo;

import java.util.ArrayList;
import java.util.List;

public class TorresDeHanoi {
    private List<String> pasos;

    public TorresDeHanoi() {
        pasos = new ArrayList<>();
    }

    public void resolver(int discos, int origen, int auxiliar, int destino) {
        if (discos == 1) {
            pasos.add("Se mueve disco 1 de columna " + origen + " a columna " + destino);
        } else {
            resolver(discos - 1, origen, destino, auxiliar);
            pasos.add("Se mueve disco " + discos + " de columna " + origen + " a columna " + destino);
            resolver(discos - 1, auxiliar, origen, destino);
        }
    }

    public List<String> getPasos() {
        return pasos;
    }

    public void limpiarPasos() {
        pasos.clear();
    }
}

