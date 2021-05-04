
import java.util.*;
public class Exercise7 {
	
	public static void main (String[] args) {
		int[][] arr = new int[3][3];
        fillArray(arr);
	}
	 public static void fillArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }
        sumOfIRow(arr);
    }
     public static void sumOfIRow(int[][] arr) {
        int sumOfIRow = 0;
        for (int i = 0; i < arr[0].length; i++) 
             sumOfIRow += arr[0][i];
        System.out.println("sum:" + sumOfIRow );

    }
}

