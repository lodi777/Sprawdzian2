package pl.kurs.zad3.models;

public class Employee extends Person {
    private String position;
    private int salary;

    public Employee(String firstName, String secondName, String pesel, String city, String position, int salary) {
        super(firstName, secondName, pesel, city);
        this.position = position;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
