package ClubRegistration;

import java.awt.Button;
import java.awt.Checkbox;
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

public class CreateClub {

	public CreateClub() {

	}
	
	static Connection connection;
	static PreparedStatement ps1;
	
	public static void main(String[] args) {
	
		createclub();
	}
	
	public static void createclub() {
		
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
//		applyCreateClub.addActionListener(new ActionListener() {
//			// use button to open to create club page
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				frame.setVisible(false);
//				CreateClub.createclub();
//			}
//		});
		
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
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
// label for heading
Label createclubHeading = new Label("APPLICATION FORM TO CREATE CLUB", Label.CENTER);
createclubHeading.setBounds(300,80,1250,30);
Font createclubHeadingFont = new Font("Verdana", Font.BOLD, 25);
createclubHeading.setFont(createclubHeadingFont);
createclubHeading.setBackground(Color.pink);
frame.add(createclubHeading);

//label for heading1
Label createclubHeading1 = new Label("REQUIED A MINIMUM OF 10 STUDENTS TO MAKE THE CLUB OFFICIAL", Label.CENTER);
createclubHeading1.setBounds(300,115,1250,15);
Font createclubHeading1Font = new Font("Verdana", Font.BOLD, 10);
createclubHeading1.setFont(createclubHeading1Font);
createclubHeading1.setBackground(Color.pink);
frame.add(createclubHeading1);

// label for notice
Label createclubNotice = new Label("IF YOU HAVE ANY QUERY RELATED TO CLUB GO TO THE CONTACT DETAILS", Label.CENTER);
createclubNotice.setBounds(300,720,1250,30);
Font createclubNoticeFont = new Font("Verdana", Font.BOLD, 20);
createclubNotice.setFont(createclubNoticeFont);
createclubNotice.setBackground(Color.RED);
frame.add(createclubNotice);

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
yearField.add(" I st YEAR");
yearField.add(" II nd YEAR");
yearField.add(" III rd YEAR");
yearField.add(" IV th YEAR");
yearField.add(" V th YEAR");
frame.add(yearField);

//label for contact
Label contact = new Label("  CONTACT NUMBER  ");
contact.setBounds(370,480,200,30);
Font contactFont = new Font("Verdana", Font.BOLD, 14);
contact.setFont(contactFont);
contact.setBackground(Color.lightGray);
frame.add(contact);

//textfield for contact
TextField contactField = new TextField();
Font contactFieldFont = new Font("Verdana", 0, 14);
contactField.setFont(contactFieldFont);
contactField.setBounds(570,480,200,30);
frame.add(contactField);

//label for club name
Label clubName = new Label(" TITLE OF THE CLUB  ");
clubName.setBounds(370,560,200,30);
Font clubNameFont = new Font("Verdana", Font.BOLD, 14);
clubName.setFont(clubNameFont);
clubName.setBackground(Color.lightGray);
frame.add(clubName);

//textfield for club name
TextField clubNameField = new TextField();
Font clubNameFieldFont = new Font("Verdana", 0, 14);
clubNameField.setFont(clubNameFieldFont);
clubNameField.setBounds(570,560,200,30);
frame.add(clubNameField);

//label for course name
Label coursename = new Label("WHICH COURSE IS BELONG TO THE CLUB");
coursename.setBounds(370,640,400,30);
Font coursenameFont = new Font("Verdana", Font.BOLD, 14);
coursename.setFont(coursenameFont);
coursename.setBackground(Color.lightGray);
frame.add(coursename);

//textfield for course name
TextField coursenameField = new TextField();
Font coursenameFieldFont = new Font("Verdana", 0, 14);
coursenameField.setFont(coursenameFieldFont);
coursenameField.setBounds(370,675,400,25);
frame.add(coursenameField);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// label for FACILITIES
Label facilities = new Label("   WHAT TYPES OF FACILITIES ARE REQUIRED FOR THIS CLUB");
facilities.setBounds(900,160,500,30);
Font facilitiesFont = new Font("Verdana", Font.BOLD, 14);
facilities.setFont(facilitiesFont);
facilities.setBackground(Color.lightGray);
frame.add(facilities);

//textfield for FACILITIES field
TextField facilitiesField = new TextField();
Font facilitiesFieldFont = new Font("Verdana", 0, 14);
facilitiesField.setFont(facilitiesFieldFont);
facilitiesField.setBounds(900,195,500,25);
frame.add(facilitiesField);

//textfield for facilitiesfield
TextField facilitiesField1 = new TextField();
facilitiesField1.setBounds(900,230,500,25);
Font facilitiesField1Font = new Font("Verdana", 0, 14);
facilitiesField1.setFont(facilitiesField1Font);
frame.add(facilitiesField1);

//label for EQUIPMENTS
Label equipments = new Label("  LIST OF EQUIPMENTS THAT MIGHT BE REQUIRED FOR THIS CLUB ");
equipments.setBounds(900,280,500,30);
Font equipmentsFont = new Font("Verdana", Font.BOLD, 14);
equipments.setFont(equipmentsFont);
equipments.setBackground(Color.lightGray);
frame.add(equipments);

//textfield for equipments
TextField equipmentsField = new TextField();
Font equipmentsFieldFont = new Font("Verdana", 0, 14);
equipmentsField.setFont(equipmentsFieldFont);
equipmentsField.setBounds(900,315,500,25);
frame.add(equipmentsField);

//label for purposeOfClub
Label purposeOfClub = new Label("  PURPOSE OF THE CLUB ");
purposeOfClub.setBounds(900,370,500,30);
Font purposeOfClubFont = new Font("Verdana", Font.BOLD, 14);
purposeOfClub.setFont(purposeOfClubFont);
purposeOfClub.setBackground(Color.lightGray);
frame.add(purposeOfClub);

//textfield for purposeOfClubField
TextField purposeOfClubField = new TextField();
Font purposeOfClubFieldFont = new Font("Verdana", 0, 14);
purposeOfClubField.setFont(purposeOfClubFieldFont);
purposeOfClubField.setBounds(900,405,500,25);
frame.add(purposeOfClubField);

//textfield forpurposeOfClubField1
TextField purposeOfClubField1 = new TextField();
Font purposeOfClubField1Font = new Font("Verdana", 0, 14);
purposeOfClubField1.setFont(purposeOfClubField1Font);
purposeOfClubField1.setBounds(900,435,500,25);
frame.add(purposeOfClubField1);

//label for hosteler or day scholar
Label typeOfStudent = new Label("TYPE OF STUDENT REQUIRED");
typeOfStudent.setBounds(900,480,230,30);
Font typeOfStudentFont = new Font("Verdana", Font.BOLD, 14);
typeOfStudent.setFont(typeOfStudentFont);
typeOfStudent.setBackground(Color.lightGray);
frame.add(typeOfStudent);


//CheckboxGroup typeOfStudentCheckbox = new CheckboxGroup();
Checkbox hostelerCheckbox = new Checkbox(" HOSTELER");
hostelerCheckbox.setBounds(1140,480,110,30);
Font hostelerCheckboxFont = new Font("Verdana", Font.BOLD, 14);
hostelerCheckbox.setFont(hostelerCheckboxFont);
hostelerCheckbox.setBackground(Color.lightGray);
frame.add(hostelerCheckbox);
Checkbox dayScholarCheckbox = new Checkbox(" DAY SCHOLAR");
dayScholarCheckbox.setBounds(1250,480,150,30);
Font dayScholarCheckboxFont = new Font("Verdana", Font.BOLD, 14);
dayScholarCheckbox.setFont(dayScholarCheckboxFont);
dayScholarCheckbox.setBackground(Color.lightGray);
frame.add(dayScholarCheckbox);


//label for Address1
Label address1 = new Label("  ADDRESS   ");
address1.setBounds(900,540,200,30);
Font address1Font = new Font("Verdana", Font.BOLD, 14);
address1.setFont(address1Font);
address1.setBackground(Color.lightGray);
frame.add(address1);

//textfield for address1
TextField address1Field = new TextField();
Font address1FieldFont = new Font("Verdana", 0, 14);
address1Field.setFont(address1FieldFont);
address1Field.setBounds(1100,540,300,30);
frame.add(address1Field);

//label for Address2
Label address2 = new Label("  ADDRESS 1 ");
address2.setBounds(900,580,200,30);
Font address2Font = new Font("Verdana", Font.BOLD, 14);
address2.setFont(address2Font);
address2.setBackground(Color.lightGray);
frame.add(address2);

//textfield for address2
TextField address2Field = new TextField();
Font address2FieldFont = new Font("Verdana", 0, 14);
address2Field.setFont(address2FieldFont);
address2Field.setBounds(1100,580,300,30);
frame.add(address2Field);

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
	
	String regno;
	String name;
	String Fname;
	String year;
	String courseName;
	
	String clubName;
	String contactnumber;
	String facilities =null;
	String facilities1;
	String Equipments;
	String Purpose;
	String Purpose1;
	String typeofstudent=null;
	String typeofstudent1=null;
	String address=null;
	String address1 = null;
	
	
	name = nameField.getText();
	regno = registrationNameField.getText();
	Fname = fatherNameField.getText();
	year = yearField.getSelectedItem();
	contactnumber = contactField.getText();
	clubName = clubNameField.getText();
	courseName =coursenameField.getText();
	facilities = facilitiesField.getText();
	facilities1 = facilitiesField1.getText();
	facilities = facilities +" " + facilities1;
	Equipments = equipmentsField.getText();
	Purpose = purposeOfClubField.getText();
	Purpose1 = purposeOfClubField1.getText();
	Purpose = Purpose + " " + Purpose1;
	address = address1Field.getText();
	address1 = address2Field.getText();
	address = address +" "+ address1;
	
	
	//type of student check box group
	if(hostelerCheckbox.getState()) {
		typeofstudent = hostelerCheckbox.getLabel();
	}
	if(dayScholarCheckbox.getState()) {
		typeofstudent1 = dayScholarCheckbox.getLabel();
	}
	typeofstudent = typeofstudent + ","+ typeofstudent1;
	
	try {
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		connection = DriverManager.getConnection("jdbc:ucanaccess://createclub.accdb"); 
		
		ps1 = connection.prepareStatement("insert into createclub ( Registration_number ,Name,FatherName,Year,ContactNumber,ClubName,CourseName,FacilitiesRequired,"
				+ " EquipemntsRequired,PurposeofClub, TypeofStudent, Address)values(?,?,?,?,?,?,?,?,?,?,?,?)");
		
		ps1.setString(1, regno);
		ps1.setString(2, name);
		ps1.setString(3, Fname);
		ps1.setString(4, year);
		ps1.setString(5, contactnumber);
		ps1.setString(6, clubName);
		ps1.setString(7, courseName);
		ps1.setString(8, facilities);
		ps1.setString(9, Equipments);
		ps1.setString(10, Purpose);
		ps1.setString(11, typeofstudent);
		ps1.setString(12, address);
		ps1.executeUpdate();

	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
	
	
	
	
// new f2 sub frame
Frame f2 = new Frame();
f2.setBounds(700,500,500,170);

//information message
Label createclubmessage = new Label();
createclubmessage.setText("IF A MINIMUM OF 10 STUDENTS JOIN YOUR CLUB THEN " );
createclubmessage.setBounds(30,50,520,20);
createclubmessage.setBackground(Color.ORANGE);
Font createclubmessageFont = new Font("Verdana", Font.BOLD,14);
createclubmessage.setFont(createclubmessageFont);
f2.add(createclubmessage);
//information message
Label createclubmessage1 = new Label();
createclubmessage1.setText("YOUR CLUB WILL BE OFFICIAL" );
createclubmessage1.setBounds(30,75,310,20);
createclubmessage1.setBackground(Color.ORANGE);
Font createclubmessage1Font = new Font("Verdana", Font.BOLD,14);
createclubmessage1.setFont(createclubmessage1Font);
f2.add(createclubmessage1);
//information message
Label createclubmessage2 = new Label();
createclubmessage2.setText(" WE WILL INFORM YOU IF YOUR CLUB WILL BE OFFICIAL " );
createclubmessage2.setBounds(30,100,410,20);
createclubmessage2.setBackground(Color.ORANGE);
Font createclubmessage2Font = new Font("Verdana", Font.BOLD,14);
createclubmessage2.setFont(createclubmessage2Font);
f2.add(createclubmessage2);

// ok button
Button exit = new Button(" OK ");
exit.setBounds(360,120,80,30);
exit.setBackground(Color.black);
exit.setForeground(Color.white);
f2.add(exit);
// ok button close the sub frame as well as the current frame and open a new frame of same page
exit.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
f2.setVisible(false);
frame.setVisible(false);
CreateClub.createclub();
}
});

f2.setBackground(Color.ORANGE);
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
	        @Override
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
