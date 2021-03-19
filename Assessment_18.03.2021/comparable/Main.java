import java.util.*;
public class Main{
    public static void main(String args[]){
        ArrayList<Student> arraylist =new ArrayList<Student>();
        arraylist.add(new Student(16,"Gopi",23));
        arraylist.add(new Student(87,"Ganapathi",27));
        arraylist.add(new Student(12,"Srini",21));

        Collections.sort(arraylist);
        for(Student st:arraylist){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}  
