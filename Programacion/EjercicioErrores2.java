package errores;

import java.util.Scanner;

public class EjercicioErrores2
{
	/*
	 * Dos numeros por teclado Uno va a ser dividendo y divisor Controlar el error
	 * de la division al dividir por 0 Si el divisor es negativo sale un error
	 * tambien
	 */
	public static void main(String[] args)
	{

		try (Scanner teclado = new Scanner(System.in))
		{
			System.out.print("Introduce dividendo: ");
			int dividendo = teclado.nextInt();

			System.out.print("Introduce dividendo: ");
			int divisor = teclado.nextInt();

			if (divisor < 0)
			{
				throw new DivisorNegativo("Error, divisor negativo");
			}

			double result = (dividendo / divisor);
			System.out.println(result);

		} catch (DivisorNegativo e)
		{
			System.out.println(e.getMessage());
		}

		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class DivisorNegativo extends Exception
{
	public DivisorNegativo(String msg)
	{
		super(msg);
	}
}
