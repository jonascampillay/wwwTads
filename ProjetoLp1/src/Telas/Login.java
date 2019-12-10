package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login {

	private JFrame frame;
	private JTextField num_conta;
	private JTextField num_senha;

	/**
	 * Launch the application.
	 */
	public static void Login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.setForeground(new Color(255, 153, 0));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\sacodinheiro.png"));
		frame.setBounds(100, 100, 387, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton entrar = new JButton("entrar");
		entrar.setBounds(113, 273, 89, 23);
		entrar.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				TelaCliente cliente = new TelaCliente();
				cliente.cliente();
			}
		});
		
		JLabel lblConta = new JLabel("conta");
		lblConta.setBounds(58, 187, 46, 14);
		
		JLabel lblSenha = new JLabel("senha");
		lblSenha.setBounds(58, 228, 46, 14);
		
		num_conta = new JTextField();
		num_conta.setBounds(113, 184, 195, 20);
		num_conta.setColumns(10);
		
		num_senha = new JTextField();
		num_senha.setBounds(114, 225, 194, 20);
		num_senha.setColumns(10);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(entrar);
		frame.getContentPane().add(lblConta);
		frame.getContentPane().add(lblSenha);
		frame.getContentPane().add(num_conta);
		frame.getContentPane().add(num_senha);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Documents\\wwwTads-dev\\wwwTads-dev\\ProjetoLp1\\src\\imagens\\iconPerson.png"));
		label.setBounds(124, 29, 125, 124);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 11, 0, 0);
		frame.getContentPane().add(label_1);
	}
}
