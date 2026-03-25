class earth { 

public static void main ( String [] args ) { 

double radiuskms = 6378; 
double volumekms = (4.0/3.0)*(22.0/7.0)*(radiuskms*radiuskms*radiuskms);
double radiusmiles = radiuskms/1.6;
double cubicmiles = (4.0/3.0)*(22.0/7.0)*(radiusmiles*radiusmiles*radiusmiles);

System.out.print("The volume of earth in cubic kilometers is " + volumekms + " and cubic miles is " + cubicmiles);
 
 }
}