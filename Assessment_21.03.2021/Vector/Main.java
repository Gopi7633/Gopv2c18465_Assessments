import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
         Vector<String> vec = new Vector<>();

        //Adding elements using add() to a vector
        vec.add("Gopi");
        vec.add("Ganapathi");
        vec.add("Srini");

        //Use forEach() method to print vector elements
        vec.forEach(System.out::println);

        //Check size and capacity
        System.out.println("Vector Size is: "+vec.size());
        System.out.println("Default vector capacity is: "+vec.capacity());

        //Adding elements using addElement() to a vector
        vec.addElement("Vijay");
        vec.addElement("Shankar");

        //Obtain an Iterator
        Iterator<String> itr = vec.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Vector Size is: "+vec.size());
        System.out.println("Default vector capacity is: "+vec.capacity());

        //Get the element at specified index
        System.out.println("Element at index 1 is = "+vec.get(0));
        System.out.println("Element at index 3 is = "+vec.get(3));

        //Get the hashcode for this vector
        System.out.println("HashCode vector = "+vec.hashCode());

        //isEmptyMethod
        if(vec.isEmpty()){
            System.out.println("Vector Is Empty");
        }else {
            System.out.println("vector have some values");
        }

        //Contains method Gopi is present or not in this vector
        if(vec.contains("Ganapathi"))
        {
            System.out.println("Ganapathi is present in the list");
        }
        else
        {
            System.out.println("Ganapathi is not present in the list.");
        }

        //Get the first element in vector
        System.out.println("The first Element of the vector is = "+vec.firstElement());

        //Get the last element in vector
        System.out.println("The last Element of the vector is = "+vec.lastElement());

        Vector<String> vec1 = new Vector<>();

        //Adding elements using add() to a vector
        vec1.add("prabha");
        vec1.add("prathap");
        System.out.println("Second Vector Elemnts:" +vec1);

        //Add all Method
        vec.addAll(vec1);
        System.out.println("After Adding  vec1 all elements into vec:" +vec);

        //equals() Method
        System.out.println("both vector have Same Value ? " +vec.equals(vec1));

        //remove
        System.out.println("Removed element at index 2 is: " +vec.remove(0));
        System.out.println("Values in vector after remove: " +vec);

    }
}
