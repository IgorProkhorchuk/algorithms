import java.util.Scanner;

public class NonNegativePrime {
    
    public static int getDivisor(int n) {
        if (n < 2) return -1;
        if (n ==2 || n == 3) return n;

        if (n % 2 == 0) return 2;
        if (n % 3 == 0) return 3;


        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0) return i;
            if (n % (i + 2) == 0) return i + 2;
        }
        return n;
    }

    public static void main(String[] args) {
        // For every nonnegative integer n the value of n2 C n C 41 is prime.
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter the number");
        int n = scanner.nextInt();
        scanner.close();

        int divisor = getDivisor(n);

        if (divisor == -1) {
            IO.println("не просте");
        } else if (divisor ==n) {
            IO.println("просте");
        } else {
            IO.println("складене, ділиться на: " + divisor);
        }
    }
}
