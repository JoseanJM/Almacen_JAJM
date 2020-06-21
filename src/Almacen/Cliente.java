package Almacen;

public class Cliente {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String email;
	private String telefono;
	// direccion para xml
	private String calle;
	private String numero;
	private String codPostal;
	private String poblacion;
	private String pais;

	public Cliente() {

	}

	public Cliente(String nombre, String apellido1, String apellido2, String email, String telefono, String calle,
			String numero, String codPostal, String poblacion, String pais) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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

	@Override
	public String toString() {
		return "<Cliente>\n\t<nombre>" + nombre + "</nombre>\n\t<apellido1>" + apellido1
				+ "</apellido1>\n\t<apellido2>"+apellido2+"</apellido2>\n\t<email>" + email
				+ "</email>\n\t<telefono>" + telefono + "</telefono>\n\t<Direccion>\n\t\t<calle>" + calle
				+ "</calle>\n\t\t<numero>" + numero + "</numero>\n\t\t<codPostal>" + codPostal
				+ "</codPostal>\n\t\t<poblacion>" + poblacion + "</poblacion>\n\t\t<pais>" + pais
				+ "</pais>\n\t</Direccion>\n</Cliente>";
	}

}
