
import java.util.Scanner;
public class PhoneBook{

	public static void main(String [] args){
	
		int totalContacts;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter total Contacts : ");
		totalContacts = sc.nextInt();

		Contacts contacts[] = new Contacts[totalContacts];
		

		for(int i = 0 ; i< totalContacts; i++){
			
			System.out.println ("-----------------");
			System.out.println("Enter Details for " + (i+1)  + " contact");
			
			contacts[i] = new Contacts();	
			
		}

		System.out.println("\n======PHONE BOOK======");
		for(int i = 0 ; i< totalContacts; i++){
			
			contacts[i].printDetails();
		}

		
	}
	
}


class Contacts{

	public String name;
	public long mobile;
	
	Scanner sc = new Scanner(System.in);
	
	Contacts(){

		System.out.print("Enter Name : " );
		this.name = sc.nextLine();
		System.out.print("Enter  mobileNumber: " );
		this.mobile = sc.nextLong();
		
	}	

	
	void printDetails(){
		
		System.out.println("NAME : " + this.name );
		System.out.println("Mobile : " + this.mobile);
		System.out.println("======================" );
		
	}	
	

}