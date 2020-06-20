package Almacen;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	//direccion para xml
	private String calle;
	private String numero;
	private String codPostal;
	private String poblacion;
	private String pais;
	
	
	public Cliente () {
		
	}
	
	
	
	
	public Cliente(String nombre, String apellidos, String email, String telefono, String calle, String numero,
			String codPostal, String poblacion, String pais) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.poblacion = poblacion;
		this.pais = pais;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
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
	
	
	
	

}
