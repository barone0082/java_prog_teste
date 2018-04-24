package orcamento;

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
	private JTextField textField;
	private final ButtonGroup groupMeioPagamento = new ButtonGroup();
	private JTextField txtIdOrcamento;
	private JTextField txtDataEntrega;

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
		
		JLabel lblPreoTotal = new JLabel("Preço Total");
		lblPreoTotal.setBounds(190, 192, 76, 30);
		frame.getContentPane().add(lblPreoTotal);
		
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
		TxtTotalItem.setBounds(258, 197, 68, 20);
		frame.getContentPane().add(TxtTotalItem);
		
		Button btnAdicionarItem = new Button("Adicionar");
		btnAdicionarItem.setBounds(296, 241, 70, 22);
		frame.getContentPane().add(btnAdicionarItem);
		
		Button btnExcluir = new Button("Excluir");
		btnExcluir.setBounds(296, 297, 70, 22);
		frame.getContentPane().add(btnExcluir);
		
		Button btnAtualizar = new Button("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizar.setBounds(296, 269, 70, 22);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnNewButton = new JButton("Gerar Orçamento");
		btnNewButton.setBounds(395, 336, 243, 47);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblMeioPagamento = new JLabel("Meio Pagamento");
		lblMeioPagamento.setBounds(20, 233, 127, 30);
		frame.getContentPane().add(lblMeioPagamento);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A vista");
		groupMeioPagamento.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(20, 261, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnParcelado = new JRadioButton("Parcelado");
		groupMeioPagamento.add(rdbtnParcelado);
		rdbtnParcelado.setBounds(20, 285, 109, 23);
		frame.getContentPane().add(rdbtnParcelado);
		
		JRadioButton rdbtnOutros = new JRadioButton("Outros");
		groupMeioPagamento.add(rdbtnOutros);
		rdbtnOutros.setBounds(20, 311, 109, 23);
		frame.getContentPane().add(rdbtnOutros);
		
		JLabel lblObs = new JLabel("Obs:");
		lblObs.setBounds(20, 336, 127, 30);
		frame.getContentPane().add(lblObs);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(47, 336, 301, 47);
		frame.getContentPane().add(textField);
		
		JScrollPane itensOrcamento = new JScrollPane();
		itensOrcamento.setBounds(395, 32, 243, 287);
		frame.getContentPane().add(itensOrcamento);
		
		JLabel lblInformaesDoOramento = new JLabel("Informações do orçamento");
		lblInformaesDoOramento.setBounds(423, 11, 170, 14);
		frame.getContentPane().add(lblInformaesDoOramento);
		
		txtIdOrcamento = new JTextField();
		txtIdOrcamento.setBounds(558, 8, 80, 20);
		frame.getContentPane().add(txtIdOrcamento);
		txtIdOrcamento.setColumns(10);
		
		JLabel lblDataDeEntrega = new JLabel("Data de Entrega");
		lblDataDeEntrega.setBounds(127, 233, 120, 30);
		frame.getContentPane().add(lblDataDeEntrega);
		
		txtDataEntrega = new JTextField();
		txtDataEntrega.setColumns(10);
		txtDataEntrega.setBounds(127, 262, 86, 20);
		frame.getContentPane().add(txtDataEntrega);
	}
}
