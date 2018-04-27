package Screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import window.window.java.*;
public class tela_orcamento {

	private JFrame frame;
	private JTextField txtTitulo;
	private JTextField TxtLargura;
	private JTextField TxtComprimento;
	private JTextField txtPrecoUnitario;
	private JTextField TxtTotalItem;
	private final ButtonGroup groupMeioPagamento = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_orcamento window = new tela_orcamento();
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
	public tela_orcamento() {
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
		
		JLabel lblMaterial = new JLabel("Material :");
		lblMaterial.setBounds(20, 52, 76, 30);
		frame.getContentPane().add(lblMaterial);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(20, 90, 76, 30);
		frame.getContentPane().add(lblQuantidade);
		
		JLabel lblTitulo = new JLabel("Titulo :");
		lblTitulo.setBounds(20, 11, 76, 30);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblPreoUnitario = new JLabel("Preço Unitario");
		lblPreoUnitario.setBounds(20, 192, 76, 30);
		frame.getContentPane().add(lblPreoUnitario);
		
		JLabel lblPrecoTotalUnitario = new JLabel("Preço Total Unitario");
		lblPrecoTotalUnitario.setBounds(14, 235, 125, 30);
		frame.getContentPane().add(lblPrecoTotalUnitario);
		
		JLabel lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(20, 131, 76, 30);
		frame.getContentPane().add(lblLargura);
		
		JLabel lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setBounds(92, 131, 76, 30);
		frame.getContentPane().add(lblComprimento);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(72, 16, 276, 20);
		frame.getContentPane().add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JComboBox BoxMateriais = new JComboBox();
		BoxMateriais.setBounds(72, 57, 276, 20);
		frame.getContentPane().add(BoxMateriais);
		
		JComboBox BoxQuantidade = new JComboBox();
		BoxQuantidade.setBounds(92, 95, 47, 20);
		frame.getContentPane().add(BoxQuantidade);
		
		TxtLargura = new JTextField();
		TxtLargura.setBounds(20, 157, 47, 20);
		frame.getContentPane().add(TxtLargura);
		TxtLargura.setColumns(10);
		
		TxtComprimento = new JTextField();
		TxtComprimento.setColumns(10);
		TxtComprimento.setBounds(92, 157, 47, 20);
		frame.getContentPane().add(TxtComprimento);
		
		txtPrecoUnitario = new JTextField();
		txtPrecoUnitario.setColumns(10);
		txtPrecoUnitario.setBounds(100, 197, 68, 20);
		frame.getContentPane().add(txtPrecoUnitario);
		
		TxtTotalItem = new JTextField();
		TxtTotalItem.setColumns(10);
		TxtTotalItem.setBounds(121, 240, 68, 20);
		frame.getContentPane().add(TxtTotalItem);
		
		JButton btnGerarOrcamento = new JButton("Gerar Orçamento");
		btnGerarOrcamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGerarOrcamento.setBounds(395, 338, 243, 47);
		frame.getContentPane().add(btnGerarOrcamento);
		
		JScrollPane itensOrcamento = new JScrollPane();
		itensOrcamento.setBounds(395, 32, 243, 287);
		frame.getContentPane().add(itensOrcamento);
		
		JLabel lblValorTotalDo = new JLabel("Valor total do pedido:");
		lblValorTotalDo.setBounds(20, 338, 125, 30);
		frame.getContentPane().add(lblValorTotalDo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(132, 343, 94, 20);
		frame.getContentPane().add(textField);
	}
}
