import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestActividades {
	private Actividades func;
	private int resultint;
	private String resultString;
	private boolean resultBoolean;

	@Before
	public void createFunciones()
	{
		func=new Actividades();
	}
	
	@After
	public void zeroFunciones()
	{
		func=null;
	}
	
	@Test
	public void Cadenas()
	{
		String cadena1 ="Hola";
		String cadena2 =" mundo";
		resultString=func.Cadenas(cadena1, cadena2);
		Assert.assertEquals(cadena1+cadena2, resultString);
	}
	
	@Test
	public void mayusculas()
	{
		String cadena="hola mundo";
		resultString=func.mayusculas(cadena);
		Assert.assertEquals("HOLA MUNDO", resultString);
		
	}
	
	@Test
	public void elementos()
	{
		String cadena="Manzana";
		resultint=func.elementos(cadena);
		Assert.assertEquals(7, resultint);
		
	}
	
	@Test
	public void numMayor()
	{
		int num1=5;
		int num2=1;
		resultBoolean=func.numMayor(num1, num2);
		Assert.assertEquals(true, resultBoolean);
		
	}
	
	@Test
	public void cuadrado()
	{
		int num=2;
		resultint=func.cuadrado(num);
		Assert.assertEquals(2*2, resultint);
		
	}
	
	@Test
	public void mayorDiez()
	{
		int num=22;
		resultBoolean=func.mayorDiez(num);
		Assert.assertEquals(true, resultBoolean);
		
	}
	
	

}
