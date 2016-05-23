import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Exercicio51 {

	static int a = 0;
	static int codigo = 0;
	static int contador = 100;

	static JFrame tela = new JFrame();
	static JFrame telacadastro = new JFrame();
	static JFrame telaatualizar = new JFrame();
	static JFrame telaexcluir = new JFrame();
	static JFrame telaconsultar = new JFrame();

	static JButton Cadastrar = new JButton("CADASTRAR");
	static JButton Atualizar = new JButton("ATUALIZAR");
	static JButton Excluir = new JButton("EXCLUIR");
	static JButton Consultar = new JButton("CONSULTAR");
	static JButton Sair = new JButton("SAIR");
	static JButton Salvar = new JButton("SALVAR");
	static JButton Voltar = new JButton("VOLTAR");
	static JButton Procurar = new JButton("PROCURAR");
	static JButton Voltar1 = new JButton("VOLTAR");

	static JLabel nome = new JLabel("*NOME:");
	static JLabel rg = new JLabel("*RG:");
	static JLabel cpf = new JLabel("*CPF:");
	static JLabel nascimento = new JLabel("*DATA DE NASCIMENTO:");
	static JLabel email = new JLabel("E-MAIL:");
	static JLabel telefone = new JLabel("*TELEFONE:");
	static JLabel celular = new JLabel("CELULAR:");
	static JLabel endereco = new JLabel("*ENDEREÇO:");
	static JLabel cidade = new JLabel("CIDADE:");
	static JLabel estado = new JLabel("ESTADO:");
	static JLabel contagem1 = new JLabel();
	static JLabel contagem2 = new JLabel();
	static JLabel mensagem = new JLabel();

	static MaskFormatter mascaraRG = null;
	static MaskFormatter mascaraCPF = null;
	static MaskFormatter mascaraNascimento = null;
	static MaskFormatter mascaraEmail = null;
	static MaskFormatter mascaraTelefone = null;
	static MaskFormatter mascaraCelular = null;
	static MaskFormatter mascaraEstado = null;

	static JTextField campoNome;
	static JFormattedTextField campoRG;
	static JFormattedTextField campoCPF;
	static JFormattedTextField campoNascimento;
	static JFormattedTextField campoEmail;
	static JFormattedTextField campoTelefone;
	static JFormattedTextField campoCelular;
	static JTextField campoEndereco;
	static JTextField campoCidade;
	static JFormattedTextField campoEstado;

	static String[][] preencher = new String[contador][10];

	public static void main(String[] args) {

		Tela();
	}

	static void Tela() {

		tela.setTitle("                                                                                                "
				+ "MENU");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(700, 700);
		tela.setLayout(null);
		tela.setLocation(500, 100);
		tela.getContentPane().setBackground(Color.pink);
		tela.setResizable(false);
		tela.setVisible(true);
		tela.add(Cadastrar).setBounds(260, 40, 150, 50);
		Cadastrar.setForeground(Color.pink);
		tela.add(Excluir).setBounds(260, 200, 150, 50);
		Excluir.setForeground(Color.pink);
		tela.add(Consultar).setBounds(260, 280, 150, 50);
		Consultar.setForeground(Color.pink);
		tela.add(Sair).setBounds(500, 600, 100, 30);
		Sair.setForeground(Color.pink);

		Botoes_Tela();
	}

	static void Tela_Cadastrar() {

		telacadastro.setTitle("                                                                                     "
				+ "TELA CADASTRO");
		telacadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telacadastro.setSize(700, 700);
		telacadastro.setLayout(null);
		telacadastro.setLocation(500, 100);
		telacadastro.getContentPane().setBackground(Color.pink);
		telacadastro.setResizable(false);
		telacadastro.setVisible(true);

		telacadastro.add(nome).setBounds(10, 0, 50, 100);
		telacadastro.add(rg).setBounds(10, 80, 50, 100);
		telacadastro.add(cpf).setBounds(250, 80, 50, 100);
		telacadastro.add(nascimento).setBounds(10, 160, 140, 100);
		telacadastro.add(email).setBounds(250, 160, 60, 100);
		telacadastro.add(telefone).setBounds(10, 240, 100, 100);
		telacadastro.add(celular).setBounds(250, 240, 60, 100);
		telacadastro.add(endereco).setBounds(10, 330, 100, 100);
		telacadastro.add(cidade).setBounds(10, 420, 50, 100);
		telacadastro.add(estado).setBounds(250, 420, 50, 100);

		telacadastro.add(contagem1).setBounds(250, 20, 450, 10);
		telacadastro.add(contagem2).setBounds(250, 40, 450, 10);
		contagem1.setVisible(false);
		contagem2.setVisible(false);

		telacadastro.add(Salvar).setBounds(60, 550, 150, 50);
		Salvar.setForeground(Color.pink);
		telacadastro.add(Atualizar).setBounds(230, 550, 150, 50);
		Atualizar.setForeground(Color.pink);
		telacadastro.add(Voltar).setBounds(400, 550, 150, 50);
		Voltar.setForeground(Color.pink);

		try {

			mascaraRG = new MaskFormatter(" # # . # # # . # # # - #");
			mascaraCPF = new MaskFormatter(" # # # . # # # . # # # - # #");
			mascaraNascimento = new MaskFormatter(" # # / # # / # # # #");
			mascaraEmail = new MaskFormatter(" * * * * * * * * * * * * * * * * * * * * * * * * *" + " * * * * *");
			mascaraTelefone = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraCelular = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraEstado = new MaskFormatter("    " + "U U");

			mascaraRG.setPlaceholderCharacter('_');
			mascaraCPF.setPlaceholderCharacter('_');
			mascaraNascimento.setPlaceholderCharacter('_');
			mascaraEmail.setPlaceholderCharacter('_');
			mascaraTelefone.setPlaceholderCharacter('_');
			mascaraCelular.setPlaceholderCharacter('_');
			mascaraEstado.setPlaceholderCharacter('_');

		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
			System.exit(-1);
		}

		campoNome = new JTextField();
		campoRG = new JFormattedTextField(mascaraRG);
		campoCPF = new JFormattedTextField(mascaraCPF);
		campoNascimento = new JFormattedTextField(mascaraNascimento);
		campoEmail = new JFormattedTextField(mascaraEmail);
		campoTelefone = new JFormattedTextField(mascaraTelefone);
		campoCelular = new JFormattedTextField(mascaraCelular);
		campoEndereco = new JTextField();
		campoCidade = new JTextField();
		campoEstado = new JFormattedTextField(mascaraEstado);

		telacadastro.add(campoNome).setBounds(10, 70, 650, 40);
		telacadastro.add(campoRG).setBounds(10, 150, 200, 40);
		telacadastro.add(campoCPF).setBounds(250, 150, 200, 40);
		telacadastro.add(campoNascimento).setBounds(10, 230, 200, 40);
		telacadastro.add(campoEmail).setBounds(250, 230, 350, 40);
		telacadastro.add(campoTelefone).setBounds(10, 310, 200, 40);
		telacadastro.add(campoCelular).setBounds(250, 310, 200, 40);
		telacadastro.add(campoEndereco).setBounds(10, 400, 500, 40);
		telacadastro.add(campoCidade).setBounds(10, 490, 200, 40);
		telacadastro.add(campoEstado).setBounds(250, 490, 50, 40);

	}

	static void Botoes_Tela() {

		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setVisible(false);
				Tela_Cadastrar();
				preencher[a][0] = campoNome.getText();
				preencher[a][1] = campoRG.getText();
				preencher[a][2] = campoCPF.getText();
				preencher[a][3] = campoNascimento.getText();
				preencher[a][4] = campoEmail.getText();
				preencher[a][5] = campoTelefone.getText();
				preencher[a][6] = campoCelular.getText();
				preencher[a][7] = campoEndereco.getText();
				preencher[a][8] = campoCidade.getText();
				preencher[a][9] = campoEstado.getText();
				a++;
				Salvar.setEnabled(true);
				Atualizar.setEnabled(false);
				telacadastro.dispose();
				Tela_Cadastrar();

			}
		});

		Atualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tela.setVisible(false);

				campoNome.setEnabled(true);
				campoRG.setEnabled(true);
				campoCPF.setEnabled(true);
				campoNascimento.setEnabled(true);
				campoNascimento.setEnabled(true);
				campoEmail.setEnabled(true);
				campoTelefone.setEditable(true);
				campoCelular.setEnabled(true);
				campoEndereco.setEnabled(true);
				campoCidade.setEnabled(true);
				campoEstado.setEnabled(true);

			}

		});

		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salvar.setEnabled(false);
				Atualizar.setEnabled(true);
				Salvar.setEnabled(true);

				campoNome.setEnabled(false);
				campoRG.setEnabled(false);
				campoCPF.setEnabled(false);
				campoNascimento.setEnabled(false);
				campoEmail.setEnabled(false);
				campoTelefone.setEditable(false);
				campoCelular.setEnabled(false);
				campoEndereco.setEnabled(false);
				campoCidade.setEnabled(false);
				campoEstado.setEnabled(false);

				contagem1.setVisible(true);
				contagem2.setVisible(true);

				contagem1.setText("CADASTRO REALIZADO COM SUCESSO!!");
				contagem2.setText("NÚMERO DE PESSOAS CADASTRADAS = " + a);

			}

		});

		Voltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				telacadastro.setVisible(false);
				Tela();
			}

		});

	}
}
