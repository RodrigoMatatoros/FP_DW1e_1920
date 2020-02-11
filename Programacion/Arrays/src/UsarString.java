
public class UsarString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuilder cadena=new StringBuilder("Hoy es viernes");
		
		cadena.append(" dia 8");
		
		System.out.println(cadena);
		
		cadena.append(23.45);
		
		System.out.println(cadena);
		
		cadena.insert(20,", ");
		
		System.out.println(cadena);
		
		cadena.insert(0, "Clase DW1E ");
		
		System.out.println(cadena);
		
		System.out.println(cadena.reverse());
		
		cadena.reverse();
		
		cadena.delete(24,27);
	}

}
