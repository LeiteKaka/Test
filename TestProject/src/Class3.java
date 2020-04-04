import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;

public class Class3 {

	private JFrame frame;
	private JTextArea txtrOvdeCeBiti;
	private JTextPane txtpnDaDa;

	/**
	 * Launch the application.
	 */
	public static void showPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class3 window = new Class3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Class3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtrOvdeCeBiti = new JTextArea();
		txtrOvdeCeBiti.setFont(new Font("Miriam", Font.PLAIN, 16));
		txtrOvdeCeBiti.setText(" slika peglice");
		txtrOvdeCeBiti.setBounds(99, 50, 196, 60);
		frame.getContentPane().add(txtrOvdeCeBiti);
		
		txtpnDaDa = new JTextPane();
		txtpnDaDa.setBackground(new Color(153, 204, 102));
		txtpnDaDa.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtpnDaDa.setText("da da");
		txtpnDaDa.setBounds(99, 142, 135, 60);
		frame.getContentPane().add(txtpnDaDa);
	}
}
