//Collects users name
	System.out.println("Please enter your name: ");
	Scanner input = new Scanner(System.in);
	String name = new String(input.nextLine());
	
	//Converts name to lowercase
	name = name.toLowerCase();
	String nameBackwards = "";
	
	//For loop that goes through the name and prints it backwards
	for (int i = name.length()-1; i >= 0; i--){
		char letter = name.charAt(i);
	  nameBackwards = nameBackwards + letter;
	}
	System.out.println("Your name backwads is: " + nameBackwards);
