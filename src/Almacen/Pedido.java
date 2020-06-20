package Almacen;

public class Pedido {
	
	private String productos;
	private String cantidad;
	//direccion para xml
	private String calle;//cliente.calle
	private String numero;//cliente.numero
	private String codPost;//cliente.codPost
	private String poblacion;//cliente.poblacion
	private String pais;//cliente.pais
	
	private String destinatario;//"cliente.nombre"+" "+"cliente.apellidos
	private String fechaEntrega;
	
	
	public Pedido () {
		
	}
	
	
	
	public Pedido(String productos, String cantidad, String calle, String numero, String codPost, String poblacion,
			String pais, String destinatario, String fechaEntrega) {
		super();
		this.productos = productos;
		this.cantidad = cantidad;
		this.calle = calle;
		this.numero = numero;
		this.codPost = codPost;
		this.poblacion = poblacion;
		this.pais = pais;
		this.destinatario = destinatario;
		this.fechaEntrega = fechaEntrega;
	}





	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCodPost() {
		return codPost;
	}
	public void setCodPost(String codPost) {
		this.codPost = codPost;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
	
	

}
