package CalculadoraG5.ventana;
import javax.swing.*;

import CalculadoraG5.GUI.Estandar;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	
            JFrame frame = new JFrame("Calculadora | GRUPO 5");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 650);
            frame.setResizable(false);

            JDesktopPane desktopPane = new JDesktopPane();
            frame.getContentPane().add(desktopPane);

            CalculadoraG5.GUI.Estandar Estandar = new CalculadoraG5.GUI.Estandar(desktopPane);
            Estandar.setLocation(0, 0);
            desktopPane.add(Estandar);
            Estandar.setVisible(true);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}