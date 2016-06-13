//Trabalho feito pela aluna Amanda Caroline Bonassoli Silva
//Curso: Ciencia da Computacao - 3 Semestre

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Exercicio51 {

	static int a = 0;
	static int b = 0;
	static int c = 0;
	static int d = 0;
	static int idC = 0;
	static int idT = 0;
	static int camposC = 8;
	static int camposT = 8;
	static int tmaximoContadorC = 100;
	static int tmaximoContadorT = 100;

	static JFrame tela = new JFrame();
	static JFrame telaC = new JFrame();
	static JFrame telaT = new JFrame();

	static JFrame telaCadastroC = new JFrame();
	static JFrame telaConsultarC = new JFrame();

	static JFrame telaCadastroT = new JFrame();
	static JFrame telaConsultarT = new JFrame();

	static JPanel painelConsultaC = new JPanel();
	static JPanel painelConsultaT = new JPanel();

	static JTable tabelaC = new JTable() {
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}

	};
	static JTable tabelaT = new JTable() {
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}

	};

	static JScrollPane barraC = new JScrollPane(tabelaC);
	static JScrollPane barraT = new JScrollPane(tabelaT);

	static String[] tabela1C = new String[] { "NOME", "RG", "CPF", "DATA DE NASC.", "E-MAIL", "ENDEREÇO", "CIDADE",
			"ESTADO" };
	static String[] tabela1T = new String[] { "NOME", "TELEFONE", "CELULAR(1)", "CELULAR(2)", "T. COMERCIAL", "T. MÃE",
			"T. PAI", "T. RECADO" };

	static DefaultTableModel tabela2C = new DefaultTableModel(tabela1C, 0);
	static DefaultTableModel tabela2T = new DefaultTableModel(tabela1T, 0);

	static String[][] matrizC = new String[tmaximoContadorC][camposC];
	static String[][] matrizT = new String[tmaximoContadorT][camposT];

	static String[] vetorC = new String[8];
	static String[] vetorT = new String[8];

	static JButton cliente = new JButton("MENU CLIENTE");
	static JButton telefone = new JButton("MENU TELEFONE");

	static JButton cadastrarC = new JButton("CADASTRAR CLIENTE");
	static JButton excluirC = new JButton("EXCLUIR CLIENTE");
	static JButton consultarC = new JButton("CONSULTAR CLIENTE");

	static JButton cadastrarT = new JButton("CADASTRAR TELEFONE");
	static JButton excluirT = new JButton("EXCLUIR TELEFONE");
	static JButton consultarT = new JButton("CONSULTAR TELEFONE");

	static JButton sair = new JButton("SAIR");
	static JButton salvarC = new JButton("SALVAR");
	static JButton salvarT = new JButton("SALVAR");
	static JButton voltar = new JButton("VOLTAR");
	static JButton voltar1 = new JButton("VOLTAR");
	static JButton voltar3 = new JButton("VOLTAR");

	static JLabel nomeC = new JLabel("*NOME:");
	static JLabel rg = new JLabel("*RG:");
	static JLabel cpf = new JLabel("*CPF:");
	static JLabel nascimento = new JLabel("*DATA DE NASCIMENTO:");
	static JLabel email = new JLabel("E-MAIL:");
	static JLabel endereco = new JLabel("*ENDEREÇO:");
	static JLabel cidade = new JLabel("CIDADE:");
	static JLabel estado = new JLabel("ESTADO:");
	static JLabel mensagem = new JLabel();

	static JLabel nomeT = new JLabel("*NOME:");
	static JLabel telefoneFixo = new JLabel("*TELEFONE FIXO:");
	static JLabel celular1 = new JLabel("CELULAR(1):");
	static JLabel celular2 = new JLabel("CELULAR(2):");
	static JLabel comercial = new JLabel("TELEFONE COMERCIAL:");
	static JLabel telefoneMae = new JLabel("*TELEFONE/MÃE:");
	static JLabel telefonePai = new JLabel("*TELEFONE/PAI:");
	static JLabel telefoneRecado = new JLabel("TELEFONE RECADO:");

	static MaskFormatter mascaraRG = null;
	static MaskFormatter mascaraCPF = null;
	static MaskFormatter mascaraNascimento = null;
	static MaskFormatter mascaraEmail = null;
	static MaskFormatter mascaraEstado = null;

	static MaskFormatter mascaraTelefoneFixo = null;
	static MaskFormatter mascaraCelular1 = null;
	static MaskFormatter mascaraCelular2 = null;
	static MaskFormatter mascaraComercial = null;
	static MaskFormatter mascaraTelefoneMae = null;
	static MaskFormatter mascaraTelefonePai = null;
	static MaskFormatter mascaraTelefoneRecado = null;

	static JTextField campoNomeC;
	static JTextField campoEndereco;
	static JTextField campoCidade;
	static JFormattedTextField campoRG;
	static JFormattedTextField campoCPF;
	static JFormattedTextField campoNascimento;
	static JFormattedTextField campoEmail;
	static JFormattedTextField campoEstado;

	static JTextField campoNomeT;
	static JFormattedTextField campoTelefoneFixo;
	static JFormattedTextField campoCelular1;
	static JFormattedTextField campoCelular2;
	static JFormattedTextField campoComercial;
	static JFormattedTextField campoTelefoneMae;
	static JFormattedTextField campoTelefonePai;
	static JFormattedTextField campoTelefoneRecado;

	public static void main(String[] args) {
		iniciar();
		botoesTela();
	}

	static void iniciar() {

		tela.setTitle("MENU");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(700, 400);
		tela.setLocation(330, 150);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setVisible(true);
		tela.getContentPane().setBackground(Color.CYAN);

		tela.add(mensagem).setBounds(250, 100, 250, 50);
		mensagem.setText("ESCOLHA UMA DAS DUAS OPÇÕES: ");

		tela.add(cliente).setBounds(150, 150, 180, 50);
		tela.add(telefone).setBounds(350, 150, 180, 50);
		tela.add(sair).setBounds(10, 10, 100, 30);
		cliente.setForeground(Color.MAGENTA);
		telefone.setForeground(Color.MAGENTA);
		sair.setForeground(Color.MAGENTA);
	}

	static void iniciarC() {

		telaC.setTitle("MENU DE CLIENTES");
		telaC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaC.setSize(300, 700);
		telaC.setLocation(550, 0);
		telaC.setLayout(null);
		telaC.setResizable(false);
		telaC.setVisible(true);
		telaC.getContentPane().setBackground(Color.CYAN);

		telaC.add(cadastrarC).setBounds(55, 240, 180, 50);
		telaC.add(consultarC).setBounds(55, 320, 180, 50);
		telaC.add(voltar).setBounds(15, 630, 100, 30);
		telaC.add(sair).setBounds(180, 630, 100, 30);

		cadastrarC.setForeground(Color.MAGENTA);
		consultarC.setForeground(Color.MAGENTA);
		voltar.setForeground(Color.MAGENTA);
		sair.setForeground(Color.MAGENTA);
	}

	static void cadastrarCliente() {

		telaCadastroC.setTitle("CADASTRO DE CLIENTES");
		telaCadastroC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadastroC.setSize(700, 700);
		telaCadastroC.setLayout(null);
		telaCadastroC.setLocation(350, 0);
		telaCadastroC.getContentPane().setBackground(Color.WHITE);
		telaCadastroC.setResizable(false);
		telaCadastroC.setVisible(true);

		telaCadastroC.add(nomeC).setBounds(10, 0, 50, 100);
		telaCadastroC.add(rg).setBounds(10, 80, 50, 100);
		telaCadastroC.add(cpf).setBounds(250, 80, 50, 100);
		telaCadastroC.add(nascimento).setBounds(10, 160, 140, 100);
		telaCadastroC.add(email).setBounds(250, 160, 60, 100);
		telaCadastroC.add(endereco).setBounds(10, 240, 100, 100);
		telaCadastroC.add(cidade).setBounds(10, 330, 50, 100);
		telaCadastroC.add(estado).setBounds(250, 330, 50, 100);

		telaCadastroC.add(salvarC).setBounds(60, 550, 150, 50);
		telaCadastroC.add(voltar1).setBounds(480, 550, 150, 50);

		nomeC.setForeground(Color.MAGENTA);
		rg.setForeground(Color.MAGENTA);
		cpf.setForeground(Color.MAGENTA);
		nascimento.setForeground(Color.MAGENTA);
		email.setForeground(Color.MAGENTA);
		endereco.setForeground(Color.MAGENTA);
		cidade.setForeground(Color.MAGENTA);
		estado.setForeground(Color.MAGENTA);

		salvarC.setForeground(Color.MAGENTA);
		voltar1.setForeground(Color.MAGENTA);

		try {

			mascaraRG = new MaskFormatter(" # # . # # # . # # # - #");
			mascaraCPF = new MaskFormatter(" # # # . # # # . # # # - # #");
			mascaraNascimento = new MaskFormatter(" # # / # # / # # # #");
			mascaraEmail = new MaskFormatter(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
			mascaraEstado = new MaskFormatter("     U U");

			mascaraRG.setPlaceholderCharacter('_');
			mascaraCPF.setPlaceholderCharacter('_');
			mascaraNascimento.setPlaceholderCharacter('_');
			mascaraEmail.setPlaceholderCharacter('_');
			mascaraEstado.setPlaceholderCharacter('_');

		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
			System.exit(-1);
		}

		campoNomeC = new JTextField();
		campoRG = new JFormattedTextField(mascaraRG);
		campoCPF = new JFormattedTextField(mascaraCPF);
		campoNascimento = new JFormattedTextField(mascaraNascimento);
		campoEmail = new JFormattedTextField(mascaraEmail);
		campoEndereco = new JTextField();
		campoCidade = new JTextField();
		campoEstado = new JFormattedTextField(mascaraEstado);

		telaCadastroC.add(campoNomeC).setBounds(10, 70, 650, 40);
		telaCadastroC.add(campoRG).setBounds(10, 150, 200, 40);
		telaCadastroC.add(campoCPF).setBounds(250, 150, 200, 40);
		telaCadastroC.add(campoNascimento).setBounds(10, 230, 200, 40);
		telaCadastroC.add(campoEmail).setBounds(250, 230, 350, 40);
		telaCadastroC.add(campoEndereco).setBounds(10, 310, 500, 40);
		telaCadastroC.add(campoCidade).setBounds(10, 400, 200, 40);
		telaCadastroC.add(campoEstado).setBounds(250, 400, 50, 40);

	}

	static void consultarCliente() {

		telaConsultarC.setTitle("TELA DE CONSULTA DE CLIENTES");
		telaConsultarC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaConsultarC.setSize(1400, 700);
		telaConsultarC.setLayout(null);
		telaConsultarC.getContentPane().setBackground(Color.CYAN);
		telaConsultarC.setResizable(false);
		telaConsultarC.setVisible(true);
		telaConsultarC.add(painelConsultaC);

		painelConsultaC.setSize(1340, 650);
		painelConsultaC.setLocation(10, 10);
		painelConsultaC.setLayout(null);
		painelConsultaC.setBackground(Color.WHITE);
		painelConsultaC.add(excluirC).setBounds(550, 615, 200, 30);

		excluirC.setForeground(Color.MAGENTA);
		painelConsultaC.add(tabelaC);
		painelConsultaC.add(barraC);

		tabelaC.setModel(tabela2C);
		tabelaC.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabelaC.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabelaC.getColumnModel().getColumn(2).setPreferredWidth(130);
		tabelaC.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabelaC.getColumnModel().getColumn(4).setPreferredWidth(300);
		tabelaC.getColumnModel().getColumn(5).setPreferredWidth(250);
		tabelaC.getColumnModel().getColumn(6).setPreferredWidth(150);
		tabelaC.getColumnModel().getColumn(7).setPreferredWidth(50);

		barraC.setBounds(10, 10, 1320, 600);
		barraC.setViewportView(tabelaC);

		registrarCliente();

	}

	static void camposCliente() {
		b = 0;

		matrizC[a][b] = campoNomeC.getText();
		matrizC[a][b + 1] = campoRG.getText();
		matrizC[a][b + 2] = campoCPF.getText();
		matrizC[a][b + 3] = campoNascimento.getText();
		matrizC[a][b + 4] = campoEmail.getText();
		matrizC[a][b + 5] = campoEndereco.getText();
		matrizC[a][b + 6] = campoCidade.getText();
		matrizC[a][b + 7] = campoEstado.getText();

		campoNomeC.setText("");
		campoRG.setText("");
		campoCPF.setText("");
		campoNascimento.setText("");
		campoEmail.setText("");
		campoEndereco.setText("");
		campoCidade.setText("");
		campoEstado.setText("");

		a++;

	}

	static void registrarCliente() {

		for (int a = 0; a < idC; a++) {

			for (int b = 0; b < 8; b++) {

				vetorC[b] = matrizC[a][b];

			}
			tabela2C.addRow(vetorC);
		}
	}

	static void iniciarT() {

		telaT.setTitle("MENU DE TELEFONES");
		telaT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaT.setSize(300, 700);
		telaT.setLocation(550, 0);
		telaT.setLayout(null);
		telaT.setResizable(false);
		telaT.setVisible(true);
		telaT.getContentPane().setBackground(Color.CYAN);

		telaT.add(cadastrarT).setBounds(55, 240, 180, 50);
		telaT.add(consultarT).setBounds(55, 320, 180, 50);
		telaT.add(voltar).setBounds(15, 630, 100, 30);
		telaT.add(sair).setBounds(180, 630, 100, 30);

		cadastrarT.setForeground(Color.MAGENTA);
		consultarT.setForeground(Color.MAGENTA);
		voltar.setForeground(Color.MAGENTA);
		sair.setForeground(Color.MAGENTA);
	}

	static void cadastrarTelefone() {
		telaCadastroT.setTitle("TELEFONE DE CLIENTES");
		telaCadastroT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadastroT.setSize(500, 500);
		telaCadastroT.setLayout(null);
		telaCadastroT.setLocation(500, 100);
		telaCadastroT.getContentPane().setBackground(Color.WHITE);
		telaCadastroT.setResizable(false);
		telaCadastroT.setVisible(true);

		telaCadastroT.add(nomeT).setBounds(100, 0, 100, 50);
		telaCadastroT.add(telefoneFixo).setBounds(50, 60, 100, 50);
		telaCadastroT.add(celular1).setBounds(70, 120, 100, 50);
		telaCadastroT.add(celular2).setBounds(70, 180, 100, 50);
		telaCadastroT.add(comercial).setBounds(10, 240, 150, 50);
		telaCadastroT.add(telefoneMae).setBounds(50, 300, 100, 50);
		telaCadastroT.add(telefonePai).setBounds(55, 360, 100, 50);
		telaCadastroT.add(telefoneRecado).setBounds(30, 420, 150, 50);

		telaCadastroT.add(salvarT).setBounds(350, 180, 100, 30);
		telaCadastroT.add(voltar3).setBounds(350, 240, 100, 30);

		nomeT.setForeground(Color.MAGENTA);
		telefoneFixo.setForeground(Color.MAGENTA);
		celular1.setForeground(Color.MAGENTA);
		celular2.setForeground(Color.MAGENTA);
		comercial.setForeground(Color.MAGENTA);
		telefoneMae.setForeground(Color.MAGENTA);
		telefonePai.setForeground(Color.MAGENTA);
		telefoneRecado.setForeground(Color.MAGENTA);

		salvarT.setForeground(Color.MAGENTA);
		voltar3.setForeground(Color.MAGENTA);

		try {
			mascaraTelefoneFixo = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraCelular1 = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraCelular2 = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraComercial = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraTelefoneMae = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraTelefonePai = new MaskFormatter(" ( # # ) # # # # - # # # #");
			mascaraTelefoneRecado = new MaskFormatter(" ( # # ) # # # # - # # # #");

			mascaraTelefoneFixo.setPlaceholderCharacter('_');
			mascaraCelular1.setPlaceholderCharacter('_');
			mascaraCelular2.setPlaceholderCharacter('_');
			mascaraComercial.setPlaceholderCharacter('_');
			mascaraTelefoneMae.setPlaceholderCharacter('_');
			mascaraTelefonePai.setPlaceholderCharacter('_');
			mascaraTelefoneRecado.setPlaceholderCharacter('_');

		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
		}

		campoNomeT = new JTextField();
		campoTelefoneFixo = new JFormattedTextField(mascaraTelefoneFixo);
		campoCelular1 = new JFormattedTextField(mascaraCelular1);
		campoCelular2 = new JFormattedTextField(mascaraCelular2);
		campoComercial = new JFormattedTextField(mascaraComercial);
		campoTelefoneMae = new JFormattedTextField(mascaraTelefoneMae);
		campoTelefonePai = new JFormattedTextField(mascaraTelefonePai);
		campoTelefoneRecado = new JFormattedTextField(mascaraTelefoneRecado);

		telaCadastroT.add(campoNomeT).setBounds(160, 0, 300, 40);
		telaCadastroT.add(campoTelefoneFixo).setBounds(160, 60, 150, 40);
		telaCadastroT.add(campoCelular1).setBounds(160, 120, 150, 40);
		telaCadastroT.add(campoCelular2).setBounds(160, 180, 150, 40);
		telaCadastroT.add(campoComercial).setBounds(160, 240, 150, 40);
		telaCadastroT.add(campoTelefoneMae).setBounds(160, 300, 150, 40);
		telaCadastroT.add(campoTelefonePai).setBounds(160, 360, 150, 40);
		telaCadastroT.add(campoTelefoneRecado).setBounds(160, 420, 150, 40);

	}

	static void consultarTelefone() {

		telaConsultarT.setTitle("TELA DE CONSULTA DE TELEFONES");
		telaConsultarT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaConsultarT.setSize(1400, 700);
		telaConsultarT.setLayout(null);
		telaConsultarT.getContentPane().setBackground(Color.CYAN);
		telaConsultarT.setResizable(false);
		telaConsultarT.setVisible(true);
		telaConsultarT.add(painelConsultaT);

		painelConsultaT.setSize(1340, 650);
		painelConsultaT.setLocation(10, 10);
		painelConsultaT.setLayout(null);
		painelConsultaT.setBackground(Color.WHITE);
		painelConsultaT.add(excluirT).setBounds(550, 615, 200, 30);

		excluirT.setForeground(Color.MAGENTA);
		painelConsultaT.add(tabelaT);
		painelConsultaT.add(barraT);

		tabelaT.setModel(tabela2T);
		tabelaT.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabelaT.getColumnModel().getColumn(1).setPreferredWidth(50);
		tabelaT.getColumnModel().getColumn(2).setPreferredWidth(50);
		tabelaT.getColumnModel().getColumn(3).setPreferredWidth(50);
		tabelaT.getColumnModel().getColumn(4).setPreferredWidth(50);
		tabelaT.getColumnModel().getColumn(5).setPreferredWidth(50);
		tabelaT.getColumnModel().getColumn(6).setPreferredWidth(50);
		tabelaT.getColumnModel().getColumn(7).setPreferredWidth(50);

		barraT.setBounds(10, 10, 1320, 600);
		barraT.setViewportView(tabelaT);

		registrarTelefone();
	}

	static void camposTelefone() {
		d = 0;

		matrizT[c][d] = campoNomeT.getText();
		matrizT[c][d + 1] = campoTelefoneFixo.getText();
		matrizT[c][d + 2] = campoCelular1.getText();
		matrizT[c][d + 3] = campoCelular2.getText();
		matrizT[c][d + 4] = campoComercial.getText();
		matrizT[c][d + 5] = campoTelefoneMae.getText();
		matrizT[c][d + 6] = campoTelefonePai.getText();
		matrizT[c][d + 7] = campoTelefoneRecado.getText();

		campoNomeT.setText("");
		campoTelefoneFixo.setText("");
		campoCelular1.setText("");
		campoCelular2.setText("");
		campoComercial.setText("");
		campoTelefoneMae.setText("");
		campoTelefonePai.setText("");
		campoTelefoneRecado.setText("");

		c++;
	}

	static void registrarTelefone() {

		for (int c = 0; c < idT; c++) {

			for (int d = 0; d < 8; d++) {

				vetorT[d] = matrizT[c][d];

			}
			tabela2T.addRow(vetorT);

		}

	}

	static void botoesTela() {

		cliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.setVisible(false);
				iniciarC();
				consultarC.setVisible(false);
			}

		});

		telefone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.setVisible(false);
				iniciarT();
				consultarT.setVisible(false);
			}

		});

		cadastrarC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaC.setVisible(false);
				telaConsultarC.setVisible(false);
				cadastrarCliente();
			}

		});

		cadastrarT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaT.setVisible(false);
				telaConsultarT.setVisible(false);
				cadastrarTelefone();

			}

		});

		salvarC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (idC <= 100) {

					campoNomeC.setEnabled(false);
					campoRG.setEnabled(false);
					campoCPF.setEnabled(false);
					campoNascimento.setEnabled(false);
					campoNascimento.setEnabled(false);
					campoEmail.setEnabled(false);
					campoEndereco.setEnabled(false);
					campoCidade.setEnabled(false);
					campoEstado.setEnabled(false);

					int atualizacaoC = JOptionPane.showConfirmDialog(null, "DESEJA ATUALIZAR O CADASTRO DE CLIENTES?");
					if (atualizacaoC == JOptionPane.YES_OPTION) {
						campoNomeC.setEnabled(true);
						campoRG.setEnabled(true);
						campoCPF.setEnabled(true);
						campoNascimento.setEnabled(true);
						campoEmail.setEnabled(true);
						campoEndereco.setEnabled(true);
						campoCidade.setEnabled(true);
						campoEstado.setEnabled(true);

					} else {

						camposCliente();
						idC++;
						JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!!!");
						JOptionPane.showMessageDialog(null, "FORAM CADASTRADAS " + idC + " CLIENTES!!!");
						consultarC.setVisible(true);

						campoNomeC.setEnabled(true);
						campoRG.setEnabled(true);
						campoCPF.setEnabled(true);
						campoNascimento.setEnabled(true);
						campoEmail.setEnabled(true);
						campoEndereco.setEnabled(true);
						campoCidade.setEnabled(true);
						campoEstado.setEnabled(true);
					}

				} else {

					campoNomeC.setEnabled(false);
					campoRG.setEnabled(false);
					campoCPF.setEnabled(false);
					campoNascimento.setEnabled(false);
					campoNascimento.setEnabled(false);
					campoEmail.setEnabled(false);
					campoEndereco.setEnabled(false);
					campoCidade.setEnabled(false);
					campoEstado.setEnabled(false);
					JOptionPane.showMessageDialog(null, "JÁ FORAM CADASTRADOS 100 CLIENTES!!!");

				}

			}

		});

		salvarT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (idT <= 100) {

					campoNomeT.setEnabled(false);
					campoTelefoneFixo.setEnabled(false);
					campoCelular1.setEnabled(false);
					campoCelular2.setEnabled(false);
					campoComercial.setEnabled(false);
					campoTelefoneMae.setEnabled(false);
					campoTelefonePai.setEnabled(false);
					campoTelefoneRecado.setEnabled(false);

					int atualizacaoT = JOptionPane.showConfirmDialog(null, "DESEJA ATUALIZAR O CADASTRO DE TELEFONES?");
					if (atualizacaoT == JOptionPane.YES_OPTION) {

						campoNomeT.setEnabled(true);
						campoTelefoneFixo.setEnabled(true);
						campoCelular1.setEnabled(true);
						campoCelular2.setEnabled(true);
						campoComercial.setEnabled(true);
						campoTelefoneMae.setEnabled(true);
						campoTelefonePai.setEnabled(true);
						campoTelefoneRecado.setEnabled(true);

					} else {

						camposTelefone();
						idT++;
						JOptionPane.showMessageDialog(null, "TELEFONES CADASTRADOS COM SUCESSO!!!");
						JOptionPane.showMessageDialog(null, "NÚMERO DE PESSOAS CADASTRADAS = " + idT);
						consultarT.setVisible(true);

						campoNomeT.setEnabled(true);
						campoTelefoneFixo.setEnabled(true);
						campoCelular1.setEnabled(true);
						campoCelular2.setEnabled(true);
						campoComercial.setEnabled(true);
						campoTelefoneMae.setEnabled(true);
						campoTelefonePai.setEnabled(true);
						campoTelefoneRecado.setEnabled(true);

					}

				} else {

					campoNomeT.setEnabled(false);
					campoTelefoneFixo.setEnabled(false);
					campoCelular1.setEnabled(false);
					campoCelular2.setEnabled(false);
					campoComercial.setEnabled(false);
					campoTelefoneMae.setEnabled(false);
					campoTelefonePai.setEnabled(false);
					campoTelefoneRecado.setEnabled(false);
					JOptionPane.showMessageDialog(null, "JÁ FORAM CADASTRADOS 100 CLIENTES E SEUS TELEFONES!!!");

				}

			}

		});

		excluirC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) tabelaC.getModel()).removeRow(tabelaC.getSelectedRow());

			}
		});
		
		excluirT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) tabelaT.getModel()).removeRow(tabelaT.getSelectedRow());

			}
		});

		consultarC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int consultaC = JOptionPane.showConfirmDialog(null, "JÁ FORAM CADASTRADOS OS 100 CLIENTES?");
				if (consultaC == JOptionPane.YES_OPTION) {
					telaC.setVisible(false);
					consultarCliente();
				} else {
					consultarC.setVisible(false);
				}

			}
		});

		consultarT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int consultaT = JOptionPane.showConfirmDialog(null, "JÁ FORAM CADASTRADOS OS 100 CLIENTES?");
				if (consultaT == JOptionPane.YES_OPTION) {
					telaT.setVisible(false);
					consultarTelefone();
				} else {
					consultarT.setVisible(false);
				}

			}
		});

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaC.setVisible(false);
				telaT.setVisible(false);
				iniciar();

			}

		});

		voltar1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaCadastroC.setVisible(false);
				iniciarC();
			}

		});

		voltar3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaCadastroT.setVisible(false);
				iniciarT();
			}

		});

		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}