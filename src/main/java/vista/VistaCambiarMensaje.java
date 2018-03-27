package vista;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class VistaCambiarMensaje extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	JButton btnCambiarMensaje;
	JButton btnSalir;

	/**
	 * Create the application.
	 */
	public VistaCambiarMensaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnCambiarMensaje = new JButton("Cambiar mensaje");
		btnCambiarMensaje.setBounds(44, 239, 91, 23);
		getContentPane().add(btnCambiarMensaje);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(297, 239, 91, 23);
		getContentPane().add(btnSalir);
		
		textField = new JTextField();
		textField.setBounds(164, 62, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSaludo = new JLabel("Saludo:");
		lblSaludo.setBounds(30, 65, 46, 14);
		getContentPane().add(lblSaludo);
	}

	public JTextField getTextField() {
		return textField;
	}


	public JButton getBtnCambiarMensaje() {
		return btnCambiarMensaje;
	}


	public JButton getBtnSalir() {
		return btnSalir;
	}


	public void mostrar() {
		this.setVisible(true);
	}
	
}
