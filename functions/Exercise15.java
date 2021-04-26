import java.util.*;

public class Exercise15{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 number");
int a=sc.nextInt();
units(a);
}
public static void units(int a){
	System.out.println(a%10);
}
}


