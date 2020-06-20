package Almacen;

import java.util.ArrayList;

public class Inventario {

	private ArrayList<Producto> productos;

	public Inventario() {

		this.productos = new ArrayList<Producto>();

	}

	public void addProd(Producto p) {
		this.productos.add(p);
	}

	public int getInvSize() {
		return this.productos.size();
	}
	
	public void removeProd(Producto p) {
		this.productos.remove(p);
	}
	public boolean checkExistsProd(Producto p) {
		return this.productos.contains(p);
	}

}
