package pedido;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JList;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class tela_pedido {

	private JFrame frame;
	private JTextField txtIdOrcamento;
	private JTextField txtCnpjOrcamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_pedido window = new tela_pedido();
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
	public tela_pedido() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOramentos = new JLabel("Orçamentos em aberto");
		lblOramentos.setBounds(270, 11, 202, 14);
		frame.getContentPane().add(lblOramentos);
		
		JLabel lblMs = new JLabel("mês");
		lblMs.setBounds(10, 188, 91, 14);
		frame.getContentPane().add(lblMs);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(123, 188, 91, 14);
		frame.getContentPane().add(lblAno);
		
		JComboBox boxMesOrcamento = new JComboBox();
		boxMesOrcamento.setBounds(44, 185, 57, 20);
		frame.getContentPane().add(boxMesOrcamento);
		
		JComboBox boxAnoOrcamento = new JComboBox();
		boxAnoOrcamento.setBounds(157, 185, 57, 20);
		frame.getContentPane().add(boxAnoOrcamento);
		
		JLabel lblIdDoOramento = new JLabel("Id do Orçamento");
		lblIdDoOramento.setBounds(10, 107, 91, 14);
		frame.getContentPane().add(lblIdDoOramento);
		
		txtIdOrcamento = new JTextField();
		txtIdOrcamento.setBounds(111, 104, 116, 20);
		frame.getContentPane().add(txtIdOrcamento);
		txtIdOrcamento.setColumns(10);
		
		JLabel lblCnpj = new JLabel("Cnpj");
		lblCnpj.setBounds(10, 144, 91, 14);
		frame.getContentPane().add(lblCnpj);
		
		txtCnpjOrcamento = new JTextField();
		txtCnpjOrcamento.setColumns(10);
		txtCnpjOrcamento.setBounds(111, 141, 116, 20);
		frame.getContentPane().add(txtCnpjOrcamento);
		
		JButton btnFiltrarOrcamento = new JButton("Filtrar");
		btnFiltrarOrcamento.setBounds(83, 240, 89, 23);
		frame.getContentPane().add(btnFiltrarOrcamento);
		
		JButton btnGerarPedido = new JButton("Gerar Pedido e OS");
		btnGerarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGerarPedido.setBounds(429, 332, 162, 23);
		frame.getContentPane().add(btnGerarPedido);
		
		JScrollPane listaOrcamentosAbertos = new JScrollPane();
		listaOrcamentosAbertos.setBounds(270, 54, 394, 268);
		frame.getContentPane().add(listaOrcamentosAbertos);
	}
}
