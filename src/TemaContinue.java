
public class TemaContinue {

	public static void main(String[] args) 
	{
		/*
		 * Slatarse una iteracion de un bucle, usamos la declaracion continue, por ejemplo
		 * Vamos imprimir la variable por medio de un bucle y queremos
		 * que no se imprima el valor de i cuando llegue a 3
		 * 
		 */

		for (int i=1; i<=5;i++){
			if (i==3){
				continue;
			} System.out.println("Valor de i: "+i);
		}
		
	}

}
