package main.java.com.calculadora.logic;

public class MatricesOperacion {
	
    public static int[][] calcularEscalar(int[][] matriz, int escalar) {
        int tamanio = matriz.length;


        int[][] resultado = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    public static int calcularDeterminante3x3(int[][] matriz) {
        
        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[1][0];
        int e = matriz[1][1];
        int f = matriz[1][2];
        int g = matriz[2][0];
        int h = matriz[2][1];
        int i = matriz[2][2];
            
        int determinante = a * (e * i - f * h) 
                         - b * (d * i - f * g) 
                         + c * (d * h - e * g);
                        
        return determinante;
    }

             
    public static int calcularDeterminante4x4(int[][] matriz) {
        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[0][3];
        int e = matriz[1][0];
        int f = matriz[1][1];
        int g = matriz[1][2];
        int h = matriz[1][3];
        int i = matriz[2][0];
        int j = matriz[2][1];
        int k = matriz[2][2];
        int l = matriz[2][3];
        int m = matriz[3][0];
        int n = matriz[3][1];
        int o = matriz[3][2];
        int p = matriz[3][3];
        
        int det = a * (f * (k * p - o * l) - g * (j * p - n * l) + h * (j * o - n * k))
                - b * (e * (k * p - o * l) - g * (i * p - m * l) + h * (i * o - m * k))
                + c * (e * (j * p - n * l) - f * (i * p - m * l) + h * (i * n - m * j))
                - d * (e * (j * o - n * k) - f * (i * o - m * k) + g * (i * n - m * j));
        
        return det;
    }

    
    public static int calcularDeterminante5x5(int[][] matriz) {
        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[0][3];
        int e = matriz[0][4];
        int f = matriz[1][0];
        int g = matriz[1][1];
        int h = matriz[1][2];
        int i = matriz[1][3];
        int j = matriz[1][4];
        int k = matriz[2][0];
        int l = matriz[2][1];
        int m = matriz[2][2];
        int n = matriz[2][3];
        int o = matriz[2][4];
        int p = matriz[3][0];
        int q = matriz[3][1];
        int r = matriz[3][2];
        int s = matriz[3][3];
        int t = matriz[3][4];
        int u = matriz[4][0];
        int v = matriz[4][1];
        int w = matriz[4][2];
        int x = matriz[4][3];
        int y = matriz[4][4];
        
        int det = a * (g * (m * (s * y - t * x) - n * (r * y - t * w) + o * (r * x - s * w)) 
                     - h * (l * (s * y - t * x) - n * (q * y - t * v) + o * (q * x - s * v)) 
                     + i * (l * (r * y - t * w) - m * (q * y - t * v) + o * (q * w - r * v)) 
                     - j * (l * (r * x - s * w) - m * (q * x - s * v) + n * (q * w - r * v)))
                 - b * (f * (m * (s * y - t * x) - n * (r * y - t * w) + o * (r * x - s * w)) 
                     - h * (k * (s * y - t * x) - n * (p * y - t * u) + o * (p * x - s * u)) 
                     + i * (k * (r * y - t * w) - m * (p * y - t * u) + o * (p * w - r * u)) 
                     - j * (k * (r * x - s * w) - m * (p * x - s * u) + n * (p * w - r * u)))
                 + c * (f * (l * (s * y - t * x) - n * (q * y - t * v) + o * (q * x - s * v)) 
                     - g * (k * (s * y - t * x) - n * (p * y - t * u) + o * (p * x - s * u)) 
                     + i * (k * (q * y - t * v) - l * (p * y - t * u) + o * (p * v - q * u)) 
                     - j * (k * (q * x - s * v) - l * (p * x - s * u) + n * (p * v - q * u)))
                 - d * (f * (l * (r * y - t * w) - m * (q * y - t * v) + o * (q * w - r * v)) 
                     - g * (k * (r * y - t * w) - m * (p * y - t * u) + o * (p * w - r * u)) 
                     + h * (k * (q * y - t * v) - l * (p * y - t * u) + o * (p * v - q * u)) 
                     - j * (k * (q * w - r * v) - l * (p * w - r * u) + m * (p * v - q * u)))
                 + e * (f * (l * (r * x - s * w) - m * (q * x - s * v) + n * (q * w - r * v)) 
                     - g * (k * (r * x - s * w) - m * (p * x - s * u) + n * (p * w - r * u)) 
                     + h * (k * (q * x - s * v) - l * (p * x - s * u) + n * (p * v - q * u)) 
                     - i * (k * (q * w - r * v) - l * (p * w - r * u) + m * (p * v - q * u)));
        
        return det;
    }
    

    public static String[][] calcularInversa(int[][] matriz) {
        int n = matriz.length;
        int determinante;
        int[][] adjunta;
        String[][] resultado;

        if (n == 3) {
            determinante = calcularDeterminante3x3(matriz);
            if (determinante == 0) {
                throw new ArithmeticException("La matriz no tiene inversa porque su determinante es cero.");
            }
            adjunta = new int[3][3];
            resultado = new String[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    adjunta[i][j] = cofactor3x3(matriz, i, j);
                }
            }
        } else if (n == 4) {
            determinante = calcularDeterminante4x4(matriz);
            if (determinante == 0) {
                throw new ArithmeticException("La matriz no tiene inversa porque su determinante es cero.");
            }
            adjunta = new int[4][4];
            resultado = new String[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    adjunta[i][j] = cofactor4x4(matriz, i, j);
                }
            }
        } else if (n == 5) {
            determinante = calcularDeterminante5x5(matriz);
            if (determinante == 0) {
                throw new ArithmeticException("La matriz no tiene inversa porque su determinante es cero.");
            }
            adjunta = new int[5][5];
            resultado = new String[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    adjunta[i][j] = cofactor5x5(matriz, i, j);
                }
            }
        } else {
            throw new IllegalArgumentException("La matriz debe ser de tamaño 3x3, 4x4 o 5x5.");
        }

        // Transposición de la matriz adjunta
        int[][] transpuesta = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[i][j] = adjunta[j][i];
            }
        }

        // Convertir la matriz transpuesta a una matriz de fracciones simplificadas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = simplifyFraction(transpuesta[i][j], determinante);
            }
        }

        return resultado;
    }

    private static int cofactor3x3(int[][] matriz, int fila, int columna) {
        int[][] submatriz = new int[2][2];
        int subFila = 0;
        for (int i = 0; i < 3; i++) {
            if (i == fila) continue;
            int subColumna = 0;
            for (int j = 0; j < 3; j++) {
                if (j == columna) continue;
                submatriz[subFila][subColumna] = matriz[i][j];
                subColumna++;
            }
            subFila++;
        }
        return ((fila + columna) % 2 == 0 ? 1 : -1) * (submatriz[0][0] * submatriz[1][1] - submatriz[0][1] * submatriz[1][0]);
    }

    private static int cofactor4x4(int[][] matriz, int fila, int columna) {
        int[][] submatriz = new int[3][3];
        int subFila = 0;
        for (int i = 0; i < 4; i++) {
            if (i == fila) continue;
            int subColumna = 0;
            for (int j = 0; j < 4; j++) {
                if (j == columna) continue;
                submatriz[subFila][subColumna] = matriz[i][j];
                subColumna++;
            }
            subFila++;
        }
        return ((fila + columna) % 2 == 0 ? 1 : -1) * calcularDeterminante3x3(submatriz);
    }

    private static int cofactor5x5(int[][] matriz, int fila, int columna) {
        int[][] submatriz = new int[4][4];
        int subFila = 0;
        for (int i = 0; i < 5; i++) {
            if (i == fila) continue;
            int subColumna = 0;
            for (int j = 0; j < 5; j++) {
                if (j == columna) continue;
                submatriz[subFila][subColumna] = matriz[i][j];
                subColumna++;
            }
            subFila++;
        }
        return ((fila + columna) % 2 == 0 ? 1 : -1) * calcularDeterminante4x4(submatriz);
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

    // Operaciones Basicas | Matrices mas de uno
    
    public static int[][] calcularSuma(int[][] matrizA, int[][] matrizB) {
        
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        
        int[][] resultado = new int[filas][columnas];

        for (int x = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {
                resultado[x][y] = matrizA[x][y] + matrizB[x][y];
            }
        }
        
        return resultado;
    }
    
    public static int[][] calcularResta(int[][] matrizA, int[][] matrizB) {
        
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        
        int[][] resultado = new int[filas][columnas];

        for (int x = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {
                resultado[x][y] = matrizA[x][y] - matrizB[x][y];
            }
        }
        
        return resultado;
    }

    public static int[][] calcularMultiplicacion(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }



    public static String[][] calcularDivision(int[][] matrizA, int[][] matrizB) {
        String[][] inversaB = calcularInversa(matrizB);
        int filas = matrizA.length;
        int columnas = inversaB[0].length;
        int n = matrizA[0].length;
        String[][] resultado = new String[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numeradorResultado = 0;
                int denominadorResultado = 1;
                for (int k = 0; k < n; k++) {
                    String[] fractionB = inversaB[k][j].split("/");
                    int numeradorB = Integer.parseInt(fractionB[0]);
                    int denominadorB = Integer.parseInt(fractionB[1]);

                    int numeradorProducto = matrizA[i][k] * numeradorB;
                    int denominadorProducto = denominadorB;

                    if (k == 0) {
                        numeradorResultado = numeradorProducto;
                        denominadorResultado = denominadorProducto;
                    } else {
                        numeradorResultado = numeradorResultado * denominadorProducto + numeradorProducto * denominadorResultado;
                        denominadorResultado *= denominadorProducto;
                    }

                    // Simplificar la fracción
                    int gcd = gcd(numeradorResultado, denominadorResultado);
                    numeradorResultado /= gcd;
                    denominadorResultado /= gcd;

                    // Asegurarse de que el denominador sea positivo
                    if (denominadorResultado < 0) {
                        numeradorResultado *= -1;
                        denominadorResultado *= -1;
                    }
                }
                resultado[i][j] = numeradorResultado + "/" + denominadorResultado;
            }
        }

        return resultado;
    }








    
   
}