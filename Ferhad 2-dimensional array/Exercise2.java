import java.util.*;
public class Exercise1 {
	
 public static void main(String[] args) {
        int[][] arr = new int[10][10];
        fillArray(arr);
        sum(arr);

    }


    public static void fillArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }


    }

    public static void sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        if(i==1)
			i=9;
            for (int j = 0; j < arr[i].length; j++)
                sum += arr[i][j];
        }

        System.out.println("sum:"+sum);
    }



}

