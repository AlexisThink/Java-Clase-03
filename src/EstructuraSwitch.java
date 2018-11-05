import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) 
	{
		/*
		 * Es mas facil entender el Switch con su equivalente
		 * Else/if
		 * 
		 * El break despues de un bucle case hace que la sentencia Switch concluya
		 * omitiendo el break permite la caide de codigo
		 * 
		 * 
		 * Estrcutura Switch
		 * 
		 * priemero va la palabra reservada switch
		 * 
		 * switch(opcion/valor){
		 * 
		 * case 1:
		 * 	instrsucciones;
		 * 	break;
		 * 
		 * default: 
		 * 	instrucciones;
		 * 	break;
		 * }
		 *
		 */
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Ingresa una opcion: ");
		int opcion= teclado.nextInt();
		
		switch(opcion){
		
		case 1:
			System.out.println("Dentro de la opcion 1");
			break;
		case 2:
			System.out.println("Dentro de la opcion 2");
			break;
		case 3:
			System.out.println("Dentro de la opcion 3");
			break;
		case 4:
			System.out.println("Dentro de la opcion 4");
			break;
		case 5:
			System.out.println("Dentro de la opcion 5");
			break;	
		
		default:
			System.out.println("No se encuentra la opcion");
			break;
		}
		
	}

}
