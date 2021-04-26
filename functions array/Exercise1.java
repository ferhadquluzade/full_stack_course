import java.util.*;
public class Exercise1{
	public static void main (String[] args) {
		Scanner   sc =new Scanner(System.in);
		System.out.println("number of elements:");
		int cell=sc.nextInt();
		System.out.println("Enter elements:");
		int[] arr=new int[cell];
		exercise1(arr,cell);
	}
	public static void exercise1(int[] arr,int x){
		Scanner   sc =new Scanner(System.in);
		for(int i=0;i<x;i++)
		arr[i]=sc.nextInt();
		
		}
		}

