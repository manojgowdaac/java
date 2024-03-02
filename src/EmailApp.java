
public class EmailApp {

	public static void main(String[] args) {
		Email em1 =new Email("manoj","gowda"); //constructor 
		
		//setting mailboxcapacity,password,alternateemail
		//em1.setMailboxCapacity(0); we can change the mail box capacity
		//System.out.println(em1.getMailboxCapacity());
		
		//em1.setAltenateEmail(null); we can add alternate email
		//em1.setPassword(null);
		System.out.println(em1.showInfo());

	}

}
