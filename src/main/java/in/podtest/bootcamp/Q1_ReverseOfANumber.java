package in.podtest.bootcamp;

public class Q1_ReverseOfANumber {

    static void printReverseOfANumber (int n) {
        int rev=0;
        if (n < 10) {
            System.out.println("Enter a number greater than 10 (2 or more digits). Execution terminated!");
        } else {
            System.out.print("Reverse of " + n + " is: ");
            while (n > 0) {
                int mod;
                mod = n % 10;
                n = n / 10;
                rev = (rev*10)+mod;
            }
        }
        System.out.println(rev);
    }
}
