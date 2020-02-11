package errores;

public class CuartoTryCatch
{

	public static void main(String[] args)
	{
		int v1 = 1, v2 = 0;

		try
		{
			int resultado = operacion(v1, v2);
			System.out.println(resultado);
		} catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		} catch (Exception e)
		{
			System.out.println(e.getClass());
		} finally
		{
			System.out.println("Programa finalizado");
		}

	}

	public static int operacion(int v1, int v2) throws ArithmeticException // Controlar el error desde el main
																			// lanzándolo
	{
		int resultado = v1 / v2;
		return resultado;
	}

}
