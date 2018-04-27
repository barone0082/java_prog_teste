package Screens;

import java.awt.EventQueue;
import model.cliente;
import DAO.conexDAO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class tela_cadastro_cliente {

	private JFrame frame;
	private JTextField txtNomeEmpresa;
	private JTextField txtNomeCliente;
	private JTextField txtEmailCliente;
	private JFormattedTextField txtCnpj;
	private JFormattedTextField txtTelefoneResidencial;
	private JFormattedTextField txtCelular1;
	private JFormattedTextField txtCelular2;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_cadastro_cliente window = new tela_cadastro_cliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public tela_cadastro_cliente() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 433);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome da Empresa:");
		lblNewLabel.setBounds(10, 26, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNomecliente = new JLabel("Nome do Cliente:");
		lblNomecliente.setBounds(10, 66, 97, 14);
		frame.getContentPane().add(lblNomecliente);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 110, 97, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(10, 157, 97, 14);
		frame.getContentPane().add(lblCnpj);
		
		JLabel lblTelefoneResidencial = new JLabel("telefone residencial:");
		lblTelefoneResidencial.setBounds(10, 209, 97, 14);
		frame.getContentPane().add(lblTelefoneResidencial);
		
		JLabel lblTelefoneCelular = new JLabel("telefone celular 1");
		lblTelefoneCelular.setBounds(10, 257, 97, 14);
		frame.getContentPane().add(lblTelefoneCelular);
		
		JLabel lblTelefoneCelular_1 = new JLabel("telefone celular 2");
		lblTelefoneCelular_1.setBounds(10, 304, 97, 14);
		frame.getContentPane().add(lblTelefoneCelular_1);
		
		txtNomeEmpresa = new JTextField();
		txtNomeEmpresa.setBounds(108, 23, 384, 20);
		frame.getContentPane().add(txtNomeEmpresa);
		txtNomeEmpresa.setColumns(10);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(108, 63, 384, 20);
		frame.getContentPane().add(txtNomeCliente);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setColumns(10);
		txtEmailCliente.setBounds(108, 107, 384, 20);
		frame.getContentPane().add(txtEmailCliente);
		
		txtCnpj =  new JFormattedTextField();
		txtCnpj.setColumns(10);
		txtCnpj.setBounds(108, 154, 384, 20);
		MaskFormatter formatCNPJ = new MaskFormatter("##.###.###/####-##");
		formatCNPJ.install(txtCnpj);
		frame.getContentPane().add(txtCnpj);
		
		txtTelefoneResidencial = new JFormattedTextField();
		txtTelefoneResidencial.setColumns(10);
		txtTelefoneResidencial.setBounds(119, 206, 373, 20);
		MaskFormatter formatTelefone = new MaskFormatter("(##)####-####");
		formatTelefone.install(txtTelefoneResidencial);
		frame.getContentPane().add(txtTelefoneResidencial);
		
		txtCelular1 = new JFormattedTextField();
		txtCelular1.setColumns(10);
		txtCelular1.setBounds(119, 254, 373, 20);
		MaskFormatter formatcelular1 = new MaskFormatter("(##)9####-####");
		formatcelular1.install(txtCelular1);
		frame.getContentPane().add(txtCelular1);
		
		txtCelular2 = new JFormattedTextField();
		txtCelular2.setColumns(10);
		txtCelular2.setBounds(117, 301, 375, 20);
		MaskFormatter formatcelular2 = new MaskFormatter("(##)9####-####");
		formatcelular2.install(txtCelular2);
		frame.getContentPane().add(txtCelular2);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cnpj;
				cliente c = new cliente();
				conexDAO dao = new conexDAO();
				c.setNome_empresa(txtNomeEmpresa.getText());
				c.setNome_cliente(txtNomeCliente.getText());
				c.setEmail(txtEmailCliente.getText());
				c.setCnpj(txtCnpj.getText());
				c.setTelefone_celular1(txtCelular1.getText());
				c.setTelefone_celular2(txtCelular2.getText());
				c.setTelefone_residencial(txtTelefoneResidencial.getText());
				
			
					dao.inserirCliente(c);
				
				
			
			}
		});
		
		btnCadastrarCliente.setBounds(245, 341, 166, 42);
		frame.getContentPane().add(btnCadastrarCliente);
	}
	

}
