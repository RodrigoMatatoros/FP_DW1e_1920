package errores;

public class SeptimoTryCatch
{

	public static void main(String[] args)
	{
		boolean mayorDeEdad = true;

		try
		{
			esFalse(mayorDeEdad);
		} catch (FalsoException e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static void esFalse(boolean valor) throws FalsoException
	{
		if (!valor)
		{
			throw new FalsoException("Es menor de edad");
		}
		System.out.println("Mayor de edad");
	}

}

class FalsoException extends Exception
{
	public FalsoException(String msg)
	{
		super(msg);
	}
}
