package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Alright then, so the next question is how many miles have you driven last?");
        int miles = input.nextInt();
        System.out.println("Cool, how many gallons of gas did you use?");
        int gallons = input.nextInt();
        int mpg = miles / gallons;
        System.out.println("So that means your car gets " + mpg + " miles per gallon. Nice?");

    }
}
