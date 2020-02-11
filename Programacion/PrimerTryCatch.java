package errores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimerTryCatch
{

	public static void main(String[] args)
	{
		double cantidad = 0;
		try (Scanner teclado = new Scanner(System.in)) // Se cierrra automaticamente el teclado o recursos abiertos.
		{
			System.out.println("Meter cantidad: ");
			cantidad = teclado.nextDouble();
		} catch (InputMismatchException e)
		{
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		} catch (Exception e)
		{
			System.out.println("Estoy en la primera excepción");
			e.printStackTrace();
			System.out.println(e.getMessage()); // Mensaje que podemos ponerle si creamos un error personalizado
		} catch (Throwable e)
		{
			e.printStackTrace();
		}

		System.out.println("La catidad es: " + cantidad);

	}

}
