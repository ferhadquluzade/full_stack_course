import java.util.*;
public class Exercise1 {
	
 public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillArray(arr);
        sum(arr);
        avg(arr);

    }


    public static void fillArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                arr[i][j] = sc.nextInt();
        }


    }

    public static void sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                sum += arr[i][j];
        }

        System.out.println("sum:"+sum);
    }

    public static void avg(int arr[][]) {
       int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                sum += arr[i][j];
        }
        System.out.println("average:"+sum
         / 5);
    }


}

