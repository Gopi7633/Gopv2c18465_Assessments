package ArrayList.com;

import java.util.ArrayList;
import java.util.Collections;

public class Company {

    public static void main(String args[]) {
        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(11,"GOPI",Employee.Status.CONFIRMED));
        list.add(new Employee(22,"GANAPATHI",Employee.Status.FAILED));
        list.add(new Employee(33,"SRINI",Employee.Status.PENDING));

        Collections.sort(list,new NameComparator());
        Collections.sort(list, new IdComparator());

        for(Employee e:list)
        {
            System.out.println("EMP ID: "+e.id+" "+"EMP NAME: "+e.name+" "+"EMP STATUS: "+e.status);
        }
    }
}

class Employee
{
    enum Status
    {
        CONFIRMED,PENDING,FAILED
    }
    int id;
    String name;
    Status status;
    public Employee(int id, String name,Status status) {
        super();
        this.id = id;
        this.name = name;
        this.status=status;
    }
}
