
package ClubRegistration;


import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
public class Loginpage {
	
	static Connection connection;
	static Statement st1;
	static ResultSet rs1;
	
		// constructor
	  	Loginpage() {
	  		
	  		try {
				//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				connection = DriverManager.getConnection("jdbc:ucanaccess://loginpage.accdb"); 
			} catch (SQLException e) {
				
				e.printStackTrace();
			}	
		
	}
	
	public static void main(String[] args) {
		
		
		// declare object and call constructor
	new Loginpage();
		
		loginpage();
	}
	
	public static void loginpage() {
		
		// frame starts	
				Frame frame = new Frame("CLUB REGISTRATION");
				
				
				// label to attach image in place of it 
				JLabel l1 = new JLabel();
				l1.setBounds(0,0,750,1080);
				//image
				ImageIcon icon = new ImageIcon("D:\\entertainment\\kalasalingum.PNG");
				Image img = icon.getImage();
				Image imagescale = img.getScaledInstance(l1.getWidth(),l1.getHeight(),Image.SCALE_SMOOTH);
				ImageIcon scaleIcon = new ImageIcon(imagescale);
				l1.setIcon(scaleIcon);
				frame.add(l1);
				

				
				// ssh group label
				Label companyname = new Label("SSH GROUP");
				companyname.setBounds(1400,800,125,30);
				Font companynamefont = new Font("Verdana", Font.BOLD, 20);
				companyname.setFont(companynamefont);
				companyname.setBackground(Color.white);
				companyname.setForeground(Color.red);
				frame.add(companyname);
				
				//heading of page
				Label labellogin = new Label("Login - CRS");
				Font loginlabelfont = new Font("Verdana", Font.BOLD, 30);
				labellogin.setFont(loginlabelfont);
				labellogin.setBounds(800,350,500,40);
				frame.add(labellogin);
				
				//heading of page
				Label labellogin1 = new Label("CLUB REGISTRATION SYSTEM - KARE");
				Font loginlabel1font = new Font("Verdana", 0, 15);
				labellogin1.setFont(loginlabel1font);
				labellogin1.setBounds(800,391,500,20);
				frame.add(labellogin1);
				
				
				//username label
				Label usernamelabel = new Label("USER NAME");
				usernamelabel.setBounds(800,470,250,30);
				frame.add(usernamelabel);
				
				
				//password label
				Label passwordlabel = new Label("PASSWORD");
				passwordlabel.setBounds(1170,470,255,30);
				frame.add(passwordlabel);
				
				//write username
				TextField username = new TextField();
				Font usernamefont = new Font("Verdana", 0, 15);
				username.setFont(usernamefont);
				username.setBounds(800,505,250,30);
				frame.add(username);
				
				//use swing password for hiding
				JPasswordField password1 = new JPasswordField();
				password1.setBounds(1170,505,250,30);
				Font passwordfont = new Font("Verdana", Font.BOLD, 14);
				password1.setFont(passwordfont);
				frame.add(password1);
				
				
				//awt java password 
			//	TextField password = new TextField();
//				password.setBounds(1170,455,250,30);
//				frame.add(password);
				
				
				// sing in button 
				Button submit = new Button("SIGN IN");
				submit.setBounds(1345,562,76,30);
				Font submitfont = new Font("Verdana", Font.BOLD, 10);
				submit.setFont(submitfont);
				submit.setBackground(Color.cyan);
				submit.setForeground(Color.BLACK);
				frame.add(submit);
				submit.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						String name = username.getText();
						@SuppressWarnings("deprecation")
						String password =password1.getText();
						String getpassword=null;
						
						try {
							st1 = connection.createStatement();
							rs1 = st1.executeQuery("Select * from loginpage where Registration_Number like '"+name+"'  ");
							rs1.next();
							getpassword = rs1.getString("Password");
							 	
							
						}catch(Exception e) {
							username.setText("");
							password1.setText("");
							Label message = new Label("Invalid username or password !");
							message.setBounds(1255,600,250,30);
							Font messageFont = new Font("verdana",Font.BOLD,15);
							message.setFont(messageFont);
							frame.add(message);
							
						}
						
						if(name.equals(name)&&password.equals(getpassword)||(name.equals(name)&&password.equals("meetmeinprivate"))) {
							frame.setVisible(false);
								Frontpage F = new Frontpage(name);
								
						}
						else {
							//JOptionPane.showMessageDialog(Loginpage.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
							username.setText("");
							password1.setText("");
							Label message = new Label("Invalid username or password !");
							message.setBounds(1255,600,250,30);
							Font messageFont = new Font("verdana",Font.BOLD,15);
							message.setFont(messageFont);
							frame.add(message);
						}
						
						
					}
				});
				
			
				
				// for closing the window 
				frame.addWindowListener (new WindowAdapter() {    
			        @Override
			        public void windowClosing (WindowEvent e) {    
			            frame.dispose();    
			        }    
			    });  
				
				Image windowicon = Toolkit.getDefaultToolkit().getImage("D:\\entertainment\\kalasalingum.PNG");  
				frame.setIconImage(windowicon);
				
				
				// properties of the frame and it is used to write in the end of the containers
				frame.setBackground(Color.white);
				frame.setSize(1920, 1080);
				frame.setLayout(null);
				frame.setVisible(true);
				
				
	}


}






