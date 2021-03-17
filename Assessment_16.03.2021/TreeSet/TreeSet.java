import java.util.*;
class TreeSet1{
    public static void main(String args[]){

        TreeSet<String> al=new TreeSet<String>();
        al.add("Gopi");
        al.add("Ganapthi");
        al.add("Srini");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
