package Cliente;

import java.util.ArrayList;

public class EjercicioClaseArrays {

	public static void main(String[] args) 
	{
		ArrayList<String> miAl = new ArrayList<String>();
		
		miAl.add("Pepe");
		miAl.add("Juan");
		miAl.add("Luis");
		miAl.add("Maria");
		miAl.add("Fernando");
		
		System.out.println(miAl);
		
		miAl.removeIf(n -> (n.charAt(2)) == 'a' || n.charAt(2) == 'r');
		
		System.out.println(miAl);
		
		HashMap<ArrayLisyt> 
		
	}

}
