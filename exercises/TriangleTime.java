package exercises;

import java.util.Scanner;

public class TriangleTime {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Hello. How long would you like your triangle today in inches?");
        int length = input1.nextInt();
        System.out.println("So you want your triangle to be " + length + " inches long, okay! How long would you like the width to be?");
        int width = input1.nextInt();
        int answer = (length * width) / 2;
        System.out.println("Cool, with a width of " + width + "in and a length of " + length + "in, your triangle has an area of " + answer + " square inches!");
    }
}
