
public class LogaritmoTest {

	public static void main(String[] args) 
	{
		double a = 10;
		String n = "Hola Caracola";
		System.out.println(log(a));
		System.out.println(met2(n));
		
		
		// TODO Auto-generated method stub

	}
	public static double log(double a) 
	{
		return Math.log10(a);
	}
	public static char met2 (String n)
	{
		return n.charAt(0);
	}

}
