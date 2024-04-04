

// demo of how to  read a input from the user 


//  This line imports the Scanner class from the java.util package
// scanner class is used to read input 
import java.util.Scanner  ;  



public class ScannerDemo {




	public static void main (String [] args ) 


{ 

// This line creates a new Scanner object named myObj. The Scanner object is used to read input from the keyboard. T


// The Scanner constructor takes a single argument, which specifies the input source for the Scanner. 

	 
  	 System.out.println("enter a number " ) ;
	 Scanner s  = new Scanner(System.in);
         int a ;


// The myObj.nextLine() method is used to read a line of text from the Scanner object. 


	 a = s.nextInt(); 
  	 System.out.println("number stored is " + a) ;

	}


}
