import java.util.*;

public class Exercise16{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 number");
int a=sc.nextInt();
tens(a);
}
public static void tens(int a){
	System.out.println(a%100/10);
}
}


