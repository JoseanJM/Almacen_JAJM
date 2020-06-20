package Almacen;

public class Producto {
	
	private String codigo;
	private String nomProd;
	private String descrip;
	private String stock;
	private String pendientes;
	//localizacion para xml
	private String pasillo;
	private String estantes;
	private String estanteria;
	
	
	public Producto() {
		
	}
	
	
	public Producto(String codigo, String nomProd, String descrip, String stock, String pendientes, String pasillo,
			String estantes, String estanteria) {
		super();
		this.codigo = codigo;
		this.nomProd = nomProd;
		this.descrip = descrip;
		this.stock = stock;
		this.pendientes = pendientes;
		this.pasillo = pasillo;
		this.estantes = estantes;
		this.estanteria = estanteria;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getPendientes() {
		return pendientes;
	}
	public void setPendientes(String pendientes) {
		this.pendientes = pendientes;
	}
	public String getPasillo() {
		return pasillo;
	}
	public void setPasillo(String pasillo) {
		this.pasillo = pasillo;
	}
	public String getEstantes() {
		return estantes;
	}
	public void setEstantes(String estantes) {
		this.estantes = estantes;
	}
	public String getEstanteria() {
		return estanteria;
	}
	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}

	
	
}
