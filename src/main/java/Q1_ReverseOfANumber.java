public class Q1_ReverseOfANumber {
    int n;

    static void printReverseOfANumber (int n) {
        if (n < 10) {
            System.out.println("Enter a number greater than 10 (2 or more digits). Execution terminated!");
        } else {
            System.out.print("Reverse of " + n + " is: ");
            while (n > 0) {
                int mod;
                mod = n % 10;
                n = n / 10;
                System.out.print(mod);
            }
        }
        System.out.println();
    }
}
