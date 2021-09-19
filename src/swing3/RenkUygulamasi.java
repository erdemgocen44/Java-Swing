package swing3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RenkUygulamasi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RenkUygulamasi frame = new RenkUygulamasi();
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
	public RenkUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
Integer[] renkSayi=new Integer[256];
for (int i = 0; i < renkSayi.length; i++) {
	renkSayi[i]=i;
	
}
JComboBox cmbRenk1 = new JComboBox(renkSayi);

		cmbRenk1.setBounds(36, 11, 107, 22);
		contentPane.add(cmbRenk1);
		
		JComboBox cmbRenk2 = new JComboBox(renkSayi);
		
		cmbRenk2.setBounds(169, 11, 107, 22);
		contentPane.add(cmbRenk2);
		
		JComboBox cmbRenk3 = new JComboBox(renkSayi);
		cmbRenk3.setBounds(299, 11, 107, 22);
		contentPane.add(cmbRenk3);
		
		JLabel lblIstenenRenk = new JLabel("Renk Olu\u015Fumu");
		lblIstenenRenk.setHorizontalAlignment(SwingConstants.CENTER);
		lblIstenenRenk.setBounds(36, 60, 370, 115);
		lblIstenenRenk.setBackground(new Color(115,25,55));
		lblIstenenRenk.setOpaque(true);
		contentPane.add(lblIstenenRenk);
		cmbRenk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblIstenenRenk.setBackground(new Color(cmbRenk1.getSelectedIndex(),cmbRenk2.getSelectedIndex(),cmbRenk3.getSelectedIndex()));
			}
		});
		cmbRenk2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblIstenenRenk.setBackground(new Color(cmbRenk1.getSelectedIndex(),cmbRenk2.getSelectedIndex(),cmbRenk3.getSelectedIndex()));

			}
		});
		cmbRenk3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblIstenenRenk.setBackground(new Color(cmbRenk1.getSelectedIndex(),cmbRenk2.getSelectedIndex(),cmbRenk3.getSelectedIndex()));

			}
		});
	}

}
