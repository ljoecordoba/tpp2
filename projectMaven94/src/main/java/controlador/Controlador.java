package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;
import vista.VistaCambiarMensaje;


public class Controlador implements ActionListener
{
	private Modelo modelo;
	private Vista vista;
	private VistaCambiarMensaje vistaMensaje;
	public Controlador(Modelo modelo, Vista vista)
	{
		this.modelo = modelo;
		this.vista = vista;
		this.vista.setVisible();
		this.vista.getBtnSaludar().addActionListener(this);
		this.vista.getBtnModificar().addActionListener(this);
		this.vista.getLblSaludoPorDefault().setText(this.vista.getLblSaludoPorDefault().getText()+modelo.getMensaje());
	}
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() == vista.getBtnSaludar())
		{
			vista.getLblHolamundolabel().setVisible(true);
			vista.getLblHolamundolabel().setText(modelo.getMensaje() +" "+vista.getTextField().getText());
		}
		if(e.getSource() == vista.getBtnModificar())
		{
			iniciarVistaEditar();
			vistaMensaje.mostrar();
		}
		if(vistaMensaje != null && e.getSource() == vistaMensaje.getBtnCambiarMensaje())
		{
			
			String mensaje = vistaMensaje.getTextField().getText();
			modelo.setMensaje(mensaje);
			vistaMensaje.dispose();			
			this.update();
			vistaMensaje = null;
		}
		if (vistaMensaje != null && e.getSource() == vistaMensaje.getBtnSalir())
		{
			vistaMensaje.dispose();
			vistaMensaje=null;
		}
	}
	
	public void iniciarVistaEditar()
	{
		vistaMensaje = new VistaCambiarMensaje();
		vistaMensaje.getBtnCambiarMensaje().addActionListener(this);
		vistaMensaje.getBtnSalir().addActionListener(this);
		
	}
	public void update()
	{
		this.vista.getLblSaludoPorDefault().setText("Saludo por default: "+modelo.getMensaje());
	}
	public  VistaCambiarMensaje getVistaCambiarMensaje() {
		// TODO Auto-generated method stub
		return vistaMensaje;
	}
	public Vista getVista()
	{
		return vista;
	}
}
