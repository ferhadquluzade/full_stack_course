import java.util.*;
public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of elements:");
        int cell = sc.nextInt();
        int[] arr = new int[cell];
        System.out.println("Enter elements:");
        for (int i = 0; i < cell; i++)
            arr[i] = sc.nextInt();
        System.out.println(exercise16(arr));
  }
    public static boolean exercise16(int[] arr) {
        boolean answr = true;
        int num = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] != num)
                answr = false;
        return answr;
 }}
