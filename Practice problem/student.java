class student {
	
	// instance variable 
	
	int id ;
	String name ;
	int age ;
	
	void displayDetails () {
		String status = "Active";
  
  System.out.println(" id: " + id );
  System.out.println(" Name:" + name );
  System.out.println("age" + age );
  
	}
  
  public static void main (String[]args) {
	  student s1 = new student ();
	  s1.displayDetails () ;
  
	}
}
