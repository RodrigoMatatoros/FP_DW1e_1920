package errores;

public class QuintoTryCatch
{

	public static void main(String[] args)
	{
		try // Ejecuta este try porque es el error correcto
		{
			System.out.println(calculo());
		} catch (IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage() + " --- " + e.getClass());
		}

	}

	public static String calculo()
	{
		int[] numeros =
		{ 1, 2, 3, 4, 5 };
		int primerPar = 0;
		try // No se mete en este try porque no es el error concreto ni una superclase
		{
			primerPar = primerPar(numeros);
			return String.valueOf(primerPar);
		} catch (ArithmeticException e)
		{
			System.out.println(e.getClass());

		}

		return "OK";
	}

	public static int primerPar(int v[]) throws IndexOutOfBoundsException
	{
		return v[9];
	}

}
