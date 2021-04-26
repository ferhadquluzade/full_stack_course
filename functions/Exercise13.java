import java.util.*;

public class Exercise13{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 number");
int a=sc.nextInt();
System.out.println(tens(a));
}
public static int tens(int a){
	return a%100/10;
}
}


