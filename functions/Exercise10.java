import java.util.*;

public class Exercise10{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers");
int a=sc.nextInt();
int b=sc.nextInt();
printBetween(a,b);
}
public static void printBetween(int a,int b){
int max=Math.max(a,b);
int min=a+b-max;
for(int i=min;i<=max;i++)
System.out.print(i);
}
}


