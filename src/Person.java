public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "\n" + getLastName() + " " + getFirstName() + " " + getAge();
    }

    @Override
    public int compareTo(Person o) {
        int comparedAge = age.compareTo(o.age);
        int comparedLastName = lastName.compareTo(o.lastName);
        if (comparedAge == 0) {
            return comparedLastName;
        } else if (comparedAge == 9 && comparedLastName == 0) {
            return firstName.compareTo(o.firstName);
        } else {
            return comparedAge;
        }
    }
}
