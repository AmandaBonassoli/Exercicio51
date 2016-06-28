//TRABALHO FEITO PELA ALUNA AMANDA CAROLINE BONASSOLI SILVA

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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

	static JFrame telaC = new JFrame();

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

	static JButton cadastrarC = new JButton("CADASTRAR CLIENTE");
	static JButton excluirC = new JButton("EXCLUIR CLIENTE");
	static JButton consultarC = new JButton("CONSULTAR");

	static JButton cadastrarT = new JButton("TELEFONE");
	static JButton excluirT = new JButton("EXCLUIR");
	static JButton consultarT = new JButton("CONSULTAR TELEFONE");

	static JButton sair = new JButton("SAIR");
	static JButton salvarC = new JButton("SALVAR");
	static JButton salvarT = new JButton("SALVAR");
	static JButton voltar = new JButton("VOLTAR");
	static JButton voltar1 = new JButton("VOLTAR");
	static JButton voltar2 = new JButton("VOLTAR");

	static JLabel nomeC = new JLabel("NOME:");
	static JLabel rg = new JLabel("RG:");
	static JLabel cpf = new JLabel("*CPF:");
	static JLabel nascimento = new JLabel("DATA DE NASCIMENTO:");
	static JLabel email = new JLabel("E-MAIL:");
	static JLabel endereco = new JLabel("ENDEREÇO:");
	static JLabel cidade = new JLabel("CIDADE:");
	static JLabel estado = new JLabel("ESTADO:");

	static JLabel nomeT = new JLabel("NOME:");
	static JLabel telefoneFixo = new JLabel("TELEFONE FIXO:");
	static JLabel celular1 = new JLabel("CELULAR(1):");
	static JLabel celular2 = new JLabel("CELULAR(2):");
	static JLabel comercial = new JLabel("TELEFONE COMERCIAL:");
	static JLabel telefoneMae = new JLabel("TELEFONE/MÃE:");
	static JLabel telefonePai = new JLabel("TELEFONE/PAI:");
	static JLabel telefoneRecado = new JLabel("TELEFONE RECADO:");
	
	static JTextField campoNomeC = new JTextField();
	static JTextField campoEndereco = new JTextField();
	static JTextField campoCidade = new JTextField();
	static JTextField campoRG = new JTextField();
	static JTextField campoCPF = new JTextField();
	static JTextField campoNascimento = new JTextField();
	static JTextField campoEmail = new JTextField();
	static JTextField campoEstado = new JTextField();

	static JTextField campoNomeT = new JTextField();
	static JTextField campoTelefoneFixo = new JTextField();
	static JTextField campoCelular1 = new JTextField();
	static JTextField campoCelular2 = new JTextField();
	static JTextField campoComercial = new JTextField();
	static JTextField campoTelefoneMae = new JTextField();
	static JTextField campoTelefonePai = new JTextField();
	static JTextField campoTelefoneRecado = new JTextField();

	public static void main(String[] args) {
		iniciarC();
		botoesTela();
	}

	static void iniciarC() {

		telaC.setTitle("MENU DE CLIENTES");
		telaC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaC.setSize(300, 700);
		telaC.setLocation(550, 0);
		telaC.setLayout(null);
		telaC.setResizable(false);
		telaC.setVisible(true);
		telaC.getContentPane().setBackground(Color.WHITE);

		telaC.add(cadastrarC).setBounds(55, 240, 180, 50);
		telaC.add(sair).setBounds(180, 630, 100, 30);

		cadastrarC.setForeground(Color.MAGENTA);
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
		telaCadastroC.add(consultarC).setBounds(268, 550, 150, 50);
		telaCadastroC.add(cadastrarT).setBounds(480, 550, 150, 50);

		nomeC.setForeground(Color.MAGENTA);
		rg.setForeground(Color.MAGENTA);
		cpf.setForeground(Color.MAGENTA);
		nascimento.setForeground(Color.MAGENTA);
		email.setForeground(Color.MAGENTA);
		endereco.setForeground(Color.MAGENTA);
		cidade.setForeground(Color.MAGENTA);
		estado.setForeground(Color.MAGENTA);

		salvarC.setForeground(Color.MAGENTA);
		consultarC.setForeground(Color.MAGENTA);
		cadastrarT.setForeground(Color.MAGENTA);
		
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
		painelConsultaC.add(cadastrarC).setBounds(100, 615, 200, 30);
		painelConsultaC.add(consultarT).setBounds(1000,615, 200, 30);

		excluirC.setForeground(Color.MAGENTA);
		consultarT.setForeground(Color.MAGENTA);
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
		
			matrizC[a][0] = campoNomeC.getText();
			matrizC[a][1] = campoRG.getText();
			matrizC[a][2] = campoCPF.getText();
			matrizC[a][3] = campoNascimento.getText();
			matrizC[a][4] = campoEmail.getText();
			matrizC[a][5] = campoEndereco.getText();
			matrizC[a][6] = campoCidade.getText();
			matrizC[a][7] = campoEstado.getText();
			
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
		
		String[] vetorC = new String[8];

		for (int a = 0; a < idC; a++) {

			for (int b = 0; b < 8; b++) {

				vetorC[b] = matrizC[a][b];

			}
			tabela2C.addRow(vetorC);
		}
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
		telaCadastroT.add(voltar).setBounds(350, 240, 100, 30);;
		
		nomeT.setForeground(Color.MAGENTA);
		telefoneFixo.setForeground(Color.MAGENTA);
		celular1.setForeground(Color.MAGENTA);
		celular2.setForeground(Color.MAGENTA);
		comercial.setForeground(Color.MAGENTA);
		telefoneMae.setForeground(Color.MAGENTA);
		telefonePai.setForeground(Color.MAGENTA);
		telefoneRecado.setForeground(Color.MAGENTA);

		salvarT.setForeground(Color.MAGENTA);
		voltar.setForeground(Color.MAGENTA);

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
		painelConsultaT.add(excluirT).setBounds(400, 615, 200, 30);
		painelConsultaT.add(voltar2).setBounds(700, 615, 200, 30);

		excluirT.setForeground(Color.MAGENTA);
		voltar2.setForeground(Color.MAGENTA);
		
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

		matrizT[c][0] = campoNomeT.getText();
		matrizT[c][1] = campoTelefoneFixo.getText();
		matrizT[c][2] = campoCelular1.getText();
		matrizT[c][3] = campoCelular2.getText();
		matrizT[c][4] = campoComercial.getText();
		matrizT[c][5] = campoTelefoneMae.getText();
		matrizT[c][6] = campoTelefonePai.getText();
		matrizT[c][7] = campoTelefoneRecado.getText();

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

		String[] vetorT = new String[8];
		
		for (int c = 0; c < idT; c++) {

			for (int d = 0; d < 8; d++) {

				vetorT[d] = matrizT[c][d];

			}
			tabela2T.addRow(vetorT);

		}

	}

	static void botoesTela() {

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
				telaCadastroC.setVisible(false);
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

					int salvarC = JOptionPane.showConfirmDialog(null, "DESEJA SALVAR?");
					if (salvarC == JOptionPane.YES_OPTION) {
						camposCliente();
						idC++;
						JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!!!");

						campoNomeC.setEnabled(true);
						campoRG.setEnabled(true);
						campoCPF.setEnabled(true);
						campoNascimento.setEnabled(true);
						campoEmail.setEnabled(true);
						campoEndereco.setEnabled(true);
						campoCidade.setEnabled(true);
						campoEstado.setEnabled(true);

					} else {

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

					int salvarT = JOptionPane.showConfirmDialog(null, "DESEJA SALVAR?");
					if (salvarT == JOptionPane.YES_OPTION) {

						camposTelefone();
						idT++;
						JOptionPane.showMessageDialog(null, "TELEFONES CADASTRADOS COM SUCESSO!!!");
						consultarT.setVisible(true);

						campoNomeT.setEnabled(true);
						campoTelefoneFixo.setEnabled(true);
						campoCelular1.setEnabled(true);
						campoCelular2.setEnabled(true);
						campoComercial.setEnabled(true);
						campoTelefoneMae.setEnabled(true);
						campoTelefonePai.setEnabled(true);
						campoTelefoneRecado.setEnabled(true);

					} else {

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
				int excluirC = JOptionPane.showConfirmDialog(null, "SELECIONOU UMA LINHA PARA EXCLUIR?");
				if (excluirC == JOptionPane.YES_OPTION) {
				((DefaultTableModel) tabelaC.getModel()).removeRow(tabelaC.getSelectedRow());
				} 
			}
		});
		
		excluirT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int excluirT = JOptionPane.showConfirmDialog(null, "SELECIONOU UMA LINHA PARA EXCLUIR?");
				if (excluirT == JOptionPane.YES_OPTION) {
				((DefaultTableModel) tabelaT.getModel()).removeRow(tabelaT.getSelectedRow());
				} 
			}
		});

		consultarC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					telaC.setVisible(false);
					limparTable(tabelaC);
					consultarCliente();
					telaCadastroC.dispose();

			}
		});
		
		consultarT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					telaConsultarC.setVisible(false);
					consultarTelefone();
					

			}
		});

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaCadastroT.setVisible(false);
				cadastrarCliente();
			}

		});

		voltar1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaCadastroC.setVisible(false);
				iniciarC();
			}

		});

		voltar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaConsultarT.setVisible(false);
				consultarCliente();
			}

		});


		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
	
	static void limparTable(JTable table) {
		while (table.getModel().getRowCount() > 0) {
			((DefaultTableModel) table.getModel()).removeRow(0);
		}
	}

}