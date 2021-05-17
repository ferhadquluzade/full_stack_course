public class Person{
private String name;
private String lastName;

public Person(String name,String lastName){
    this.name=name;
    this.lastName=lastName;
}
public String getName(){
    return this.name;
}
public String getLastName(){
    return this.lastName;
}
public void setName(String name){
    this.name=name;
}
public void setLastName(String lastName){
    this.lastName=lastName;
}
public String toString(){
    return this.name+","+this.lastName;
}
public static void main(String[] args){
        System.out.println(new Person("fiko","qulizada").toString());
    }
    
}