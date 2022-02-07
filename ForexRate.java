import java.util.Scanner; // Scanner is in java.util package
public class ForexRate{
    public static void main(String[]args){

 // Creating a Scanner object       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter exchangeRate from Dollars to MWK  ");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to convert dollars to MWK and 1 vice versa ");
        int x = input.nextInt();
         if (x == 0) {
            System.out.println("Enter the dollar amount ");
            double dollar = input.nextDouble();
            double MWK = exchangeRate * dollar;
            System.out.println( "$" + dollar + " is " + MWK + "kwacha");}
        else if (x ==1 ) {
  // Displaying the results          
            System.out.println("Enter the MWK amount ");
            double MWK = input.nextDouble();
         double Dollars =  MWK / exchangeRate;
            System.out.println(MWK + " is " + "$"+ Dollars);
        }
    }
}