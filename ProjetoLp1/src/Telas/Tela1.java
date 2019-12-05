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

public class Tela1 {

	private JFrame frmTelaGerente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
					window.frmTelaGerente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaGerente = new JFrame();
		frmTelaGerente.getContentPane().setBackground(new Color(255, 255, 255));
		frmTelaGerente.setTitle("Tela Gerente");
		frmTelaGerente.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\sacodinheiro.png"));
		frmTelaGerente.setBounds(100, 100, 409, 529);
		frmTelaGerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaGerente.getContentPane().setLayout(null);
		
		JButton btnAddClient = new JButton("add Cliente");
		btnAddClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddClient.setBounds(44, 166, 105, 23);
		frmTelaGerente.getContentPane().add(btnAddClient);
		
		JButton btnAddContas = new JButton("add Contas");
		btnAddContas.setBounds(217, 166, 105, 23);
		frmTelaGerente.getContentPane().add(btnAddContas);
		
		JButton btnRemoveCliente = new JButton("remove Cliente");
		btnRemoveCliente.setIcon(null);
		btnRemoveCliente.setBounds(44, 292, 105, 23);
		frmTelaGerente.getContentPane().add(btnRemoveCliente);
		
		JButton btnNewButton = new JButton("remove Conta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(217, 292, 105, 23);
		frmTelaGerente.getContentPane().add(btnNewButton);
		
		JButton btnUpdate = new JButton("UpDate");
		btnUpdate.setBounds(141, 423, 89, 23);
		frmTelaGerente.getContentPane().add(btnUpdate);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconaddPerson.png"));
		label.setBounds(54, 83, 75, 75);
		frmTelaGerente.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconaddcont.png"));
		label_1.setBounds(227, 83, 75, 75);
		frmTelaGerente.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconremoveCLient.png"));
		label_2.setBounds(54, 206, 75, 75);
		frmTelaGerente.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconremoveConta.png"));
		label_3.setBounds(227, 206, 75, 75);
		frmTelaGerente.getContentPane().add(label_3);
	}

}
