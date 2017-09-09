package scientific_calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Calculator {
	
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	
	public Calculator()
	{
		frame.setSize(340, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.RED,4);
		panel.setBorder(border);
		
		panel.add(textarea);
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		
		textarea.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,32);
		textarea.setFont(font);
	}

}
