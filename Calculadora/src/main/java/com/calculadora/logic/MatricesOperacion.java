package main.java.com.calculadora.logic;

public class MatricesOperacion {

    public static int[][] calcularEscalar(int[][] matriz, int escalar) {
        int[][] resultado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    public static int calcularDeterminante(int[][] matriz) {
        int diagonal_principal_uno = matriz[0][0] * matriz[1][1] * matriz[2][2];
        int diagonal_principal_dos = matriz[1][0] * matriz[2][1] * matriz[0][2];
        int diagonal_principal_tres = matriz[2][0] * matriz[0][1] * matriz[1][2];

        int diagonal_secundaria_uno = matriz[0][2] * matriz[1][1] * matriz[2][0];
        int diagonal_secundaria_dos = matriz[1][2] * matriz[2][1] * matriz[0][0];
        int diagonal_secundaria_tres = matriz[2][2] * matriz[0][1] * matriz[1][0];

        return (diagonal_principal_uno + diagonal_principal_dos + diagonal_principal_tres) 
                - (diagonal_secundaria_uno + diagonal_secundaria_dos + diagonal_secundaria_tres);
    }

    public static String[][] calcularInversa(int[][] matriz) {
        int determinante = calcularDeterminante(matriz);
        if (determinante == 0) {
            throw new ArithmeticException("La matriz no tiene inversa porque su determinante es cero.");
        }

        int[][] transpuesta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        int[][] adjunta = new int[3][3];
        adjunta[0][0] = (transpuesta[1][1] * transpuesta[2][2]) - (transpuesta[1][2] * transpuesta[2][1]);
        adjunta[0][1] = -((transpuesta[1][0] * transpuesta[2][2]) - (transpuesta[1][2] * transpuesta[2][0]));
        adjunta[0][2] = (transpuesta[1][0] * transpuesta[2][1]) - (transpuesta[1][1] * transpuesta[2][0]);

        adjunta[1][0] = -((transpuesta[0][1] * transpuesta[2][2]) - (transpuesta[0][2] * transpuesta[2][1]));
        adjunta[1][1] = (transpuesta[0][0] * transpuesta[2][2]) - (transpuesta[0][2] * transpuesta[2][0]);
        adjunta[1][2] = -((transpuesta[0][0] * transpuesta[2][1]) - (transpuesta[0][1] * transpuesta[2][0]));

        adjunta[2][0] = (transpuesta[0][1] * transpuesta[1][2]) - (transpuesta[0][2] * transpuesta[1][1]);
        adjunta[2][1] = -((transpuesta[0][0] * transpuesta[1][2]) - (transpuesta[0][2] * transpuesta[1][0]));
        adjunta[2][2] = (transpuesta[0][0] * transpuesta[1][1]) - (transpuesta[0][1] * transpuesta[1][0]);

        String[][] resultado = new String[3][3];

        resultado[0][0] = simplifyFraction(adjunta[0][0], determinante);
        resultado[0][1] = simplifyFraction(adjunta[0][1], determinante);
        resultado[0][2] = simplifyFraction(adjunta[0][2], determinante);

        resultado[1][0] = simplifyFraction(adjunta[1][0], determinante);
        resultado[1][1] = simplifyFraction(adjunta[1][1], determinante);
        resultado[1][2] = simplifyFraction(adjunta[1][2], determinante);

        resultado[2][0] = simplifyFraction(adjunta[2][0], determinante);
        resultado[2][1] = simplifyFraction(adjunta[2][1], determinante);
        resultado[2][2] = simplifyFraction(adjunta[2][2], determinante);

        return resultado;
    }

    private static String simplifyFraction(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return numerator + "/" + denominator;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    // Operaciones Basicas
    

    
    private static int[][] ANS = new int[3][3];
    
    
    public static int[][] igualar(int[][] matriz) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ANS[i][j] = matriz[i][j];
            }
        }
        return ANS;
    }
    
    // Suma
    public static int[][] suma(int[][] matrizB) {
        
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ANS[i][j] += matrizB[i][j];
            }
        }
        
      
        return ANS;
    }
    
    // Resta
    
    public static int[][] resta(int[][] matrizB) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ANS[i][j] -= matrizB[i][j];
            }
        }
        
        return ANS;
    }    
    
    public static int[][] multiplicacion(int[][] matriz) {
        
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ANS[i][j] *= matriz[i][j];
            }
        }

        return ANS;
    }    
    
    public static int[][] division(int[][] matriz) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ANS[i][j] /= matriz[i][j];
            }
        }
        
        return ANS;
    }
}
