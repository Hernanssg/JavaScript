package com.coderhouse.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.coderhouse.Clases.Clientes;
import com.coderhouse.Clases.Producto;

public class MainInterfaces {

	public static void main(String[] args) {

		Clientes unCliente = new Clientes();

		unCliente.setUsuario("HernanG");
		unCliente.setContraseña(123456);
		unCliente.setEmail("hernangutierrez@gmail.com");
		unCliente.setNacionalidad("Argentino");
		unCliente.setDni(23458923);
		unCliente.Descuentos();
		unCliente.Premium();

		System.out.println("El usuario ingresado es " + unCliente.getUsuario() + ", con su contraseña correspondiente "
				+ unCliente.getContraseña() + ", con el dni " + unCliente.getDni() + " y es "
				+ unCliente.getNacionalidad() + " de nacionalidad. " + "correo electronico " + unCliente.getEmail());

		Scanner scanner = new Scanner(System.in);
		List<Producto> listaProductos = new ArrayList<>();

		// Agregar algunos productos a la lista
		listaProductos.add(new Producto("Leche", 1.5));
		listaProductos.add(new Producto("Pan", 1.0));
		listaProductos.add(new Producto("Huevos", 2.0));
		listaProductos.add(new Producto("Manzanas", 3.0));
		
		for (Producto producto : listaProductos) {
			System.out.println("Bienvenido a la lista de compra!");

			while (true) {
				System.out.println("Opciones:");
				System.out.println("1. Agregar un artículo a la lista");
				System.out.println("2. Mostrar la lista de compra");
				System.out.println("3. Salir");
				System.out.print("Seleccione una opción: ");
				int opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el buffer del scanner

				switch (opcion) {
				case 1:
					System.out.print("Ingrese el artículo que desea agregar: ");
					String articulo = scanner.nextLine();
					listaProductos.add(opcion, producto);
					System.out.println("Artículo agregado a la lista.");
					break;
				case 2:
					if (listaProductos.isEmpty()) {
						System.out.println("La lista de compra está vacía.");
					} else {
						System.out.println("Lista de compra:");
						for (Producto item : listaProductos) {
							System.out.println("- " + item);
						}
					}
					break;
				case 3:
					System.out.println("¡Gracias por usar la lista de compra!");
					scanner.close();
					return;
				default:
					System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
				}
			}
		}
	}

}
