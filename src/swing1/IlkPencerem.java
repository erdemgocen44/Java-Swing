package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class IlkPencerem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IlkPencerem frame = new IlkPencerem();
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
	public IlkPencerem() {
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 450, 300);//konum
		setMinimumSize(new Dimension(200,200));
		setMaximumSize(new Dimension(500,500));

		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMerhaba = new JLabel("Merhaba Swing");
		ImageIcon imgIcon=new ImageIcon(getClass().getResource("/1.jpg"));
		lblMerhaba.setIcon(imgIcon);
		lblMerhaba.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblMerhaba.setBackground(Color.PINK);
		lblMerhaba.setHorizontalTextPosition(JLabel.BOTTOM);
		lblMerhaba.setOpaque(true);
		lblMerhaba.setBounds(50, 32, 208, 78);
		lblMerhaba.setHorizontalAlignment(SwingConstants.CENTER		);
		contentPane.add(lblMerhaba);
	}
}
