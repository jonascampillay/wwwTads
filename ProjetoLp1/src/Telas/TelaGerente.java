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

public class TelaGerente {

	private JFrame frmTelaGerente;

	/**
	 * Launch the application.
	 */
	public static void iniciar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerente window = new TelaGerente();
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
	public TelaGerente() {
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
		frmTelaGerente.setBounds(100, 100, 409, 654);
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
		btnAddContas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaNewConta telanewconta = new TelaNewConta();
				telanewconta.iniciar();
			}
		});
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
		btnUpdate.setBounds(145, 561, 89, 23);
		frmTelaGerente.getContentPane().add(btnUpdate);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\iconAddPerson.png"));
		label.setBounds(54, 83, 75, 75);
		frmTelaGerente.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\iconAdd.png"));
		label_1.setBounds(227, 83, 75, 75);
		frmTelaGerente.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\iconRemovePerson.png"));
		label_2.setBounds(54, 206, 75, 75);
		frmTelaGerente.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Hiago Brazzali\\Documents\\wwwTads\\ProjetoLp1\\src\\Imagens\\iconRemove.png"));
		label_3.setBounds(227, 206, 75, 75);
		frmTelaGerente.getContentPane().add(label_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setSelectedIcon(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Documents\\wwwTads-dev\\wwwTads-dev\\ProjetoLp1\\src\\imagens\\iconVoltar.png"));
		btnNewButton_1.setBounds(10, 11, 41, 23);
		frmTelaGerente.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("listar Clientes");
		btnNewButton_2.setBounds(44, 447, 105, 23);
		frmTelaGerente.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("listar Contas");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaListaContas listaContas = new TelaListaContas();
				TelaListaContas.iniciar();
			}
		});
		btnNewButton_3.setBounds(217, 447, 105, 23);
		frmTelaGerente.getContentPane().add(btnNewButton_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Documents\\wwwTads-dev\\wwwTads-dev\\ProjetoLp1\\src\\imagens\\iconListarPerson.png"));
		label_4.setBounds(54, 361, 75, 75);
		frmTelaGerente.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Documents\\wwwTads-dev\\wwwTads-dev\\ProjetoLp1\\src\\imagens\\iconListarContas.png"));
		label_5.setBounds(227, 361, 75, 75);
		frmTelaGerente.getContentPane().add(label_5);
	}

}
