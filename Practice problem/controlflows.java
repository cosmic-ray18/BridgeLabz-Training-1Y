class controlflows {

public static void main (String[] args) {

 System.out.println(" For loop Example : ");
for ( int i = 1 ; i <=5; i++){
	for (int j = 1 ; j<=5;j++){
		
    
	System.out.print("*");
  }
  System.out.println();
 }  
 
 System.out.println(" While Loop Example : ");
 
 int i = 1;
  while(i<=20){
	  System.out.println(i+ "");
	  i++;
  }
  
   System.out.println(" do - While Loop Example : ");
     
	 int j = 0;
	 do {
		 System.out.println(j);
		 j++;
	 }
	 while (j<=5);
}
}