import java.util.Scanner;

public class NonNegativePrime {
    
    public static int getDivisor(int n) {
        if (n < 2) return -1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
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
