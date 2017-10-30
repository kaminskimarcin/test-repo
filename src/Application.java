import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        LinkedList<Person> persons = PersonList.addingPersons();

        PersonList.displayListInTable(persons);
        PersonList.sortList(persons);
        PersonList.displayListInTable(persons);
    }
}
