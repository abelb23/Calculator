import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;



public class FrameEditor extends JFrame{
	
	JButton equals;
	
	FrameEditor() {

		this.setSize(500, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Calculator");
		this.getContentPane().setBackground(new Color(118, 118, 118));
		this.setLayout(null);
		
		/*
		ImageIcon icon = new ImageIcon("b2039b74-6284-42c2-aefb-6bd972e9a192.png");
		this.setIconImage(icon.getImage());
		*/
		
		try {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		
		catch (Exception x) {
			System.out.println("broken");
		}
		
		equals = new JButton();
		equals.setBounds(375, 580, 100, 75);
		
		this.add(equals);
		
		equals.addActionListener(e -> System.out.println("hi"));
		
		equals.setText("=");
		equals.setFocusable(false);
		equals.setFont(new Font("Inter", Font.BOLD, 35));
		equals.setOpaque(true);
		equals.setBorderPainted(false);
		equals.setContentAreaFilled(true);
		equals.setBackground(Color.LIGHT_GRAY);
		
		
		
	}


}
