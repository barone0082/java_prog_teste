package Screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import DAO.conexDAO;
import model.cliente;
import model.orcamento;

import javax.swing.JRadioButton;
import java.awt.Button;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;

public class tela_prazo_orcamento {

	private JFrame frame;
	private JTextField dt_entrega;
	private JTextField txtObs;
	private JFormattedTextField dtEntrega;
	private final ButtonGroup groupPagamento = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	JComboBox comboCliente = new JComboBox();

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
	 * @throws SQLException 
	 * @throws ParseException 
	 */
	public tela_prazo_orcamento() throws SQLException, ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ParseException 
	 */
	private void initialize() throws SQLException, ParseException {
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
		
		
		
		JRadioButton rdVista = new JRadioButton("A vista");
		groupPagamento.add(rdVista);
		rdVista.setSelected(true);
		rdVista.setBounds(20, 148, 109, 23);
		frame.getContentPane().add(rdVista);
		rdVista.setActionCommand("A vista");
		
		
		JRadioButton rdParcelado = new JRadioButton("Parcelado");
		groupPagamento.add(rdParcelado);
		rdParcelado.setBounds(20, 174, 109, 23);
		frame.getContentPane().add(rdParcelado);
		rdParcelado.setActionCommand("Parcelado");
		
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		groupPagamento.add(rdOutros);
		rdOutros.setBounds(20, 200, 109, 23);
		frame.getContentPane().add(rdOutros);
		rdOutros.setActionCommand("Outros");
		
		JLabel label_2 = new JLabel("Obs:");
		label_2.setBounds(20, 230, 127, 30);
		frame.getContentPane().add(label_2);
		
		txtObs = new JTextField();
		txtObs.setColumns(10);
		txtObs.setBounds(10, 255, 654, 76);
		frame.getContentPane().add(txtObs);
		
		JButton btnInserirProdutos = new JButton("Inserir Produtos");
		btnInserirProdutos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				conexDAO con = new conexDAO();
				orcamento or = new orcamento();
				cliente c1 = new cliente();
				or.setData_entrega(dtEntrega.getText().toString());
				or.setId_orcamento(0);
				or.setMeio_pagamento(groupPagamento.getSelection().getActionCommand());
				or.setObs(txtObs.getText());
				con.inserirInicioOrcamento(comboCliente,or);
				tela_orcamento to;
				try {
					to = new tela_orcamento();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tela_orcamento.main(null);
			}
		});
		btnInserirProdutos.setBounds(421, 342, 243, 47);
		frame.getContentPane().add(btnInserirProdutos);
		
		comboCliente.setBounds(179, 23, 485, 20);
		frame.getContentPane().add(comboCliente);
		conexDAO con = new conexDAO();
		cliente cl = new cliente();
		con.listarClientes(cl,comboCliente);
		
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(133, 18, 120, 30);
		frame.getContentPane().add(lblCliente);
		
		dtEntrega = new JFormattedTextField();
		dtEntrega.setBounds(20, 80, 86, 20);
		MaskFormatter dtEntregaFormat = new MaskFormatter("##/##/####");
		dtEntregaFormat.install(dtEntrega);
		frame.getContentPane().add(dtEntrega);
		
	}
}
