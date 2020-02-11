/**
 * Creamos la clase PracticaJavaDoc para que nos aparezca el nombre la edad y el sueldo del trabajador
 * @author dw1e1920
 *
 */
public class PracticaJavaDoc 
{
	/**
	 * Creo variable de nombre
	 */
	private String nombre;
	/**
	 * Creamos variable de edad
	 */
	private int edad;
	/**
	 * Creamos la variable sueldo
	 */
	private double sueldo;
	
	/**
	 * Creamos un constructor.
	 * 
	 * @param nombre
	 * @param edad
	 * @param sueldo
	 */
	public PracticaJavaDoc (String nombre, int edad, double sueldo)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	/**
	 * Creamos la clase main para imprimir los datos del trabajador
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/**
		 * Creamos un objeto para poder meter los parametros del 
		 */
			PracticaJavaDoc obj = new PracticaJavaDoc("Alberto",24,1400);
			System.out.println("Nombre: " +obj.getNombre()+" Edad: "+obj.getEdad()+" Sueldo: "+obj.getSueldo());
	}


	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}


	public int getEdad() 
	{
		return edad;
	}


	public void setEdad(int edad) 
	{
		this.edad = edad;
	}


	public double getSueldo() 
	{
		return sueldo;
	}


	public void setSueldo(double sueldo) 
	
	{
		this.sueldo = sueldo;
	}

}
