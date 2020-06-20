package Almacen;

import java.util.ArrayList;

public class AgendaClientes {
	
	private ArrayList<Cliente> clientes;
	
	public AgendaClientes() {
		
		this.clientes = new ArrayList <Cliente>();
		
	}
	
	public void addCli(Cliente c) {
		this.clientes.add(c);
	}

	public int getAgeSize() {
		return this.clientes.size();
	}
	
	public void removeCli(Cliente c) {
		this.clientes.remove(c);
	}
	public boolean checkExistsCli(Cliente c) {
		return this.clientes.contains(c);
	}
	
	

}
