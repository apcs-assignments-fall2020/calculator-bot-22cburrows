//Rasika and I worked on this together
//This was done by Chloe Burrows

import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int d = Math.max(a, b);
        int e = Math.max(b, c);
        int f = Math.max(d, e);
        int g = Math.min(a, b);
        int h = Math.min(b, c);
        int i = Math.min(g, h);
        return ((a + b + c) - (i + f));
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int abso = Math.max(Math.abs(a), Math.abs(b));
        if (abso == (Math.abs(a))){
            return a; 
        }
        else {
            return b;
        }

    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("What command would you like to carry out?");
        String command = scan.next();


        //Test each command to make sure they work
        if (command.equals("median")){
            System.out.println("What is the first number?");
            int num1 = scan.nextInt();
            System.out.println("What is the second number?");
            int num2 = scan.nextInt();
            System.out.println("What is the third number?");
            int num3 = scan.nextInt();
            System.out.println("The median is " + median(num1, num2, num3));
        }
        else if (command.equals("magnitude")){
            System.out.println("What is the first number?");
            int num4 = scan.nextInt();
            System.out.println("What is the second number?");
            int num5 = scan.nextInt();
            System.out.println("The magnitude is " + magnitude(num4, num5)); 
        }
        else{
            System.out.println("What is the first number?");
            int num6 = scan.nextInt();
            System.out.println("What is the second number?");
            int num7 = scan.nextInt();
            System.out.println("The pythagoras is " + pythagoras(num6, num7));
        }
    }
}
