import java.util.Scanner; // Scanner is in java.util package
public class EvenAndOdd{
    public static void main(String [] args) {

 // Creating a Scanner object
 Scanner input = new Scanner(System.in);
 System.out.println(" Enter an integer");
 int number = input.nextInt();

 // if a number is divisibe by 2 then its an even number
 // if a number is not divisible by 2 then its odd number
 if(number%2 == 0){
  System.out.println(" Enter a number, is even");   
 }
 else{
 System.out.println( "Enter a number, is odd");    
 }       
    }
}