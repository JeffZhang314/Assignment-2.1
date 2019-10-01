import java.util.Scanner;

class MortgageCalculator {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Investment Calculator");
        System.out.println("---------------------");
        System.out.println("");
        
        System.out.print("Enter the investment's principle amount in dollars: $");
        double P = scanner.nextDouble();
        
        System.out.print("Enter the investment's interest rate (between 0 and 1): ");
        double r = scanner.nextDouble();
        
        System.out.print("Enter the number of years ");
        System.out.print("the investment will accumulate wealth: ");
        double n = scanner.nextDouble();
        
        double A = P * Math.pow(1 + r, n);
        
        System.out.println("This investment will be worth $" + A + " after " + n + " years.");
    }
}