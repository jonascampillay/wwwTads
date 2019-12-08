package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		label.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Documents\\wwwTads-dev\\wwwTads-dev\\ProjetoLp1\\src\\imagens\\login.png"));
		label.setBounds(52, 39, 100, 100);
		frmTelaCliente.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSaque saque = new TelaSaque();
				saque.saque();
			}
		});
		btnNewButton.setBounds(252, 63, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Transferencia");
		btnNewButton_1.setBounds(252, 97, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaTransferencia telaT = new TelaTransferencia();
				telaT.transferencia();
				
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("Dsposito");
		btnNewButton_2.setBounds(252, 131, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Extrato");
		btnNewButton_3.setBounds(252, 165, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton_3);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeCliente.setBounds(26, 150, 89, 14);
		frmTelaCliente.getContentPane().add(lblNomeCliente);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(26, 169, 96, 14);
		frmTelaCliente.getContentPane().add(lblSaldo);
	}


}
