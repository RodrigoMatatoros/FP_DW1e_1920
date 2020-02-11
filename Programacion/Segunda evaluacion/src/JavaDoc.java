/**
 * Programa para calcular la suma, resta, multipicacion y division de dos numeros dobles
 * 
 * consta de los metodos main sumar restar multiplicar y dividir
 * @author dw1e1920
 *@version 1.0
 */
public class JavaDoc 
{

	/**
	 * Este metodo solo llama a otros metodos
	 * @param args - Array de String
	 * @see metodos: sumar, restar, multiplicar y dividir en esta clase
	 */
	public static void main(String[] args) 
	{
		JavaDoc obj = new JavaDoc();
		
		double suma = obj.sumar(32.20, 10);
		double resta = obj.restar(32.20, 10);
		double multiplica = obj.multiplicar(32.20, 10);
		double divide = obj.dividir(32.20, 10);
		
		System.out.println("Resultados: "+suma+" * "+resta+" * "+multiplica+" * "+divide);
		
		

	}
	/**
	 * 
	 * @param a -- tipo double
	 * @param b -- tipo double 
	 * @return -- retorna la suma de los parametros . Tipo double
	 */
	public double sumar(double a, double b)
	{
		return a+b;
	}
	/**
	 * 
	 * @param a -- tipo double
	 * @param b -- tipo double 
	 * @return -- retorna la resta de los parametros . Tipo double
	 */
	public double restar(double a, double b)
	{
		return a-b;
	}
	/**
	 * 
	 * @param a -- tipo double
	 * @param b -- tipo double 
	 * @return -- retorna la multipliación de los parametros . Tipo double
	 */
	public double multiplicar(double a, double b)
	{
		return a*b;
	}
	/**
	 * 
	 * @param a -- tipo double
	 * @param b -- tipo double 
	 * @return -- retorna la división de los parametros . Tipo double
	 */
	public double dividir(double a, double b)
	{
		return a/b;
	}
	
}

