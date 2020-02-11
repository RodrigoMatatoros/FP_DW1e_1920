package errores;

import java.util.Scanner;

public class EjercicioErrores1
{

	public static void main(String[] args)
	{
		int n1, n2;

		try (Scanner teclado = new Scanner(System.in))
		{
			System.out.print("Introducir n1: ");
			n1 = teclado.nextInt();
			System.out.print("Introducir n2: ");
			n2 = teclado.nextInt();
			comparacion(n1, n2);
		} catch (Throwable e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static void comparacion(int n1, int n2) throws Throwable
	{
		if (n1 > n2)
		{
			throw new Throwable("n1 es mayor que n2");
		}

		System.out.println("n1 es menor o igual que n2");
	}
}

/*
 * Pedir por teclado dos numeros n1 y n2 con tryWith resources para cerrrarlo Si
 * n1>n2 da error de tipo Throuable tu sabe... ( "n1 > n2") en caso contrario
 * sale un mensaje "n1 menor o igual que n2"
 * 
 */