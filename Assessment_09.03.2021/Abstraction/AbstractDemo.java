public class AbstractDemo {

    public static void main(String [] args) {
        Employee e = new Employee("George W.", "Houston, TX", 43);
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}
