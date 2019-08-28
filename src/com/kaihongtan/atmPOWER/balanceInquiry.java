package com.kaihongtan.atmPOWER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class balanceInquiry extends JFrame{
		//Declare buttons
	    private JButton number1;
	    private JButton number5;
	    private JButton number6;
	    private JButton number4;
	    private JButton number3;
	    private JButton number2;
	    private JButton number7;
	    private JButton number8;
	    private JButton number9;
	    private JButton number00;
	    private JButton number0;
	    private JButton numberBackspace;
	    private JButton numberTick;
	    private JButton insertCard;
		private JLabel topLabel;
		private JLabel rmLabel;
		private JLabel balanceLabel;
		private JLabel interpretLabel;
		private JLabel background1;
	DecimalFormat fmt = new DecimalFormat("0.00");
		public static double balanceMoney = 1000.00;
		boolean richornot = true;
	    public balanceInquiry() {
	    	super("KonG Bank");
			background1 = new JLabel(
					new ImageIcon(Toolkit.getDefaultToolkit().getImage(
							getClass().getResource("Untitled-4.png"))));
			background1.setLayout(new FlowLayout(FlowLayout.CENTER));
	        number1 = new JButton ("1");
	        number5 = new JButton ("5");
	        number6 = new JButton ("6");
	        number4 = new JButton ("4");
	        number3 = new JButton ("3");
	        number2 = new JButton ("2");
	        number7 = new JButton ("7");
	        number8 = new JButton ("8");
	        number9 = new JButton ("9");
	        number00 = new JButton ("00");
	        number0 = new JButton ("0");
	        numberBackspace = new JButton ("â†�");
	        numberTick = new JButton ("âœ”");
	        insertCard = new JButton ("BACK");
			topLabel = new JLabel ("Your Balance is");
			rmLabel = new JLabel ("RM");
			balanceLabel = new JLabel ("null");
			interpretLabel = new JLabel ("You are considered POOR");

	        //adjust size and set layout
	        setPreferredSize (new Dimension (944, 574));
	        setLayout (null);
	        
	        //add components
			add(background1);
	        add (number1);
	        add (number5);
	        add (number6);
	        add (number4);
	        add (number3);
	        add (number2);
	        add (number7);
	        add (number8);
	        add (number9);
	        add (number00);
	        add (number0);
	        add (numberBackspace);
	        add (numberTick);
	        add (insertCard);
			add (topLabel);
			add (rmLabel);
			add (balanceLabel);
			add (interpretLabel);

	        //set component bounds (only needed by Absolute Positioning)
	        number1.setBounds (150, 300, 100, 25);
	        number5.setBounds (270, 345, 100, 25);
	        number6.setBounds (385, 345, 100, 25);
	        number4.setBounds (150, 345, 100, 25);
	        number3.setBounds (385, 300, 100, 25);
	        number2.setBounds (270, 300, 100, 25);
	        number7.setBounds (150, 390, 100, 25);
	        number8.setBounds (270, 390, 100, 25);
	        number9.setBounds (385, 390, 100, 25);
	        number00.setBounds (150, 435, 100, 25);
	        number0.setBounds (270, 435, 100, 25);
	        numberBackspace.setBounds (500, 300, 100, 25);
	        numberTick.setBounds (500, 435, 100, 25);
	        insertCard.setBounds (670, 335, 220, 90);
			topLabel.setBounds (150, 40, 400, 25);
			rmLabel.setBounds (155, 120, 80, 30);
			balanceLabel.setBounds (285, 120, 200, 30);
			interpretLabel.setBounds (600, 110, 300, 35);
			background1.setBounds (0, 0, 944, 551);
	        insertCard.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new mainMenu();
	                dispose();
	            }
	        });
			topLabel.setFont(new Font("Sans Serif", Font.PLAIN,32));
			rmLabel.setFont(new Font("Sans Serif", Font.PLAIN,32));
			balanceLabel.setFont(new Font("Sans Serif", Font.PLAIN,32));
			interpretLabel.setFont(new Font("Sans Serif", Font.PLAIN,24));
	        balanceLabel.setText(fmt.format(balanceMoney));
	        


			
	        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	        pack();
	        setResizable(false);
	        setVisible (true);
	    }}



	


