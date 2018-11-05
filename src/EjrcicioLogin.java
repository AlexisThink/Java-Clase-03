import java.util.Scanner;

public class EjrcicioLogin {

	public static void main(String[] args) 
	{
		Scanner teclado=new Scanner(System.in);

		System.out.print("Escriba su nombre de usuario: ");
		String userName=teclado.next();
		
		if (userName.equals("Alexis")){
			System.out.print("Escriba la contraseña: ");
			
			String passWord=teclado.next();
			
				if (passWord.equals("AmericA12")){
					System.out.println("Bienvenido");
			} else System.out.println("Contraseña incorrecta");
			
		} else System.out.println("Nombre de usuario incorrecto");	
		
		
		
		/*if (userName.equals("Alexis")){
			if (passWord.equals("AmericA")){
				System.out.println("Bienvenido, has entrado!");
			} else System.out.println("Fallo el Password");
		} else System.out.println("Fallo el Username");
		*/
		
		
		
		

	}

}
