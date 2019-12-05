package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCliente {

	private JFrame frmTelaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente window = new TelaCliente();
					window.frmTelaCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaCliente = new JFrame();
		frmTelaCliente.getContentPane().setBackground(new Color(255, 255, 255));
		frmTelaCliente.setTitle("Tela Cliente");
		frmTelaCliente.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\sacodinheiro.png"));
		frmTelaCliente.setBounds(100, 100, 456, 317);
		frmTelaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaCliente.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconCliente.png"));
		label.setBounds(53, 26, 128, 128);
		frmTelaCliente.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(252, 63, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Transferencia");
		btnNewButton_1.setBounds(252, 97, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Dsposito");
		btnNewButton_2.setBounds(252, 131, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Extrato");
		btnNewButton_3.setBounds(252, 165, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton_3);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeCliente.setBounds(53, 169, 89, 14);
		frmTelaCliente.getContentPane().add(lblNomeCliente);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(53, 194, 96, 14);
		frmTelaCliente.getContentPane().add(lblSaldo);
	}


}
