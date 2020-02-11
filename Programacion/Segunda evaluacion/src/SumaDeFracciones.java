import java.util.*;
public class SumaDeFracciones 
{

	public static void main(String[] args) 
	{
		int fraccion1_num;
		int fraccion1_de;
		int fraccion2_num;
		int fraccion2_de;
		
		

	}


}
class SumaException extends Exception
{
	public  SumaException(int fraccion1_num,int fraccion1_de,int fraccion2_num,int fraccion2_den  )
	{
		return((fraccion1_num/fraccion1_de)+(fraccion2_num/fraccion2_den));
	}
}