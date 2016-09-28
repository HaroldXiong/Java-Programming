import java.util.Scanner;

/**
 * Created by xiong on 9/28/16.
 */
public class P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant < 0) {
            System.out.println("The equation has no roots");
        } else if (discriminant == 0) {
            System.out.println("The root is " + equation.getRoot1());
        } else {
            System.out.println("The roots are " + equation.getRoot1()
                    + " and " + equation.getRoot2());
        }
    }
}


class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        return (getDiscriminant() >= 0)
                ? (-b + Math.sqrt(getDiscriminant()))
                / (2 * a) : 0;
    }

    double getRoot2() {
        return (getDiscriminant() > 0)
                ? (-b - Math.sqrt(getDiscriminant()))
                / (2 * a) : 0;
    }
}
