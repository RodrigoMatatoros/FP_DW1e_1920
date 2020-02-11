
public class Arboles 
{
	private String nombre;
	private double altura;
	private int años;
	private String nacionalidad;
	private boolean hoja;
	
	public Arboles(String nom, double alt, int annos, String pais, boolean caduca)
	{
		nombre=nom;
		altura=alt;
		años=annos;
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

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
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
