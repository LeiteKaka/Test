import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Class5 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblTrabantmadeInDdr;

	/**
	 * Launch the application.
	 */
	public static void showPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class5 window = new Class5();
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
	public Class5() {
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
		
		lblNewLabel = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/trabant.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		lblNewLabel.setBounds(70, 62, 328, 173);
		frame.getContentPane().add(lblNewLabel);
		
		lblTrabantmadeInDdr = new JLabel("Trabant(made in DDR)");
		lblTrabantmadeInDdr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTrabantmadeInDdr.setBounds(104, 24, 200, 14);
		frame.getContentPane().add(lblTrabantmadeInDdr);
	}

}
