package Screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class tela_gerenciamento_cliente {

	private JFrame frame;
	private JTextField txtIdCliente;
	private JTextField txtNomeEmpresa;
	private JTextField txtNomeCliente;
	private JTextField txtEmailCliente;
	private JTextField txtCnpjCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_gerenciamento_cliente window = new tela_gerenciamento_cliente();
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
	public tela_gerenciamento_cliente() {
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
		
		JScrollPane listaClientes = new JScrollPane();
		listaClientes.setBounds(360, 11, 304, 372);
		frame.getContentPane().add(listaClientes);
		
		JLabel lblNome = new JLabel("Nome Empresa:");
		lblNome.setBounds(10, 54, 114, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente :");
		lblNomeCliente.setBounds(10, 79, 114, 14);
		frame.getContentPane().add(lblNomeCliente);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 104, 114, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCnpj = new JLabel("Cnpj:");
		lblCnpj.setBounds(10, 129, 114, 14);
		frame.getContentPane().add(lblCnpj);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(10, 29, 114, 14);
		frame.getContentPane().add(lblId);
		
		JButton btnAtulizarCliente = new JButton("Atualizar");
		btnAtulizarCliente.setBounds(55, 154, 89, 23);
		frame.getContentPane().add(btnAtulizarCliente);
		
		JButton btnRemoverCliente = new JButton("Remover");
		btnRemoverCliente.setBounds(165, 154, 89, 23);
		frame.getContentPane().add(btnRemoverCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(30, 26, 63, 20);
		frame.getContentPane().add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		txtNomeEmpresa = new JTextField();
		txtNomeEmpresa.setColumns(10);
		txtNomeEmpresa.setBounds(90, 51, 238, 20);
		frame.getContentPane().add(txtNomeEmpresa);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(90, 76, 238, 20);
		frame.getContentPane().add(txtNomeCliente);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setColumns(10);
		txtEmailCliente.setBounds(41, 101, 287, 20);
		frame.getContentPane().add(txtEmailCliente);
		
		txtCnpjCliente = new JTextField();
		txtCnpjCliente.setColumns(10);
		txtCnpjCliente.setBounds(38, 126, 290, 20);
		frame.getContentPane().add(txtCnpjCliente);
		
		JLabel label = new JLabel("Filtro");
		label.setBounds(10, 188, 171, 31);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Cnpj");
		label_1.setBounds(10, 222, 171, 31);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(38, 227, 216, 20);
		frame.getContentPane().add(textField);
		
		JLabel label_2 = new JLabel("Email:");
		label_2.setBounds(10, 264, 171, 31);
		frame.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(41, 269, 216, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_3 = new JLabel("Nome Cliente");
		label_3.setBounds(10, 306, 171, 31);
		frame.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 311, 182, 20);
		frame.getContentPane().add(textField_2);
		
		JButton button = new JButton("Pesquisar");
		button.setBounds(165, 360, 89, 23);
		frame.getContentPane().add(button);
	}
}
