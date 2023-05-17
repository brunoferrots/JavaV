package problems.application;

import problems.entities.Triangle;

//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of triangle");

        double a = 2.0;
        double b = 3.0;
        double c = 4.0;

        var triA = new Triangle(a, b, c);

        System.out.println("The area of triangle is : " + triA.area());

//        input.close();
    }
}
