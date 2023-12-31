package Car_Park;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class AboutUs {

	private JFrame frmAboutUs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
					window.frmAboutUs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutUs = new JFrame();
		frmAboutUs.getContentPane().setBackground(Color.WHITE);
		frmAboutUs.getContentPane().setFont(new Font("Sitka Text", Font.PLAIN, 11));
		frmAboutUs.setTitle("ABOUT US");
		frmAboutUs.setBounds(100, 100, 761, 442);
		frmAboutUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAboutUs.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CAR PARKING MANAGEMENT SYSTEM");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 17));
		label.setBounds(43, 0, 352, 44);
		frmAboutUs.getContentPane().add(label);
		
		JButton AbtnHome = new JButton("HOME");
		AbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();   // calling home window will come.
				Home.main(null);
				frmAboutUs.setVisible(false);
			}
		});
		AbtnHome.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnHome.setBounds(0, 46, 106, 30);
		frmAboutUs.getContentPane().add(AbtnHome);
		
		JButton AbtnCarPa = new JButton("CAR PARKING");
		AbtnCarPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarParking cp= new CarParking();   //calling car parking window will come.
				CarParking.main(null);
				frmAboutUs.setVisible(false);
			}
		});
		AbtnCarPa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnCarPa.setBounds(128, 46, 116, 30);
		frmAboutUs.getContentPane().add(AbtnCarPa);
		
		JButton AbtnCarRe = new JButton("CAR RELEASE");
		AbtnCarRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarRele cr= new CarRele();   //calling car release window will come.
				CarRele.main(null);
				frmAboutUs.setVisible(false);
			}
		});
		AbtnCarRe.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnCarRe.setBounds(267, 46, 116, 30);
		frmAboutUs.getContentPane().add(AbtnCarRe);
		
		JButton AbtnAbout = new JButton("ABOUT US");
		AbtnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs au= new AboutUs();  //calling about window will come.
				AboutUs.main(null);
				frmAboutUs.setVisible(false);
			}
		});
		AbtnAbout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnAbout.setBounds(393, 46, 106, 30);
		frmAboutUs.getContentPane().add(AbtnAbout);
		
		JButton AbtnCont = new JButton("CONTACT US");
		AbtnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact c= new Contact();  //calling contact window will come.
				Contact.main(null);
				frmAboutUs.setVisible(false);
			}
		});
		AbtnCont.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnCont.setBounds(523, 46, 106, 30);
		frmAboutUs.getContentPane().add(AbtnCont);
		
		JButton AbtnLogout = new JButton("LOG OUT");
		AbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN li= new LOGIN();
				LOGIN.main(null);
				frmAboutUs.setVisible(false);
			}
		});
		AbtnLogout.setFont(new Font("Sitka Text", Font.BOLD, 11));
		AbtnLogout.setBounds(639, 46, 106, 30);
		frmAboutUs.getContentPane().add(AbtnLogout);
		
		JTextPane txtpnEstablishedInThe = new JTextPane();
		txtpnEstablishedInThe.setBackground(new Color(192, 192, 192));
		txtpnEstablishedInThe.setForeground(SystemColor.desktop);
		txtpnEstablishedInThe.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtpnEstablishedInThe.setText("Our HANDS ON approach, and ensuring that each location address to our mini project model, has contributed greatly to our success.\r\n\r\nWe understand how expensive PUNE can be and strive to make all our locations very AFFORDABLE without compromising on service! We also understand that our Customers have choices when it comes to choosing a Parking Facility, and we make this choice easier with value and service.Our future plans are to expand selectively with more locations throughout the area.\r\n\r\nWe invite you to visit and tour any of our facilities to experience for yourself the level of quality and value our Parking Space. We look forward to serving all your parking needs and hope you will choose OUR VEHICAL PARKING\u2026.. \r\n\r\nSincerely \r\nSMART PARKING SYSTEM  ");
		txtpnEstablishedInThe.setBounds(0, 71, 745, 332);
		frmAboutUs.getContentPane().add(txtpnEstablishedInThe);
	}
}