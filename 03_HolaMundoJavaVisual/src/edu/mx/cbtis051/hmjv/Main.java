package edu.mx.cbtis051.hmjv;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hola Mundo Java Visual");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 12, 435, 47);
		contentPane.add(lblNewLabel);
		
		JLabel nobre = new JLabel("aqui pongan su nombre");
		nobre.setFont(new Font("Dialog", Font.BOLD, 15));
		nobre.setHorizontalAlignment(SwingConstants.CENTER);
		nobre.setBounds(54, -39, 435, 47);
		contentPane.add(nobre);
		
		JPanel panel = new JPanel();
		panel.setBounds(82, 141, 161, 10);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(255, 111, 3, 3);
		contentPane.add(scrollPane);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(113, 198, 188, -20);
		contentPane.add(formattedTextField);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(95, 198, 129, 21);
		contentPane.add(menuBar);
		
	}
}
