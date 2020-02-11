package errores;

import java.util.Scanner;

public class EjercicioDeErrores3
{

	public static void main(String[] args)
	{
		try (Scanner teclado = new Scanner(System.in))
		{
			System.out.print("Introduce número: ");
			int numero = teclado.nextInt();

			System.out.print("Introduce porcentaje: ");
			int porcentaje = teclado.nextInt();

			double result = numero * porcentaje / 100d;
			if (result <= 100 && result >= 0)
			{
				System.out.println("El resultado es: " + result + "%");
			} else if (result <= 1000 && result >= 101)
			{
				throw new SobreCoste("Sobrecoste");
			} else if (result > 1000)
			{
				throw new Excesivo("Es excesivo");
			}

		} catch (SobreCoste e)
		{
			System.out.println(e.getMessage());
		} catch (Excesivo e)
		{
			System.out.println(e.getMessage());
		} catch (Throwable e)
		{
			e.getMessage();
		}

	}

}

class SobreCoste extends Exception
{
	public SobreCoste(String msg)
	{
		super(msg);
	}
}

class Excesivo extends Exception
{

	public Excesivo(String msg)
	{
		super(msg);
	}

}

/*
 * Pedir 2 numeros el segundo va a ser un %
 * 
 * si resultado esta entre [0, 100] ver resultado si esta entre [101,1000] error
 * personalizado con mensaje resultado entre 101 y 1000 en otro caso mayor que
 * 1000
 * 
 * otro error llamado excesivo resultado es excesivo
 */