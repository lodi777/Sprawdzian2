package pl.kurs.zad3.models;

public class Student extends Person{
    private String group;
    private int scholarship;

    public Student(String firstName, String secondName, String pesel, String city, String group, int scholarship) {
        super(firstName, secondName, pesel, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    @Override
    public int getSalary() {
        return scholarship;
    }
}