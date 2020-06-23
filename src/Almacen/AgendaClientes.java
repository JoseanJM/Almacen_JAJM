package Almacen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AgendaClientes {
	
	private static ArrayList<Cliente> clientes;
	
	public AgendaClientes() {
		
		clientes = new ArrayList <Cliente>();
		
	}
	
	//funcion para añadir clientes
	public static void addCliente(Cliente c, ArrayList<Cliente> clientes) {

		

		Scanner sn = new Scanner(System.in);
		System.out.println("Rellena los datos del cliente:");
		System.out.println("Nombre:");
		c.setNombre(sn.nextLine());//
		System.out.println("Apellido1:");
		c.setApellido1(sn.nextLine());
		System.out.println("Apellido2:");
		c.setApellido2(sn.nextLine());
		System.out.println("Email:");
		c.setEmail(sn.nextLine());
		System.out.println("telefono:");
		c.setTelefono(sn.nextLine());
		System.out.println("Calle:");
		c.setCalle(sn.nextLine());
		System.out.println("Numero de calle:");
		c.setNumero(sn.nextLine());
		System.out.println("Codigo Postal:");
		c.setCodPostal(sn.nextLine());
		System.out.println("Poblacion:");
		c.setPoblacion(sn.nextLine());
		System.out.println("Pais:");
		c.setPais(sn.nextLine());

		clientes.add(c);
		System.out.println("Cliente añadido con exito\n");
		System.out.println("El total de clientes es: " + " " + clientes.size() + "\n");
	}
	
	//funcion para eliminar clientes a traves de su telefono
	public static void deleteCliente(ArrayList<Cliente> clientes) {
		Scanner sn3 = new Scanner(System.in);
		System.out.println("Dame el telefono del cliente:");
		String cliBuscado = sn3.nextLine();// cliBuscado = telefono cliente buscado
		boolean cliEncontrado = false;
		Iterator<Cliente> it = clientes.iterator();
		Cliente tmpAnalizando;
		while (it.hasNext() && cliEncontrado == false) {
			tmpAnalizando = it.next();
			if (tmpAnalizando.getTelefono().equals(cliBuscado)) {
				cliEncontrado = true;
				System.out.println("Se va a borrar el cliente con el telefono" + cliBuscado);

				clientes.remove(tmpAnalizando);
				cliEncontrado = true;

			} // fin if
			else {
			}
		} // fin while
		if (cliEncontrado == false) {
			System.out.println("El cliente con ese telefono no se ha encontrado");
		} // fin if

	}
	
	//funcion para modificar un cliente
	public static void modifCliente(ArrayList<Cliente> clientes) {
		Scanner sn4 = new Scanner(System.in);
		System.out.println("Dame el telefono del cliente a modificar :");
		String cliBuscado = sn4.nextLine();// prodbuscado = nom producto buscado
		boolean cliEncontrado = false;
		Cliente cliModif = new Cliente();
		Iterator<Cliente> it = clientes.iterator();
		Cliente tmpAnalizando;

		while (it.hasNext()) {
			tmpAnalizando = it.next();
			if (tmpAnalizando.getTelefono().equals(cliBuscado)) {
				cliEncontrado = true;
				System.out.println("Introduzca los nuevos datos para el cliente con telefono " + cliBuscado);
				System.out.println("Nombre:");
				tmpAnalizando.setNombre(sn4.nextLine());
				System.out.println("Apellido1:");
				tmpAnalizando.setApellido1(sn4.nextLine());
				System.out.println("Apellido2:");
				tmpAnalizando.setApellido2(sn4.nextLine());
				System.out.println("Email:");
				tmpAnalizando.setEmail(sn4.nextLine());
				System.out.println("Telefono:");
				tmpAnalizando.setTelefono(sn4.nextLine());
				System.out.println("Calle:");
				tmpAnalizando.setCalle(sn4.nextLine());
				System.out.println("Numero de calle:");
				tmpAnalizando.setCalle(sn4.nextLine());
				System.out.println("Codigo Postal:");
				tmpAnalizando.setCodPostal(sn4.nextLine());
				System.out.println("Poblacion:");
				tmpAnalizando.setPoblacion(sn4.nextLine());
				System.out.println("Pais:");
				tmpAnalizando.setPais(sn4.nextLine());
				
				

				System.out.println("Los nuevos datos para el cliente son:");
				System.out.println(tmpAnalizando.toString());
				

			} // fin if
			else {
			}

		} // fin while
		if (cliEncontrado == false) {
			System.out.println("El cliente con ese telefono no se ha encontrado");
		} // fin if
	}
	

}
