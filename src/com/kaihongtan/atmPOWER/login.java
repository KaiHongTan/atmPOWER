package com.kaihongtan.atmPOWER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class login extends JFrame{

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
	    private JPasswordField pinField;
	    private JLabel pinLabel;
	    private JLabel loginLabel;
		private JLabel wrongPIN;
		private String pinNumber = "6969";
		private JLabel background1;

	    public login() {
	    	super("KonG Bank");
			background1 = new JLabel(
					new ImageIcon(Toolkit.getDefaultToolkit().getImage(
							getClass().getResource("Untitled-2.png"))));
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
	        abort = new JButton ("ABORT");
	        pinField = new JPasswordField (5);
	        pinLabel = new JLabel ("Insert your PIN Number to authenticate:");
	        loginLabel = new JLabel ("LOGIN");
			wrongPIN = new JLabel ("Wrong PIN Number!");

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
	        add (pinField);
	        add (pinLabel);
	        add (loginLabel);
	        add	(wrongPIN);

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
	        pinField.setBounds (150, 190, 335, 30);
	        pinLabel.setBounds (150, 155, 230, 35);
	        loginLabel.setBounds (150, 25, 100, 25);
			wrongPIN.setBounds (490, 195, 120, 20);
			background1.setBounds (0, 0, 944, 551);
			pinField.setFocusable(false);
			wrongPIN.setVisible(false);

			number1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"1");
				}
			});
			number2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"2");
				}
			});
			number3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"3");
				}
			});
			number4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"4");
				}
			});
			number5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"5");
				}
			});
			number6.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"6");
				}
			});
			number7.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"7");
				}
			});
			number8.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"8");
				}
			});
			number9.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"9");
				}
			});
			number0.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"0");
				}
			});
			number00.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pinField.setText(pinField.getText()+"00");
				}
			});
			numberBackspace.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(pinField.getPassword().length == 0){
						wrongPIN.setText("Nothing to remove!");
						wrongPIN.setVisible(true);}
					else{pinField.setText(pinField.getText().substring(0, pinField.getText().length() - 1));}
				}
			});
			numberTick.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(pinField.getText().isEmpty()){
						wrongPIN.setText("Please enter a PIN");
						wrongPIN.setVisible(true);
					}
					else if(pinField.getText().equals(pinNumber)){
						new mainMenu();
						dispose();
					}
					else{
						wrongPIN.setText("Wrong PIN Number");
						wrongPIN.setVisible(true);
					}
				}
			});
			abort.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new insertCard();
					dispose();
				}
			});
	        loginLabel.setFont(new Font("Sans Serif", Font.PLAIN,32));
	        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			setResizable(false);
	        pack();
	        setVisible (true);
	    }



	

}

