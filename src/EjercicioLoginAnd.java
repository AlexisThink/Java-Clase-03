import java.util.Scanner;

public class EjercicioLoginAnd {

	public static void main(String[] args) 
	{
	Scanner teclado=new Scanner(System.in);
	
	System.out.print("Escriba su nombre de usuario: ");
	String userName=teclado.next();
	System.out.print("Escriba su contraseña: ");
	String passWord=teclado.next();
	
	if (userName.equals("Alexis") && passWord.equals("AmericA12")){
		System.out.println("Bienvenido");
	} else System.out.println("No furula chavo!");

	}

}
