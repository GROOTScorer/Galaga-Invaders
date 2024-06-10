/* Parte de Ozores Matias y Amodeo Luca
 * 
 * 
 * La parte logica de esto esta beta, lo que le falta basicamente es la funcionalidad del ANSWER y 
 * todas las validaciones que me esta rompiendo la cabeza. Con respecto al diseño le falta el boton 
 * clear y posteriormente a todo esto recien ahi voy a crear la parte para cambiar la longitud de las
 * matrices, ya sean, de 3x3,4x4 y 5x5 tanto para calcular suma,resta,div,mult como tambien para 
 * calc determinante, inversa y escalar. 
 * 
 * En resumen, la primera parte (VentanaMatricesUno) falta modificar longitud y la segunda parte
 * (VentanaMatricesMasDeUno) falta parte logica funcional, boton clear y modificar longitud
 * 
 * Con respecto a los demas apartados: La idea de lo que voy a entregar es mi parte luego, uniremos todo
 * para que este todo en un mismo proyecto java y este completo, pero estos son nuestros avances
 * 
 * */

package main.java.com.calculadora;

import main.java.com.calculadora.gui.VentanaMatricesUno;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	VentanaMatricesUno ventanaMatrices = new VentanaMatricesUno();
                ventanaMatrices.setVisible(true);
            }
        });
    }
}
