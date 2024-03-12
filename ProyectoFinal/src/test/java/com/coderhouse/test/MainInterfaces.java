package com.coderhouse.test;
import com.coderhouse.Clases.Clientes;
public class MainInterfaces {

	public static void main(String[] args) {
	
		Clientes unCliente = new Clientes();
		
		unCliente.setUsuario("HernanG");
		unCliente.setContraseña(123456);
		unCliente.setEmail("asdasda@gmail.com");
		unCliente.setNacionalidad("Argentino");
		unCliente.setDni(23458923);
		unCliente.Descuentos();
		unCliente.Premium();
		
		System.out.println("El usuario ingresado es " + unCliente.getUsuario()
		+ ", con su contraseña correspondiente " + unCliente.getContraseña()
		+ ", con el dni " + unCliente.getDni()
		+ " y es " + unCliente.getNacionalidad() + " de nacionalidad. "
		+ "correo electronico " + unCliente.getEmail());
		


	
	}

}