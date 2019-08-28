package com.kaihongtan.atmPOWER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class insertCard extends JFrame{

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
	    private JLabel background1;
	    private ImageIcon icon;


	    public insertCard() {
	    	super("KonG Bank");

	    	background1 = new JLabel(
					new ImageIcon(Toolkit.getDefaultToolkit().getImage(
							getClass().getResource("Untitled-1.png"))));
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
	        insertCard = new JButton ("INSERT CARD");

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

	        //set component bounds (only needed by Absolute Positioning)
			background1.setBounds (0, 0, 944, 551);
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

	        insertCard.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new login();
	                dispose();
	            }
	        });
	        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			setResizable(false);
	        pack();

	        setVisible (true);
	    }



	
public static void main (String[] args) {
    new insertCard();

}
}

