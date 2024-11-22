
package TorreHanoi;

import controlador.Hanoi;
import modelo.TorresDeHanoi;
import vista.VentanaPrincipal;

public class Main {
     public static void main(String[] args) {
        // Crear las instancias de los componentes
        VentanaPrincipal vista = new VentanaPrincipal();
        TorresDeHanoi modelo = new TorresDeHanoi();
        Hanoi controlador = new Hanoi(vista, modelo);

        // Hacer visible la ventana principal
        vista.setVisible(true);
    }
    
}
