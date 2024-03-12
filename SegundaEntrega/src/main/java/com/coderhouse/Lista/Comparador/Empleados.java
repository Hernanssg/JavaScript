package com.coderhouse.Lista.Comparador;

public class Empleados {

	private String Nombre;
	private String Apellido;
	private String Nacionalidad;
	private double Sueldo;
	private int Edad;

	public Empleados() {

	}

	public Empleados(String nombre, String apellido, String nacionalidad, double sueldo, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Nacionalidad = nacionalidad;
		Sueldo = sueldo;
		Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

}
