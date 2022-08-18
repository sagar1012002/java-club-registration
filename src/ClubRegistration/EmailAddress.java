package ClubRegistration;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EmailAddress {

	public EmailAddress() {

	}
	
	public static void main(String[] args) {
		
		emailaddress();
	}
	public static void emailaddress() {
		
		//frame starts
		Frame frame = new Frame();
		
		Button home = new Button("HOME");
		home.setBounds(0,80,300,30);
		frame.add(home);
		home.addActionListener(new ActionListener() {
			// use button to open membership page
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Frontpage.frontpage();
			}
		});
		

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
//		emails.addActionListener(new ActionListener() {
//			// use button to open email address page
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				frame.setVisible(false);
//				EmailAddress.emailaddress();
//			}
//		});
		
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
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		// label for heading
		Label emailHeading = new Label("EMAIL - ADDRESS", Label.CENTER);
		emailHeading.setBounds(300,160,1250,30);
		Font emailHeadingFont = new Font("Verdana", Font.BOLD, 25);
		emailHeading.setFont(emailHeadingFont);
		emailHeading.setBackground(Color.pink);
		frame.add(emailHeading);
		
		// label for heading
				Label addressdetails = new Label("        1. 9920004749@klu.ac.in");
				addressdetails.setBounds(340,240,700,30);
				Font addressdetailsFont = new Font("Verdana", Font.BOLD, 20);
				addressdetails.setFont(addressdetailsFont);
				addressdetails.setBackground(Color.red);
				frame.add(addressdetails);
				// label for heading
				Label addressdetails1 = new Label("        2. 9920004623@klu.ac.in");
				addressdetails1.setBounds(340,320,700,30) ;
				Font addressdetails1Font = new Font("Verdana", Font.BOLD, 20);
				addressdetails1.setFont(addressdetails1Font);
				addressdetails1.setBackground(Color.red);
				frame.add(addressdetails1);
		
				// label for heading
				Label addressdetails2 = new Label("        3. 9920004696@klu.ac.in");
				addressdetails2.setBounds(340,400,700,30);
				Font addressdetails2Font = new Font("Verdana", Font.BOLD, 20);
				addressdetails2.setFont(addressdetails2Font);
				addressdetails2.setBackground(Color.red);
				frame.add(addressdetails2);
				
				// label for heading
				Label addressdetails3 = new Label("        4. info@kalasalingam.ac.in");
				addressdetails3.setBounds(340,480,700,30);
				Font addressdetails3Font = new Font("Verdana", Font.BOLD, 20);
				addressdetails3.setFont(addressdetails3Font);
				addressdetails3.setBackground(Color.red);
				frame.add(addressdetails3);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
