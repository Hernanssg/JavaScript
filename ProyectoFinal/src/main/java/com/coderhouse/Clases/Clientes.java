package com.coderhouse.Clases;

import com.coderhouse.Interfaces.Usuarios;

public class Clientes implements Usuarios{

	private String Email;
	private Integer Dni;
	private String Nacionalidad;
		
	
	//Sobrecarga de Constructores
		//Constructores
		public Clientes() {
			super();}		
		
	
	
		public Clientes (String Email, String Nacionalidad, Integer Dni) { 
			
			this.Nacionalidad = Nacionalidad;
			this.Dni = Dni;
			this.Email = Email;
			
			
		
		}


		public String getEmail() {
			return this.Email;
		}


		public void setEmail(String email) {
			this.Email = email;
		}


		public Integer getDni() {
			return this.Dni;
		}


		public void setDni(Integer dni) {
			this.Dni = dni;
		}


		public String getNacionalidad() {
			return this.Nacionalidad;
		}


		public void setNacionalidad(String nacionalidad) {
			this.Nacionalidad = nacionalidad;
		}


		@Override
		public void Usuario() {
			
		}

		@Override
		public void Contraseña() {
		
			
		}

		@Override
		public boolean Descuentos() {
			
			return Descuentos();
		}
	
	
	
	
	
	
}
	
	

