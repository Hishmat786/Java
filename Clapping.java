import java.util.*;

class Clapping {
    int sum = 0, digit = 0;

    static boolean countDigit(int n) {
        while (n != 0) {
            if (n % 10 == 7) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    static int sumN(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n = n / 10;
        }
        return s;
    }

    void clapping(int n) {
        for (int i = 1; i <= n; i++) {
            boolean cout = countDigit(i);
            sum = sumN(i);
            if (i % 7 == 0 || cout || sum % 7 == 0) {
                System.out.println("CLAP");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner ci = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = ci.nextInt();
        Clapping obj = new Clapping();
        obj.clapping(n);

    }
}