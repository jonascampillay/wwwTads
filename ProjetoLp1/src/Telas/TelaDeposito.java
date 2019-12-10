package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaDeposito {

	private JFrame frmDeposito;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void deposito() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeposito window = new TelaDeposito();
					window.frmDeposito.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDeposito() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeposito = new JFrame();
		frmDeposito.setForeground(Color.WHITE);
		frmDeposito.setTitle("Deposito");
		frmDeposito.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\iconBank.png"));
		frmDeposito.setBackground(new Color(255, 102, 0));
		frmDeposito.getContentPane().setBackground(Color.WHITE);
		frmDeposito.setBounds(100, 100, 325, 313);
		frmDeposito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(63, 175, 175, 20);
		textField.setColumns(10);
		
		JLabel lblR = new JLabel("R$");
		lblR.setBounds(25, 175, 16, 18);
		lblR.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		
		JLabel lblQualOValor = new JLabel("Valor a Depositar");
		lblQualOValor.setBounds(25, 128, 99, 14);
		frmDeposito.getContentPane().setLayout(null);
		
		JLabel lblSaldo = new JLabel("Saldo Atual");
		lblSaldo.setBounds(25, 42, 120, 33);
		frmDeposito.getContentPane().add(lblSaldo);
		frmDeposito.getContentPane().add(lblQualOValor);
		frmDeposito.getContentPane().add(lblR);
		frmDeposito.getContentPane().add(textField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\images.png"));
		label.setBounds(180, 37, 75, 75);
		frmDeposito.getContentPane().add(label);
		
		JButton btnOk = new JButton("ok");
		btnOk.setBounds(102, 227, 89, 23);
		frmDeposito.getContentPane().add(btnOk);
	}
}
