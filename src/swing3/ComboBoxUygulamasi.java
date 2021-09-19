package swing3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ComboBoxUygulamasi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxUygulamasi frame = new ComboBoxUygulamasi();
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
	public ComboBoxUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[]derseKatilanlar= {"Merve","Dila","Akif","Mine","Erdem",};
		JComboBox comboBox = new JComboBox(derseKatilanlar);
		
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Samet", "Gulcan", "Ya\u011Fmur", "Erdem", "Salih", "Mehmet"}));
		comboBox.setBounds(37, 39, 172, 22);
		comboBox.addItem("Idris");
		comboBox.removeItem("Erdem");
		comboBox.insertItemAt("Cafer", 2);
		contentPane.add(comboBox);
		
		JLabel lblSecilen = new JLabel("");
		lblSecilen.setBackground(Color.YELLOW);
		lblSecilen.setForeground(Color.BLUE);
		lblSecilen.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblSecilen.setBounds(37, 83, 172, 31);
		contentPane.add(lblSecilen);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//System.out.println(comboBox.getSelectedItem());
				System.out.println(comboBox.getSelectedIndex());

				lblSecilen.setText(comboBox.getSelectedItem().toString());
			}
		});
	}
}
