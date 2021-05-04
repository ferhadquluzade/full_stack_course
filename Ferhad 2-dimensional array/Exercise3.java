import java.util.*;

public class Exercise3 {
	
	
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        fillArray(arr);

    }


    public static void fillArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }

        sumOfRow(arr);

    }

    public static void sumOfRow(int[][] arr) {
        int sumOfRow = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                sumOfRow += arr[i][j];

            if (i == 0)
                i = arr.length - 2;
        }
        System.out.println("sum of row:" + sumOfRow + "\nsum of Column:" + sumOfColm(arr));

    }

    public static int sumOfColm(int[][] arr) {
        int sumOfColm = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfColm += arr[i][j];
            if (j == 0)
                j = arr[i].length - 1;
        }
        return sumOfColm;
    }
}

