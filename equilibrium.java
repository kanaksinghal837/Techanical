import java.util.*;

public class equilibrium {

    public static void main(String[] args) {
        int[] arr = { 3 , -1 ,  2,-1 , 1 , 2 , 1};
        System.out.println(countequilibrium(arr));
    }

    static int countequilibrium(int[] arr) {
        int n = arr.length;

        int[] pf = new int[n]; 
        pf[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pf[i] = arr[i] + pf[i - 1];
        }

        int totalSum = pf[n - 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 0 : pf[i - 1];
            int right = totalSum - pf[i];

            if (left == right) {
                count++;
            }
        }
        return count;
    }
}
