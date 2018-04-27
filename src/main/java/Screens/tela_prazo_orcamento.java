package Screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela_prazo_orcamento {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_prazo_orcamento window = new tela_prazo_orcamento();
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
	public tela_prazo_orcamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 433);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Meio Pagamento");
		label.setBounds(20, 111, 127, 30);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Data de Entrega");
		label_1.setBounds(20, 52, 120, 30);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 80, 86, 20);
		frame.getContentPane().add(textField);
		
		JRadioButton radioButton = new JRadioButton("A vista");
		radioButton.setBounds(20, 148, 109, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Parcelado");
		radioButton_1.setBounds(20, 174, 109, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Outros");
		radioButton_2.setBounds(20, 200, 109, 23);
		frame.getContentPane().add(radioButton_2);
		
		JLabel label_2 = new JLabel("Obs:");
		label_2.setBounds(20, 230, 127, 30);
		frame.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 255, 654, 76);
		frame.getContentPane().add(textField_1);
		
		JButton btnInserirProdutos = new JButton("Inserir Produtos");
		btnInserirProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela_orcamento to = new tela_orcamento();
				to.main(null);
			}
		});
		btnInserirProdutos.setBounds(421, 342, 243, 47);
		frame.getContentPane().add(btnInserirProdutos);
	}
}
