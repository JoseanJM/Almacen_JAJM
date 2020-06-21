package Almacen;

public class Producto {
	
	private String codigo;
	private String nomProd;
	private String descrip;
	private String stock;
	private String pendientes;
	//localizacion para xml
	private String pasillo;
	private String estante;
	private String estanteria;
	
	
	public Producto() {
		
	}
	
	
	public Producto(String codigo, String nomProd, String descrip, String stock, String pendientes, String pasillo,
			String estante, String estanteria) {
		super();
		this.codigo = codigo;
		this.nomProd = nomProd;
		this.descrip = descrip;
		this.stock = stock;
		this.pendientes = pendientes;
		this.pasillo = pasillo;
		this.estante = estante;
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
	public String getEstante() {
		return estante;
	}
	public void setEstante(String estante) {
		this.estante = estante;
	}
	public String getEstanteria() {
		return estanteria;
	}
	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}


	@Override
	public String toString() {
		return "<Producto>\n\t<codigo>"+codigo+"</codigo>\n\t<nomProd>"+nomProd+"</nomProd>\n\t<descrip>"+descrip+"</descrip>\n\t<stock>"+stock+
		"</stock>\n\t<pendientes>"+pendientes+"</pendientes>\n\t<localizacion>\n\t\t<pasillo>"+pasillo+"</pasillo>\n\t\t<estante>"
				+estante+"</estante>\n\t\t<estanteria>"+estanteria+"</estanteria>\n\t</localizacion>\n</Producto>";
	}

	
	
}
