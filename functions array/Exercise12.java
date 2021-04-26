import java.util.*;
public class Exercise12{
	public static void main (String[] args) {
		Scanner   sc =new Scanner(System.in);
		System.out.println("number of elements:");
		int cell=sc.nextInt();
		int[] arr=new int[cell];
		System.out.println("Enter elements:");
		for(int i=0;i<cell;i++)
		arr[i]=sc.nextInt();
		System.out.println(exercise12(arr));
		
	}
	public static boolean exercise12(int[] arr){
		int sum=0;
		for(int i:arr)
		sum+=i;
		return (sum>100)?true:false;		}
		}

