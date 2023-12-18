package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class CreatingAc {
	
	public static ArrayList<createAccount> create = new ArrayList<createAccount>();
	public static HashMap<createAccount, Boolean> hp = new HashMap<createAccount, Boolean>();

	private JFrame frmCreatAccount;
	private JTextField nameTxt;
	private JTextField passTxt;
	private JTextField emailTxt;
	private JTextField mobTxt;
	private String Name,Pass,email,mobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatingAc window = new CreatingAc();
					window.frmCreatAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreatingAc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreatAccount = new JFrame();
		frmCreatAccount.getContentPane().setBackground(Color.WHITE);
		frmCreatAccount.setTitle("Create Account");
		frmCreatAccount.setBounds(100, 100, 761, 442);
		frmCreatAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreatAccount.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		label.setBounds(76, 11, 530, 44);
		frmCreatAccount.getContentPane().add(label);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(137, 82, 254, 30);
		frmCreatAccount.getContentPane().add(nameTxt);
		nameTxt.setColumns(10);
		
		passTxt = new JTextField();
		passTxt.setColumns(10);
		passTxt.setBounds(136, 128, 254, 30);
		frmCreatAccount.getContentPane().add(passTxt);
		
		emailTxt = new JTextField();
		emailTxt.setColumns(10);
		emailTxt.setBounds(137, 177, 254, 30);
		frmCreatAccount.getContentPane().add(emailTxt);
		
		mobTxt = new JTextField();
		mobTxt.setColumns(10);
		mobTxt.setBounds(137, 232, 254, 30);
		frmCreatAccount.getContentPane().add(mobTxt);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object obj = arg0.getSource();
				
				try{
					
				    FileWriter pr=new FileWriter("createAccount.txt",true);
					BufferedWriter bw=new BufferedWriter(pr);
					String p=nameTxt.getText();	
					String a=passTxt.getText();
					String ip=emailTxt.getText();
					String po=mobTxt.getText();
					 //pr.append(" ").println();
					 
						bw.write(a+" "+p+" "+ip+" "+po);
						 // bw.append("\n");
						bw.newLine();
						bw.close();
					}
					catch(Exception e){
						System.out.print("Exception");
					}
				
				
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmCreatAccount.setVisible(false);
			}
		});
		btnNewButton.setBounds(338, 342, 89, 38);
		frmCreatAccount.getContentPane().add(btnNewButton);
		
	
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(49, 88, 103, 14);
		frmCreatAccount.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(49, 136, 84, 14);
		frmCreatAccount.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(49, 185, 46, 14);
		frmCreatAccount.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(49, 240, 78, 14);
		frmCreatAccount.getContentPane().add(lblNewLabel_4);
	}
}