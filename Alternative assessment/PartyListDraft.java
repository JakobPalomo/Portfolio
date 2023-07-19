package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PartyListDraft extends JFrame implements ActionListener{
	JLabel lbl1,LastN,lblLogo,lblIcon;
	JTextField LN;
	JPanel p1,p2;
	JButton btnNext;
	ButtonGroup pList;
	JRadioButton party1,party2,party3,party4,party5,party6,party7,party8,party9,party10,abstain;
	JRadioButton party11,party12,party13,party14,party15,party16,party17,party18,party19,party20;

	public PartyListDraft() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);
		
		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lbl1=new JLabel("Partylist (Choose 1)");
		
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
		lbl1.setBounds(369, 94, 254, 43);
		lbl1.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		p1.setLayout(null);
			
		p1.add(lbl1);p1.add(lblLogo);p1.add(lblIcon);
		getContentPane().add(p1);p1.add(p2);
		party1 = new JRadioButton("New radio button");
		party1.setBounds(155, 180, 189, 23);
		p1.add(party1);
		party2 = new JRadioButton("New radio button");
		party2.setBounds(155, 218, 189, 23);
		p1.add(party2);
		party3 = new JRadioButton("New radio button");
		party3.setBounds(155, 255, 189, 23);
		p1.add(party3);
		party4 = new JRadioButton("New radio button");
		party4.setBounds(155, 293, 189, 23);
		p1.add(party4);
		party5 = new JRadioButton("New radio button");
		party5.setBounds(155, 331, 189, 23);
		p1.add(party5);
		party6 = new JRadioButton("New radio button");
		party6.setBounds(155, 368, 189, 23);
		p1.add(party6);
		party7 = new JRadioButton("New radio button");
		party7.setBounds(155, 407, 189, 23);
		p1.add(party7);
		party8 = new JRadioButton("New radio button");
		party8.setBounds(414, 180, 189, 23);
		p1.add(party8);
		party9 = new JRadioButton("New radio button");
		party9.setBounds(414, 218, 189, 23);
		p1.add(party9);
		party10 = new JRadioButton("New radio button");
		party10.setBounds(414, 255, 189, 23);
		p1.add(party10);
		party11 = new JRadioButton("New radio button");
		party11.setBounds(414, 293, 189, 23);
		p1.add(party11);
		party12 = new JRadioButton("New radio button");
		party12.setBounds(414, 331, 189, 23);
		p1.add(party12);
		party13 = new JRadioButton("New radio button");
		party13.setBounds(414, 368, 189, 23);
		p1.add(party13);
		party14 = new JRadioButton("New radio button");
		party14.setBounds(414, 407, 189, 23);
		p1.add(party14);
		party15 = new JRadioButton("New radio button");
		party15.setBounds(664, 180, 189, 23);
		p1.add(party15);
		party16 = new JRadioButton("New radio button");
		party16.setBounds(664, 218, 189, 23);
		p1.add(party16);
		party17 = new JRadioButton("New radio button");
		party17.setBounds(664, 255, 189, 23);
		p1.add(party17);
		party18 = new JRadioButton("New radio button");
		party18.setBounds(664, 293, 189, 23);
		p1.add(party18);
		party19 = new JRadioButton("New radio button");
		party19.setBounds(664, 331, 189, 23);
		p1.add(party19);
		party20 = new JRadioButton("New radio button");
		party20.setBounds(664, 368, 189, 23);
		p1.add(party20);
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNext.setBounds(809, 469, 161, 43);
		p1.add(btnNext);
		
		abstain = new JRadioButton("ABSTAIN");
		abstain.setBounds(432, 483, 109, 23);
		p1.add(abstain);
		
		pList= new ButtonGroup();
		pList.add(party1);pList.add(party2);pList.add(party3);pList.add(party4);pList.add(party5);
		pList.add(party6);pList.add(party7);pList.add(party8);pList.add(party9);pList.add(party10);
		pList.add(party11);pList.add(party12);pList.add(party13);pList.add(party14);pList.add(party15);
		pList.add(party16);pList.add(party17);pList.add(party18);pList.add(party19);pList.add(party20);
		pList.add(abstain);
					
		setSize(1024,576);
		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		PartyListDraft gui=new PartyListDraft();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}