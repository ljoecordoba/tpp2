package modelo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ModeloTest extends TestCase{

	public ModeloTest(String name){
		super(name);
	}
    public static Test suite()
    {
        return new TestSuite( ModeloTest.class );
    }

	public void testApp()
	{
		Modelo modelo = new Modelo();
		modelo.setMensaje("Hello Sir");
		assertEquals(modelo.getMensaje(), "Hello Sir");
	}
}
