package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaRemoveCliente {

	private JFrame frmRemoveCliente;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRemoveCliente window = new TelaRemoveCliente();
					window.frmRemoveCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaRemoveCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRemoveCliente = new JFrame();
		frmRemoveCliente.setTitle("Remove Cliente");
		frmRemoveCliente.getContentPane().setBackground(Color.WHITE);
		frmRemoveCliente.getContentPane().setLayout(null);
		
		JLabel lblCpfDoCliente = new JLabel("CPF do Cliente");
		lblCpfDoCliente.setBounds(27, 169, 89, 14);
		frmRemoveCliente.getContentPane().add(lblCpfDoCliente);
		
		textField = new JTextField();
		textField.setBounds(126, 166, 120, 20);
		frmRemoveCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\iconRemovePerson.png"));
		label.setBounds(104, 49, 75, 75);
		frmRemoveCliente.getContentPane().add(label);
		
		JButton btnK = new JButton("ok");
		btnK.setBounds(90, 216, 89, 23);
		frmRemoveCliente.getContentPane().add(btnK);
		frmRemoveCliente.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\iconBank.png"));
		frmRemoveCliente.setBounds(100, 100, 295, 316);
		frmRemoveCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
