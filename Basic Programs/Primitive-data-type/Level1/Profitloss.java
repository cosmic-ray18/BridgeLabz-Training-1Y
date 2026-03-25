class Profitloss { 

public static void main ( String [] args ) {

double costprice = 129;
double sellingprice = 191;

double  Profit = sellingprice - costprice;
double Percentage = (Profit/costprice)*100;

System.out.print("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellingprice +
                 "\nThe Profit is INR " + Profit + " and Profit Percentage is " + Percentage);
	}
}	