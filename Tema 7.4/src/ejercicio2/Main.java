package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Gestisimal[] gestisimal = new Gestisimal[0];
		int codigo;
		String descripcion;
		double precioc;
		double preciov;
		int stock;
		int libre;
		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		while (opcion != 7) {
			System.out.print("GESTISIMAL\n" + "====================\n"
					+ " 1. Listado.\n 2. Alta\n 3. Baja\n 4. Modificación\n 5. Entrada de Mercancia\n 6. Salida de Mercancia\n 7. Salir\n"
					+ "¿Qué desea hacer? ");
			opcion = sc.nextInt();
			System.out.println();
			switch (opcion) {
			case 1:
				if (gestisimal.length != 0) {
					for (int i = 0; i < gestisimal.length; i++) {
						System.out.println(gestisimal[i].toString());
						System.out.println();
					}
				}
				break;
			case 2:
				gestisimal = Arrays.copyOf(gestisimal, gestisimal.length + 1);
				gestisimal[gestisimal.length - 1] = new Gestisimal();
				gestisimal[gestisimal.length - 1].setCodigo(gestisimal.length);
				System.out.print("Introduzca una descripción del producto: ");
				descripcion = sc.nextLine();
				sc.nextLine();
				gestisimal[gestisimal.length - 1].setDescripcion(descripcion);
				System.out.print("Introduzca el precio de compra: ");
				precioc = sc.nextDouble();
				gestisimal[gestisimal.length - 1].setPrecioc(precioc);
				System.out.print("Introduzca el precio de venta: ");
				preciov = sc.nextDouble();
				gestisimal[gestisimal.length - 1].setPrecioc(preciov);
				System.out.print("Introduzca la cantidad en stock: ");
				stock = sc.nextInt();
				gestisimal[gestisimal.length - 1].setStock(stock);
				break;
			case 3:
				System.out.print("Introduzca el codigo del elemento que desea dar de baja: ");
				libre = sc.nextInt();
				System.arraycopy(gestisimal, libre + 1, gestisimal, libre, gestisimal.length - libre - 1);
				gestisimal = Arrays.copyOf(gestisimal, gestisimal.length - 1);
				if (gestisimal.length != 0) {
					for (int i = 0; i < gestisimal.length; i++) {
						gestisimal[i].setCodigo(i + 1);
					}
				}
				break;
			case 4:
				System.out.print("Introduzca el codigo del elemento que desea modificar: ");
				libre = sc.nextInt();
				System.out.print("Introduzca una descripción del producto: ");
				descripcion = sc.nextLine();
				sc.nextLine();
				gestisimal[libre-1].setDescripcion(descripcion);
				System.out.print("Introduzca el precio de compra: ");
				precioc = sc.nextDouble();
				gestisimal[libre-1].setPrecioc(precioc);
				System.out.print("Introduzca el precio de venta: ");
				preciov = sc.nextDouble();
				gestisimal[libre-1].setPrecioc(preciov);
				System.out.print("Introduzca la cantidad en stock: ");
				stock = sc.nextInt();
				gestisimal[libre-1].setStock(stock);
				break;
			case 5:
				System.out.print("Introduzca la candidad de stock a añadir: ");
				stock = sc.nextInt();
				System.out.print("Introduzca el codigo del articulo: ");
				libre = sc.nextInt();
				gestisimal[libre-1].setStock(gestisimal[libre-1].getStock() + stock);
				break;
			case 6:
				System.out.print("Introduzca la candidad de stock a disminuir: ");
				stock = sc.nextInt();
				System.out.print("Introduzca el codigo del articulo: ");
				libre = sc.nextInt();
				gestisimal[libre-1].setStock(gestisimal[libre-1].getStock() - stock);
				break;
			case 7:
				break;
			}
			System.out.println();
		}
		sc.close();
	}

}
