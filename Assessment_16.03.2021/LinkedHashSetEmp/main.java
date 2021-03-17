import java.util.LinkedHashSet;

public class LinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Employee>set=new LinkedHashSet<Employee>();

        Employee emp=new Employee(1,"Gopi","Developer", "Ganapathi");
        set.add(emp);

        for (Employee employee : set) {
            System.out.println("EmpId:"+emp.EmpId+" "+"EmpName:" +emp.EmpName+" "+"EmpDep:"+" "+emp.EmpDep +" " +"EmpManager" + emp.EmpManager);
        }
    }
}


class Employee{
    int EmpId;
    String EmpName,EmpDep,EmpManager;

    public Employee(int EmpId,String EmpName,String EmpDep, String EmpManager) {
        super();
        this.EmpId=EmpId;
        this.EmpName=EmpName;
        this.EmpDep=EmpDep;
        this.EmpManager=EmpManager;
    }
}
