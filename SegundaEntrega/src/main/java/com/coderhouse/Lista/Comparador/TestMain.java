package com.coderhouse.Lista.Comparador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		List<Empleados> ListaDeEmpleados = new ArrayList<>();
		ListaDeEmpleados.add(new Empleados("Hernan", "Gutierrez", "Argentina", 500000, 23));
		ListaDeEmpleados.add(new Empleados("Laura", "Martinez", "Argentina", 1000000, 40));
		ListaDeEmpleados.add(new Empleados("Lautaro", "Sanchez", "Guatemala", 800000, 27));
		ListaDeEmpleados.add(new Empleados("Lorena", "Perez", "Canada", 5000, 17));
		ListaDeEmpleados.add(new Empleados("Martin", "Albaraz", "Brasil", 9000, 19));
		ListaDeEmpleados.add(new Empleados("Gerardo", "Dorches", "Chile", 2500, 20));
		ListaDeEmpleados.add(new Empleados("Lucia", "Diaz", "Panama", 1000, 38));

		Collections.sort(ListaDeEmpleados, new ComparetorEmpleado ());

		for (Empleados empleado : ListaDeEmpleados) {
			System.out.println("");
			System.out.println("Nombre : " + empleado.getNombre());
			System.out.println("Apellido : " + empleado.getApellido());
			System.out.println("Pais : " + empleado.getNacionalidad());
			System.out.println("Sueldo : " + empleado.getSueldo());
			System.out.println("Edad : " + empleado.getEdad());
		}

	}

}
