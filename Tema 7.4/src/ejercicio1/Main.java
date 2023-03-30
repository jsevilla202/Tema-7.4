package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Alumno[] alumnos = new Alumno[30];

		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno();
		}
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		String nombre;
		double notaMedia;
		int pos = 0;
		int modify = 0;
		String buscar;

		while (opcion != 5) {
			System.out.print("ALUMNOS/AS\n" + "====================\n"
					+ " 1. Listado.\n 2. Nuevo Alumno\n 3. Modificar\n 4. Borrar\n 5. Salir\n" + "¿Qué desea hacer? ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				for (int i = 0; i < alumnos.length; i++) {
					if (!(alumnos[i].getNombre() == null)) {
						System.out.println();
						System.out.println(alumnos[i].toString());
					}
				}
				System.out.println();
				break;
			case 2:
				sc.nextLine();
				while (alumnos[pos].getNombre() == null) {
					System.out.print("Inserte el nombre del alumno: ");
					nombre = sc.nextLine();
					alumnos[pos].setNombre(nombre);

					if (alumnos[pos].getNombre() == null) {
						System.out.println("ERROR: Inserte apropiado para el alumno");
						System.out.println();
					}
				}
				while (alumnos[pos].getNotaMedia() < 0) {
					System.out.print("Inserte la nota media: ");
					notaMedia = sc.nextDouble();
					alumnos[pos].setNotaMedia(notaMedia);
					if (alumnos[pos].getNotaMedia() < 0) {
						System.out.println();
						System.out.println("ERROR: La Nota Media no puede ser inferior a 0");
						System.out.println();
					}
				}
				System.out.println();
				pos++;
				break;
			case 3:
				sc.nextLine();
				System.out.print("¿Qué alumno desea buscar? ");
				buscar = sc.nextLine();
				int i = 0;
				while (i < pos) {
					if (alumnos[i].getNombre().equals(buscar)) {
						System.out.print("Inserte su nueva nota: ");
						notaMedia = sc.nextDouble();
						alumnos[i].setNotaMedia(notaMedia);
						if (alumnos[i].getNotaMedia() < 0) {
							i--;
						}
					}
					i++;
				}
				System.out.println();
				break;
			case 4:
				sc.nextLine();
				System.out.print("¿Qué alumno desea eliminar? ");
				buscar = sc.nextLine();
				for (int j = 0; j < pos && alumnos[j].getNombre().equals(buscar); j++) {
					modify = j;
				}
				// En vez de borrar esa posición, se resetea el objeto y listo
				System.arraycopy(alumnos, modify + 1, alumnos, modify, alumnos.length - modify - 1);
				alumnos[alumnos.length - 1] = new Alumno();
				pos--;
				System.out.println();
				break;
			case 5:
				System.out.println("SALIENDO.......");
				break;
			}
		}
		sc.close();
	}

}
