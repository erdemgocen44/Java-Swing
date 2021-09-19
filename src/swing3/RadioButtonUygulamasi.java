package swing3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButtonUygulamasi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonUygulamasi frame = new RadioButtonUygulamasi();
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
	public RadioButtonUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdnBtnBay = new JRadioButton("Bay");
		
		rdnBtnBay.setBounds(6, 7, 119, 40);
		ImageIcon imgIcon=new ImageIcon(getClass().getResource("/1.jpg"));
rdnBtnBay.setIcon(imgIcon);
		contentPane.add(rdnBtnBay);
		
		JRadioButton rdbtnBayan = new JRadioButton("Bayan");
		
		rdbtnBayan.setBounds(169, 7, 113, 40);
		ImageIcon imgIcon2=new ImageIcon(getClass().getResource("/1.jpg"));
		rdbtnBayan.setIcon(imgIcon2);

		contentPane.add(rdbtnBayan);
		ButtonGroup btnGroup=new ButtonGroup();
		btnGroup.add(rdnBtnBay);
		btnGroup.add(rdbtnBayan);
		rdnBtnBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bay Seçtiniz");
			}
		});
		rdbtnBayan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bayan Seçtiniz");

			}
		});
		
	}
}
