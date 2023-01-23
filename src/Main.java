import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Employee("John", "Lennon", "Employee", 27045.78));
        list.add(new Employee("George", "Harrison", "Employee", 50000));
        list.add(new Student("Ringo", "Starr", 2.5));
        list.add(new Student("Paul", "M8cCartney", 3));

        Collections.sort(list);
        printData(list);

    }
    public static void printData(ArrayList<Person> list) {
        for (Person a : list) {
            System.out.print(a.toString());
            System.out.println(" earns " + a.getPaymentAmount() + " tenge");
        }
    }
}
