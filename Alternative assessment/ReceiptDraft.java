package com.proj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ReceiptDraft extends JFrame implements ActionListener{
	JLabel lbl1,LastN,lblLogo,lblIcon;
	JTextField LN;
	JButton exit;
	JPanel p1,p2;
	JTextField presi,vPresi,sen1,sen2,sen3,sen4,sen5,sen6,sen7,sen8,sen9,sen10,sen11,sen12,partyList;
	JLabel lblVicepresident,lblSenators,lblPartylist,lblVotingReceipt;

	public ReceiptDraft() {
		super("ElectroVote");
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);
		
		p1.setBackground(new Color(217,217,217));
		
		lblLogo = new JLabel("ElectroVote");
		lblIcon = new JLabel("");
		lbl1=new JLabel("Thank you for voting");
		exit=new JButton("Done");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		lblLogo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblLogo.setBounds(103, 26, 161, 32);
		
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\DraftProj\\imgs\\logo.png"));
		lblIcon.setBounds(0, 0, 93, 87);
		lbl1.setBounds(375, 92, 242, 43);
		lbl1.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		exit.setBounds(745, 479, 236, 47);
		exit.setFont(new Font("Courier New", Font.PLAIN, 20));
		
		p1.setLayout(null);
			
		p1.add(lbl1);p1.add(lblLogo);p1.add(lblIcon);p1.add(exit);
		getContentPane().add(p1);p1.add(p2);
		presi = new JTextField();
		presi.setBounds(124, 214, 194, 20);
		p1.add(presi);
		

		JLabel lblNewLabel = new JLabel("President");
		lblNewLabel.setFont(new Font("Corbel Light", Font.PLAIN, 15));
		lblNewLabel.setBounds(87, 194, 83, 20);
		p1.add(lblNewLabel);
		
		lblVicepresident = new JLabel("Vice-President");
		lblVicepresident.setFont(new Font("Corbel Light", Font.PLAIN, 15));
		lblVicepresident.setBounds(375, 194, 130, 20);
		p1.add(lblVicepresident);
		
		vPresi = new JTextField();
		vPresi.setColumns(10);
		vPresi.setBounds(412, 214, 194, 20);
		p1.add(vPresi);
		
		lblSenators = new JLabel("Senators");
		lblSenators.setFont(new Font("Corbel Light", Font.PLAIN, 15));
		lblSenators.setBounds(87, 258, 83, 20);
		p1.add(lblSenators);
		
		sen1 = new JTextField();
		sen1.setColumns(10);
		sen1.setBounds(124, 289, 194, 20);
		p1.add(sen1);
		
		sen2 = new JTextField();
		sen2.setColumns(10);
		sen2.setBounds(124, 320, 194, 20);
		p1.add(sen2);
		
		sen3 = new JTextField();
		sen3.setColumns(10);
		sen3.setBounds(124, 351, 194, 20);
		p1.add(sen3);
		
		sen4 = new JTextField();
		sen4.setColumns(10);
		sen4.setBounds(124, 381, 194, 20);
		p1.add(sen4);
		
		sen5 = new JTextField();
		sen5.setColumns(10);
		sen5.setBounds(412, 289, 194, 20);
		p1.add(sen5);
		
		sen6 = new JTextField();
		sen6.setColumns(10);
		sen6.setBounds(412, 320, 194, 20);
		p1.add(sen6);
		
		sen7 = new JTextField();
		sen7.setColumns(10);
		sen7.setBounds(412, 351, 194, 20);
		p1.add(sen7);
		
		sen8 = new JTextField();
		sen8.setColumns(10);
		sen8.setBounds(413, 381, 194, 20);
		p1.add(sen8);
		
		sen9 = new JTextField();
		sen9.setColumns(10);
		sen9.setBounds(654, 289, 194, 20);
		p1.add(sen9);
		
		sen10 = new JTextField();
		sen10.setColumns(10);
		sen10.setBounds(654, 320, 194, 20);
		p1.add(sen10);
		
		sen11 = new JTextField();
		sen11.setColumns(10);
		sen11.setBounds(654, 351, 194, 20);
		p1.add(sen11);
		sen12 = new JTextField();
		sen12.setColumns(10);
		sen12.setBounds(654, 381, 194, 20);
		p1.add(sen12);
		
		lblPartylist = new JLabel("Partylist");
		lblPartylist.setFont(new Font("Corbel Light", Font.PLAIN, 15));
		lblPartylist.setBounds(87, 414, 83, 20);
		p1.add(lblPartylist);
		
		partyList = new JTextField();
		partyList.setColumns(10);
		partyList.setBounds(124, 439, 194, 20);
		p1.add(partyList);
		
		lblVotingReceipt = new JLabel("Voting Receipt");
		lblVotingReceipt.setFont(new Font("Corbel Light", Font.PLAIN, 20));
		lblVotingReceipt.setBounds(422, 146, 137, 20);
		p1.add(lblVotingReceipt);
				
		setSize(1024,576);
		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		ReceiptDraft gui=new ReceiptDraft();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}