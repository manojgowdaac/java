import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 250;
	private int defaultPasswordLength = 10; // length of the random password
	private String alternateEmail; // Instead of accessing directly we can access through methods that's all about encapsulation data binding and data hiding
	private String email;
	private String companySuffix = "hellocompany.com";  // company email suffix eg:- amazom.com, google.com etc....
	
	
	// constructor to receive first and last name
	public Email(String firstName ,String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName;
		//System.out.println("EMAIL CREATED : " + this.firstName + " "+ this.lastName);
		
		// call a method asking department - return department
		
		this.department = setDepartment();
		//System.out.println(" Departement : "+ this.department);
		
		// call method that return random password
		
		this.password=randomPassword( defaultPasswordLength); 
		//System.out.println(" your password is : "+ this.password);  // password should not display
		
		// combine element to generate email
		email =firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+ department+"." + companySuffix;
		//System.out.println("YOUR EMAIL : "+ email); // printed in showInfo
	}
	
	//ask for department
	private String setDepartment() {
		System.out.print(" New Worker :"+ firstName + " , Department codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code :"); // \n represent the new line
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice ==1) {
			return "Sales";
		}else if(depChoice == 2){
			return "Development";
		}else if(depChoice ==3) {
			return "Accounting";
		}else{return "";}
	
	}
	//generate random password
	private String randomPassword(int length) {
		//generate a random number and looks at this as an array and we gonna find a random number find the value of this array at any given number
		String passwordSet ="ABCEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&"; 
		char[] password =new char[length];
		
		// grab a value inside from above array 
		for(int i=0;i<length;i++) {
			// if we nned to generate a random password we need to grab random number from array
		int rand =	(int)(Math.random() * passwordSet.length());  // char ---> int (0-26) Math.random are 0 & 1
		password[i]=passwordSet.charAt(rand); 
		// we are genrating random number for above mentioned array and we're taknig the character at  random 
		//numbber and passing into our array one at a time  
		}
		// once it generate this we return password
		return new String(password);
		
	}
	// set mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	//alternate email
	public void setAlternateEmail( String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change password
	public void setPassword(String Password) {
		this.password=password;
	}
	
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	// printing the information 
	public String showInfo() {
		return "NAME : "+ firstName+" "+ lastName+
		" \nCOMPANY EMAIL : "+email+
		" \nMAILBOX CAPACITY : "+ mailboxCapacity + " mb";
		
	}

}
