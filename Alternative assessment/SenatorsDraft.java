package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SenatorsDraft extends JFrame implements ActionListener{
	JLabel lbl1,LastN,lblLogo,lblIcon;
	JTextField LN;
	JPanel p1,p2;
	JRadioButton sen1,sen2,sen3,sen4,sen5,sen6,sen7,sen8,sen9,sen10;
	JRadioButton sen11,sen12,sen13,sen14,sen15,sen16,sen17,sen18,sen19,sen20,abstain;
	JButton btnNext;

	public SenatorsDraft() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);
		
		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lbl1=new JLabel("Senators (Choose at most 12)");
		
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
		lbl1.setBounds(303, 94, 376, 43);
		lbl1.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		p1.setLayout(null);
			
		p1.add(lbl1);p1.add(lblLogo);p1.add(lblIcon);
		getContentPane().add(p1);p1.add(p2);
		sen1 = new JRadioButton("New radio button");
		sen1.setBounds(155, 180, 189, 23);
		p1.add(sen1);
		sen2 = new JRadioButton("New radio button");
		sen2.setBounds(155, 218, 189, 23);
		p1.add(sen2);
		sen3 = new JRadioButton("New radio button");
		sen3.setBounds(155, 255, 189, 23);
		p1.add(sen3);
		sen4 = new JRadioButton("New radio button");
		sen4.setBounds(155, 293, 189, 23);
		p1.add(sen4);
		sen5 = new JRadioButton("New radio button");
		sen5.setBounds(155, 331, 189, 23);
		p1.add(sen5);
		sen6 = new JRadioButton("New radio button");
		sen6.setBounds(155, 368, 189, 23);
		p1.add(sen6);
		sen7 = new JRadioButton("New radio button");
		sen7.setBounds(155, 407, 189, 23);
		p1.add(sen7);
		sen8 = new JRadioButton("New radio button");
		sen8.setBounds(414, 180, 189, 23);
		p1.add(sen8);
		sen9 = new JRadioButton("New radio button");
		sen9.setBounds(414, 218, 189, 23);
		p1.add(sen9);
		sen10 = new JRadioButton("New radio button");
		sen10.setBounds(414, 255, 189, 23);
		p1.add(sen10);
		sen11 = new JRadioButton("New radio button");
		sen11.setBounds(414, 293, 189, 23);
		p1.add(sen11);
		sen12 = new JRadioButton("New radio button");
		sen12.setBounds(414, 331, 189, 23);
		p1.add(sen12);
		sen13 = new JRadioButton("New radio button");
		sen13.setBounds(414, 368, 189, 23);
		p1.add(sen13);
		sen14 = new JRadioButton("New radio button");
		sen14.setBounds(414, 407, 189, 23);
		p1.add(sen14);
		sen15 = new JRadioButton("New radio button");
		sen15.setBounds(650, 180, 189, 23);
		p1.add(sen15);
		sen16 = new JRadioButton("New radio button");
		sen16.setBounds(650, 218, 189, 23);
		p1.add(sen16);
		sen17 = new JRadioButton("New radio button");
		sen17.setBounds(650, 255, 189, 23);
		p1.add(sen17);
		sen18 = new JRadioButton("New radio button");
		sen18.setBounds(650, 293, 189, 23);
		p1.add(sen18);
		sen19 = new JRadioButton("New radio button");
		sen19.setBounds(650, 331, 189, 23);
		p1.add(sen19);
		sen20 = new JRadioButton("New radio button");
		sen20.setBounds(650, 368, 189, 23);
		p1.add(sen20);
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNext.setBounds(809, 469, 161, 43);
		p1.add(btnNext);
		
		abstain = new JRadioButton("ABSTAIN");
		abstain.setBounds(432, 483, 109, 23);
		p1.add(abstain);
					
		setSize(1024,576);
		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		SenatorsDraft gui=new SenatorsDraft();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}