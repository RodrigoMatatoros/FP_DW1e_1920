package Cliente;
import java.util.ArrayList;

public class EjerciciosArraysInterger 
{

	public static void main(String[] args) 
	{
		
		//Creo el ArrayList
		ArrayList<Integer> miAl = new ArrayList<Integer>();
		for (int i= 0; i< 20;i++)
		{
			miAl.add(i);
		}
		
		//Creo un Array a partir del ArrayList
		Integer[] arr = new Integer[miAl.size()]; 
		arr = miAl.toArray(arr);
		
		//Borro los elementos del 8 al 12 del ArrayList
		for (int i= 0; i< miAl.size();i++)
		{
			if(miAl.removeIf( n -> n >=8 && n<=12));
		}
		 //Visualizar el elemento 7 del arraylist
		System.out.println(miAl.contains(7));
		
		//Preguntamos en que indice esta el el n�18
		
		System.out.println("�Donde esta el elemento 18?");mi.AlindexOd(18)
		
		//Preguntamos si miAl esta vacia
		
		if (miAl.isEmpty())
		{
			System.out.println("Esta vacia");
		}else
		{
			System.out.println("Tiene valores dentro");
		}
		//Borrar los espacios no ocupados en miAl
		miAl.trimToSize(); 
		//Preguntar si tiene el elemento 45
		for (int i= 0; i< miAl.size();i++)
		{
			if (miAl.contains(45))
			{
				System.out.println("Tiene el elemento 45");
			}
			
		}
	}

}