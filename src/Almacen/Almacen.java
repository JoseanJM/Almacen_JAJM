package Almacen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Almacen {

	static ArrayList<Producto> productos = new ArrayList<Producto>();
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	public static void main(String[] args) throws IOException {
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
			System.out.println("3.- CREA un PEDIDO");
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
				menuPedido();
				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}

		}
		/*
		 * Aqui definimos la cabecera y el elemento root para el xml
		 * */
		String header = "<?xml version=\"1.0\" encoding=\"UTF-8\">\n";
		String root = "<Almacen>\n";
		String xml = "";
		xml += header + root;
		//
		for (Producto p: productos) {
			xml += p;
			//System.out.println(xml);
		}
		for (Cliente c: clientes) {
			xml += "\n"+c;
			//System.out.println(xml);
		}
		for(Pedido ped:pedidos) {
			xml += "\n"+ped;
		}
		String close_root = "\n</Almacen>";

		xml += close_root;
		writeToFile(xml, "Almacen.xml");

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
	
	public static void menuPedido() {
		Scanner sn8 = new Scanner(System.in);
		Scanner sn9 = new Scanner(System.in);
		boolean salir = false;
		boolean salida = false;
		int opcion, opc; // Guardaremos la opcion del usuario
		String fruta = "";
		String prodsPedido = "";
		String cantPedido = "";
		String cli = "";
		while (!salir) {
			System.out.println("¿Que quieres hacer?");
			System.out.println("1.- Rellenar datos pedido");
			System.out.println("2.- SALIR");
			System.out.println("Elige una de las opciones");
			opcion = sn8.nextInt();
			switch (opcion) {
			case 1:// Rellenar datos para hacer un pedido
				Pedido ped = new Pedido();// creamos un objeto de tipo pedido
				while (!salida) {
					System.out.println("¿Que deseas hacer?");
					System.out.println("3.- Añadir un producto");
					System.out.println("4.- Rellenar resto de datos del pedido");
					System.out.println("5.- SALIR");
					System.out.println("Elige una de las opciones");
					opc = sn9.nextInt();
					switch (opc) {
					case 3:
						System.out.println("Disponemos de los siguientes productos y cantidades:");
						// recorremos el arraylist de productos para mostrar los nombres y cantidades en
						// stock
						for (Producto p : productos) {
							fruta += p;
							System.out.println("Producto : " + p.getNomProd());
							System.out.println("Cantidad disponible : " + p.getStock() + "\n");
						}
						System.out.println("Elige un producto:");
						prodsPedido += sn9.nextLine();
						System.out.println("Producto elegido!");
						
						System.out.println("Cantidad:");
						cantPedido += sn9.nextLine();
						System.out.println("Cantidad elegida!");
						break;
					
					case 4:
					ped.setProdsPedido(prodsPedido);// guardamos la lista de productos en pedido
					System.out.println("Productos añadidos al pedido");
					ped.setCantidad(cantPedido);// guardamos la lista de cantidades en pedido
					System.out.println("Cantidades añadidas al pedido");

					System.out.println("Fecha estimada de entrega:");
					ped.setFechaEntrega(sn9.nextLine());
					System.out.println("Fecha de entrega rellenada con exito!");
					
					System.out.println("Tenemos los siguientes clientes, elige uno:");
					for (Cliente c : clientes) {
						cli += c;
						System.out.println("Nombre : " + c.getNombre() + " Apellido1 :" + c.getApellido1()
								+ " Apellido2 : " + c.getApellido2() + " Telefono :" + c.getTelefono());
					}
					/*
					 * Codigo para buscar cliente concreto
					 * */
					System.out.println("Telefono del cliente :");
					String cliBuscado = sn9.nextLine();// cliBuscado = telefono cliente buscado
					boolean cliEncontrado = false;
					Iterator<Cliente> it = clientes.iterator();
					Cliente tmpAnalizando2;
					while (it.hasNext() && cliEncontrado == false) {
						tmpAnalizando2 = it.next();
						/*
						 * codigo para comparar cliente buscado con arraylist clientes
						 * */
						if (tmpAnalizando2.getTelefono().equals(cliBuscado)) {
							/*
							 * Si hemos encontrado el cliente, rellenamos el resto de datos del pedido
							 * con los datos de direccion de ese cliente
							 * */
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
							System.out.println("Pedido completado con exito!");

						} // fin if
						else {
						}
					} // fin while iterador
					if (cliEncontrado == false) {
						System.out.println("El cliente con ese telefono no se ha encontrado");
					} // fin if
					break;
					case 5:
						salida=true;
					default:
						System.out.println("Solo números entre 3 y 5");
					}//fin switch	

				}//fin while salida
				break;
			case 2:// salir
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 2");
			}//fin switch

			}// fin while salir
		}

	
	
	
	//funcion para escribir fichero xml
	public static void writeToFile(String xml, String fileName) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		try {
			writer.write(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		writer.close();
		}
	}
	
	
	/*
	 * no se como acabar esta parte para poder arrancar el programa desde el backup del xml
	public static void leerProdXML() {
		// hay que crear los iniciadores, y el propio archivo.
		File archivoXML= new File("Almacen.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		//crear el documento y pasarle como parametro el File creado anteriormente
		Document doc= db.parse(archivoXML);
		//para eliminar espacios en blanco en las etiquetas
		doc.getDocumentElement().normalize();
		//hay que decirle que tiene que tener en cuenta para saber que es un nodo.
		Element raiz = doc.getDocumentElement();//el elemento raiz
		NodeList almacenNodos = raiz.getElementsByTagName("Almacen");
		
		NodeList productoNodos =doc.getElementsByTagName(“Producto”);
		for(int i =0; i< productoNodos.getLength(); i++) {
			Node pNodo = productoNodos.item(i);
			Element pElement = (Element)pNodo;
			Node codigoNodo =pElement.getElementsByTagName("codigo").item(0);
			Element codigoElement = (Element)codigoNodo;
			String codigo = codigoElement.getTextContent();
			
			Node nomNodo =pElement.getElementsByTagName("nomProd").item(0);
			Element nomProdElement = (Element)nomNodo;
			String nomProd = nomProdElement.getTextContent();
			
			Node descripNodo =pElement.getElementsByTagName("descrip").item(0);
			Element descripElement = (Element)descripNodo;
			String descrip = descripElement.getTextContent();
			
			Node stockNodo =pElement.getElementsByTagName("stock").item(0);
			Element stockElement = (Element)stockNodo;
			String stock = stockElement.getTextContent();
			
			Node pendientesNodo =pElement.getElementsByTagName("pendientes").item(0);
			Element pendientesElement = (Element)pendientesNodo;
			String pendientes = pendientesElement.getTextContent();
			
			Node pasilloNodo =pElement.getElementsByTagName("pasillo").item(0);
			Element pasilloElement = (Element)pasilloNodo;
			String pasillo = pasilloElement.getTextContent();
			
			Node estanteNodo =pElement.getElementsByTagName("estante").item(0);
			Element estanteElement = (Element)estanteNodo;
			String estante = estanteElement.getTextContent();
			
			Node estanteriaNodo =pElement.getElementsByTagName("estanteria").item(0);
			Element estanteriaElement = (Element)estanteriaNodo;
			String estanteria = estanteriaElement.getTextContent();
			
			Producto p = new Producto();
			p.setCodigo(codigo);
			p.setNomProd(nomProd);
			p.setDescrip(descrip);
			p.setStock(stock);
			p.setPendientes(pendientes);
			p.setPasillo(pasillo);
			p.setEstante(estante);
			p.setEstanteria(estanteria);
			
			
			productos.addElement(p);
			
			
		}
		
		
	}
	*/

}
