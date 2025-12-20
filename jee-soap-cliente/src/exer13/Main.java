package exer13;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		
		ImagemServicoImpService service = new ImagemServicoImpService();
		ServicoImagem proxy = service.getImagemServicoImpPort();
		byte[] byteArray=  proxy.dowload();
		//Swing
		ImageIcon imageIcon = new ImageIcon(byteArray);
		JFrame gui = new JFrame();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(600, 600);
		JLabel label = new JLabel(new ImageIcon(imageIcon.getImage()));
		gui.add(label);
		gui.setVisible(true);
	}
}
