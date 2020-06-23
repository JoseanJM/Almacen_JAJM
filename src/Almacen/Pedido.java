package Almacen;

import java.util.List;

public class Pedido {

	private String prodsPedido;
	private String cantidad;
	private String destPedido;// c.getNom()+" "+c.getApe1()+" "+c.getApe2();
	// direccionEntrega para xml
	private String calleDest;// cliente.calle
	private String numeroDest;// cliente.numero
	private String codPostDest;// cliente.codPost
	private String poblacionDest;// cliente.poblacion
	private String paisDest;// cliente.pais

	private String fechaEntrega;

	public Pedido() {

	}

	// constructor para pedido
	public Pedido(String prodsPedido, String cantidad, String destPedido, String calleDest, String numeroDest,
			String codPostDest, String poblacionDest, String paisDest, String fechaEntrega) {
		super();
		this.prodsPedido = prodsPedido;
		this.cantidad = cantidad;
		this.destPedido = destPedido;
		this.calleDest = calleDest;
		this.numeroDest = numeroDest;
		this.codPostDest = codPostDest;
		this.poblacionDest = poblacionDest;
		this.paisDest = paisDest;
		this.fechaEntrega = fechaEntrega;
	}

	// getters y setters
	public String getProdsPedido() {
		return prodsPedido;
	}

	public void setProdsPedido(String prodsPedido) {
		this.prodsPedido = prodsPedido;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getDestPedido() {
		return destPedido;
	}

	public void setDestPedido(String destPedido) {
		this.destPedido = destPedido;
	}

	public String getCalleDest() {
		return calleDest;
	}

	public void setCalleDest(String calleDest) {
		this.calleDest = calleDest;
	}

	public String getNumeroDest() {
		return numeroDest;
	}

	public void setNumeroDest(String numeroDest) {
		this.numeroDest = numeroDest;
	}

	public String getCodPostDest() {
		return codPostDest;
	}

	public void setCodPostDest(String codPostDest) {
		this.codPostDest = codPostDest;
	}

	public String getPoblacionDest() {
		return poblacionDest;
	}

	public void setPoblacionDest(String poblacionDest) {
		this.poblacionDest = poblacionDest;
	}

	public String getPaisDest() {
		return paisDest;
	}

	public void setPaisDest(String paisDest) {
		this.paisDest = paisDest;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Override
	public String toString() {
		return "<Pedido>" + "\n\t<prodsPedido>" + prodsPedido + "</prodsPedido>" + "\n\t<cantidad>" + cantidad
				+ "</cantidad>" + "\n\t<destPedido>" + destPedido + "</destPedido>" + "\n\t<DireccionEntrega>"
				+ "\n\t\t<calleDest>" + calleDest + "</calleDest>" + "\n\t\t<numeroDest>" + numeroDest
				+ "</numeroDest>\n\t\t<codPostDest>" + codPostDest + "</codPostDest>\n\t\t<poblacionDest>" + poblacionDest + "</poblacionDest>\n\t\t<paisDest>"
				+ paisDest + "</paisDest>\n\t</DireccionEntrega>\n\t<fechaEntrega>" + fechaEntrega + "</fechaEntrega>\n</Producto>";
	}

}
