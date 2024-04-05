


import java.util.Scanner;

public class ControlStr {

    public static void main(String[] args) {
   
  	 Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number : ");
    int a  = scanner.nextInt();

    System.out.print("Enter second number: ");
    int b  = scanner.nextInt();

    System.out.print("Enter third number");
    int c  = scanner.nextInt();




	if (a > b) 
	{ 
		if ( a > c ) 
		{  
		System.out.println("greatest number is " +a ); 
		}
	} 
	else 
	{ 
		if ( b > c )	
		System.out.println("greatest number is " +b ); 
		

		else 
		{

		System.out.println("greatest number is " +c ); 
		}


} 
	
	
    }
}




