package Screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import DAO.conexDAO;
import model.produto;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class adicionar_produto {

	private JFrame frame;
	private JTextField txtNomeProduto;
	private JFormattedTextField txtValorUnitario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adicionar_produto window = new adicionar_produto();
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
	public adicionar_produto() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frame = new JFrame();
		frame.setBounds(100, 100, 407, 225);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Produto:");
		lblNewLabel.setBounds(10, 57, 130, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblValorUnitariometro = new JLabel("Valor Unitario/metro");
		lblValorUnitariometro.setBounds(10, 97, 130, 14);
		frame.getContentPane().add(lblValorUnitariometro);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produto p = new produto();
				p.setId_produto(0);
				p.setNome_produto(txtNomeProduto.getText());
				p.setValor_produto_unitario(Double.parseDouble(txtValorUnitario.getText()));
				
				conexDAO dao = new conexDAO();
				dao.inserirProduto(p);
			}
		});
		btnInserir.setBounds(124, 151, 89, 23);
		frame.getContentPane().add(btnInserir);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(133, 54, 181, 20);
		frame.getContentPane().add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		txtValorUnitario = new JFormattedTextField();
		txtValorUnitario.setColumns(10);
		txtValorUnitario.setBounds(134, 94, 113, 20);
		frame.getContentPane().add(txtValorUnitario);
		MaskFormatter formatValor = new MaskFormatter("###.##");
		formatValor.install(txtValorUnitario);
		frame.getContentPane().add(txtValorUnitario);
	}

}
