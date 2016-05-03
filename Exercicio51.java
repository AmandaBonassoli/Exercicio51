import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercicio51 {
	
		static JFrame tela;
		static JButton botaoAdicionar = new JButton(new ImageIcon("imagem\\adicionar.png"));
		
		public static void main(String[] args) {
		tela = new JFrame();
		Tela();
		}
		
		static void Tela() {
			
			tela.setTitle("Menu");
			tela.setSize(1600,900);
			tela.setLocation(0, 0);
			tela.getContentPane().setBackground(Color.white);
			tela.setResizable(false);
			tela.setVisible(true);
			tela.add(botaoAdicionar).setBounds(20, 20, 0, 0); 
			

	}
}