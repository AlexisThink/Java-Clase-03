
public class OperadorTernario {

	public static void main(String[] args) 
	{
		boolean isGenero=true;
		String cadenaGenero;
		
		if(isGenero){
			cadenaGenero="Masculino";
		} else cadenaGenero="Femenino";
System.out.println("El sexo de la persona es "+cadenaGenero);

//Operador Ternario

System.out.println("El genero de la persona es " +((isGenero)? "Masculino":"Femenino"));

/*
 * El signo de interrogacion es un if, estructura o sintaxis 
 * (condicion)? SI SE CUMPLE VALOR:SINO SE CUMPLE VALOR
 */

System.out.println("************");

int tipoUsuario=3; //El 1 es alumno, el 2 es maestro, el 3 director

String tipoUsuarioCadena = (tipoUsuario ==1)?"Alumno": (tipoUsuario ==2)?"Maestro": (tipoUsuario ==3)?"Director": "No existe usuario";
System.out.println(tipoUsuarioCadena);
	}

}
