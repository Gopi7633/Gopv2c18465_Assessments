import java.util.*;
class Employee implements Comparable<Employee>{
    int id;
    String name,dep,state;
    int experience;
    public Employee(int id, String name, String dep, String state, int experience) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.state = state;
        this.experience = experience;
    }
    public int compareTo(Employee b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Queue<Employee> queue=new PriorityQueue<Employee>();
        //Creating Books
        Employee e1=new Employee(101,"Gopi","Dveloper","india",2);
        Employee e2=new Employee(102,"Ganapathi","Network Admin","india",6);
        Employee e3=new Employee(103,"Srini","manager","india",10);
        //Adding Books to the queue
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        System.out.println("queue elements:");
        //Traversing queue elements
        for(Employee b:queue){
            System.out.println(b.id+" "+b.name+" "+b.dep+" "+b.state+" "+b.experience);
        }
        queue.remove();
        System.out.println("After removing one Employee record:");
        for(Employee b:queue){
            System.out.println(b.id+" "+b.name+" "+b.dep+" "+b.state+" "+b.experience);
        }
    }
}  
