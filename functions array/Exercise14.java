import java.util.*;
public class Exercise14{
	public static void main (String[] args) {
		Scanner   sc =new Scanner(System.in);
		System.out.println("number of elements of array:");
		int cell=sc.nextInt();
		int[] arr=new int[cell];
		System.out.println("Enter elements:");
		for(int i=0;i<cell;i++)
		arr[i]=sc.nextInt();
		
		System.out.println("number of elements of array2:");
		int cell2=sc.nextInt();
		int[] arr2=new int[cell2];
		System.out.println("Enter elements:");
		for(int i=0;i<cell2;i++)
		arr2[i]=sc.nextInt();
		System.out.println(exercise14(arr,arr2));
		
	}
	public static int exercise14(int[] arr,int[] arr2){
		int sum=0;
		for(int i:arr)
		sum+=i;
		for(int i:arr2)
		sum+=i;
		return sum;		}
		}

