package Almacen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OperPedidos {

	private static ArrayList<Pedido> pedidos;

	public OperPedidos() {

		pedidos = new ArrayList<Pedido>();

	}
	
	//funcion donde añadimos los productos, cantidades y resto de datos al pedido
	public static void addPedido(ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
		Pedido ped = new Pedido();// creamos un objeto de tipo pedido
		String prodsPedido = "";
		String cantPedido = "";
		Scanner sn6 = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		int opc;// opcion para el while interno
		boolean salida = false;
		String fruta = "";
		String cli = "";
		System.out.println("Vamos a hacer un pedido:");
		while (!salir) {
			System.out.println("1.- Rellenar datos pedido");
			System.out.println("2.- SALIR");
			System.out.println("Elige una de las opciones");
			opcion = sn6.nextInt();

			switch (opcion) {
			case 1:// Rellenar datos para hacer un pedido
				while (!salida) {
					System.out.println("Disponemos de los siguientes productos y cantidades:");
					// recorremos el arraylist de productos para mostrar los nombres y cantidades en
					// stock
					for (Producto p : productos) {
						fruta += p;
						System.out.println("Producto : " + p.getNomProd());
						System.out.println("Cantidad disponible : " + p.getStock() + "\n");
					}
					System.out.println("1.- Añadir un producto");
					System.out.println("2.- Rellenar resto de datos del pedido");
					System.out.println("3.- SALIR");
					System.out.println("Elige una de las opciones");
					opc = sn6.nextInt();
					switch (opc) {
					case 1:
						System.out.println("Elige un producto:");
						prodsPedido += sn6.nextLine();
						System.out.println("Cantidad:");
						cantPedido += sn6.nextLine();
						break;
					case 2:
						ped.setProdsPedido(prodsPedido);// guardamos la lista de productos en pedido
						ped.setCantidad(cantPedido);// guardamos la lista de cantidades en pedido

						System.out.println("Fecha estimada de entrega:");
						ped.setFechaEntrega(sn6.nextLine());
						System.out.println("Tenemos los siguientes clientes, elige uno:");
						for (Cliente c : clientes) {
							cli += c;
							System.out.println("Nombre : " + c.getNombre() + " Apellido1 :" + c.getApellido1()
									+ " Apellido2 : " + c.getApellido2() + " Telefono :" + c.getTelefono());
						}
						System.out.println("Telefono del cliente :");
						String cliBuscado = sn6.nextLine();// cliBuscado = telefono cliente buscado
						boolean cliEncontrado = false;
						Iterator<Cliente> it = clientes.iterator();
						Cliente tmpAnalizando2;
						while (it.hasNext() && cliEncontrado == false) {
							tmpAnalizando2 = it.next();
							if (tmpAnalizando2.getTelefono().equals(cliBuscado)) {
								cliEncontrado = true;
								System.out.println("Cliente encontrado!");
								System.out.println("..Añadiendo sus datos a la informacion del pedido");
								// añadimos los campos que nos faltan para completar el pedido
								ped.setDestPedido("\n\t<nombre>"+tmpAnalizando2.getNombre() + "</nombre>\n\t<apellido1>"+ tmpAnalizando2.getApellido1() + "</apellido1>\n\t<apellido2>"
										+ tmpAnalizando2.getApellido2()+"</apellido2>\n\t");
								ped.setCalleDest(tmpAnalizando2.getCalle());
								ped.setNumeroDest(tmpAnalizando2.getNumero());
								ped.setCodPostDest(tmpAnalizando2.getCodPostal());
								ped.setPoblacionDest(tmpAnalizando2.getPoblacion());
								ped.setPaisDest(tmpAnalizando2.getPais());

								cliEncontrado = true;
								pedidos.add(ped);//añadimos nuestro pedido actual a pedidos

							} // fin if
							else {
							}
						} // fin while iterador
						if (cliEncontrado == false) {
							System.out.println("El cliente con ese telefono no se ha encontrado");
						} // fin if

					case 3:
						salida=true;
						break;
					default:
						System.out.println("Solo números entre 1 y 3");
					}//fin switch interno

				}//fin while intermedio

				break;
			case 2:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 2");
			}
		}//fin while mas externo

		System.out.println("");

	}

}
