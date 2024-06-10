package vectores;

import java.util.Scanner;
import java.lang.Math; 


public class VectoresCalculadora {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese la cantidad de números para ambos vectores: ");
	
	int i = 0;
	
	int[] vector1 = new int[100];
	
	int[] vector2 = new int[100];
	
	int vectorCantidad = scanner.nextInt();
	
	for(i = 0;i<vectorCantidad;i++) {
		System.out.println("Ingrese el valor " + (i+1) + " del primer vector: ");
		
		vector1[i] = scanner.nextInt();
	}
	
	for(i = 0;i<vectorCantidad;i++) {
		System.out.println("Ingrese el valor " + (i+1) + " del segundo vector: ");
		
		vector2[i] = scanner.nextInt();
	}
	
	System.out.println("Estas son las opciones de cálculo: ");
	
	System.out.println("1 para suma");
	System.out.println("2 para resta");
	System.out.println("3 para multiplicación por un escalar");
	System.out.println("4 para producto escalar");
	System.out.println("5 para producto vectorial");

	System.out.print("Ingrese una opción: ");
	
	int respuestaVector = scanner.nextInt();

	int[] nuevoVector = new int[100];
	
	switch(respuestaVector) {
		case 1:
		for(i = 0; i < vectorCantidad; i++) {
			nuevoVector[i] = vector1[i] + vector2[i];
		}
		
		System.out.print("La suma de vectores da: ");
		System.out.print("[ ");
		for(i = 0;i < vectorCantidad; i++) {
			System.out.print(nuevoVector[i] + " ");
		}
		
		System.out.print("]");
		
		break;
	case 2:
		for(i = 0; i < vectorCantidad; i++) {
			nuevoVector[i] = vector1[i] - vector2[i];
		}
		
		System.out.print("La resta de vectores da: ");
		for(i = 0;i < vectorCantidad; i++) {
			System.out.print("[ "+ nuevoVector[i] + " ");
			System.out.print("]");
		}
		
		break;
		
	case 3:
		System.out.print("Ingrese el escalar: ");
		
		int escalar = scanner.nextInt();
		
		for(i = 0; i<vectorCantidad; i++) {
			nuevoVector[i] = vector1[i] * escalar;
		}
		
		System.out.print("El primer vector multiplicado por el escalar da: ");
		for(i = 0; i < vectorCantidad; i++) {
			System.out.print(nuevoVector[i] + " ");
		}
		
		System.out.print("\n");
		
		for(i = 0; i<vectorCantidad; i++) {
			nuevoVector[i] = vector2[i] * escalar;
		}
		
		System.out.print("El segundo vector multiplicado por el escalar da: ");
		for(i = 0;i < vectorCantidad; i++) {
			System.out.print(nuevoVector[i] + " ");
		}
		break;
	
	case 4:
		int productoEscalar = 0;
		for(i = 0; i<vectorCantidad; i++) {
			productoEscalar += vector1[i] * vector2[i];
		}

		System.out.print("El producto escalar da: " + productoEscalar);

		break;
	
	case 5:
        if (vectorCantidad == 3) {
            nuevoVector[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
            nuevoVector[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
            nuevoVector[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
            System.out.println("El producto vectorial da: ");
            System.out.print("[ " + nuevoVector[0] + ", " + nuevoVector[1] + ", " + nuevoVector[2] + " ]");
        } else {
            System.out.println("El producto vectorial solo puede definirse en tres dimensiones.");
        }					
		break;
}
}
}
