package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WelcomeDraft extends JFrame implements ActionListener{
	JLabel lblWelcome,lblVote,LastN,lblLogo,lblIcon;
	JTextField LN;
	JButton proceedVote;
	JPanel p1,p2;
	private JTextPane txtInstructions;

	public WelcomeDraft() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);
		
		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lblWelcome=new JLabel("Welcome");
		lblVote=new JLabel("How to vote");
		proceedVote=new JButton("Proceed to voting");
		proceedVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
		lblWelcome.setBounds(402, 89, 175, 43);
		lblWelcome.setFont(new Font ("Arial Black",Font.BOLD,30));
			
		lblVote.setBounds(423, 177, 121, 32);
		lblVote.setFont(new Font("Corbel Light", Font.BOLD, 20));
		
		proceedVote.setBounds(339, 451, 314, 47);
		proceedVote.setFont(new Font("Courier New", Font.PLAIN, 20));
		
		p1.setLayout(null);
			
		p1.add(lblWelcome);
		p1.add(lblVote);p1.add(lblLogo);p1.add(lblIcon);p1.add(proceedVote);
		getContentPane().add(p1);p1.add(p2);
		
		txtInstructions = new JTextPane();
		txtInstructions.setBounds(268, 235, 435, 162);
		txtInstructions.setText("Each of the group members will be tackling "
				+ "a social problem of their choice that could be seen in"
				+ " the movie “Tinimbang ka Ngunit Kulang”. The main "
				+ "content of the presentation will contain the exact scene, social problem");
		p1.add(txtInstructions);
				
		setSize(1024,576);
		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		WelcomeDraft gui=new WelcomeDraft();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}