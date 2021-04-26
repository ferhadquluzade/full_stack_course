import java.util.*;

public class Exercise4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println(average(num,num2,num3));
		
		}
		public static double average(int num,int num2,int num3){
			return (num+num2+num3)/3;
			}
		}

