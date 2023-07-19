package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VicePresidentsDraft extends JFrame implements ActionListener{
	JLabel lbl1,lblLogo,lblIcon,lblPres;
	JTextField sN,LN,pS;
	JButton createAcc,signUp;
	JPanel p1,p2;
	ButtonGroup vPres;

	public VicePresidentsDraft() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);

		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lbl1=new JLabel("Vice Presidents (Choose 1)");
		p1.setLayout(null);
		
		lbl1.setBounds(347, 83, 321, 43);
		lbl1.setFont(new Font ("Arial Black",Font.BOLD,20));
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
		
		p1.add(lblLogo);p1.add(lblIcon);p1.add(lbl1);
		p1.add(p2);
		getContentPane().add(p1);
		
		JLabel lblVPIcon1 = new JLabel("");
		lblVPIcon1.setBounds(76, 157, 93, 87);
		p1.add(lblVPIcon1);
		lblVPIcon1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		
		JRadioButton vPres1 = new JRadioButton("Leni");
		vPres1.setBounds(72, 268, 109, 23);
		p1.add(vPres1);
		
		JLabel lblVPIcon2 = new JLabel("");
		lblVPIcon2.setBounds(253, 157, 93, 87);
		p1.add(lblVPIcon2);
		lblVPIcon2.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		
		JRadioButton vPres2 = new JRadioButton("Leni");
		vPres2.setBounds(253, 268, 109, 23);
		p1.add(vPres2);
		
		JLabel lblVPIcon3 = new JLabel("");
		lblVPIcon3.setBounds(427, 157, 93, 87);
		p1.add(lblVPIcon3);
		
		JRadioButton vPres3 = new JRadioButton("Leni");
		vPres3.setBounds(423, 268, 109, 23);
		p1.add(vPres3);
		
		JLabel lblVPIcon4 = new JLabel("");
		lblVPIcon4.setBounds(585, 157, 93, 87);
		p1.add(lblVPIcon4);
				
		JRadioButton vPres5 = new JRadioButton("Leni");
		vPres5.setBounds(762, 268, 109, 23);
		p1.add(vPres5);
		
		JLabel lblVPIcon5 = new JLabel("");
		lblVPIcon5.setBounds(762, 157, 93, 87);
		p1.add(lblVPIcon5);
		
		JRadioButton vPres4 = new JRadioButton("Leni");
		vPres4.setBounds(585, 268, 109, 23);
		p1.add(vPres4);
		
		JLabel lblVPIcon6 = new JLabel("");
		lblVPIcon6.setBounds(159, 313, 93, 87);
		p1.add(lblVPIcon6);
		
		JRadioButton vPres6 = new JRadioButton("Leni");
		vPres6.setBounds(155, 424, 109, 23);
		p1.add(vPres6);
		
		JLabel lblVPIcon7 = new JLabel("");
		lblVPIcon7.setBounds(335, 313, 93, 87);
		p1.add(lblVPIcon7);
		
		JRadioButton vPres7 = new JRadioButton("Leni");
		vPres7.setBounds(335, 424, 109, 23);
		p1.add(vPres7);
		
		JLabel lblVPIcon8 = new JLabel("");
		lblVPIcon8.setBounds(508, 313, 93, 87);
		p1.add(lblVPIcon8);
		
		JRadioButton vPres8 = new JRadioButton("Leni");
		vPres8.setBounds(504, 424, 109, 23);
		p1.add(vPres8);
		
		JLabel lblVPIcon9 = new JLabel("");
		lblVPIcon9.setBounds(674, 313, 93, 87);
		p1.add(lblVPIcon9);
		
		JRadioButton vPres9 = new JRadioButton("Leni");
		vPres9.setBounds(674, 424, 109, 23);
		p1.add(vPres9);

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNext.setBounds(837, 483, 161, 43);
		p1.add(btnNext);
		
		JRadioButton abstain = new JRadioButton("ABSTAIN");
		abstain.setBounds(423, 483, 109, 23);
		p1.add(abstain);
		
		vPres= new ButtonGroup();
		vPres.add(vPres1);vPres.add(vPres2);vPres.add(vPres3);vPres.add(vPres4);vPres.add(vPres5);
		vPres.add(vPres6);vPres.add(vPres7);vPres.add(vPres8);vPres.add(vPres9);vPres.add(abstain);
		
		setSize(1024,576);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		VicePresidentsDraft gui=new VicePresidentsDraft();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
