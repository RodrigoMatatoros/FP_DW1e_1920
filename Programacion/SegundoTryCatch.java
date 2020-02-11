package errores;

public class SegundoTryCatch
{

	public static void main(String[] args)
	{
		int numerador = 10, denominador = 0, resultado = 0;

		try
		{
			resultado = numerador / denominador;
		} catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

		catch (Exception e)
		{
			System.out.println(e.getClass());
		} finally
		{
			System.out.println("Fin de programa");
		}
		System.out.println(resultado);
	}

}
