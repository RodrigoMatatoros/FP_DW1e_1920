package errores;

public class SextoTryCatch
{

	public static void main(String[] args)
	{
		int[] lista =
		{ 1, 5, 3, 5, 8, 0, 1, 8 };

		try
		{
			comprobacion(lista);

		} catch (Throwable e)
		{
			System.out.println(e.getClass() + e.getMessage());
		}

	}

	public static void comprobacion(int[] lista) throws Throwable
	{
		for (int v : lista)
		{
			if (v == 0)
			{
				throw new Throwable(" ----- Hay un cero ------");

			}

		}
		for (int i : lista)
		{
			System.out.println(i);
		}
	}

}
