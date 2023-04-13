package ejercicio3;

import java.util.Scanner;

import ejercicio3.Pizza.Estado;
import ejercicio3.Pizza.Tamaño;
import ejercicio3.Pizza.Tipo;

public class Main {

	public static void main(String[] args) {
		int codigo;
		String tamaño;
		String tipo;
		String estado;
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
				System.out.print("Inserte el tamaño de la Pizza (MEDIANA/GRANDE): ");
				tamaño = sc.next();
				pizzas[pizzas.length-1].setTamaño(Tamaño.valueOf(tamaño));
				System.out.print("Inserte el tipo de la Pizza (MARGARITA, CUATROQUESOS, FUNGUI): ");
				tipo = sc.next();
				pizzas[pizzas.length-1].setTipo(Tipo.valueOf(tipo));
				break;
			case 3:
				System.out.println("Inserte el codigo de la pizza que ha sido servida: ");
				libre = sc.nextInt();
				pizzas[libre].setEstado(Estado.valueOf("SERVIDA"));
				break;
			case 4:
				break;
			}
			System.out.println();
		}
		sc.close();
	}
}
