package Screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.LineNumberInputStream;
import java.sql.SQLException;

import javax.swing.JScrollPane;
import DAO.conexDAO;
import model.cliente;
public class tela_selecionar_cliente {

	private JFrame frame;
	private JTextField txtCnpjConsulta;
	private JTextField txtEmailConsulta;
	private JTextField txtNomeConsulta;
	private JList listaClientes; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_selecionar_cliente window = new tela_selecionar_cliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public tela_selecionar_cliente() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 433);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelecioneOCliente = new JLabel("Filtro");
		lblSelecioneOCliente.setBounds(30, 49, 171, 31);
		frame.getContentPane().add(lblSelecioneOCliente);
		
		JLabel lblCnpj = new JLabel("Cnpj");
		lblCnpj.setBounds(10, 91, 171, 31);
		frame.getContentPane().add(lblCnpj);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 133, 171, 31);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNome = new JLabel("Nome Cliente");
		lblNome.setBounds(10, 174, 171, 31);
		frame.getContentPane().add(lblNome);
		
		txtCnpjConsulta = new JTextField();
		txtCnpjConsulta.setBounds(40, 96, 216, 20);
		frame.getContentPane().add(txtCnpjConsulta);
		txtCnpjConsulta.setColumns(10);
		
		txtEmailConsulta = new JTextField();
		txtEmailConsulta.setColumns(10);
		txtEmailConsulta.setBounds(40, 138, 216, 20);
		frame.getContentPane().add(txtEmailConsulta);
		
		txtNomeConsulta = new JTextField();
		txtNomeConsulta.setColumns(10);
		txtNomeConsulta.setBounds(74, 179, 182, 20);
		frame.getContentPane().add(txtNomeConsulta);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(126, 220, 89, 23);
		frame.getContentPane().add(btnPesquisar);
		
		JButton btnSelecionarCliente = new JButton("Selecionar Cliente");
		btnSelecionarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tela_prazo_orcamento tpo = new tela_prazo_orcamento();
				tpo.main(null);
			}
		});
		btnSelecionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelecionarCliente.setBounds(422, 360, 165, 23);
		frame.getContentPane().add(btnSelecionarCliente);
		
		listaClientes = new JList();
		listaClientes.setBounds(357, 49, 284, 266);
		frame.getContentPane().add(listaClientes);
		conexDAO dao = new conexDAO();
	
		
		
	}
	public void adicionarCliente(cliente cl){
	
		
		listaClientes.add(listaClientes, cl.getNome_cliente()+" - "+cl.getEmail()+" - "+cl.getCnpj());
	}
}
