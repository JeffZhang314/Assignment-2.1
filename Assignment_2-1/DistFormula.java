import java.util.Scanner;

class DistFormula {
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Distance Calculator");
        System.out.println("-------------------");
        System.out.println("");
        
        System.out.print("Enter the x coordinate of point 1: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Enter the y coordinate of point 1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter the x coordinate of point 2: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Enter the y coordinate of point 2: ");
        double y2 = scanner.nextDouble();
        
        double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("The distance between those points is " + d + " units.");
    }
}
