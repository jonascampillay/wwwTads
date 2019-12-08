package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class TelaSaque {

	private JFrame frmSaque;
	private JTextField textSaque;

	/**
	 * Launch the application.
	 */
	public static void saque() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSaque window = new TelaSaque();
					window.frmSaque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaSaque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaque = new JFrame();
		frmSaque.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\iconBank.png"));
		frmSaque.setTitle("Saque");
		frmSaque.getContentPane().setBackground(Color.WHITE);
		frmSaque.setBounds(100, 100, 298, 287);
		frmSaque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSaque.getContentPane().setLayout(null);
		
		JButton btnSacar = new JButton("ok");
		btnSacar.setBounds(90, 187, 89, 23);
		frmSaque.getContentPane().add(btnSacar);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Documents\\wwwTads-dev\\wwwTads-dev\\ProjetoLp1\\src\\imagens\\iconVoltar.png"));
		btnVoltar.setBounds(26, 11, 37, 23);
		frmSaque.getContentPane().add(btnVoltar);
		
		textSaque = new JTextField();
		textSaque.setBounds(118, 125, 97, 20);
		frmSaque.getContentPane().add(textSaque);
		textSaque.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("valor a sacar");
		lblNewLabel.setBounds(31, 120, 128, 30);
		frmSaque.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Saldo Atual");
		lblNewLabel_1.setBounds(31, 74, 77, 30);
		frmSaque.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\images.png"));
		label.setBounds(154, 21, 75, 75);
		frmSaque.getContentPane().add(label);
	}
}
