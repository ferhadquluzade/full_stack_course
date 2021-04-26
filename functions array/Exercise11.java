import java.util.*;
public class Exercise11{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("number of elements:");
        int cell = sc.nextInt();
        int[] arr = new int[cell];
        System.out.println("Enter elements:");
        for (int i = 0; i < cell; i++)
            arr[i] = sc.nextInt();
        System.out.println(exercise11(arr));
    }
    public static boolean exercise11(int[] arr) {
        int cntr = 0;
        for (int i : arr)
            if (i >= 0)
                cntr += 1;
        return (cntr == arr.length) ? true : false;
    }
		}

