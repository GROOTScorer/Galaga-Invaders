package vectores;

import javax.swing.*;

import GUI_Vectores.VentanaVectores;


public class VentanaPrincipal {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	VentanaVectores vectores = new VentanaVectores();
                vectores.setVisible(true);
            }
        });
    }
}
