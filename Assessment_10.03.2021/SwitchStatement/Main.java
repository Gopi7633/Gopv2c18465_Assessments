public class Main {
    public static void main(String[] args) {
        printDayofTheWeek(0);
        printDayofTheWeek(1);
        printDayofTheWeek(2);
        printDayofTheWeek(3);
        printDayofTheWeek(4);
        printDayofTheWeek(5);
        printDayofTheWeek(6);
        printDayofTheWeek(10);
    }

    public static void printDayofTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("INVALID DAY");
                break;

        }
    }
}
