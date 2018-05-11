package Screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.UIManager;

import org.w3c.dom.CDATASection;

import DAO.conexDAO;
import model.cliente;
import model.itens_orcamento;
import model.orcamento;
import model.produto;

import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import window.window.java.*;
import javax.swing.JSpinner;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.beans.VetoableChangeListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
public class tela_orcamento {

	private JFrame frame;
	private JTextField txtTitulo;
	private JTextField TxtLargura;
	private JTextField TxtComprimento;
	private JTextField txtPrecoUnitario;
	private JTextField TxtTotalItem;
	private final ButtonGroup groupMeioPagamento = new ButtonGroup();
	private JTextField txtTotalPedido;

	/**
	 * Launch the application.
	 */
	public static void main(String string) {
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
	 * @throws SQLException 
	 */
	public tela_orcamento() throws SQLException {
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
		
		JLabel lblMaterial = new JLabel("Produto");
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
		
		final JComboBox BoxMateriais = new JComboBox();
		final produto p = new produto();
		
		BoxMateriais.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				produto p = (produto) BoxMateriais.getSelectedItem();
				txtPrecoUnitario.setText(String.valueOf(p.getValor_produto_unitario()));
			}
		});
		

		BoxMateriais.setBounds(72, 57, 276, 20);
		frame.getContentPane().add(BoxMateriais);
		
		TxtLargura = new JTextField();
		TxtLargura.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				produto p = new produto();
				Double largura = Double.parseDouble(TxtLargura.getText());
				p.setLargura_produto(largura);
				System.out.println(largura);
			}
		});
			
		
		
		
		
		TxtLargura.setToolTipText("double");
		TxtLargura.setText("0");
		TxtLargura.setBounds(20, 157, 47, 20);
		frame.getContentPane().add(TxtLargura);
		TxtLargura.setColumns(10);
		
		TxtComprimento = new JTextField();
		TxtComprimento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				produto p = new produto();
				Double comprimento = Double.parseDouble(TxtComprimento.getText());
				p.setComprimento_produto(comprimento);
				System.out.println(comprimento);
			}
		});
	
			
		TxtComprimento.setToolTipText("double");
		TxtComprimento.setText("0");
		TxtComprimento.setColumns(10);
		TxtComprimento.setBounds(92, 157, 47, 20);
		frame.getContentPane().add(TxtComprimento);
		
		txtPrecoUnitario = new JTextField();
		txtPrecoUnitario.setEditable(false);
		txtPrecoUnitario.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		txtPrecoUnitario.setColumns(10);
		txtPrecoUnitario.setBounds(158, 197, 68, 20);
		frame.getContentPane().add(txtPrecoUnitario);
		
		TxtTotalItem = new JTextField();
		TxtTotalItem.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				double totalMetroQuadrado = p.getComprimento_produto()*p.getLargura_produto();
				double valorTotal = (totalMetroQuadrado*p.getQuantidade_produto_orcamento());
				txtTotalPedido.setText(String.valueOf(valorTotal));
			}
		});
		TxtTotalItem.setEditable(false);
		TxtTotalItem.setColumns(10);
		TxtTotalItem.setBounds(158, 240, 68, 20);
		frame.getContentPane().add(TxtTotalItem);
		

	 
		
		JButton btnGerarOrcamento = new JButton("Gerar Orçamento");
		
		conexDAO d = new conexDAO();
		d.listarProdutos(BoxMateriais,p);
		
		
		btnGerarOrcamento.setBounds(533, 338, 131, 47);
		frame.getContentPane().add(btnGerarOrcamento);
		
		JScrollPane itensOrcamento = new JScrollPane();
		itensOrcamento.setBounds(395, 32, 243, 287);
		frame.getContentPane().add(itensOrcamento);
		
		JLabel lblValorTotalDo = new JLabel("Valor total do pedido:");
		lblValorTotalDo.setBounds(20, 338, 125, 30);
		frame.getContentPane().add(lblValorTotalDo);
		
		txtTotalPedido = new JTextField();
		txtTotalPedido.setEnabled(false);
		txtTotalPedido.setColumns(10);
		txtTotalPedido.setBounds(198, 343, 94, 20);
		frame.getContentPane().add(txtTotalPedido);
		
		JButton btnInserirItem = new JButton("Inserir Item");
		btnInserirItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itens_orcamento io = new itens_orcamento();
				produto prd = new produto();
				io.setTitulo(txtTitulo.getText());
				io.setId_itens_orcamento(0);
				prd.setComprimento_produto(Double.parseDouble(TxtComprimento.getText()));
				prd.setLargura_produto(Double.parseDouble(TxtLargura.getText()));
				
				produto p = (produto) BoxMateriais.getSelectedItem();
				txtPrecoUnitario.setText(String.valueOf(p.getValor_produto_unitario()));
			}
		});
		btnInserirItem.setBounds(345, 338, 125, 47);
		frame.getContentPane().add(btnInserirItem);
		
		final JSpinner spnQuantidade = new JSpinner();
		spnQuantidade.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				produto p = new produto();
				int valor=0;
				valor = (Integer)spnQuantidade.getValue();
				p.setQuantidade_produto_orcamento(valor);
				System.out.println(valor);
			}
		});
		
		
		spnQuantidade.setBounds(92, 93, 47, 20);
		frame.getContentPane().add(spnQuantidade);
	}
}
