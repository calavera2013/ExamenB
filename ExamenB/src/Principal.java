import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		
		Scanner leer = new Scanner(System.in);
		String seleccionar;
		
		System.out.println("1. Seleccionar profesor");
		System.out.println("2. Seleccionar alumno");
		System.out.println("S. Salir");
		
		seleccionar = leer.nextLine();
				
		switch(seleccionar){
		
			case "1":
					miguelAngelCamarena();
				
				break;
				
			case "2":
				
				System.out.println("ALUMNOS");
				System.out.println("Jesus Gines Ruiz");
				System.out.println("Fco. Javier Cuesta");
				//////// Debajo de esta linea ir escribiendo vuestros nombres para formar el menu correspondiente /////
				// 1. Pikachu Rodriguez
				// 2. Son Goku Garcia 
				// ...

				seleccionar = leer.nextLine();
				
				//////// En este swith cada alumno debe anadir un case diferente. ////////
				//////// Dentro de el, se encontrara una llamada a una funcion con su nombre y apellidos (igual que hice yo en el caso de arriba) ////////
				
				
				
				
				break;
			
		}

	}
	
	public static void miguelAngelCamarena(){
		System.out.println("Esta es la funcion de Miguel Angel Camarena");
	}
	
	public static void jesusGinesRuiz(){
		System.out.println("Esta es la funcion de Jesus Ginés Ruiz");
	}
	public static void JavierCuesta(){
		System.out.println("Esta es la funcion de Fco. Javier Cuesta");
	}

}

