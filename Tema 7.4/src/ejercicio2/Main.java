package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Gestisimal[] gestisimal = new Gestisimal[0];
		int codigo;
		String descripcion;
		double precioc;
		double preciov;
		int stock;
		int opcion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(opcion!=7) {
			System.out.print("GESTISIMAL\n" + "====================\n"
					+ " 1. Listado.\n 2. Alta\n 3. Baja\n 4. Modificación\n 5. Entrada de Mercancia\n 6.salida de Mercancia\n 7. Salir\n" + "¿Qué desea hacer? ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: 
				for(int i = 0; i<gestisimal.length; i++) {
					gestisimal[i].toString();
					System.out.println();
				}
			case 7:
				break;
			}
			System.out.println();
		}
		
	}

}
