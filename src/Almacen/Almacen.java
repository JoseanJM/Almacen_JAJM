package Almacen;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	static ArrayList<Producto> productos = new ArrayList<Producto>();
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

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
				menuCliente();
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

	/*
	 * Funcion para el menu relativo a las opciones con producto
	 * */
	public static void menuProducto() {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		

		while (!salir) {

			System.out.println("¿Que quieres hacer? ");
			System.out.println("1.- Añadir un PRODUCTO ");
			System.out.println("2.- Eliminar un PRODUCTO ");
			System.out.println("3.- Modificar un PRODUCTO");
			System.out.println("4.- Imprimir el INVENTARIO ");
			System.out.println("5.- SALIR (Menu PRODUCTO)");

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
			case 4://imprimir productos
				System.out.println("Vamos a imprimir el inventario");
				productos.forEach((impProd) -> {
					System.out.println(impProd);
				});
				
				break;
			case 5:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 5");
			}
		}

	}
	
	
	
	/*
	 * Funcion para el menu relativo a las opciones con cliente
	 * */
	public static void menuCliente() {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		

		while (!salir) {

			System.out.println("¿Que quieres hacer? ");
			System.out.println("1.- Añadir un CLIENTE ");
			System.out.println("2.- Eliminar un CLIENTE ");
			System.out.println("3.- Modificar un CLIENTE");
			System.out.println("4.- Imprimir la AGENDA ");
			System.out.println("5.- SALIR(Menu CLIENTE)");

			System.out.println("Elige una de las opciones");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:// añadir
				Cliente c = new Cliente(); // creo un cliente c
				System.out.println("Dame los datos del cliente a añadir");
				AgendaClientes.addCliente(c, clientes);

				break;
			case 2:// eliminar
				AgendaClientes.deleteCliente(clientes);
				
				
				System.out.println("Vamos a imprimir la Agenda");
				clientes.forEach((impAgenda) -> {
					System.out.println(impAgenda);
				});
				

				break;
			case 3:// modificar
				System.out.println("Vamos a modificar un cliente");
				AgendaClientes.modifCliente(clientes);
				

				break;
			case 4://imprimir clientes
				System.out.println("Vamos a imprimir la Agenda");
				clientes.forEach((impAgenda) -> {
					System.out.println(impAgenda);
				});
				
				break;
			case 5:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 5");
			}
		}

	}

}
