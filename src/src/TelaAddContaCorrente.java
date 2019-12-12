import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import LP.Cliente;
import LP.HandlerCliente;
import LP.HandlerContaCorrente;
import LP.HandlerContaPoupanca;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAddContaCorrente {

	private JFrame frmTelaNewConta;
	private JTextField txtsaldo;
	private JTextField txtlimite;
	private JTextField txtcpfcliente;

	/**
	 * Launch the application.
	 */
	public static void criar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAddContaCorrente window = new TelaAddContaCorrente();
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
	public TelaAddContaCorrente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaNewConta = new JFrame();
		frmTelaNewConta.getContentPane().setBackground(Color.WHITE);
		frmTelaNewConta.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\src\\iconBank.png"));
		frmTelaNewConta.setTitle("Tela New Conta Corrente");
		frmTelaNewConta.setBounds(100, 100, 283, 334);
		frmTelaNewConta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaNewConta.getContentPane().setLayout(null);
		
		JButton ok = new JButton("ok");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 //falta salvar conta
				
				Cliente cliente = HandlerCliente.consultarCliente(txtcpfcliente.getText());
				if (cliente != null) {
				
				HandlerContaCorrente.criarContaCorrente(txtsaldo.getText(), txtlimite.getText(), cliente);
				TelaGerente.frmTelaGerente.setVisible(true);
				frmTelaNewConta.setVisible(false);
			}
			}
		});
		ok.setBounds(152, 211, 89, 23);
		frmTelaNewConta.getContentPane().add(ok);
		
		JButton voltar = new JButton("");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaAddConta.frmNewConta.setVisible(true);
				frmTelaNewConta.setVisible(false);
			}
		});
		voltar.setBounds(23, 24, 51, 23);
		frmTelaNewConta.getContentPane().add(voltar);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(41, 126, 66, 14);
		frmTelaNewConta.getContentPane().add(lblSaldo);
		
		JLabel lblLimite = new JLabel("limite");
		lblLimite.setBounds(41, 151, 46, 14);
		frmTelaNewConta.getContentPane().add(lblLimite);
		
		txtsaldo = new JTextField();
		txtsaldo.setBounds(150, 123, 86, 20);
		frmTelaNewConta.getContentPane().add(txtsaldo);
		txtsaldo.setColumns(10);
		
		txtlimite = new JTextField();
		txtlimite.setText("");
		txtlimite.setBounds(150, 148, 86, 20);
		frmTelaNewConta.getContentPane().add(txtlimite);
		txtlimite.setColumns(10);
		
		txtcpfcliente = new JTextField();
		txtcpfcliente.setBounds(155, 73, 86, 20);
		frmTelaNewConta.getContentPane().add(txtcpfcliente);
		txtcpfcliente.setColumns(10);
		
		JLabel lblCpfDoCliente = new JLabel("CPF do cliente ");
		lblCpfDoCliente.setBounds(41, 76, 89, 14);
		frmTelaNewConta.getContentPane().add(lblCpfDoCliente);
	}
}
