import java.util.Scanner;

class AreaToRadius {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Circle Radius Calculator");
        System.out.println("------------------------");
        System.out.println("");
        System.out.print("Enter the circle's area: ");
        double A = scanner.nextDouble();
        double r = Math.sqrt(A/Math.PI);
        System.out.print("The circle with area " + A + " units^2 ");
        System.out.println("has a radius of " + r + " units.");
    }
}
