import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) 
	{
		int numeroUno, numeroDos;
		boolean isPass=true;
		
		
		while (isPass){
		System.out.println("Eliga una opcion utilizando un numero");
		
		System.out.println("1) SUMAR");
		System.out.println("2) RESTAR");
		System.out.println("3) DIVIDIR");
		System.out.println("4) MULTIPLICAR");
		System.out.println("5) SALIR");
		
		Scanner teclado=new Scanner(System.in);
		int opcion= teclado.nextInt();
		
	//Aqui empieza el Switch	
switch(opcion){		
		case 1:
			System.out.println("Selecciono SUMAR a continuacion digite los numeros");
			System.out.print("Numero uno: ");
			numeroUno=teclado.nextInt();
					
			System.out.print("Numero dos: ");
			numeroDos=teclado.nextInt();
			
			System.out.println(numeroUno+numeroDos);;
			break;
		case 2:
			System.out.println("Selecciono RESTAR a continuacion digite los numeros");
			System.out.print("Numero uno: ");
			numeroUno=teclado.nextInt();
					
			System.out.print("Numero dos: ");
			numeroDos=teclado.nextInt();
			
			System.out.println(numeroUno-numeroDos);;
			break;
		case 3:
			System.out.println("Selecciono DIVIDIR a continuacion digite los numeros");
			System.out.print("Numero uno: ");
			numeroUno=teclado.nextInt();
					
			System.out.print("Numero dos: ");
			numeroDos=teclado.nextInt();
			
			System.out.println(numeroUno/numeroDos);;
			break;
		case 4:
			System.out.println("Selecciono MULTIPLICAR a continuacion digite los numeros");
			System.out.print("Numero uno: ");
			numeroUno=teclado.nextInt();
					
			System.out.print("Numero dos: ");
			numeroDos=teclado.nextInt();
			
			System.out.println(numeroUno*numeroDos);;
			break;
		case 5:
			isPass=false;
			System.out.println("Ha elegido salir");
			break;	
		
		default:
			System.out.println("No se encuentra la opcion");
			break;
		
	}

	}
}
	
}
