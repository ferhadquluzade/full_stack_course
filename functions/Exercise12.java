import java.util.*;

public class Exercise12{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 number");
int a=sc.nextInt();
System.out.println(units(a));
}
public static int units(int a){
	return a%10;
}
}


