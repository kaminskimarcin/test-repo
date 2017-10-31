import java.util.Collections;
import java.util.LinkedList;

public class PersonList {
    private PersonList() {
    }

    public static LinkedList<Person> addingPersons() {
        LinkedList<Person> persons = new LinkedList<>();

        persons.add(new Person("Marcin", "Nowak", 25));
        persons.add(new Person("Tadeusz", "Adamski", 24));
        persons.add(new Person("Tadeusz", "Zieliński", 24));
        persons.add(new Person("Amadeusz", "Nowak", 25));
        persons.add(new Person("Tomasz", "Kamiński", 50));
        persons.add(new Person("Tadeusz", "Nowak", 32));
        persons.add(new Person("Michał", "Nowak", 23));

        return persons;
    }

    public static LinkedList<Person> sortList(LinkedList<Person> persons) {
        System.out.println("Sorting list by age, then by first name and at last by last name...\n");

        Collections.sort(persons);

        return persons;
    }

    public static void displayListInTable(LinkedList<Person> persons) {
        System.out.println("Displaying list...");
        int i = 0;
        System.out.format("%-5s%-12s%-15s", "Age", "First name", "Last name");
        while (i < persons.size()) {
            System.out.format("\n" + "%-5s%-12s%-15s", "" + persons.get(i).getAge(), persons.get(i).getFirstName(), persons.get(i).getLastName());
            i++;
        }
        System.out.println("\n");
    }
}
