package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JTextField txtDiscos;
    private JButton btnResolver;
    private JTextArea txtAreaPasos;
    private JScrollPane scrollPane;

    public VentanaPrincipal() {
        setTitle("Torre de Hanói");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(new JLabel("Cantidad de discos:"));
        txtDiscos = new JTextField(5);
        panelSuperior.add(txtDiscos);
        btnResolver = new JButton("Resolver");
        panelSuperior.add(btnResolver);

        // Área de texto para los pasos
        txtAreaPasos = new JTextArea();
        txtAreaPasos.setEditable(false);
        txtAreaPasos.setFont(new Font("Monospaced", Font.PLAIN, 14));
        scrollPane = new JScrollPane(txtAreaPasos);

        // Añadir componentes al JFrame
        add(panelSuperior, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public JTextField getTxtDiscos() {
        return txtDiscos;
    }

    public JButton getBtnResolver() {
        return btnResolver;
    }

    public JTextArea getTxtAreaPasos() {
        return txtAreaPasos;
    }
}
