package swing1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame () {

		this.setSize(400,400);
		this.setTitle("Ýlk Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon frameIcon=new ImageIcon("Images/1.jpg");
		this.setIconImage(frameIcon.getImage());
		this.getContentPane().setBackground(new Color(88, 212, 177));
		this.setVisible(true);
		
}

}
