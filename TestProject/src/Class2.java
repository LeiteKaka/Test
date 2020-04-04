import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Class2 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblBirajteAutomobil;
	private JRadioButton buttonPeg;
	private JRadioButton buttonFi;
	private JRadioButton buttonTr;

	/**
	 * Launch the application.
	 */
	public static void showPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class2 window = new Class2();
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
	public Class2() {
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
		
		lblNewLabel = new JLabel("Welcome everyone!");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 153, 51));
		lblNewLabel.setBounds(101, 11, 245, 34);
		frame.getContentPane().add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(new Color(153, 102, 255));
		panel.setBounds(68, 64, 306, 50);
		frame.getContentPane().add(panel);
		
		lblBirajteAutomobil = new JLabel("Birajte automobil :");
		lblBirajteAutomobil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirajteAutomobil.setBounds(147, 141, 130, 28);
		frame.getContentPane().add(lblBirajteAutomobil);
		
		buttonPeg = new JRadioButton("Peglica");
		buttonPeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Class3.showPage();
			}
		});
		buttonPeg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonPeg.setBounds(147, 172, 109, 23);
		frame.getContentPane().add(buttonPeg);
		
		buttonFi = new JRadioButton("Buba");
		buttonFi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Class4.showPage();
			}
		});
		buttonFi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonFi.setBounds(147, 202, 109, 23);
		frame.getContentPane().add(buttonFi);
		
		buttonTr = new JRadioButton("Trabant");
		buttonTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Class5.showPage();
			}
		});
		buttonTr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonTr.setBounds(147, 232, 109, 23);
		frame.getContentPane().add(buttonTr);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(buttonPeg);
		bg.add(buttonFi);
		bg.add(buttonPeg);
	}
}
