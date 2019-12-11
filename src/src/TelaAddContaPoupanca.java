import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import LP.Cliente;
import LP.HandlerCliente;
import LP.HandlerContaCorrente;
import LP.HandlerContaPoupanca;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAddContaPoupanca {

	private JFrame frmTelaNewConta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtcpfcliente;

	/**
	 * Launch the application.
	 */
	public static void criar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAddContaPoupanca window = new TelaAddContaPoupanca();
					window.frmTelaNewConta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAddContaPoupanca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaNewConta = new JFrame();
		frmTelaNewConta.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\src\\iconBank.png"));
		frmTelaNewConta.getContentPane().setBackground(Color.WHITE);
		frmTelaNewConta.setTitle("Tela New Conta Poupanca");
		frmTelaNewConta.setBounds(100, 100, 268, 411);
		frmTelaNewConta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaNewConta.getContentPane().setLayout(null);
		
		JButton voltar = new JButton("");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaAddConta.frmNewConta.setVisible(true);
				frmTelaNewConta.setVisible(false);
			}
		});
		voltar.setBounds(20, 24, 46, 23);
		frmTelaNewConta.getContentPane().add(voltar);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//falta salvar conta 
				
				
				Cliente cliente = HandlerCliente.consultarCliente(txtcpfcliente.getText());
				if (cliente != null) {
				HandlerContaPoupanca.criarContaPoupanca(cliente);
				TelaGerente.frmTelaGerente.setVisible(true);
				frmTelaNewConta.setVisible(false);
				}
			}
		});
		btnOk.setBounds(73, 314, 89, 23);
		frmTelaNewConta.getContentPane().add(btnOk);
		
		textField = new JTextField();
		textField.setBounds(110, 189, 111, 20);
		frmTelaNewConta.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 220, 111, 20);
		frmTelaNewConta.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSaldoInicial = new JLabel("saldo inicial");
		lblSaldoInicial.setBounds(20, 192, 80, 14);
		frmTelaNewConta.getContentPane().add(lblSaldoInicial);
		
		JLabel lblRendimento = new JLabel("rendimento");
		lblRendimento.setBounds(20, 223, 80, 14);
		frmTelaNewConta.getContentPane().add(lblRendimento);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\src\\iconAdd.png"));
		label.setBounds(128, 40, 75, 75);
		frmTelaNewConta.getContentPane().add(label);
		
		txtcpfcliente = new JTextField();
		txtcpfcliente.setBounds(110, 147, 111, 20);
		frmTelaNewConta.getContentPane().add(txtcpfcliente);
		txtcpfcliente.setColumns(10);
		
		JLabel lblCpfDoCiente = new JLabel("CPF do ciente");
		lblCpfDoCiente.setBounds(20, 150, 90, 14);
		frmTelaNewConta.getContentPane().add(lblCpfDoCiente);
	}

}
