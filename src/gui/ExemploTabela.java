package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

public class ExemploTabela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploTabela frame = new ExemploTabela();
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
	public ExemploTabela() {
		setTitle("Tabela de Dados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 489);
		contentPane = new JPanel();
		contentPane.setToolTipText("Cadastro de Produto");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 97, 467, 284);
		contentPane.add(scrollPane);
		
//      Criando as colunas da nossa tabela
		String col[] = {"Código","Nome do Produto","Quantidade","Preço"};
		
//		Criando os dados da nossa tabeal
		String dados[][]= {
				
				{"01","Mouse","45","R$ 54,90"},
				{"02","Teclado","15","R$ 120,40"}
				
		};
		
		
		table = new JTable(dados,col);
		scrollPane.setViewportView(table);
	}
}
