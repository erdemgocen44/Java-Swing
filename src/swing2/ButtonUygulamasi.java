package swing2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ButtonUygulamasi extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnKaydet;
	JButton btnSil;
	JLabel lblMesaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonUygulamasi frame = new ButtonUygulamasi();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);//frame i ekranýn tam ortasýnda açar
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonUygulamasi() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Dimension dmDimension=Toolkit.getDefaultToolkit().getScreenSize();//Ekranýn 
		setBounds(100, 100, 500, 500);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);//Uygulama ekraný kaplar
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnKaydet = new JButton("Kaydet");
		btnKaydet.setBackground(Color.PINK);
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/1.jpg"));
		btnKaydet.setIcon(imageIcon);
		btnKaydet.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));

		btnKaydet.setForeground(Color.RED);
		btnKaydet.setFont(new Font("Sitka Text", Font.BOLD, 20));
		btnKaydet.setBounds(31, 100, 165, 94);
		btnKaydet.addActionListener(this);
		contentPane.add(btnKaydet);
		
		btnSil = new JButton("Sil");
		btnSil.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
		btnSil.setForeground(Color.CYAN);
		btnSil.setFont(new Font("Sitka Text", Font.BOLD, 20));
		btnSil.setBackground(Color.YELLOW);
		btnSil.setBounds(31, 218, 165, 94);
		btnKaydet.addActionListener(this);

		contentPane.add(btnSil);
		
		lblMesaj = new JLabel("Merhaba Siliyorum");
		lblMesaj.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblMesaj.setBounds(31, 337, 330, 63);
		contentPane.add(lblMesaj);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
if (e.getSource()==btnKaydet ) {
	lblMesaj.setText("Merhaba Salih Bey Kaydediyorum");
}	else if(e.getSource()==btnSil) {
	lblMesaj.setText("Siliyorum");
}
	
}	
	}

