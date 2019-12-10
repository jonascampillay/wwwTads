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
	public static void cliente() {
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
		btnNewButton.setBounds(298, 63, 107, 23);
		frmTelaCliente.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Transferencia");
		btnNewButton_1.setBounds(298, 97, 107, 23);
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
		
		
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setBounds(141, 63, 126, 23);
		frmTelaCliente.getContentPane().add(btnCadastrarCliente);
		
		JButton btnConsultarCliente = new JButton("Consultar CLiente");
		btnConsultarCliente.setBounds(141, 109, 126, 23);
		frmTelaCliente.getContentPane().add(btnConsultarCliente);
		
		JButton btnAlterarCliente = new JButton("Alterar cliente");
		btnAlterarCliente.setBounds(141, 165, 126, 23);
		frmTelaCliente.getContentPane().add(btnAlterarCliente);
		
		JButton btnNewButton_4 = new JButton("Transa\u00E7\u00F5es");
		btnNewButton_4.setBounds(141, 224, 126, 23);
		frmTelaCliente.getContentPane().add(btnNewButton_4);
	}
}
