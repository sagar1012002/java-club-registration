package ClubRegistration;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import javax.swing.ImageIcon;


public class Frontpage {
	
	static Connection connection;
	static Statement st1;
	static ResultSet rs1;
	static String namelogin;
	


	public Frontpage(String name) {
		
		namelogin = name;
		frontpage();
	}





	public static void main(String[] args) {
		
		
		
		
	}
	

	
	public static void frontpage() {
		
		
		
		
		//frame starts
		Frame frame = new Frame();
		
		
		Button home = new Button("HOME");
		home.setBounds(0,80,300,30);
		frame.add(home);
		

		// club membership button
		Button applyClubRegistration = new Button("Apply for Club Membership");
		applyClubRegistration.setBounds(0,160,300,30);
		frame.add(applyClubRegistration);
		applyClubRegistration.addActionListener(new ActionListener() {
			// use button to open membership page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				ClubMembership.clubmembership();
			}
		});
		
		//club supervisor button
		Button applyClubsupervisor = new Button("Apply for Club supervisor");
		applyClubsupervisor.setBounds(0,240,300,30);
		frame.add(applyClubsupervisor);
		applyClubsupervisor.addActionListener(new ActionListener() {
			// use button to open supervisor page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				ClubSupervisor.clubsupervisor();
			}
		});

		// create club button
		Button applyCreateClub = new Button("Apply to Create Club *");
		applyCreateClub.setBounds(0,320,300,30);
		frame.add(applyCreateClub);
		applyCreateClub.addActionListener(new ActionListener() {
			// use button to open to create club page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				CreateClub.createclub();
			}
		});
		
		// certificates button
		Button certificates = new Button("Certificates");
		certificates.setBounds(0,400,300,30);
		frame.add(certificates);
		certificates.addActionListener(new ActionListener() {
			// use button to open certificates page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Certificates.certificates();
			}
		});
		
		// feedback button
		Button feedback = new Button("Feedback");
		feedback.setBounds(0,480,300,30);
		frame.add(feedback);
		feedback.addActionListener(new ActionListener() {
			// use button to open feedback page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Feedback.feedback();
			}
		});
		
		// contact details button
		Button contactDetails = new Button("Contact Details");
		contactDetails.setBounds(0,560,300,30);
		frame.add(contactDetails);
		contactDetails.addActionListener(new ActionListener() {
			// use button to open contact details page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				ContactDetails.contactdetails();
			}
		});
		
		// email address button
		Button emails = new Button("Email Address");
		emails.setBounds(0,640,300,30);
		frame.add(emails);
		emails.addActionListener(new ActionListener() {
			// use button to open email address page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				EmailAddress.emailaddress();
			}
		});
		
		// logout button
		Button logout = new Button("Logout");
		logout.setBounds(0,720,300,30);
		frame.add(logout);
		logout.addActionListener(new ActionListener() {
			// use button to open login page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				//Loginpage l = new Loginpage();
				Loginpage.loginpage();
			}
		});
		
		
		
