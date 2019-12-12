

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaListaContas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void listar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListaContas window = new TelaListaContas();
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
	public TelaListaContas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\iconBank.png"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaGerente.frmTelaGerente.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Documents\\wwwTads-dev\\wwwTads-dev\\ProjetoLp1\\src\\imagens\\iconVoltar.png"));
		button.setBounds(34, 35, 46, 23);
		frame.getContentPane().add(button);
		
		JList list = new JList();
		list.setBounds(75, 111, 255, 359);
		frame.getContentPane().add(list);
		// Listar  as contas da agencia
		
		
		frame.setBounds(100, 100, 450, 591);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
