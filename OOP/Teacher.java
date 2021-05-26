import java.util.*;
import java.lang.*;
class Teacher{
private String name;
private int age;
private int salary;
public Teacher(String name,int age,int salary){
this.name=name;
this.age=age;
this.salary=salary;
}
public String getName(){
return name;
}
public int getAge(){
return age;}
public int getSalary(){
return salary;
}
public void setName(String newName){
name=newName;
}
;public void setAge(int newAge){
age=newAge;
}
public void setSalary(int newSalary){
salary=newSalary;
}
public String toString(){
return String.format("name: %s,salary :%d,age: %d",name,salary,age);
}
public  void addSalary(int wageToAdd){
salary+=wageToAdd;
}
public static void main(String[] args){
Teacher[] tcArr={new Teacher("Dadas",48,1000),

	         new Teacher("Lala",24,1500),
	         new Teacher("Fikret",25,1025)};
for(Teacher tch:tcArr)
System.out.println(tch.toString());
Arrays.sort(tcArr,(a,b) -> Integer.compare(a.salary,b.salary));
System.out.println(tcArr[2].toString());
for(Teacher tch:tcArr){
if(tch.age>45)
tch.salary+=100;
}
for(Teacher tch:tcArr)
System.out.println(tch.salary);


}
}

