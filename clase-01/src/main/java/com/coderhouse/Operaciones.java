package com.coderhouse;

public class Operaciones {
	public static void main(String[] args) {
		/*
		 * Los Operadores Aritmeticos y son: + - * / %
		 */

		int x = 32;
		float y = 6;
		int z = 7;
		float c = -5;
		
		float suma = x + y;
		double resta = x - y;
		double multiplicacion = (int) (x * y);
		int multiplicacion1 = x * (int) y;
		double multiplicacion2 = x * y;
		float division = x / y;
		float resto = x % y;
		int resto2 =  (int) (x % y);
		int division3 = (int) (x * y * z);
		double resta2 = z - y + x;
		float multiplicacion3 = c * z * y * x;
		int resta3 = (int) (x - y - z - c);
		double cuentas = x * c - y + c;
		
		System.out.println("El resultado de la Suma es: " + suma);
		System.out.println("El resultado de la Resta es: " + resta);
		System.out.println("El resultado de la Multiplicacion es: " + multiplicacion);
		System.out.println("El resultado de la Multiplicacion1 es: " + multiplicacion1);
		System.out.println("El resultado de la Multiplicacion2 es: " + multiplicacion2);
		System.out.println("El resultado de la Multiplicacion3 es: " + multiplicacion3);
		System.out.println("El resultado de la Division es: " + division);
		System.out.println("El resultado de la Resto de la Division1 es: " + resto);
		System.out.println("El resultado de la Resto de la Division2 es: " + resto2);
		System.out.println("El resultado de la Division3 es: " + division3);
		System.out.println("El resultado de la Resta2 es: " + resta2);
		System.out.println("El resultado de la Resta3 es: " + resta3);
		System.out.println("El resultado de las cuentas es: " + cuentas);
	
		
		
		

}

}