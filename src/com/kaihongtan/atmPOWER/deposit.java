package com.kaihongtan.atmPOWER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deposit extends JFrame{

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
	    private JButton abort;
		private JTextField amountField;
		private JLabel topLabel;
		private JLabel message;
		private JButton dot;
		private JLabel background1;

	    public deposit() {
	    	super("KonG Bank");
			background1 = new JLabel(
					new ImageIcon(Toolkit.getDefaultToolkit().getImage(
							getClass().getResource("Untitled-5.png"))));
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
	        numberBackspace = new JButton ("←");
	        numberTick = new JButton ("✔");
	        abort = new JButton ("BACK");
			amountField = new JTextField (1);
			topLabel = new JLabel ("Amount to Deposit");
			message = new JLabel ("Deposit Successful!");
			dot = new JButton (".");

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
	        add (abort);
			add (amountField);
			add (topLabel);
			add (message);
			add (dot);

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
	        abort.setBounds (670, 335, 220, 90);
			amountField.setBounds (150, 140, 335, 75);
			topLabel.setBounds (150, 55, 215, 60);
			message.setBounds (490, 165, 240, 30);
			dot.setBounds (385, 435, 100, 25);
			background1.setBounds (0, 0, 944, 551);

			amountField.setFocusable(false);
			message.setVisible(false);

			number1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"1");
				}
			});
			number2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"2");
				}
			});
			number3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"3");
				}
			});
			number4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"4");
				}
			});
			number5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"5");
				}
			});
			number6.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"6");
				}
			});
			number7.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"7");
				}
			});
			number8.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"8");
				}
			});
			number9.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"9");
				}
			});
			number0.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"0");
				}
			});
			number00.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+"00");
				}
			});
			dot.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					amountField.setText(amountField.getText()+".");
				}
			});
			numberBackspace.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(amountField.getText().length() == 0){
						message.setText("Nothing to remove!");
						message.setVisible(true);}
					else{amountField.setText(amountField.getText().substring(0, amountField.getText().length() - 1));}
				}
			});
			numberTick.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(amountField.getText().isEmpty()){
						message.setText("Please enter an amount!");
						message.setVisible(true);
					}
					else if (amountField.getText().matches("[0.00-9.00]+")) {
						if(Double.parseDouble(amountField.getText())>0){
							balanceInquiry.balanceMoney = balanceInquiry.balanceMoney
									+ Double.parseDouble(amountField.getText());
							message.setText("Deposit Successful!");
							message.setVisible(true);
							amountField.setText("");}

						else{
							message.setText("No Negative Values!");
							message.setVisible(true);
						}

					} else {
						message.setText("Please insert amount properly!");
						message.setVisible(true);
					}
				}
			});
			abort.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new mainMenu();
					dispose();
				}
			});
	        topLabel.setFont(new Font("Sans Serif", Font.PLAIN,24));
	        amountField.setFont(new Font("Sans Serif", Font.PLAIN,32));
	        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			setResizable(false);
	        pack();
	        setVisible (true);
	    }



	

}

