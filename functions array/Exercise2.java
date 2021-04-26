import java.util.*;
public class Exercise2{
	public static void main (String[] args) {
		Scanner   sc =new Scanner(System.in);
		System.out.println("number of elements:");
		int cell=sc.nextInt();
		int[] arr=new int[cell];
		System.out.println("Enter elements:");
		for(int i=0;i<cell;i++)
		arr[i]=sc.nextInt();
		exercise2(arr);
	}
	public static void exercise2(int[] arr){
		for(int i:arr)
		System.out.print(i);
				}
		}

