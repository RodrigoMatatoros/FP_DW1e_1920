
public class Arboles 
{
	private String nombre;
	private double altura;
	private int a�os;
	private String nacionalidad;
	private boolean hoja;
	
	public Arboles(String nom, double alt, int annos, String pais, boolean caduca)
	{
		nombre=nom;
		altura=alt;
		a�os=annos;
		nacionalidad=pais;
		hoja=caduca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getA�os() {
		return a�os;
	}

	public void setA�os(int a�os) {
		this.a�os = a�os;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public boolean isHoja() {
		return hoja;
	}

	public void setHoja(boolean hoja) {
		this.hoja = hoja;
	}
}
