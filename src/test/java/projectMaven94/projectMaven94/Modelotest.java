package projectMaven94.projectMaven94;

import static org.junit.Assert.assertEquals;
import modelo.Modelo;

public class Modelotest {

	@org.junit.Test
	@org.junit.Before
	public void correrAntes()
	{
		ControladorTest ctrl = new ControladorTest();
		ctrl.Test2();
		ctrl.Test2();
		ctrl.Test3();
		ctrl.Test4();
		ctrl.test5();
	}
	
	@org.junit.Test
	public void test() {
		Modelo modelo = new Modelo();
		assertEquals(modelo.getMensaje(),"Hola! ");
	}

	@org.junit.Test
	public void setMensajeTest()
	{
		Modelo modelo = new Modelo();
		modelo.setMensaje("Hello Sir");
		assertEquals(modelo.getMensaje(), "Hello Sir");
	}
}
