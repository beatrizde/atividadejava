package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CadastrodeProduto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrodeProduto frame = new CadastrodeProduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrodeProduto() {
		setTitle("Cadastro de Produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("cadastro de produtos ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 192, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME DO PRODUTO");
		lblNewLabel_1.setBounds(10, 53, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CODIGO DO PRODUTO");
		lblNewLabel_2.setBounds(10, 78, 114, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("VALOR DA COMPRAR");
		lblNewLabel_3.setBounds(10, 103, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MARCA");
		lblNewLabel_4.setBounds(10, 128, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DESCRIÇÃO");
		lblNewLabel_5.setBounds(10, 153, 81, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(134, 50, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 75, 207, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 100, 207, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(134, 125, 207, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(134, 150, 207, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DATA DA COMPRAR");
		lblNewLabel_6.setBounds(351, 53, 106, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("FORNECEDOR");
		lblNewLabel_7.setBounds(351, 78, 83, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("VÁLOR DA VENDA");
		lblNewLabel_8.setBounds(351, 103, 106, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("CATEGORIA");
		lblNewLabel_9.setBounds(351, 128, 61, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("PRATEREIRA");
		lblNewLabel_10.setBounds(351, 153, 83, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(454, 50, 156, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(453, 75, 157, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(454, 100, 156, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(454, 125, 156, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(454, 150, 156, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("QUANTIDADE");
		lblNewLabel_11.setBounds(655, 53, 76, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(645, 75, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(645, 99, 41, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(690, 99, 41, 23);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(633, 53, 114, 89);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(773, 21, 101, 146);
		contentPane.add(panel_1);
		
		JButton btnNewButton_2 = new JButton("NOVO");
		btnNewButton_2.setBounds(2, 197, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("CADASTRAR");
		btnNewButton_2_1.setBounds(113, 197, 114, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("LIMPAR CAMPOS");
		btnNewButton_2_1_1.setBounds(250, 197, 106, 23);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("LIMPAR TABELA");
		btnNewButton_2_1_1_1.setBounds(366, 197, 111, 23);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("LIMPAR LINHA");
		btnNewButton_2_1_1_1_1.setBounds(487, 197, 123, 23);
		contentPane.add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1 = new JButton("SALVAR ALTERAÇÕES");
		btnNewButton_2_1_1_1_1_1.setBounds(620, 197, 139, 23);
		contentPane.add(btnNewButton_2_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1 = new JButton("EDITAR");
		btnNewButton_2_1_1_1_1_1_1.setBounds(785, 197, 89, 23);
		contentPane.add(btnNewButton_2_1_1_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"NOME"}));
		comboBox.setBounds(0, 231, 114, 22);
		contentPane.add(comboBox);
		
		textField_11 = new JTextField();
		textField_11.setBounds(134, 232, 476, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_2_1_1_1_1_1_2 = new JButton("SALVAR ALTERAÇÕES");
		btnNewButton_2_1_1_1_1_1_2.setBounds(620, 231, 131, 23);
		contentPane.add(btnNewButton_2_1_1_1_1_1_2);
		
		JButton btnNewButton_2_1_1_1_1_1_2_1 = new JButton("SALVAR ALTERAÇÕES");
		btnNewButton_2_1_1_1_1_1_2_1.setBounds(767, 231, 131, 23);
		contentPane.add(btnNewButton_2_1_1_1_1_1_2_1);
	}
}
