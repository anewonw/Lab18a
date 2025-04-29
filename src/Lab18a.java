import java.util.Scanner;

public class Lab18a {
    // Constants For int array
    private static final int M = 0;
    private static final int N = 1;

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
            int[] intArray = {Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1])};

            getGCD(intArray);
            }

        }







    // Make larger number first
    private static void setLargerNumFirst (int[] intArray) {
            if (intArray[M] < intArray[N])  {
                int temp = intArray[M];
                intArray[M] = intArray[N];
                intArray[N] = temp;
            }
        }
    // Get CGD recursively
    private static void getGCD(int[] intArray) {
        setLargerNumFirst(intArray);
        System.out.printf("Entering GCD method:  m = %d,  n = %d)\n", intArray[M], intArray[N]);

        if (intArray[M] % intArray[N] == 0) {
            System.out.printf("Returning GCD value = 1 (BASE CASE:  m = %d,  n = %d)\n", intArray[M], intArray[N]);
        }
        else    {
            intArray[M] = intArray[N];
            intArray[N] = intArray[M] % intArray[N];
        }

    }

}


