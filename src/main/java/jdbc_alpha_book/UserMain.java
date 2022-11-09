package jdbc_alpha_book;
import java.util.Scanner;
public class UserMain {
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
	
		boolean data=true;
		do {
			System.out.println("+++++ : Welcome to Alpha Book :+++++");
			System.out.println("Enter your Choice :");
			System.out.println("+++ 1. For Sign Up :+++++");
			System.out.println("+++ 2. For Login :+++++");
			System.out.println("+++ 3. For Exit : +++++++");
			UserCRUD usercrud=new UserCRUD();
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Welcome to the Sign Up Module for Alpha Book");
					System.out.println("+++  Where User Interacts with Multiple Users:  +++");
					System.out.println("Enter the User Id :");
					int id=scanner.nextInt();
					System.out.println("Enter the User First Name :");
					String fName=scanner.next();
					System.out.println("Enter the User Second Name :");
					String lName=scanner.next();
					System.out.println("Enter the User Mail Id :");
					String email=scanner.next();
					System.out.println("Enter the User Contact Number :");
					Long contactNum=scanner.nextLong();
					System.out.println("Enter the User Date of Birth :");
					String Dob=scanner.next();
					System.out.println("Enter the User Password :");
					String password=scanner.next();
					System.out.println("Enter the User Gender :");
					String gender=scanner.next();
					
					User user1=new User();
					user1.setId(id);
					user1.setFirstName(fName);
					user1.setLastName(lName);
					user1.setMailId(email);
					user1.setContactNumber(contactNum);
					user1.setDOB(Dob);
					user1.setPassword(password);
					user1.setGender(gender);
					
					
						usercrud.SignUpUser(user1);
					break;
					
				case 2: 
					System.out.println("Welcome to the Login Module for Alpha Book");
					System.out.println("+++ Where User Interacts with Multiple Users:  +++");
					System.out.println("Enter the User Mail Id :");
					String email2=scanner.next();
					System.out.println("Enter the User Password :");
					String password2=scanner.next();
					User user2=new User();
					user2.setMailId(email2);
					user2.setPassword(password2);
						usercrud.LoginUser(email2, password2, user2);
					
					break;	
				case 3:
					System.out.println("Thanks for Using ****** Alpha Book*****");
					System.out.println("We will be helping you on smooth *****OffBoarding from Alpha Book********");
					System.out.println("***Have a Great Day Ahead****Hoping to See you Back Soon****");
					data=false;
					break;
				default:
					System.out.println("Invalid Choice Kindly Select from No. 1 , 2 and 3 Only for Using Alpha Book :");
			}
		}while(data);
	}

}
