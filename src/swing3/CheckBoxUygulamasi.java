package swing3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class CheckBoxUygulamasi extends JFrame {

	private JPanel contentPane;
	ImageIcon icon;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxUygulamasi frame = new CheckBoxUygulamasi();
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
	public CheckBoxUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chcBoxSartlarKabul = new JCheckBox("\u015Eartlar\u0131 kabul etmiyorum.");
		icon=new ImageIcon(getClass().getResource("/false.png"));
		chcBoxSartlarKabul.setIcon(icon);
		chcBoxSartlarKabul.setForeground(Color.RED);
		chcBoxSartlarKabul.setSelected(true);
		chcBoxSartlarKabul.setBounds(6, 7, 150, 23);
		contentPane.add(chcBoxSartlarKabul);
		
		JButton btnKayitButon = new JButton("Kay\u0131t");
		btnKayitButon.setFont(new Font("Stencil Std", Font.BOLD, 17));
		btnKayitButon.setEnabled(false);
		
		btnKayitButon.setBounds(16, 37, 140, 41);
		contentPane.add(btnKayitButon);
		chcBoxSartlarKabul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chcBoxSartlarKabul.isSelected()) {
					System.out.println("Þartlarý Kabul Ettiniz");
					btnKayitButon.setEnabled(true);
					icon=new ImageIcon(getClass().getResource("/true.png"));
					chcBoxSartlarKabul.setIcon(icon);
					chcBoxSartlarKabul.setText("Þartlarý Kabul Ediyorum");
					chcBoxSartlarKabul.setForeground(Color.GREEN);

				}else {
					System.out.println("Þartlarý Kabul ETMEDÝNÝZ!!");
					btnKayitButon.setEnabled(false);
					icon=new ImageIcon(getClass().getResource("/false.png"));
					chcBoxSartlarKabul.setForeground(Color.RED);
					chcBoxSartlarKabul.setText("Þartlarý Kabul Etmiyorum");
					chcBoxSartlarKabul.setIcon(icon);

					btnKayitButon.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Sistemimize kaydýnýz yapýldý");
						}
					});
				}
			}
		});
	}
}
