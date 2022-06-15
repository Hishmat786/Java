import java.util.*;

class ClinkingGlass {
    int click(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        ClinkingGlass obj = new ClinkingGlass();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of guest: ");
        int n = in.nextInt();
        System.out.print("Total glass clicking: " + obj.click(n));
    }
}