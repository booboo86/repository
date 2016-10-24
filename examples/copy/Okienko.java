package day1.examples.copy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Okienko extends JFrame implements ActionListener
{
	
	public Okienko()
	{
		setSize(500,500); 
		setLayout(null);
		JButton button = new JButton("/podaj 1"); 
		add(button); 
		button.setBounds(100, 50, 100,20);;
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println(new Date());
		
	}




}