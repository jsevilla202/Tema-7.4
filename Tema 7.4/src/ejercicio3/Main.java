package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

import ejercicio3.Pizza.Estado;
import ejercicio3.Pizza.Tamano;
import ejercicio3.Pizza.Tipo;

public class Main {

	public static void main(String[] args) {
		String tamano;
		String tipo;
		int opcion = 0;
		int libre;
		Pizza[] pizzas = new Pizza[0];
		
		Scanner sc = new Scanner(System.in);
		while (opcion != 4) {
			System.out.print("PIZZAS\n ====================================\n "
					+ "1. Listado de Pizzas\n 2. Nuevo Pedido\n 3. Pizza servida\n 4. Salir\n¿Qué desea hacer? ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				if (pizzas.length != 0) {
					for (int i = 0; i < pizzas.length; i++) {
						System.out.println(pizzas[i].toString());
						System.out.println();
					}
				}
				break;
			case 2:
				pizzas = Arrays.copyOf(pizzas, pizzas.length+1);
				pizzas[pizzas.length-1] = new Pizza();
				pizzas[pizzas.length-1].setCodigo(pizzas.length);
				System.out.print("Inserte el tamano de la Pizza (MEDIANA/GRANDE): ");
				tamano = sc.next();
				tamano = tamano.toUpperCase();
				pizzas[pizzas.length-1].setTamano(Tamano.valueOf(tamano));
				System.out.print("Inserte el tipo de la Pizza (MARGARITA, CUATROQUESOS, FUNGUI): ");
				tipo = sc.next();
				tipo = tipo.toUpperCase();
				pizzas[pizzas.length-1].setTipo(Tipo.valueOf(tipo));
				break;
			case 3:
				System.out.print("Inserte el codigo de la pizza que ha sido servida: ");
				libre = sc.nextInt();
				pizzas[libre-1].setEstado(Estado.valueOf("SERVIDA"));
				break;
			case 4:
				break;
			}
			System.out.println();
		}
		sc.close();
	}
}
