import java.util.*;
public class Exercise8{
	public static void main (String[] args) {
		Scanner   sc =new Scanner(System.in);
		System.out.println("number of elements:");
		int cell=sc.nextInt();
		int[] arr=new int[cell];
		System.out.println("Enter elements:");
		for(int i=0;i<cell;i++)
		arr[i]=sc.nextInt();
		exercise8(arr);
		
	}
	public static void exercise8(int[] arr){
		int cntr=0;
		for(int i=arr.length-1;i>=0;i--)
		System.out.print(arr[i]+" ");	
	}
		}

