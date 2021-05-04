
import java.util.*;
public class Exercise8 {
	
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
        sumOfLastRow(arr);
    }
     public static void sumOfLastRow(int[][] arr) {
        int sumOfLastRow = 0;
        for (int i = 0; i < arr[arr.length-1].length; i++) 
             sumOfLastRow += arr[arr.length-1][i];
        System.out.println("sum:" + sumOfLastRow );

    }
}

