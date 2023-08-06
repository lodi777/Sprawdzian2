package pl.kurs.zad3.app;

import pl.kurs.zad3.models.Employee;
import pl.kurs.zad3.models.Person;
import pl.kurs.zad3.models.Student;

public class App {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];

        personArray[0] = new Student("Anna", "Nowak", "98061212345", "Warszawa", "A1", 1000);
        personArray[1] = new Employee("Jan", "Kowalski", "75091298765", "Kraków", "Kierownik", 5000);
        personArray[2] = new Student("Maria", "Wójcik", "99030223456", "Gdańsk", "B2", 800);
        personArray[3] = new Employee("Piotr", "Lis", "82070187654", "Wrocław", "Programista", 4000);
        personArray[4] = new Student("Katarzyna", "Mazurek", "00111554321", "Poznań", "C3", 1200);



        int numberOfWoman = 0;
        for (Person person : personArray) {
            if (person.getSex() == 'K') {
                numberOfWoman++;
            }
        }

        System.out.println("Liczba kobiet w tablicy: " + numberOfWoman);

        Person personWithHighestSalary = Person.findPersonWithHighestSalary(personArray);
        System.out.println("Osoba z najwiekszym dochodem: " + personWithHighestSalary);
    }
}

