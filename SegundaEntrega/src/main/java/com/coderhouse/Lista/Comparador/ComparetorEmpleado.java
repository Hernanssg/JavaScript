package com.coderhouse.Lista.Comparador;

import java.util.Comparator;

public class ComparetorEmpleado implements Comparator<Empleados> {

	@Override
	public int compare(Empleados primerEmpleado, Empleados segundoEmpleado) {

		// Datos tipos Strings
		// return primerEmpleado.getNombre(). compareTo(segundoEmpleado.getNombre ());

		// si el 1° (A) objecto es mayor al segundo objecto (B), me retorna un positivo
		// (+)
		// y si el 2° (B) objecto es mayor al primer objecto (A), me retorna un negativo
		// (-)
		// si ambos son igaules me retorna un 0.

		int respuesta = 0;
		if (primerEmpleado.getEdad() > segundoEmpleado.getEdad()) {
			respuesta = 1;

		} else if (primerEmpleado.getEdad() < segundoEmpleado.getEdad()) {
			respuesta = -1;
		} else {
			respuesta = 0;
		
		}
		return respuesta;
	}
}