import java.util.*;
public class RodrigoMatatorosP02_Errores 
{

	public static void main(String[] args)
	{
		
		
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Por favor introduzca el Tipo de tratamiento y la cantidad requerida");
			String nombre = sc.next(); 
			double a = sc.nextDouble();
			metodo(a);	
			if (nombre.equals("Sra") || nombre.equals("Sr"))
			{
				
			}
			else 
			{
				throw new TratamientoException("El tratamiento "+nombre+" es incorrecto");
			}
		System.out.println(nombre+" "+a);
		}
		catch (TratamientoException o)
		{
			System.out.println(o.getMessage());
		}
		catch (NegativoException e)
		{
			System.out.println(e.getMessage());
		}
		catch (CeroException e)
		{
			System.out.println(e.getMessage());
		}
		catch (FueraDeRangoException e)
		{
			System.out.println(e.getMessage());
		}
		

	}
	public static double metodo (double a) throws NegativoException, CeroException, FueraDeRangoException
	{
		if (a<0)
		{
			throw new NegativoException ("Lo siento no se admiten cantidades negativas");
		}
		
		if (a==0)
		{
			throw new CeroException ("Lo siento no se admiten cantidades iguales a cero");
		}
		
		if (a>1000000 || a<1000)
		{
			throw new FueraDeRangoException ("Lo siento es cifra esta fuera de rango");
		}
		
		return 2;
	}

}
class TratamientoException extends Exception
{
	public TratamientoException (String msj) 
	{
		super(msj);
	}
}
class NegativoException extends Exception
{
	public NegativoException (String msj)
	{
		super(msj);
	}
}
class CeroException extends Exception
{
	public CeroException (String msj)
	{
		super(msj);
	}
}
class FueraDeRangoException extends Exception
{
	public FueraDeRangoException (String msj)
	{
		super(msj);
	}
}


	