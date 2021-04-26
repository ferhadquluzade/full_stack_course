
import java.util.*;
public class Exercise15{
	public static void main (String[] args) {
		Scanner   sc =new Scanner(System.in);
		System.out.println("number of elements:");
		int cell=sc.nextInt();
		System.out.println("Enter the number to find:");
		int numToFind=sc.nextInt();
		int[] arr=new int[cell];
		System.out.println("Enter elements:");
		for(int i=0;i<cell;i++)
		arr[i]=sc.nextInt();
		System.out.println(exercise15(arr,numToFind));
		
	}
	public static int exercise15(int[] arr,int numToFind){
		int cntr=0;
		for(int i:arr){
		if(i==numToFind)
          cntr+=1;}
		return cntr;		}
	}
		

