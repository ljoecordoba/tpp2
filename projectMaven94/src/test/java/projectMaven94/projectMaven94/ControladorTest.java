package projectMaven94.projectMaven94;

import static org.junit.Assert.*;

import javax.swing.JButton;


import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class ControladorTest {

	
	@org.junit.Test
	public void Test2()
	{
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		JButton button = controlador.getVista().getBtnSaludar();
		button.doClick();
		assertEquals(vista.getLblHolamundolabel().isVisible(), true);
	}
	@org.junit.Test
	public void Test3()
	{
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		JButton button = vista.getBtnModificar();
		button.doClick();
		assert(controlador.getVistaCambiarMensaje() != null);
	}
	@org.junit.Test
	public void Test4()
	{
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		vista.getBtnModificar().doClick();
		JButton button = controlador.getVistaCambiarMensaje().getBtnCambiarMensaje();
		String text = controlador.getVistaCambiarMensaje().getTextField().getText();
		button.doClick();
		assertEquals(modelo.getMensaje(), text);
		assert(controlador.getVistaCambiarMensaje() == null);
	}
	
	@org.junit.Test
	public void test5()
	{
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		vista.getBtnModificar().doClick();
		controlador.getVistaCambiarMensaje().getBtnSalir().doClick();
		assertEquals(controlador.getVistaCambiarMensaje(), null);
	}

}
