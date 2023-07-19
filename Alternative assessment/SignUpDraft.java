package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SignUpDraft extends JFrame implements ActionListener{
	JLabel lbl1,stdNo,LastN,pass,lblLogo,lblIcon,lblConfirmPassword;
	JTextField sN,LN,pS,cPass;
	JButton createAcc,signUp;
	JPanel p1,p2;

	public SignUpDraft() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);
		
		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lbl1=new JLabel("Create a new account");
		stdNo=new JLabel("Student Number: ");
		sN=new JTextField();
		pass=new JLabel("Password: ");
		pS=new JTextField();
		createAcc=new JButton("Create Account");
		signUp=new JButton("Sign Up");
		lblConfirmPassword = new JLabel("Confirm Password: ");
		
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
			
		lbl1.setBounds(304, 118, 412, 43);
		lbl1.setFont(new Font ("Arial Black",Font.BOLD,30));
			
		stdNo.setBounds(156, 186, 161, 32);
		stdNo.setFont(new Font("Corbel Light", Font.BOLD, 20));
		sN.setBounds(281, 217, 464, 32);
			
		pass.setBounds(156, 260, 121, 32);
		pass.setFont(new Font("Corbel Light", Font.BOLD, 20));
		pS.setBounds(281, 288, 464, 32);
		
		lblConfirmPassword.setFont(new Font("Corbel Light", Font.BOLD, 20));
		lblConfirmPassword.setBounds(156, 342, 189, 32);
		cPass = new JTextField();
		cPass.setBounds(281, 365, 464, 32);
		
		createAcc.setBounds(338, 446, 314, 47);
		createAcc.setFont(new Font("Courier New", Font.PLAIN, 20));
		
		p1.setLayout(null);
			
		p1.add(lbl1);
		p1.add(stdNo);p1.add(sN);
		p1.add(pass);p1.add(lblLogo);
		p1.add(pS);p1.add(lblIcon);
		
		p1.add(createAcc);
		getContentPane().add(p1);
		p1.add(p2);p1.add(cPass);
		p1.add(lblConfirmPassword);
				
		setSize(1024,576);
		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		SignUpDraft gui=new SignUpDraft();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
