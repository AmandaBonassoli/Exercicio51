import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio51 {

	static JFrame tela;
	static JFrame telacadastro;
	static JFrame telaatualizar;
	static JFrame telaexcluir;
	static JFrame telaconsultar;

	static JButton Cadastrar = new JButton("Cadastrar");
	static JButton Atualizar = new JButton("Atualizar");
	static JButton Excluir = new JButton("Excluir");
	static JButton Consultar = new JButton("Consultar");
	static JButton Salvar = new JButton("Salvar");
	static JButton Sair = new JButton("Sair");

	static JLabel fundo = new JLabel(new ImageIcon("imagem\\fundo.jpg"));
	static JLabel nome = new JLabel("Nome:");
	static JLabel rg = new JLabel("RG:");
	static JLabel cpf = new JLabel("CPF:");
	static JLabel nascimento = new JLabel("Data de Nascimento:");
	static JLabel email = new JLabel("E-mail:");
	static JLabel telefone = new JLabel("Telefone:");
	static JLabel celular = new JLabel("Celular:");
	static JLabel endereco = new JLabel("Endereço:");
	static JLabel cidade = new JLabel("Cidade:");
	static JLabel estado = new JLabel("Estado:");

	static JTextField campoNome = new JTextField();
	static JTextField campoRG = new JTextField();
	static JTextField campoCPF = new JTextField();
	static JTextField campoNascimento = new JTextField();
	static JTextField campoEmail = new JTextField();
	static JTextField campoTelefone1 = new JTextField();
	static JTextField campoTelefone2 = new JTextField();
	static JTextField campoCelular1 = new JTextField();
	static JTextField campoCelular2 = new JTextField();
	static JTextField campoEndereco = new JTextField();
	static JTextField campoCidade = new JTextField();
	static JTextField campoEstado = new JTextField();
	
	public static void main(String[] args) {
		telacadastro = new JFrame();
		tela = new JFrame();
		Tela();

	}

	static void Tela() {

		tela.setTitle("Menu");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(200, 500);
		tela.setLayout(null);
		tela.setLocation(700, 150);
		tela.getContentPane().setBackground(Color.pink);
		tela.setResizable(false);
		tela.setVisible(true);
		tela.add(Cadastrar).setBounds(50, 40, 100, 50);
		Cadastrar.setForeground(Color.pink);
		tela.add(Atualizar).setBounds(50, 120, 100, 50);
		Atualizar.setForeground(Color.pink);
		tela.add(Excluir).setBounds(50, 200, 100, 50);
		Excluir.setForeground(Color.pink);
		tela.add(Consultar).setBounds(50, 280, 100, 50);
		Consultar.setForeground(Color.pink);
		tela.add(Sair).setBounds(110, 435, 80, 30);
		tela.add(fundo).setBounds(0, 0, 200, 500);
		botoes();
	}

	static void TelaCadastro() {
		telacadastro.setTitle("Tela de Cadastro");
		telacadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telacadastro.setSize(700, 700);
		telacadastro.setLayout(null);
		telacadastro.setLocation(500, 100);
		telacadastro.getContentPane().setBackground(Color.pink);
		telacadastro.setResizable(false);
		telacadastro.setVisible(true);
		telacadastro.add(nome).setBounds(10, 0, 50, 100);
		telacadastro.add(rg).setBounds(10, 50, 50, 100);
		telacadastro.add(cpf).setBounds(250, 50, 50, 100);
		telacadastro.add(nascimento).setBounds(10, 100, 120, 100);
		telacadastro.add(email).setBounds(10, 150, 60, 100);
		telacadastro.add(telefone).setBounds(10, 200, 60, 100);
		telacadastro.add(celular).setBounds(350, 200, 60, 100);
		telacadastro.add(endereco).setBounds(10,250,60,100);
		telacadastro.add(cidade).setBounds(10, 300, 50, 100);
		telacadastro.add(estado).setBounds(250, 300, 50, 100);

		telacadastro.add(campoNome).setBounds(10, 60, 650, 30);
		telacadastro.add(campoRG).setBounds(10, 110, 200, 30);
		telacadastro.add(campoCPF).setBounds(250, 110, 200, 30);
		telacadastro.add(campoNascimento).setBounds(10, 160, 200, 30);
		telacadastro.add(campoEmail).setBounds(10, 210, 500, 30);
		telacadastro.add(campoTelefone1).setBounds(10, 260, 50, 30);
		telacadastro.add(campoTelefone2).setBounds(70, 260, 250, 30);
		telacadastro.add(campoCelular1).setBounds(345, 260, 50, 30);
		telacadastro.add(campoCelular2).setBounds(405, 260, 250, 30);
		telacadastro.add(campoEndereco).setBounds(10,310,500,30);
		telacadastro.add(campoCidade).setBounds(10, 360, 200, 30);
		telacadastro.add(campoEstado).setBounds(250, 360, 200, 30);;
		
		telacadastro.add(Salvar).setBounds(270, 550, 150, 50);

	}

	static void botoes() {

		Cadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.setVisible(false);
				TelaCadastro();

			}
		});
		Sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});

	}
}
