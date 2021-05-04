
import java.util.*;
public class Exercise4 {
	
	public static void main (String[] args) {
		int[][] arr = new int[5][5];
        fillArray(arr);
	}
	 public static void fillArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }

        sumOfSlant(arr);

    }

    public static void sumOfSlant(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
}
}
}

