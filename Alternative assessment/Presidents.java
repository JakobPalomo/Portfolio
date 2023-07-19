package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Presidents extends JFrame implements ActionListener{
	JLabel lbl1,lblLogo,lblIcon,lblPres;
	JTextField sN,LN,pS;
	JButton createAcc,signUp,btnNext;
	JPanel p1,p2;
	JRadioButton pres1,pres2,pres3,pres4,pres5,pres6,pres7,pres8,pres9,pres10,abstain;
	JLabel iconPres1,iconPres2,iconPres3,iconPres4,iconPres5,iconPres6,iconPres7,iconPres8,iconPres9,iconPres10;
	ButtonGroup presiBtn;

	public Presidents() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);

		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lbl1=new JLabel("Presidents (Choose 1)");
		p1.setLayout(null);
		
		lbl1.setBounds(347, 83, 269, 43);
		lbl1.setFont(new Font ("Arial Black",Font.BOLD,20));
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
		
		iconPres1 = new JLabel("");
		pres1 = new JRadioButton("Leni");
		iconPres2 = new JLabel("");
		pres2 = new JRadioButton("Leni");
		iconPres3 = new JLabel("");
		pres3 = new JRadioButton("Leni");
		iconPres4 = new JLabel("");
		pres4 = new JRadioButton("Leni");
		iconPres5 = new JLabel("");
		pres5 = new JRadioButton("Leni");
		iconPres6 = new JLabel("");
		pres6 = new JRadioButton("Leni");
		iconPres7 = new JLabel("");
		pres7 = new JRadioButton("Leni");
		iconPres8 = new JLabel("");
		pres8 = new JRadioButton("Leni");
		iconPres9 = new JLabel("");
		pres9 = new JRadioButton("Leni");
		iconPres10 = new JLabel("");
		pres10 = new JRadioButton("Leni");
		btnNext = new JButton("Next");
		abstain = new JRadioButton("ABSTAIN");
		
		presiBtn =new ButtonGroup();
		presiBtn.add(pres1);presiBtn.add(pres2);presiBtn.add(pres3);presiBtn.add(pres4);presiBtn.add(pres5);
		presiBtn.add(pres6);presiBtn.add(pres7);presiBtn.add(pres8);presiBtn.add(pres9);presiBtn.add(pres10);
		
		p1.add(lblLogo);p1.add(lblIcon);p1.add(lbl1);
		p1.add(p2);
		getContentPane().add(p1);
		
		iconPres1 = new JLabel("");
		pres1 = new JRadioButton("Leni");
		
		iconPres1.setBounds(76, 157, 93, 87);
		p1.add(iconPres1);
		iconPres1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
			
		pres1.setBounds(72, 268, 109, 23);
		p1.add(pres1);
		
		iconPres2.setBounds(253, 157, 93, 87);
		p1.add(iconPres2);
		iconPres2.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		
		pres2.setBounds(253, 268, 109, 23);
		p1.add(pres2);

		iconPres3.setBounds(427, 157, 93, 87);
		p1.add(iconPres3);
		
		pres3.setBounds(423, 268, 109, 23);
		p1.add(pres3);
	
		iconPres4.setBounds(585, 157, 93, 87);
		p1.add(iconPres4);
		
		pres4.setBounds(585, 268, 109, 23);
		p1.add(pres4);
		
		pres5.setBounds(762, 268, 109, 23);
		p1.add(pres5);
		
		iconPres5.setBounds(762, 157, 93, 87);
		p1.add(iconPres5);
		
		iconPres6.setBounds(80, 313, 93, 87);
		p1.add(iconPres6);
		
		pres6.setBounds(76, 424, 109, 23);
		p1.add(pres6);
		
		iconPres7.setBounds(253, 313, 93, 87);
		p1.add(iconPres7);
		
		pres7.setBounds(253, 424, 109, 23);
		p1.add(pres7);
		
		iconPres8.setBounds(427, 313, 93, 87);
		p1.add(iconPres8);
		
		pres8.setBounds(423, 424, 109, 23);
		p1.add(pres8);
		
		iconPres9.setBounds(585, 313, 93, 87);
		p1.add(iconPres9);
		
		pres9.setBounds(585, 424, 109, 23);
		p1.add(pres9);
		
		pres10.setBounds(762, 424, 109, 23);
		p1.add(pres10);
		
		iconPres10.setBounds(762, 313, 93, 87);
		p1.add(iconPres10);
		
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNext.setBounds(837, 483, 161, 43);
		p1.add(btnNext);
		
		abstain.setBounds(423, 483, 109, 23);
		p1.add(abstain);
				
		setSize(1024,576);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		Presidents gui=new Presidents();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
