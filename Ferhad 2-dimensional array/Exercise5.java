
import java.util.*;
public class Exercise5 {
	
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
        sumOfLastColm(arr);
    }
     public static void sumOfLastColm(int[][] arr) {
        int sumOfLastColm = 0;
        for (int i = 0; i < arr[arr.length-1].length; i++) 
             sumOfLastColm += arr[i][arr.length-1];
        System.out.println("sum:" + sumOfLastColm );

    }
}

