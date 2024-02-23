package coderhouse02;

public class Switch {

		public static void main(String[] args) {
			int diaDeLaSemana = 8;
			String nombreDelDia;

			switch (diaDeLaSemana) {

			case 1:
				nombreDelDia = "Domingo";
				break;
			case 2:
				nombreDelDia = "Lunes";
				break;
			case 3:
				nombreDelDia = "Martes";
				break;
			case 4:
				nombreDelDia = "Miercoles";
				break;
			case 5:
				nombreDelDia = "Jueves";
				break;
			case 6:
				nombreDelDia = "Viernes";
				break;
			case 7:
				nombreDelDia = "Sabado";
				break;
			default:
				nombreDelDia = "No Existe ese dia";
			}

			System.out.println("nombreDelDia = " + nombreDelDia);
			
			
			//Ejercicio num1
		
			String mes = "diciembre";
			switch(mes) {
			
			 case "enero":
	             System.out.println(1);
	             break;
	         case "febrero":
	        	 System.out.println(2);
	             break;
	         case "marzo":
	        	 System.out.println(3);
	             break;
	         case "abril":
	        	 System.out.println(4);
	             break;
	         case "mayo":
	        	 System.out.println(5);
	             break;
	         case "junio":
	        	 System.out.println(6);
	             break;
	         case "julio":
	        	 System.out.println(7);
	             break;
	         case "agosto":
	        	 System.out.println(8);
	             break;
	         case "septiembre":
	        	 System.out.println(9);
	             break;
	         case "octubre":
	        	 System.out.println(10);
	             break;
	         case "noviembre":
	        	 System.out.println(11);
	             break;
	         case "diciembre":
	        	 System.out.println(12);
	             break;
	         default:
	        	 System.out.println(-1);
			
	        	 
	        	 //Ejercicio 2
			}			
		
		String nombreMes = "Julio";
		int numeroMes;

		switch (nombreMes) {
		case "Enero":
			numeroMes = 1;
			break;
		case "Febrero":
			numeroMes = 2;
			break;
		case "Marzo":
			numeroMes = 3;
			break;
		case "Abril":
			numeroMes = 4;
			break;
		case "Mayo":
			numeroMes = 5;
			break;
		case "Junio":
			numeroMes = 6;
			break;
		case "Julio":
			numeroMes = 7;
			break;
		case "Agosto":
			numeroMes = 8;
			break;
		case "Septiembre":
			numeroMes = 9;
			break;
		case "Octubre":
			numeroMes = 10;
			break;
		case "Noviembre":
			numeroMes = 11;
			break;
		case "Diciembre":
			numeroMes = 12;
			break;
		default:
			numeroMes = 0;
		}

		if (numeroMes > 0) {
			System.out.println("Numero de mes: " + numeroMes);
		} else
			System.out.println("No existe ese mes");
	}

}

	