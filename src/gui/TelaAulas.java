package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Aluno;
import classes.Aulas;
import classes.Curso;
import classes.Professor;
import classes.Sala;

public class TelaAulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloCurso;
	private JTextField txtArea;
	private JTextField txtCargaHoraria;
	private JTextField txtPrecoCurso;
	private JTextField txtIdentificacao;
	private JTextField txtDescricao;
	private JTextField txtNomeProfessor;
	private JTextField txtEmailProfessor;
	private JTextField txtCpfProfessor;
	private JTextField txtNomeAluno;
	private JTextField txtEmailAluno;
	private JTextField txtIdAula;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField txtCurso;
	private JTextField txtProfessor;
	private JTextField txtInicio;
	private JTextField txtTermino;
	private JTextField txtSala;
	
	//Declaração dos item para criar uma aula
	
	private Curso curso;
	private Aluno aluno;
	private Sala sala;
	private Professor professor;
	private Aulas aulas;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAulas frame = new TelaAulas();
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
	public TelaAulas() {
		
		//Vamos instaciar as nossas classe para gerar
		//objetos dos itens relacionados a aula.
		//Estes objetos estão vazio e serãprencidops quando o
		//usuario clicar nos botois de incluir
		curso = new Curso();
		aluno = new Aluno();
		sala = new Sala();
		professor = new Professor();
		
		
		setResizable(false);
		setTitle("Cadastro de Aulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBackground(Color.WHITE);
		panel_curso.setBounds(10, 11, 805, 90);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo do Curso:");
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 149, 14);
		panel_curso.add(lblNewLabel);
		
		txtTituloCurso = new JTextField();
		txtTituloCurso.setBounds(140, 9, 322, 20);
		panel_curso.add(txtTituloCurso);
		txtTituloCurso.setColumns(10);
		
		JLabel lblrea = new JLabel("Área:");
		lblrea.setForeground(Color.DARK_GRAY);
		lblrea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblrea.setBackground(SystemColor.activeCaption);
		lblrea.setBounds(472, 12, 66, 14);
		panel_curso.add(lblrea);
		
		txtArea = new JTextField();
		txtArea.setBounds(548, 9, 247, 20);
		panel_curso.add(txtArea);
		txtArea.setColumns(10);
		
		JLabel lblCargaHorria = new JLabel("Carga Horária:");
		lblCargaHorria.setForeground(Color.DARK_GRAY);
		lblCargaHorria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCargaHorria.setBackground(SystemColor.activeCaption);
		lblCargaHorria.setBounds(10, 44, 149, 14);
		panel_curso.add(lblCargaHorria);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(140, 42, 208, 20);
		panel_curso.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		JLabel lblCargaHorria_1 = new JLabel("Preço do Curso:");
		lblCargaHorria_1.setForeground(Color.DARK_GRAY);
		lblCargaHorria_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCargaHorria_1.setBackground(SystemColor.activeCaption);
		lblCargaHorria_1.setBounds(371, 44, 149, 14);
		panel_curso.add(lblCargaHorria_1);
		
		txtPrecoCurso = new JTextField();
		txtPrecoCurso.setColumns(10);
		txtPrecoCurso.setBounds(472, 42, 323, 20);
		panel_curso.add(txtPrecoCurso);
		
		JPanel panel_sala = new JPanel();
		panel_sala.setBackground(new Color(255, 255, 255));
		panel_sala.setBounds(10, 107, 805, 64);
		contentPane.add(panel_sala);
		panel_sala.setLayout(null);
		
		JLabel lblIdentificao = new JLabel("Identificação:");
		lblIdentificao.setForeground(Color.DARK_GRAY);
		lblIdentificao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdentificao.setBackground(SystemColor.activeCaption);
		lblIdentificao.setBounds(10, 23, 149, 14);
		panel_sala.add(lblIdentificao);
		
		txtIdentificacao = new JTextField();
		txtIdentificacao.setBounds(120, 21, 124, 20);
		panel_sala.add(txtIdentificacao);
		txtIdentificacao.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(328, 23, 467, 20);
		panel_sala.add(txtDescricao);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setForeground(Color.DARK_GRAY);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescrio.setBackground(SystemColor.activeCaption);
		lblDescrio.setBounds(254, 23, 149, 14);
		panel_sala.add(lblDescrio);
		
		JPanel panel_professor = new JPanel();
		panel_professor.setBackground(new Color(255, 255, 255));
		panel_professor.setBounds(10, 179, 805, 76);
		contentPane.add(panel_professor);
		panel_professor.setLayout(null);
		
		JLabel lblNomeDoProfessor = new JLabel("Nome do Professor");
		lblNomeDoProfessor.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor.setBounds(10, 13, 149, 14);
		panel_professor.add(lblNomeDoProfessor);
		
		txtNomeProfessor = new JTextField();
		txtNomeProfessor.setColumns(10);
		txtNomeProfessor.setBounds(10, 32, 260, 20);
		panel_professor.add(txtNomeProfessor);
		
		txtEmailProfessor = new JTextField();
		txtEmailProfessor.setColumns(10);
		txtEmailProfessor.setBounds(280, 32, 260, 20);
		panel_professor.add(txtEmailProfessor);
		
		JLabel lblEmailDoProfessor = new JLabel("E-Mail do Professor:");
		lblEmailDoProfessor.setForeground(Color.DARK_GRAY);
		lblEmailDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoProfessor.setBackground(SystemColor.activeCaption);
		lblEmailDoProfessor.setBounds(280, 13, 149, 14);
		panel_professor.add(lblEmailDoProfessor);
		
		txtCpfProfessor = new JTextField();
		txtCpfProfessor.setColumns(10);
		txtCpfProfessor.setBounds(550, 32, 245, 20);
		panel_professor.add(txtCpfProfessor);
		
		JLabel lblNomeDoProfessor_1_1 = new JLabel("CPF do Professor");
		lblNomeDoProfessor_1_1.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor_1_1.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor_1_1.setBounds(550, 13, 203, 14);
		panel_professor.add(lblNomeDoProfessor_1_1);
		
		JPanel panel_aluno = new JPanel();
		panel_aluno.setBackground(new Color(255, 255, 255));
		panel_aluno.setBounds(10, 266, 805, 116);
		contentPane.add(panel_aluno);
		panel_aluno.setLayout(null);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do Aluno:");
		lblNomeDoAluno.setForeground(Color.DARK_GRAY);
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoAluno.setBackground(SystemColor.activeCaption);
		lblNomeDoAluno.setBounds(10, 11, 149, 14);
		panel_aluno.add(lblNomeDoAluno);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setColumns(10);
		txtNomeAluno.setBounds(10, 30, 396, 20);
		panel_aluno.add(txtNomeAluno);
		
		JLabel lblEmailDoAluno = new JLabel("E-Mail do Aluno:");
		lblEmailDoAluno.setForeground(Color.DARK_GRAY);
		lblEmailDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoAluno.setBackground(SystemColor.activeCaption);
		lblEmailDoAluno.setBounds(427, 11, 149, 14);
		panel_aluno.add(lblEmailDoAluno);
		
		txtEmailAluno = new JTextField();
		txtEmailAluno.setColumns(10);
		txtEmailAluno.setBounds(427, 30, 368, 20);
		panel_aluno.add(txtEmailAluno);
		
		JLabel lblCpfDoAluno = new JLabel("CPF do Aluno:");
		lblCpfDoAluno.setForeground(Color.DARK_GRAY);
		lblCpfDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpfDoAluno.setBackground(SystemColor.activeCaption);
		lblCpfDoAluno.setBounds(10, 65, 149, 14);
		panel_aluno.add(lblCpfDoAluno);
		
		txtIdAula = new JTextField();
		txtIdAula.setColumns(10);
		txtIdAula.setBounds(140, 63, 322, 20);
		panel_aluno.add(txtIdAula);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.DARK_GRAY);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBackground(SystemColor.activeCaption);
		lblIdade.setBounds(472, 66, 66, 14);
		panel_aluno.add(lblIdade);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(548, 63, 247, 20);
		panel_aluno.add(textField_12);
		
		JPanel panel_aulas = new JPanel();
		panel_aulas.setBackground(new Color(255, 255, 255));
		panel_aulas.setBounds(10, 393, 805, 106);
		contentPane.add(panel_aulas);
		panel_aulas.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Id da Aula:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 11, 169, 14);
		panel_aulas.add(lblNewLabel_1);
		
		textField_13 = new JTextField();
		textField_13.setBounds(96, 9, 120, 20);
		panel_aulas.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Curso:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(238, 12, 87, 14);
		panel_aulas.add(lblNewLabel_2);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(292, 9, 206, 20);
		panel_aulas.add(txtCurso);
		
		JLabel lblNewLabel_2_1 = new JLabel("Professor:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(509, 14, 87, 14);
		panel_aulas.add(lblNewLabel_2_1);
		
		txtProfessor = new JTextField();
		txtProfessor.setColumns(10);
		txtProfessor.setBounds(589, 11, 206, 20);
		panel_aulas.add(txtProfessor);
		
		JLabel lblNewLabel_1_1 = new JLabel("Início:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 48, 169, 14);
		panel_aulas.add(lblNewLabel_1_1);
		
		txtInicio = new JTextField();
		txtInicio.setColumns(10);
		txtInicio.setBounds(96, 46, 120, 20);
		panel_aulas.add(txtInicio);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Término:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(238, 48, 169, 14);
		panel_aulas.add(lblNewLabel_1_1_1);
		
		txtTermino = new JTextField();
		txtTermino.setColumns(10);
		txtTermino.setBounds(302, 46, 120, 20);
		panel_aulas.add(txtTermino);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Alunos:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(440, 49, 169, 14);
		panel_aulas.add(lblNewLabel_1_1_1_1);
		
		JComboBox cboAlunos = new JComboBox();
		cboAlunos.setBounds(533, 48, 262, 17);
		panel_aulas.add(cboAlunos);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Sala:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(10, 81, 169, 14);
		panel_aulas.add(lblNewLabel_1_1_2);
		
		txtSala = new JTextField();
		txtSala.setColumns(10);
		txtSala.setBounds(96, 79, 120, 20);
		panel_aulas.add(txtSala);
		
		JButton btnIncluirCurso = new JButton("Incluir curso");
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//obter o texto que está na caixa de titulo do curso e
				// adicionar á caixa curso que esta na Área do Criar aula
				txtCurso.setText(txtTituloCurso.getText());
				
				
				
				
				//Vamos desativar o panel de curso vamos usar
				//o comando enabled com o valor false
				txtTituloCurso.setEnabled(false);
				txtArea.setEnabled(false);
				txtCargaHoraria.setEnabled(false);
				txtPrecoCurso.setEnabled(false);
			}
		});
		btnIncluirCurso.setBounds(10, 510, 141, 23);
		contentPane.add(btnIncluirCurso);
		
		JButton btnIncluirSala = new JButton("Incluir sala");
		btnIncluirSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				btnIncluirSala.setEnabled(false);
				txtIdentificacao.setEnabled(false);
				txtDescricao.setEnabled(false);
				txtEmailProfessor.setEnabled(false);
				txtCpfProfessor.setEnabled(false);
				txtSala.setText(txtSala.getText());
			}
		});
		btnIncluirSala.setBounds(161, 510, 141, 23);
		contentPane.add(btnIncluirSala);
		
		JButton btnIncluirProfessor = new JButton("Incluir professor");
		btnIncluirProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//obter o texto que está na caixa do Professor  e
				// adicionar á caixa professor que esta na Área do Criar aula
				txtProfessor.setText(txtProfessor.getText());
				
				
				
				btnIncluirProfessor.setEnabled(false);
				txtNomeProfessor.setEnabled(false);
				
			}
		});
		btnIncluirProfessor.setBounds(312, 510, 141, 23);
		contentPane.add(btnIncluirProfessor);
		
		JButton btnIncluirAluno = new JButton("Incluir aluno");
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cboAlunos.addItem(txtNomeAlunos.getText());
			}
		});
		btnIncluirAluno.setBounds(463, 510, 141, 23);
		contentPane.add(btnIncluirAluno);
		
		JButton btnCriarAula = new JButton("Criar a Aula");
		btnCriarAula.setBounds(625, 510, 141, 23);
		contentPane.add(btnCriarAula);
	}
}
