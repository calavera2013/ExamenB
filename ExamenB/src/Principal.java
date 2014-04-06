import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		
		Scanner leer = new Scanner(System.in);
		int seleccionar;
		
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
				// 1. Pikachu Rodriguez
				// 2. Son Goku Garcia 
				// ...
				System.out.println("1. alumnoPrueba");
				seleccionar = Integer.parseInt(leer.nextLine());
				
				//////// En este swith cada alumno debe a�adir un case diferente. ////////
				//////// Dentro de �l, se encontrar� una llamada a una funcion con su nombre y apellidos (igual que hice yo en el caso de arriba) ////////
				switch(seleccionar){  
					case 1:
						alumnoPrueba();
						break;
				
				}
				
				break;
			
		}

	}
	
	public static void miguelAngelCamarena(){
		System.out.println("Esta es la funcion de Miguel Angel Camarena");
	}
	
	public static void alumnoPrueba(){
		System.out.println("Esta es la funcion de alumnoPrueba");
	}

}
