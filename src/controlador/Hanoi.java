package controlador;

import modelo.TorresDeHanoi;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hanoi {
    private VentanaPrincipal vista;
    private TorresDeHanoi modelo;

    public Hanoi(VentanaPrincipal vista, TorresDeHanoi modelo) {
        this.vista = vista;
        this.modelo = modelo;
        inicializarControlador();
    }

    private void inicializarControlador() {
        vista.getBtnResolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resolverTorresDeHanoi();
            }
        });
    }

    private void resolverTorresDeHanoi() {
        try {
            int discos = Integer.parseInt(vista.getTxtDiscos().getText());
            if (discos <= 0) {
                JOptionPane.showMessageDialog(vista, "Ingrese un número positivo de discos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            modelo.limpiarPasos();
            modelo.resolver(discos, 1, 2, 3);

            StringBuilder resultado = new StringBuilder();
            for (String paso : modelo.getPasos()) {
                resultado.append(paso).append("\n");
            }

            vista.getTxtAreaPasos().setText(resultado.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

