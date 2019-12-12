
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import LP.Cliente;
import LP.HandlerCliente;
import LP.HandlerConta;
import LP.HandlerContaCorrente;
import LP.HandlerContaPoupanca;
import LP.Principal;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaAddConta {

	public static JFrame frmNewConta;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void iniciar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAddConta window = new TelaAddConta();
					window.frmNewConta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAddConta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewConta = new JFrame();
		frmNewConta.setResizable(false);
		frmNewConta.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\20181tadst0330\\Desktop\\src\\iconBank.png"));
		frmNewConta.getContentPane().setBackground(Color.WHITE);
		frmNewConta.setTitle("New Conta");
		frmNewConta.setBounds(100, 100, 216, 241);
		frmNewConta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewConta.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tipo de Conta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 40, 169, 27);
		frmNewConta.getContentPane().add(lblNewLabel);

		JRadioButton rdbtnContaPoupana = new JRadioButton("Conta Poupan\u00E7a");
		buttonGroup.add(rdbtnContaPoupana);
		rdbtnContaPoupana.setBounds(18, 74, 109, 23);
		frmNewConta.getContentPane().add(rdbtnContaPoupana);

		JRadioButton rdbtnContaCorrente = new JRadioButton("Conta Corrente");
		buttonGroup.add(rdbtnContaCorrente);
		rdbtnContaCorrente.setBounds(18, 100, 109, 23);
		frmNewConta.getContentPane().add(rdbtnContaCorrente);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconAdd.png"));
		lblNewLabel_1.setBounds(162, 25, 75, 75);
		frmNewConta.getContentPane().add(lblNewLabel_1);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					if (rdbtnContaPoupana.isSelected()) {
						TelaAddContaPoupanca.criar();
						frmNewConta.setVisible(false);
					}else{
						TelaAddContaCorrente.criar();
						frmNewConta.setVisible(false);
					}

			}
		});
		btnOk.setBounds(67, 156, 89, 23);
		frmNewConta.getContentPane().add(btnOk);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaGerente.frmTelaGerente.setVisible(true);
				frmNewConta.setVisible(false);

			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\20181tadst0330\\Desktop\\iconVoltar.png"));
		button.setBounds(26, 11, 45, 23);
		frmNewConta.getContentPane().add(button);
	}
}
