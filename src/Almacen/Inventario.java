package Almacen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Inventario {

	private static ArrayList<Producto> productos;

	public Inventario() {

		productos = new ArrayList<Producto>();

	}

	public static void addProd(Producto p, ArrayList<Producto> productos) {

		// ArrayList <Producto> productos= new ArrayList <Producto>();

		Scanner sn = new Scanner(System.in);
		System.out.println("Rellena los datos del producto:");
		System.out.println("Codigo:");
		p.setCodigo(sn.nextLine());
		System.out.println("Nombre:");
		p.setNomProd(sn.nextLine());
		System.out.println("Descripcion:");
		p.setDescrip(sn.nextLine());
		System.out.println("Cuantos hay en stock:");
		p.setStock(sn.nextLine());
		System.out.println("Cuantos hay pendientes:");
		p.setPendientes(sn.nextLine());
		System.out.println("Donde esta ubicado");
		System.out.println("Pasillo:");
		p.setPasillo(sn.nextLine());
		System.out.println("Estante:");
		p.setEstante(sn.nextLine());
		System.out.println("Estanteria:");
		p.setEstanteria(sn.nextLine());

		productos.add(p);
		System.out.println("Producto añadido con exito\n");
		System.out.println("El total de productos es: " + " " + productos.size() + "\n");
	}

	public static int getInvSize() {
		return productos.size();
	}

	public static boolean checkExistsProd(Producto p, ArrayList<Producto> productos) {
		return productos.contains(p);
	}

	public static void deleteProd(ArrayList<Producto> productos) {
		Scanner sn3 = new Scanner(System.in);
		System.out.println("Dame el nombre del producto:");
		String prodBuscado = sn3.nextLine();// prodbuscado = nom producto buscado
		boolean prodEncontrado = false;
		Iterator<Producto> it = productos.iterator();
		Producto tmpAnalizando;
		while (it.hasNext() && prodEncontrado == false) {
			tmpAnalizando = it.next();
			if (tmpAnalizando.getNomProd().equals(prodBuscado)) {
				prodEncontrado = true;
				System.out.println("Se va a borrar el producto " + prodBuscado);

				productos.remove(tmpAnalizando);
				prodEncontrado = true;

			} // fin if
			else {
			}
		} // fin while
		if (prodEncontrado == false) {
			System.out.println("El producto con ese nombre no se ha encontrado");
		} // fin if

	}

	public static void modifProd(ArrayList<Producto> productos) {
		Scanner sn4 = new Scanner(System.in);
		System.out.println("Dame el nombre del producto a modificar :");
		String prodBuscado = sn4.nextLine();// prodbuscado = nom producto buscado
		boolean prodEncontrado = false;
		Producto prodModif = new Producto();
		Iterator<Producto> it = productos.iterator();
		Producto tmpAnalizando;

		while (it.hasNext()) {
			tmpAnalizando = it.next();
			if (tmpAnalizando.getNomProd().equals(prodBuscado)) {
				prodEncontrado = true;
				System.out.println("Introduzca los nuevos datos para el prodcucto " + prodBuscado);
				System.out.println("Codigo:");
				tmpAnalizando.setCodigo(sn4.nextLine());
				System.out.println("Nombre:");
				tmpAnalizando.setNomProd(sn4.nextLine());
				System.out.println("Descripcion:");
				tmpAnalizando.setDescrip(sn4.nextLine());
				System.out.println("Cuantos hay en stock:");
				tmpAnalizando.setStock(sn4.nextLine());
				System.out.println("Cuantos hay pendientes:");
				tmpAnalizando.setPendientes(sn4.nextLine());
				System.out.println("Donde esta ubicado");
				System.out.println("Pasillo:");
				tmpAnalizando.setPasillo(sn4.nextLine());
				System.out.println("Estante:");
				tmpAnalizando.setEstante(sn4.nextLine());
				System.out.println("Estanteria:");
				tmpAnalizando.setEstanteria(sn4.nextLine());

				System.out.println("Los nuevos datos para el producto son:");
				System.out.println(tmpAnalizando.toString());
				

			} // fin if
			else {
			}

		} // fin while
		if (prodEncontrado == false) {
			System.out.println("El producto con ese nombre no se ha encontrado");
		} // fin if
	}

}
