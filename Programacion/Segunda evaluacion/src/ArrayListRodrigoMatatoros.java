
//1.Creo la clase
import java.util.*;
public class ArrayListRodrigoMatatoros 
{

	
	public static void main(String[] args) 
	{
//2.Creo el ArrayList
	ArrayList <Arboles> miAl = new ArrayList<Arboles>();
	{
		miAl.add(new Arboles("Roble",12.5,80,"Canadá",true));
		miAl.add(new Arboles("Encina", 5.25,90,"Encina",false));
		miAl.add(new Arboles("Pino Laricio",22.5,80,"Italia",false));
		miAl.add(new Arboles("Roble", 5.5, 15, "Canadá", true));
		miAl.add(new Arboles("Manzano", 3.5, 60, "India", false));
	}
//3.Si el ArrayList esta vacio meter el arrylist
	if (miAl.isEmpty())
	{
		miAl.add(new Arboles("Roble",12.5,80,"Canadá",true));
		miAl.add(new Arboles("Encina", 5.25,90,"Encina",false));
		miAl.add(new Arboles("Pino Laricio",22.5,80,"Italia",false));
		miAl.add(new Arboles("Roble", 5.5, 15, "Canadá", true));
		miAl.add(new Arboles("Manzano", 3.5, 60, "India", false));
	}else
	{
		System.out.println("El ArrayList no esta vacio");
		
	}
	
//4.Comprobar si peral existe
	for (Arboles v : miAl)
	{
		if(v.getNombre().contains("Peral") && v.getNacionalidad().contains("Canadá"))
		{
			System.out.println();
		}
	}
//5.Conocer y visualizar la posicion en la que esta el elemento que contenga peral
	
	for (Arboles v : miAl)
	{
		if(0);
	}
}}*/