import  java.lang.*;
import java.util.*;
public class Classroom{
	private int  classNo;
	private int numOfStudents;
	Teacher  teacher;
public Classroom(int classNo,int numOfStudents,Teacher teacher){
	this.classNo=classNo;
	this.numOfStudents=numOfStudents;
	this.teacher=teacher;
}
public int getClassNo(){
	return classNo;
}
public int getNumOfStudents(){
	return  numOfStudents;
}
public Teacher getTeacher(){
	return teacher;
}
public void setClassNo(int classNo){
	this.classNo=classNo;
}
public void setNumOfStudents(int num){
	this.numOfStudents=num;
}
public void setTeacher(Teacher teacher){ 
	this.teacher=teacher;
}
public String toString(){
	return String.format("classNo: %s,numOfStudents: %d,teacher: %s",classNo,numOfStudents,getTeacher());
}


public static void main(String[] args){
Classroom cr[]={new Classroom(2,20,new Teacher("Jeyhun",27,1099)),
	        new Classroom(3,22,new Teacher("Cavad",25,1000)),
                new Classroom(4,25,new Teacher("Qismet",24,1250))};
	Arrays.sort(cr,(a,b) -> Integer.compare(a.getTeacher().getSalary(),b.getTeacher().getSalary()));
	System.out.println(cr[2].getTeacher().toString());
	Arrays.sort(cr,(a,b) -> Integer.compare(a.getNumOfStudents(),b.getNumOfStudents()));
	cr[2].getTeacher().addSalary(100);
	System.out.println(cr[2].getTeacher().getSalary());
       System.out.println(cr[2].toString()		);

}

}
