import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import LP.Cliente;
import LP.HandlerCliente;
import LP.Principal;
import LP.Util;
import LP.UtilBanco;

public class TelaAddCLiente {

	public static JFrame frmNewClient;
	private JTextField txtnome;
	private JTextField txtCPF;
	private JTextField txtendereco;
	private JTextField txtlogin;
	private JTextField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void adicionar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAddCLiente window = new TelaAddCLiente();
					window.frmNewClient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAddCLiente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewClient = new JFrame();
		frmNewClient.getContentPane().setBackground(Color.WHITE);
		frmNewClient.setTitle("New Client");
		frmNewClient.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\iconBank.png"));
		frmNewClient.setBounds(100, 100, 311, 491);
		frmNewClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewClient.getContentPane().setLayout(null);
		
		txtnome = new JTextField();
		txtnome.setBounds(90, 162, 160, 20);
		frmNewClient.getContentPane().add(txtnome);
		txtnome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(90, 193, 160, 20);
		frmNewClient.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		txtendereco = new JTextField();
		txtendereco.setBounds(90, 224, 160, 20);
		frmNewClient.getContentPane().add(txtendereco);
		txtendereco.setColumns(10);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(90, 313, 136, 20);
		frmNewClient.getContentPane().add(txtlogin);
		txtlogin.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNewClient.setVisible(false);
				TelaGerente.frmTelaGerente.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconVoltar.png"));
		btnNewButton.setBounds(23, 23, 46, 23);
		frmNewClient.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ok");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Confirmar e Salvar o Novo Cliente
				
				if (!UtilBanco.pesquisaCliente(txtCPF.getText())) {
					HandlerCliente.cadastrarCliente(txtnome.getText(), txtCPF.getText(), txtendereco.getText());
				}
				
				
				frmNewClient.setVisible(false);
				TelaGerente.frmTelaGerente.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(102, 391, 85, 23);
		frmNewClient.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setBounds(23, 165, 46, 14);
		frmNewClient.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cpf");
		lblNewLabel_1.setBounds(23, 196, 46, 14);
		frmNewClient.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("endere\u00E7o");
		lblNewLabel_2.setBounds(23, 227, 46, 14);
		frmNewClient.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setBounds(23, 316, 46, 14);
		frmNewClient.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("senha");
		lblNewLabel_4.setBounds(23, 347, 46, 14);
		frmNewClient.getContentPane().add(lblNewLabel_4);
		
		txtsenha = new JTextField();
		txtsenha.setBounds(90, 344, 136, 20);
		frmNewClient.getContentPane().add(txtsenha);
		txtsenha.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconAddPerson.png"));
		label.setBounds(114, 53, 75, 75);
		frmNewClient.getContentPane().add(label);
	}
}
