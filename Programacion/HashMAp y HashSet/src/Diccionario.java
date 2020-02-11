import java.util.*;
public class Diccionario {

	public static void main(String[] args) 
	{
		Scanner tecladoScanner = new Scanner(System.in);
		HashMap <String, String>diccionario = new HashMap<String,String>();
		
			diccionario.put("Table", "Mesa");
			diccionario.put("Man", "Hombre");
			diccionario.put("Woman", "Mujer");
			diccionario.put("Door", "Puerta");
	
		int a = 10;
		while(a!=3) 
		{
		System.out.println("¿Qué quieres hacer?");
		System.out.println("Si quieres que muestre el diccionario introduce 1");
		System.out.println("Si quieres introducir una palabra en el diccionario introduce un 2");
		System.out.println("Si quieres salir introduce 3");
		
		a = tecladoScanner.nextInt();
			if (a==1)
			{
				System.out.println(diccionario);
			}
			
			if (a==2)
			{
				
			 System.out.println("Primero introduce la palabra en inglés");
			 
			 String ingles = tecladoScanner.next();
			 
			 System.out.println("Ahora en español");
			
			 String español = tecladoScanner.next();
			 
			 diccionario.put(ingles, español);
			 
			 System.out.println(diccionario);
			}
			
			
			if(a==3)
			{
				System.out.println("Gracias por usar el diccionario online");
				
			}
		}
		
			
	}

}
