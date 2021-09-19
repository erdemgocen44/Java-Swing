package swing3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelUygulamasi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelUygulamasi frame = new PanelUygulamasi();
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
	public PanelUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAnasayfa = new JPanel();
		panelAnasayfa.setBackground(Color.ORANGE);
		panelAnasayfa.setBounds(10, 11, 444, 467);
		contentPane.add(panelAnasayfa);
		panelAnasayfa.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(54, 154, 145, 59);
		panelAnasayfa.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Anasayfa");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 11, 256, 90);
		panelAnasayfa.add(lblNewLabel);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(Color.PINK);
		panelMenu.setBounds(464, 11, 360, 467);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JButton btnAnasayfa = new JButton("Anasayfa");
		btnAnasayfa.setBounds(0, 11, 89, 100);
		panelMenu.add(btnAnasayfa);
		
		JButton btnHakkmzda = new JButton("Hakk\u0131m\u0131zda");
		btnHakkmzda.setBounds(0, 150, 89, 100);
		panelMenu.add(btnHakkmzda);
	}
}
