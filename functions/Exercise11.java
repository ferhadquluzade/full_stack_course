import java.util.*;

public class Exercise11{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println(isBig100(a,b,c));
}
public static int isBig100(int a,int b,int c){

if(a>100 && b>100 && c>100)
	return 1;
	else return 0;
}
}


