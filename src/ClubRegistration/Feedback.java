package ClubRegistration;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Feedback {

	
	static Connection connection;
	static PreparedStatement ps1;
	
	public Feedback() {

		
	}
	
	public static void main(String[] args) {
		
		feedback();
	}
	
	public static void feedback(){
		
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
//		feedback.addActionListener(new ActionListener() {
//			// use button to open feedback page
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				frame.setVisible(false);
//				Feedback.feedback();
//			}
//		});
		
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
// label for heading
Label clubRegistrationHeading = new Label("   FEEDBACK  ", Label.CENTER);
clubRegistrationHeading.setBounds(300,80,1250,30);
Font clubRegistrationHeadingFont = new Font("Verdana", Font.BOLD, 26);
clubRegistrationHeading.setFont(clubRegistrationHeadingFont);
clubRegistrationHeading.setBackground(Color.pink);
frame.add(clubRegistrationHeading);

// label for notice
Label clubRegistrationNotice = new Label("IF YOU HAVE ANY QUERY RELATED TO CLUB GO TO THE CONTACT DETAILS", Label.CENTER);
clubRegistrationNotice.setBounds(300,720,1250,30);
Font clubRegistrationNoticeFont = new Font("Verdana", Font.BOLD, 20);
clubRegistrationNotice.setFont(clubRegistrationNoticeFont);
clubRegistrationNotice.setBackground(Color.RED);
frame.add(clubRegistrationNotice);

// label for name
Label name = new Label("  NAME  ");
name.setBounds(370,160,200,30);
Font nameFont = new Font("Verdana", Font.BOLD, 14);
name.setFont(nameFont);
name.setBackground(Color.lightGray);
frame.add(name);

//textfield for name
TextField nameField = new TextField();
Font nameFieldFont = new Font("Verdana", 0, 14);
nameField.setFont(nameFieldFont);
nameField.setBounds(570,160,200,30);
frame.add(nameField);

//label for father's name
Label fatherName = new Label("  FATHER'S NAME  ");
fatherName.setBounds(370,240,200,30);
Font fatherNameFont = new Font("Verdana", Font.BOLD, 14);
fatherName.setFont(fatherNameFont);
fatherName.setBackground(Color.lightGray);
frame.add(fatherName);

//textfield for father's name
TextField fatherNameField = new TextField();
Font fatherNameFieldFont = new Font("Verdana", 0, 14);
fatherNameField.setFont(fatherNameFieldFont);
fatherNameField.setBounds(570,240,200,30);
frame.add(fatherNameField);

//label for registration_number
Label registrationNumber = new Label("  REGISTRATION NUMBER  ");
registrationNumber.setBounds(370,320,200,30);
Font registrationNumberFont = new Font("Verdana", Font.BOLD, 14);
registrationNumber.setFont(registrationNumberFont);
registrationNumber.setBackground(Color.lightGray);
frame.add(registrationNumber);

//textfield for registration_number
TextField registrationNameField = new TextField();
Font registrationNameFieldFont = new Font("Verdana", 0, 14);
registrationNameField.setFont(registrationNameFieldFont);
registrationNameField.setBounds(570,320,200,30);
frame.add(registrationNameField);

//label for year
Label year = new Label("  YEAR  ");
year.setBounds(370,400,200,30);
Font yearFont = new Font("Verdana", Font.BOLD, 14);
year.setFont(yearFont);
year.setBackground(Color.lightGray);
frame.add(year);

//textfield for year
Choice yearField = new Choice();
Font yearFieldFont = new Font("Verdana", 0, 19);
yearField.setFont(yearFieldFont);
yearField.setBounds(570,400,200,30);
yearField.add("         I st YEAR");
yearField.add("         II nd YEAR");
yearField.add("         III rd YEAR");
yearField.add("         IV th YEAR");
yearField.add("         V th YEAR");
frame.add(yearField);

//label for contact details
Label contactNumber = new Label("  CONTACT NUMBER  ");
contactNumber.setBounds(370,480,200,30);
Font contactNumberFont = new Font("Verdana", Font.BOLD, 14);
contactNumber.setFont(contactNumberFont);
contactNumber.setBackground(Color.lightGray);
frame.add(contactNumber);

//textfield for contact details
TextField contactNumberField = new TextField();
Font contactNumberFieldFont = new Font("Verdana", 0, 14);
contactNumberField.setFont(contactNumberFieldFont);
contactNumberField.setBounds(570,480,200,30);
frame.add(contactNumberField);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




//label for email id
Label emailID = new Label("  EMAIL ID  ");
emailID.setBounds(900,160,200,30);
Font emailIDFont = new Font("Verdana", Font.BOLD, 14);
emailID.setFont(emailIDFont);
emailID.setBackground(Color.lightGray);
frame.add(emailID);

//textfield for email id
TextField emailIDField = new TextField();
Font emailIDFieldFont = new Font("Verdana", 0, 14);
emailIDField.setFont(emailIDFieldFont);
emailIDField.setBounds(1100,160,300,30);
frame.add(emailIDField);



//label for Address
Label address = new Label("  FEEDBACK ",Label.CENTER);
address.setBounds(900,240,500,30);
Font addressFont = new Font("Verdana", Font.BOLD, 14);
address.setFont(addressFont);
address.setBackground(Color.lightGray);
frame.add(address);


//textfield for address1
TextField address1Field = new TextField();
Font address1FieldFont = new Font("Verdana", 0, 14);
address1Field.setFont(address1FieldFont);
address1Field.setBounds(900,280,500,30);
frame.add(address1Field);

//textfield for address2
TextField address2Field = new TextField();
Font address2FieldFont = new Font("Verdana", 0, 14);
address2Field.setFont(address2FieldFont);
address2Field.setBounds(900,320,500,30);
frame.add(address2Field);

//textfield for address3
TextField address3Field = new TextField();
Font address3FieldFont = new Font("Verdana", 0, 14);
address3Field.setFont(address3FieldFont);
address3Field.setBounds(900,360,500,30);
frame.add(address3Field);

//textfield for address4
TextField address4Field = new TextField();
Font address4FieldFont = new Font("Verdana", 0, 14);
address4Field.setFont(address4FieldFont);
address4Field.setBounds(900,400,500,30);
frame.add(address4Field);


// submit button
Button submit = new Button("SUBMIT");
submit.setBounds(1300,640,100,30);
submit.setBackground(Color.black);
submit.setForeground(Color.white);
frame.add(submit);
// new sub frame with message and ok button and (* submit all the information in a table)
submit.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {

	
	
	String regno,name, Fname, year;
	
	String contactnumber, email_id, address1 = null, address2=null,address3=null,address4=null;
	
	
	name = nameField.getText();
	Fname = fatherNameField.getText();
	year = yearField.getSelectedItem();
	contactnumber = contactNumberField.getText();
	email_id = emailIDField.getText();
	address1 = address1Field.getText(); 
	address2 = address2Field.getText(); 
	address3 = address3Field.getText(); 
	address4 = address4Field.getText(); 
	regno = registrationNameField.getText();
	address1 =  address1 + " "+address2 + " "+address3+" "+address4;
	

	
	try {
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		connection = DriverManager.getConnection("jdbc:ucanaccess://feedback.accdb"); 
		
		ps1 = connection.prepareStatement("insert into feedback ( Registration_number ,Name,FatherName,Year,Contact,"
				+ " Email, Feedback)values(?,?,?,?,?,?,?)");
		
		ps1.setString(1, regno);
		ps1.setString(2, name);
		ps1.setString(3, Fname);
		ps1.setString(4, year);
		ps1.setString(5, contactnumber);
		ps1.setString(6, email_id);
		ps1.setString(7, address1);
		ps1.executeUpdate();

	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
	
//new f2 sub frame
Frame f2 = new Frame();
f2.setBounds(800,500,300,150);

//information message
Label clubmembershipmessage = new Label();
clubmembershipmessage.setText(" THANKS FOR THE FEEDBACK" );
clubmembershipmessage.setBounds(30,50,310,50);
clubmembershipmessage.setBackground(Color.orange);
Font clubmembershipmessageFont = new Font("Verdana", Font.BOLD,14);
clubmembershipmessage.setFont(clubmembershipmessageFont);
f2.add(clubmembershipmessage);

//ok button
Button exit = new Button(" OK ");
exit.setBounds(200,100,60,30);
exit.setBackground(Color.black);
exit.setForeground(Color.white);
f2.add(exit);
// ok button close the sub frame as well as the current frame and open a new frame of same page
exit.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
f2.setVisible(false);
frame.setVisible(false);
Feedback.feedback();
}
});

f2.setBackground(Color.orange);
f2.setLayout(null);
f2.setVisible(true);

}

});


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


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
