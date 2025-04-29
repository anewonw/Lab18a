import java.util.Scanner;

public class Lab18a {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Get integers
            System.out.print("Enter two integers or press 'q' to quit: ");
            String inputString = input.nextLine();

            // Quit if q is pressed
            if (inputString.contains("q"))
                System.exit(0);

            // Split string
            String[] inputArray = inputString.split(" ");
            int m = Integer.parseInt(inputArray[0]);
            int n = Integer.parseInt(inputArray[1]);

            // Show GCD
            System.out.printf("The GCD of %d and %d is %d\n\n", m, n, getGCD(m, n));
        }

    }





    // Get GCD recursively
    private static int getGCD(int m, int n) {
        System.out.printf("Entering GCD method:  m = %d,  n = %d\n", m, n);

        int gcd;
        int remainder = m % n;
        boolean isBase = false;

        // Call method again with new values
        if (remainder != 0)
            gcd = getGCD(n, remainder);
        else {
            gcd = n;
            isBase = true;
        }

        System.out.printf("Returning GCD value = %d (%s case:  m = %d,  n = %d)\n",
                gcd, isBase ? "BASE" : "Recursive", m, n);

        return gcd;

    }

}




