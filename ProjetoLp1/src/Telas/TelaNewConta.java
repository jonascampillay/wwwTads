package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaNewConta {

	private JFrame frmNewConta;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void iniciar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNewConta window = new TelaNewConta();
					window.frmNewConta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaNewConta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewConta = new JFrame();
		frmNewConta.getContentPane().setBackground(Color.WHITE);
		frmNewConta.setTitle("New Conta");
		frmNewConta.setBounds(100, 100, 288, 316);
		frmNewConta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewConta.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(118, 189, 86, 20);
		frmNewConta.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSaldoInicial = new JLabel("Saldo Inicial");
		lblSaldoInicial.setBounds(37, 189, 78, 20);
		frmNewConta.getContentPane().add(lblSaldoInicial);
		
		JLabel lblNewLabel = new JLabel("Tipo de Conta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 25, 169, 27);
		frmNewConta.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnContaPoupana = new JRadioButton("Conta Poupan\u00E7a");
		rdbtnContaPoupana.setBounds(20, 59, 109, 23);
		frmNewConta.getContentPane().add(rdbtnContaPoupana);
		
		JRadioButton rdbtnContaCorrente = new JRadioButton("Conta Corrente");
		rdbtnContaCorrente.setBounds(20, 85, 109, 23);
		frmNewConta.getContentPane().add(rdbtnContaCorrente);
		
		JLabel lblCpfDoCliente = new JLabel("CPF do Cliente");
		lblCpfDoCliente.setBounds(36, 147, 91, 27);
		frmNewConta.getContentPane().add(lblCpfDoCliente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 150, 109, 20);
		frmNewConta.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\iconAdd.png"));
		lblNewLabel_1.setBounds(162, 25, 75, 75);
		frmNewConta.getContentPane().add(lblNewLabel_1);
	}
}
