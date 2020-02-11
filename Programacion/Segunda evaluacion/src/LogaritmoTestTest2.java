import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
class LogaritmoTestTest2 {

	@Test
	void testLog() 
	{
		double a = 10;
		double esperado = 1;
		double resulta = LogaritmoTest.log(a);
		if(esperado != resulta)
		{
			 fail("Fallo");
		}else
		{
			assertEquals(esperado,resulta, 0);
		}
	}
	
	@Test
	void testMet2() 
	{
		String a = "Hola Caracola";
		char esperado ='c';
		char resulta = LogaritmoTest.met2(a);
		if(esperado != resulta)
		{
			 fail("Fallo");
		}else
		{
			assertEquals(esperado,resulta, 0);
		}
	}

}
