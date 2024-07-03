package sistemaDeEcuaciones;

import java.util.Scanner;

public class SistemaEcuaciones {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la dimensión del sistema de ecuaciones (2 o 3): ");
        int n = scanner.nextInt();

        if (n == 2) {
            resolverSistema2x2(scanner);
        } else if (n == 3) {
            resolverSistema3x3(scanner);
        } else {
            System.out.println("Dimensión no válida.");
        }
    }

    public static void resolverSistema2x2(Scanner scanner) {
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double determinante = a1 * b2 - a2 * b1;

        if (determinante == 0) {
            System.out.println("El sistema no tiene solución única.");
        } else {
            double x = (c1 * b2 - c2 * b1) / determinante;
            double y = (a1 * c2 - a2 * c1) / determinante;
        }
    }

    public static void resolverSistema3x3(Scanner scanner) {
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        double d1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double a3 = scanner.nextDouble();
        double b3 = scanner.nextDouble();
        double c3 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        double determinante = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);

        if (determinante == 0) {
            System.out.println("El sistema no tiene solución única.");
        } else {
            double x = (d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2)) / determinante;
            double y = (a1 * (d2 * c3 - d3 * c2) - d1 * (a2 * c3 - a3 * c2) + c1 * (a2 * d3 - a3 * d2)) / determinante;
            double z = (a1 * (b2 * d3 - b3 * d2) - b1 * (a2 * d3 - a3 * d2) + d1 * (a2 * b3 - a3 * b2)) / determinante;
            System.out.println("La solución del sistema es: x = " + x + ", y = " + y + ", z = " + z);
        }
    }
}
