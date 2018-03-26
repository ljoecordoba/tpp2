package vista;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.awt.Font;


public class Vista extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblHolamundolabel;
	private JButton btnSaludar;
	private JTextField textField;
	private JLabel lblIngreseSuNombre;
	private JButton btnCambiarSaludo;
	private JLabel lblSaludoPorDefault;
	/**
	 * Create the application.
	 */
	public Vista() {
		getContentPane().setLayout(null);
		btnSaludar = new JButton("Saludar");
		btnSaludar.setBounds(36, 217, 102, 23);
		getContentPane().add(btnSaludar);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		lblHolamundolabel = new JLabel("HolaMundoLabel");
		lblHolamundolabel.setBounds(161, 179, 102, 14);
		getContentPane().add(lblHolamundolabel);
		
		textField = new JTextField();
		textField.setBounds(164, 51, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblIngreseSuNombre = new JLabel("Ingrese su nombre");
		lblIngreseSuNombre.setBounds(36, 54, 102, 14);
		getContentPane().add(lblIngreseSuNombre);
		
		btnCambiarSaludo = new JButton("Cambiar Saludo");
		btnCambiarSaludo.setBounds(281, 217, 116, 23);
		getContentPane().add(btnCambiarSaludo);
		
		lblSaludoPorDefault = new JLabel("Saludo por default: ");
		lblSaludoPorDefault.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSaludoPorDefault.setBounds(36, 11, 222, 14);
		getContentPane().add(lblSaludoPorDefault);
		lblHolamundolabel.setVisible(false);
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */

	
	public void setVisible()
	{
		this.setVisible(true);
	}


	public JLabel getLblHolamundolabel() {
		return lblHolamundolabel;
	}


	public JButton getBtnSaludar() {
		return btnSaludar;
	}


	public JTextField getTextField() {
		return textField;
	}



	public JButton getBtnModificar() {
		return btnCambiarSaludo;
	}
	public JLabel getLblSaludoPorDefault()
	{
		return lblSaludoPorDefault;
	}
	
}
