
public class TemaBreak {

	public static void main(String[] args) 
	{
	/*
	 * Team Break 
	 * 
	 * Puedes utilizar la declaracion Break para dar fin a un ciclo en cualquier momento
	 * Por ejemplo, vamos a incrementar el valor de i por 3 y queremos evitar un mayor 
	 * incremento en su resultado si alcanza el 7
	 */

		int i, resultado;
		
		for(i=1; i<=10; i++){
			resultado= i+3;
			if(resultado > 7){
				break;
			}
			System.out.println(resultado);
		}
		
	}

}
