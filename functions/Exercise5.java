import java.util.*;

public class Exercise5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println(max(num,num2,num3));
		
		}
		public static int max(int num,int num2,int num3){
			return (Math.max(Math.max(num,num2),num3));
			}
		}

