package main.java.com.calculadora;

import javax.swing.*;

import main.java.com.calculadora.gui.VentanaMatricesMasDeUno;
import main.java.com.calculadora.gui.VentanaMatricesUno;

public class VentanaPrincipal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame principal
            JFrame frame = new JFrame("Calculadora | GRUPO 5");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 650);
            frame.setResizable(false);

            // Crear el JDesktopPane
            JDesktopPane desktopPane = new JDesktopPane();
            frame.getContentPane().add(desktopPane);

            // Crear una instancia de VentanaMatricesUno
            VentanaMatricesUno ventanaMatricesUno = new VentanaMatricesUno(() -> {
                abrirVentanaMasDeUno(desktopPane);
            });
            ventanaMatricesUno.setLocation(0, 0);

            // Añadir la instancia de VentanaMatricesUno al JDesktopPane
            desktopPane.add(ventanaMatricesUno);

            // Centrar el JInternalFrame
            centrarInternalFrame(ventanaMatricesUno, desktopPane);

            // Hacer visible el JFrame principal y centrado en la pantalla
            frame.setLocationRelativeTo(null); // Centrar en la pantalla
            frame.setVisible(true);

            // Hacer visible el JInternalFrame
            ventanaMatricesUno.setVisible(true);
        });
    }

    // Método para centrar un JInternalFrame dentro de un JDesktopPane
    private static void centrarInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane) {
        int desktopWidth = desktopPane.getWidth();
        int desktopHeight = desktopPane.getHeight();
        int frameWidth = internalFrame.getWidth();
        int frameHeight = internalFrame.getHeight();

        int x = (desktopWidth - frameWidth) / 2;
        int y = (desktopHeight - frameHeight) / 2;
        internalFrame.setLocation(0, 0);
    }

    // Método para abrir VentanaMatricesMasDeUno
    private static void abrirVentanaMasDeUno(JDesktopPane desktopPane) {
        VentanaMatricesMasDeUno nuevaVentana = new VentanaMatricesMasDeUno(() -> {
            abrirVentanaUno(desktopPane);
        });
        desktopPane.add(nuevaVentana);
        nuevaVentana.setVisible(true);

        // Centrar el JInternalFrame
        centrarInternalFrame(nuevaVentana, desktopPane);
    }

    // Método para abrir VentanaMatricesUno
    private static void abrirVentanaUno(JDesktopPane desktopPane) {
        VentanaMatricesUno nuevaVentana = new VentanaMatricesUno(() -> {
            abrirVentanaMasDeUno(desktopPane);
        });
        desktopPane.add(nuevaVentana);
        nuevaVentana.setVisible(true);

        // Centrar el JInternalFrame
        centrarInternalFrame(nuevaVentana, desktopPane);
    }
}