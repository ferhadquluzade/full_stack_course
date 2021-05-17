public class Student extends Person{
int gradesAvg;
public Student(String name,String lastName,int gradesAvg){
    super(name,lastName);
    this.gradesAvg=gradesAvg;
}
public int getGradesAvg(){
    return this.gradesAvg;
}
public void setGradeAvg(int newGradeAvg){
    this.gradesAvg=newGradeAvg;

}
public String toString(){
    return this.gradesAvg+","+super.getName()+","+this.getLastName();
}
public static void main(String args[]){
    System.out.println(new Student("Fiko","Qulizada",99));
}
}