package com.coderhouse;

public class Desafio {
    public static void main(String[] args) {
        float numero = 3.14159f; // flotante
        
        // entera 
        int parteEntera = (int) numero; // obtener la parte entera
        System.out.println("Parte Entera: " + parteEntera);
        
        // Separar la parte decimal del número
        float parteDecimal = numero - parteEntera; // Restar la parte entera para obtener la parte decimal
        System.out.println("Parte Decimal: " + parteDecimal);
        
        //  representación binaria de flotante
        int bits = Float.floatToIntBits(numero);
        String binario = Integer.toBinaryString(bits);
        String mantisaBinaria = binario.substring(9); // Los primeros 9bits son el signo y el exponente
        
        // Añadir ceros a la izquierda si es necesario para completar 23bits
        mantisaBinaria = String.format("%23s", mantisaBinaria).replace(' ', '0');
        
        System.out.println("Mantisa: " + mantisaBinaria);
    }
}
