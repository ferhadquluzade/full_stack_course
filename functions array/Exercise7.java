import java.util.*;
public class Exercise7{
	public static void main (String[] args) {
		Scanner   sc =new Scanner(System.in);
		System.out.println("number of elements:");
		int cell=sc.nextInt();
		int[] arr=new int[cell];
		System.out.println("Enter elements:");
		for(int i=0;i<cell;i++)
		arr[i]=sc.nextInt();
		System.out.println(exercise7(arr));
		
	}
	public static int exercise7(int[] arr){
		int cntr=0;
		for(int i:arr){
		if(i%3==0)
		cntr+=1;}
		return cntr;		}
		}

