package matrix;
import java.util.*;

public class matrixprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int sum = 0 ;
        int [][] arr = new int[rows][cols];
        for (int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                if(i==j){
                    System.out.print(arr[i][j] + " ");
                    sum += arr[i][j];

                }
            }
        }
        System.out.println(sum);
        


    }
}
