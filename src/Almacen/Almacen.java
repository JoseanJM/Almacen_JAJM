package Almacen;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	static ArrayList<Producto> productos = new ArrayList<Producto>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		System.out.println("\n Bienvenido a la aplicacion de Almacen \n");
		// menu principal
		while (!salir) {

			System.out.println("Elige una categoria :");
			System.out.println("1.- PRODUCTO");
			System.out.println("2.- CLIENTE");
			System.out.println("3.- PEDIDO");
			System.out.println("4.- SALIR");

			System.out.println("Elige una de las opciones");
			opcion = sn.nextInt();

			switch (opcion) {
			case 1:
				menuProducto();
				break;
			case 2:
				System.out.println("Has seleccionado la opcion 2");
				break;
			case 3:
				System.out.println("Has seleccionado la opcion 3");
				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}

		}

	}// fin main

	public static void menuProducto() {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		// Producto p = new Producto(); //creo un producto p

		while (!salir) {

			System.out.println("¿Que quieres hacer? ");
			System.out.println("1.- Añadir un PRODUCTO ");
			System.out.println("2.- Eliminar un PRODUCTO ");
			System.out.println("3.- Muestrame todos los productos");
			System.out.println("4.- SALIR ");

			System.out.println("Elige una de las opciones");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:// añadir
				Producto p = new Producto(); // creo un producto p
				System.out.println("Dame los datos del producto a añadir");
				Inventario.addProd(p, productos);

				break;
			case 2:// eliminar
				Inventario.deleteProd(productos);
				System.out.println("Vamos a imprimir el inventario");
				productos.forEach((impProd) -> {
					System.out.println(impProd);
				});

				break;
			case 3:// modificar
				System.out.println("Vamos a modificar un producto");
				Inventario.modifProd(productos);

				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}
		}

	}

}
