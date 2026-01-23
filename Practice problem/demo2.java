class VariableExample {
	
	int id = 10;
	String name = "Jay";
	static int age = 20; // static variable 
	
	Void display ()
	{
		String status = "Active"; // local variable 
System.out.println("Status:" + status); // Printing statement 
	}
public static void main (String [] args ); // main method 

{
	VariableExamples var = new VariableExamples ();
	var.display();
	
	System.out.println(age);

 }
}