//		Button applyClubRegistration = new Button("Apply for Club Registration");
//		applyClubRegistration.setBounds(0,100,300,30);
//		frame.add(applyClubRegistration);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Button ssh = new Button("SSH GROUP");
		ssh.setBounds(1420,40,100,28);
		frame.add(ssh);
		ssh.addActionListener(new ActionListener(){
			
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				
				Frame donate = new Frame();
				donate.setBounds(775,67,650,400);
				
				Label line1 = new Label("THANKS FOR VISITING OUR APP.");
				line1.setBounds(100,100,400,30);
				Font line1Font = new Font("Verdana",Font.BOLD,25);
				line1.setFont(line1Font);
				donate.add(line1);
				
				Label line2 = new Label("IF U WANT TO DONATE MONEY ");
				line2.setBounds(100,140,400,30);
				Font line2Font = new Font("Verdana",Font.BOLD,25);
				line2.setFont(line2Font);
				donate.add(line2);
				Label line3 = new Label("YOU CAN PAY THROUGH UPI.");
				line3.setBounds(100,180,400,30);
				Font line3Font = new Font("Verdana",Font.BOLD,25);
				line3.setFont(line3Font);
				donate.add(line3);
				Label line4 = new Label("OUR UPI ID : 1234567890@PAYTM");
				line4.setBounds(100,220,400,30);
				Font line4Font = new Font("Verdana",Font.BOLD,25);
				line4.setFont(line4Font);
				donate.add(line4);
				
				Button userProfile = new Button("USER PROFILE");
				userProfile.setBounds(80,300,130,30);
				userProfile.setBackground(Color.black);
				userProfile.setForeground(Color.white);
				donate.add(userProfile);
				userProfile.addActionListener(new ActionListener() {
					// use button to open membership page
					@Override
					public void actionPerformed(ActionEvent arg0) {
						donate.setVisible(false);
						frame.setVisible(false);
						Frontpage.frontpage();
					}
				});
				
//				JLabel upiscan = new JLabel();
//				upiscan.setBounds(260,270,100,100);
//				upiscan.setBackground(Color.red);
//				ImageIcon icon = new ImageIcon("D:\\entertainment\\upi_id.jpeg");
//				Image img = icon.getImage();
//				Image imagescale = img.getScaledInstance(upiscan.getWidth(),upiscan.getHeight(),Image.SCALE_SMOOTH);
//				ImageIcon scaleIcon = new ImageIcon(imagescale);
//				upiscan.setIcon(scaleIcon);
//				donate.add(upiscan);
				
				Button logoutdonate = new Button("Logout");
				logoutdonate.setBounds(500,300,100,30);
				logoutdonate.setBackground(Color.black);
				logoutdonate.setForeground(Color.white);
				donate.add(logoutdonate);
				logoutdonate.addActionListener(new ActionListener() {
					// use button to open login page
					@Override
					public void actionPerformed(ActionEvent arg0) {
						donate.setVisible(false);
						frame.setVisible(false);
						Loginpage.loginpage();
					}
				});
				
				
				donate.addWindowListener (new WindowAdapter() {    
			        @Override
			        public void windowClosing (WindowEvent e) {    
			            donate.dispose();    
			        }    
			    });  
				
				donate.setBackground(Color.orange);
				donate.setLayout(null);
				donate.setVisible(true);
			}
		});
		
		Label title = new Label("CLUB REGISTRATION",Label.CENTER);
		title.setBounds(10,10,290,80);
		Font titleFont = new Font("verdana",Font.BOLD, 20);
		title.setFont(titleFont);
		title.setBackground(Color.pink);
		frame.add(title);
		
		Label owner = new Label("   MAINTAIN AND DESIGNED BY SSH GROUP , KARE");
		owner.setBounds(315,765,1085,40);
		Font ownerFont = new Font("Verdana", Font.BOLD,14);
		owner.setFont(ownerFont);
		owner.setBackground(Color.black);
		owner.setForeground(Color.white);
		frame.add(owner);
		Label owner1 = new Label("Version 1.0.0");
		owner1.setBounds(1400,765,120,40);
		owner1.setBackground(Color.black);
		owner1.setForeground(Color.white);
		frame.add(owner1);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String name=null;
		String aadhar_number=null;
		//String dob=null;
		String degree=null;
		String address=null;
		
		
		try {
			//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			connection = DriverManager.getConnection("jdbc:ucanaccess://frontpage.accdb"); 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	
		try {
			st1 = connection.createStatement();
			rs1 = st1.executeQuery("Select * from frontpage where Registration_Number like '"+namelogin+"'  ");
			rs1.next();
			 name = rs1.getString("Name");
			 aadhar_number = rs1.getString("Aadhar_Number");
			// dob = rs1.getString("dob");
			 degree = rs1.getString("Degree");
			 address = rs1.getString("Address");

			
		}catch(Exception e) {
			System.out.println("error");
		}
		
	
		// label for heading
		Label frontpageHeading = new Label("PERSONAL DETAILS", Label.CENTER);
		frontpageHeading.setBounds(300,80,1250,30);
		Font frontpageHeadingFont = new Font("Verdana", Font.BOLD, 25);
		frontpageHeading.setFont(frontpageHeadingFont);
		frontpageHeading.setBackground(Color.pink);
		frame.add(frontpageHeading);
		
		// label for notice
		Label clubRegistrationNotice = new Label("IF YOU HAVE ANY QUERY RELATED TO CLUB GO TO THE CONTACT DETAILS", Label.CENTER);
		clubRegistrationNotice.setBounds(300,720,1250,30);
		Font clubRegistrationNoticeFont = new Font("Verdana", Font.BOLD, 20);
		clubRegistrationNotice.setFont(clubRegistrationNoticeFont);
		clubRegistrationNotice.setBackground(Color.RED);
		frame.add(clubRegistrationNotice);
		
				// label for heading
				Label frontpagenameheading = new Label();
				frontpagenameheading.setText("        NAME : " +name );
				frontpagenameheading.setBounds(400,160,1000,30);
				Font frontpagenameheadingFont = new Font("Verdana", Font.BOLD, 20);
				frontpagenameheading.setFont(frontpagenameheadingFont);
				frontpagenameheading.setBackground(Color.pink);
				frontpagenameheading.setForeground(Color.black);
				frame.add(frontpagenameheading);
				
				// label for heading
				Label frontpageregnoheading = new Label();
				frontpageregnoheading.setText("        REGISTRATION NUMBER : "+namelogin);
				frontpageregnoheading.setBounds(400,240,1000,30);
				Font frontpageregnoheadingFont = new Font("Verdana", Font.BOLD, 20);
				frontpageregnoheading.setFont(frontpageregnoheadingFont);
				frontpageregnoheading.setBackground(Color.pink);
				frontpageregnoheading.setForeground(Color.black);
				frame.add(frontpageregnoheading);
				
				// label for heading
				Label frontpageclassheading = new Label();
				frontpageclassheading.setText("        CLASS : "+degree);
				frontpageclassheading.setBounds(400,320,1000,30);
				Font frontpageclassheadingFont = new Font("Verdana", Font.BOLD, 20);
				frontpageclassheading.setFont(frontpageclassheadingFont);
				frontpageclassheading.setBackground(Color.pink);
				frontpageclassheading.setForeground(Color.black);
				frame.add(frontpageclassheading);
				
				// label for heading
				Label frontpageyearheading = new Label();
				frontpageyearheading.setText("        YEAR : 2ND YEAR");
				frontpageyearheading.setBounds(400,400,1000,30);
				Font frontpageyearheadingFont = new Font("Verdana", Font.BOLD, 20);
				frontpageyearheading.setFont(frontpageyearheadingFont);
				frontpageyearheading.setBackground(Color.pink);
				frontpageyearheading.setForeground(Color.black);
				frame.add(frontpageyearheading);
				
				// label for heading
				Label frontpageaadharheading = new Label();
				frontpageaadharheading.setText("        AADHAR NUMBER : " +aadhar_number);
				frontpageaadharheading.setBounds(400,480,1000,30);
				Font frontpageaadharheadingFont = new Font("Verdana", Font.BOLD, 20);
				frontpageaadharheading.setFont(frontpageaadharheadingFont);
				frontpageaadharheading.setBackground(Color.pink);
				frontpageaadharheading.setForeground(Color.black);
				frame.add(frontpageaadharheading);
		
				// label for heading
				Label frontpageaddressheading = new Label();
				frontpageaddressheading.setText("        ADDRESS : "+address);
				frontpageaddressheading.setBounds(400,560,1000,30);
				Font frontpageaddressheadingFont = new Font("Verdana", Font.BOLD, 20);
				frontpageaddressheading.setFont(frontpageaddressheadingFont);
				frontpageaddressheading.setBackground(Color.pink);
				frontpageaddressheading.setForeground(Color.black);
				frame.add(frontpageaddressheading);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// properties of the frame
		Label l1 = new Label();
		l1.setBounds(0,0,300,1080);
		l1.setBackground(Color.pink);
		frame.add(l1);
		
		
		
		frame.addWindowListener (new WindowAdapter() {    
	        public void windowClosing (WindowEvent e) {    
	            frame.dispose();    
	        }    
	    });  
		
		Image windowicon = Toolkit.getDefaultToolkit().getImage("D:\\entertainment\\kalasalingum.PNG");  
		frame.setIconImage(windowicon);
		
		
		frame.setBackground(Color.cyan);
		frame.setSize(1920, 1080);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}


	

}
