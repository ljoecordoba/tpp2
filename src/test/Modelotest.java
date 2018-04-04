package org.test;

import static org.junit.Assert.assertEquals;
import modelo.Modelo;

public class Modelotest {


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
