package com.coderhouse.Clases;



import com.coderhouse.Interfaces.Usuarios;

public class Clientes implements Usuarios{

	private String Usuario;
	private Integer Contraseña;
	private String Email;
	private Integer Dni;
	private String Nacionalidad;
	
	
	
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public Integer getContraseña() {
		return Contraseña;
	}
	public void setContraseña(Integer contraseña) {
		Contraseña = contraseña;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getDni() {
		return Dni;
	}
	public void setDni(Integer dni) {
		Dni = dni;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}


	@Override
	public String toString() {
		return "Clientes [Usuario=" + Usuario + ", Contraseña=" + Contraseña + ", Email=" + Email + ", Dni=" + Dni
				+ ", Nacionalidad=" + Nacionalidad + "]";
	}
	

	
	@Override
	public  boolean Premium() {
	
		return true;
	}
	@Override
	public  boolean Descuentos() {
		
		return true;
	}
	
}