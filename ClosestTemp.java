import java.util.*;

class ClosestTemp {

    void cTemp(int[] arr) {
        int near = arr[0];
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr = arr[i] * arr[i];
            if (curr <= (near * near)) {
                near = arr[i];
            }
        }
        System.out.println(near);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ClosestTemp obj = new ClosestTemp();

        System.out.print("Enter Number of Temp: ");
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        obj.cTemp(arr);
    }
}