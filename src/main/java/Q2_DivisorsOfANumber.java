public class Q2_DivisorsOfANumber {

    static void printDivisorsOfANumber (int n) {

        if (n < 0) {
            System.out.println("Enter a number greater than 0. Execution terminated!");
        } else {
            System.out.print("Divisors of " + n + " are: ");
            for (int i=1; i<=n;i++) {
                if ((n%i) == 0)
                    System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
}
