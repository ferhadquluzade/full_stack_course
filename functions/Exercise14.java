import java.util.*;

public class Exercise14{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
isBig100(a,b,c);
}
public static void isBig100(int a,int b,int c){

if(a>100 && b>100 && c>100)
	System.out.println(1);
	else System.out.println(0);
}
}


