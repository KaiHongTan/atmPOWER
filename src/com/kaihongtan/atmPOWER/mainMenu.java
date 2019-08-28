package com.kaihongtan.atmPOWER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends JFrame{

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
		private JButton balance;
		private JButton deposit;
		private JButton withdraw;
		private JButton bankrupt;
		private JLabel balanceLabel;
		private JLabel withdrawLabel;
		private JLabel depositLabel;
		private JLabel bankruptLabel;
	private JLabel background1;

	    public mainMenu() {
			super("KonG Bank");
			background1 = new JLabel(
					new ImageIcon(Toolkit.getDefaultToolkit().getImage(
							getClass().getResource("Untitled-3.png"))));
			background1.setLayout(new FlowLayout(FlowLayout.CENTER));
			number1 = new JButton("1");
			number5 = new JButton("5");
			number6 = new JButton("6");
			number4 = new JButton("4");
			number3 = new JButton("3");
			number2 = new JButton("2");
			number7 = new JButton("7");
			number8 = new JButton("8");
			number9 = new JButton("9");
			number00 = new JButton("00");
			number0 = new JButton("0");
			numberBackspace = new JButton("←");
			numberTick = new JButton("✔");
			insertCard = new JButton("ABORT");
			balance = new JButton ("·");
			deposit = new JButton ("·");
			withdraw = new JButton ("·");
			bankrupt = new JButton ("·");
			balanceLabel = new JLabel ("Balance Inquiry");
			withdrawLabel = new JLabel ("Withdraw Funds");
			depositLabel = new JLabel ("Deposit Funds");
			bankruptLabel = new JLabel ("DECLARE BANKUPTCY");


			//adjust size and set layout
			setPreferredSize(new Dimension(944, 574));
			setLayout(null);

			//add components
			add(background1);
			add(number1);
			add(number5);
			add(number6);
			add(number4);
			add(number3);
			add(number2);
			add(number7);
			add(number8);
			add(number9);
			add(number00);
			add(number0);
			add(numberBackspace);
			add(numberTick);
			add(insertCard);
			add (balance);
			add (deposit);
			add (withdraw);
			add (bankrupt);
			add (balanceLabel);
			add (withdrawLabel);
			add (depositLabel);
			add (bankruptLabel);

			//set component bounds (only needed by Absolute Positioning)
			number1.setBounds(150, 300, 100, 25);
			number5.setBounds(270, 345, 100, 25);
			number6.setBounds(385, 345, 100, 25);
			number4.setBounds(150, 345, 100, 25);
			number3.setBounds(385, 300, 100, 25);
			number2.setBounds(270, 300, 100, 25);
			number7.setBounds(150, 390, 100, 25);
			number8.setBounds(270, 390, 100, 25);
			number9.setBounds(385, 390, 100, 25);
			number00.setBounds(150, 435, 100, 25);
			number0.setBounds(270, 435, 100, 25);
			numberBackspace.setBounds(500, 300, 100, 25);
			numberTick.setBounds(500, 435, 100, 25);
			insertCard.setBounds(670, 335, 220, 90);
			balance.setBounds (120, 110, 40, 25);
			deposit.setBounds (120, 150, 40, 25);
			withdraw.setBounds (435, 110, 40, 25);
			bankrupt.setBounds (435, 150, 40, 25);
			balanceLabel.setBounds (165, 110, 100, 25);
			withdrawLabel.setBounds (480, 110, 100, 25);
			depositLabel.setBounds (165, 150, 100, 25);
			bankruptLabel.setBounds (480, 150, 130, 25);
			background1.setBounds (0, 0, 944, 551);

			insertCard.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new insertCard();
					dispose();
				}
			});
			balance.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new balanceInquiry();
					dispose();
				}
			});
			deposit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new deposit();
					dispose();
				}
			});
			withdraw.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new withdraw();
					dispose();
				}
			});
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			pack();
			setVisible(true);
		}}



	


