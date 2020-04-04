import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.Color;

public class Class4 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel labela_2;

	/**
	 * Launch the application.
	 */
	public static void showPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class4 window = new Class4();
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
	public Class4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 852, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		labela_2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/ball.png")).getImage();
		labela_2.setIcon(new ImageIcon(img2));
		labela_2.setBounds(29, 26, 623, 422);
		frame.getContentPane().add(labela_2);
	}

}
