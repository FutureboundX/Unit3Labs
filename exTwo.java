import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		String fName = getFirstName();
		String lName = getLastName();
		String password = generatePass(fName, lName);

	}
	//Method to get first name
	public static String getName(){
		System.out.println("Please enter your first name: ");
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		
		return firstName;
	}
	
	//Method to get last name
	public static String getLastName(){
		System.out.println("Please enter your last name: ");
		Scanner input = new Scanner(System.in);
		String lastName = input.nextLine();
		
		return lastName;
		
	}
	
	//Method that generates pseudo-random password
	public static String passGenerator(String first, String last){
		char one = first.charAt(0);
		char two = first.charAt(0);
		char three = first.charAt(0);
		
		String beginning = " " + one + two + three;
