package sistemaDeEcuaciones;

import GUI_SistemaDeEcuaciones.Ventana2x2;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Ventana2x2 ventana2x2 = new Ventana2x2();
                ventana2x2.setVisible(true);
            }
        });
    }
}
