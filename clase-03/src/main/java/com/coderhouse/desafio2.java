package com.coderhouse;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class desafio2 {

	public static void main(String[] args) {
		
		List<String> Shop = new ArrayList <> () ;
		Shop.add("Gaseosa");
		Shop.add("Huevos");
		Shop.add("Leche");
		Shop.add("Harina");
		Shop.add("Yerba");{
		
			Iterator<String> iterator = Shop.iterator();
		System.out.println("El tamaño de la lista es de : " + Shop.size() 
						+ " Productos");
	}
	  List <String> Yogurt = new ArrayList <> () ;{
	  Yogurt.add("Frutilla");
	  Yogurt.add("Vainilla");
	  Yogurt.add("Durazno");
	  Yogurt.add("Mixto");
	  
		Iterator<String> iterator = Yogurt.iterator();
		System.out.println("El tamaño de la lista de Yogurt es : " + Yogurt.size() 
						+ " Productos");
		
Shop.addAll(Yogurt);
		
		for (String Producto : Shop) { 
			System.out.println("El Producto es = " + Producto); 
		}Yogurt.remove(0);
		
		Yogurt.removeAll(Shop);
		
		for (String Producto : Yogurt) { 
			System.out.println("El Producto es = " + Producto ); 
		}
		
			
	  }
	}
}
	

