package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginDraft extends JFrame implements ActionListener{
	JLabel lbl1,stdN,LastN,pass,lblLogo,lblIcon;
	JTextField sN,LN,pS;
	JButton login,signUp;
	JPanel p1,p2;

	public LoginDraft() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);
		
		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lbl1=new JLabel("Log In");
		stdN=new JLabel("Student Number: ");
		sN=new JTextField();
		pass=new JLabel("Password: ");
		pS=new JTextField();
		login=new JButton("Login");
		signUp=new JButton("Sign Up");
		
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
		lbl1.setBounds(423, 130, 126, 43);
		lbl1.setFont(new Font ("Arial Black",Font.BOLD,30));
			
		stdN.setBounds(156, 190, 161, 32);
		stdN.setFont(new Font("Corbel Light", Font.BOLD, 20));
		sN.setBounds(281, 218, 464, 32);
			
		pass.setBounds(156, 258, 121, 32);
		pass.setFont(new Font("Corbel Light", Font.BOLD, 20));
		pS.setBounds(281, 281, 464, 32);
			
		login.setBounds(339, 376, 314, 47);
		login.setFont(new Font("Courier New", Font.PLAIN, 20));
		
		signUp.setBounds(339, 451, 314, 47);
		signUp.setFont(new Font("Courier New", Font.PLAIN, 20));
		
		p1.setLayout(null);
			
		p1.add(lbl1);
		p1.add(stdN);p1.add(sN);
		p1.add(pass);p1.add(lblLogo);
		p1.add(pS);p1.add(lblIcon);
		p1.add(login);p1.add(signUp);
		getContentPane().add(p1);p1.add(p2);
				
		setSize(1024,576);
		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		LoginDraft gui=new LoginDraft();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}