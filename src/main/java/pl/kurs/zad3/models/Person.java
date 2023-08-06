package pl.kurs.zad3.models;

public class Person {
    private String firstName;
    private String secondName;
    private String pesel;
    private String city;

    public Person(String firstName, String secondName, String pesel, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.pesel = pesel;
        this.city = city;
    }
    public char getSex() {
        char sex = pesel.charAt(pesel.length() - 2);
        return sex % 2 == 0 ? 'K' : 'M';
    }

    public int getSalary() {
        return  0;
    }

    public static Person findPersonWithHighestSalary(Person[] people) {
        Person personWithHighestSalary = null;
        double maxSalary = 0;

        for (Person person : people) {
           int salary = person.getSalary();
           if (salary > maxSalary) {
               maxSalary = salary;
               personWithHighestSalary = person;

            }
        }
        return personWithHighestSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }
}