
public class Arreglos {

	public static void main(String[] args) 
	{
/*
 * Arreglos o Matrizes
 * 
 * Son variables que separan espacio de memoria de ante mano
 * y podemos acceder a ellos, atravez de posiciones.
 * 
 *  Funcionan con todos los tipos de objetos
 */
		String nombre="Alexis";
		
		nombre = "cetech";
		// Primero pongamos lo corchetes para hacer un arreglo, tenemos que inicializar y definir las posiciones en memoria
		
		String[] nombres=new String[8];
		// Asignando valor a cada posicon
		
		nombres[0]="Brandon";
		nombres[1]="Daniel";
		nombres[2]="Paty";
		nombres[3]="Mario";
		nombres[4]="Alexis";
		nombres[5]="Alejandro";
		nombres[6]="Hector";
		nombres[7]="Miguel";
		
		System.out.println(nombres[4]);
		
		
	}

}
