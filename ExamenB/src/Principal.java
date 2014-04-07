import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		
		Scanner leer = new Scanner(System.in);
		String seleccionar;
		
		System.out.println("1. Seleccionar profesor");
		System.out.println("2. Seleccionar alumno");
		System.out.println("S. Salir");
		
		String opcion = leer.nextLine();
				
		switch(opcion){
		
			case "1":
					miguelAngelCamarena();
				
				break;
				
			case "2":
				

				System.out.println("ALUMNOS"); //////// Debajo de esta linea ir escribiendo vuestros nombres para formar el menu correspondiente /////
				System.out.println("1.Adrián Pérez Morales");

				System.out.println("ALUMNOS");
				System.out.println("Jesus Gines Ruiz");
				//////// Debajo de esta linea ir escribiendo vuestros nombres para formar el menu correspondiente /////
		}
				// 1. Pikachu Rodriguez
				// 2. Son Goku Garcia 
				// ...

				seleccionar = leer.nextLine();
				
				//////// En este swith cada alumno debe anadir un case diferente. ////////
				//////// Dentro de el, se encontrara una llamada a una funcion con su nombre y apellidos (igual que hice yo en el caso de arriba) ////////

				switch(seleccionar){  
				case "1":
					adrianPerezMorales();
					break;

				case "2":
					jesusGinesRuiz();
				
					break;
				
				}
				
				
		
		

	}
	
	public static void miguelAngelCamarena(){
		System.out.println("Esta es la funcion de Miguel Angel Camarena");
	}
	public static void adrianPerezMorales(){
		System.out.println("Esta es una funcion de Adrián Pérez Morales");
	}
	
	public static void jesusGinesRuiz(){
		System.out.println("Esta es la funcion de Jesus Ginés Ruiz");
	}

}

