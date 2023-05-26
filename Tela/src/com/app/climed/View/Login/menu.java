package com.app.climed.View.Login;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTree;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -14, 895, 652);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, -32, 208, 684);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(menu.class.getResource("/Images/Captura de tela_2023-05-09_17-04-41.png")));
		lblNewLabel.setBounds(0, 69, 269, 67);
		panel_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 156, 184, 2);
		panel_1.add(separator);
		
		JLabel lblGerenciar = new JLabel("Gerenciar Pacientes");
		lblGerenciar.setBounds(20, 170, 171, 15);
		panel_1.add(lblGerenciar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(246, 245, 244));
		panel_2.setBounds(206, 0, 677, 618);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTree tree =  new JTree();
		tree.setBounds(12, 23, 653, 662);
		panel_2.add(tree);
	}
}