package com.example.project6sort;

public class Person implements Comparable<Person> {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.birthYear, other.birthYear);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Alice", 1990);
        Person person2 = new Person("Bob", 1985);
        Person person3 = new Person("Charlie", 1995);


        System.out.println("Comparing Alice and Bob: " + person1.compareTo(person2));
        System.out.println("Comparing Alice and Charlie: " + person1.compareTo(person3));
        System.out.println("Comparing Bob and Charlie: " + person2.compareTo(person3));


        if (person1.compareTo(person2) < 0) {
            System.out.println(person1.getName() + " is younger than " + person2.getName());
        } else if (person1.compareTo(person2) > 0) {
            System.out.println(person1.getName() + " is older than " + person2.getName());
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are of the same age");
        }


        if (person3.compareTo(person1) > 0) {
            System.out.println(person3.getName() + " is younger than " + person1.getName());
        } else if (person3.compareTo(person1) < 0) {
            System.out.println(person3.getName() + " is older than " + person1.getName());
        } else {
            System.out.println(person3.getName() + " and " + person1.getName() + " are of the same age");
        }


        if (person2.compareTo(person2) == 0) {
            System.out.println(person2.getName() + " and " + person2.getName() + " are of the same age");
        } else {
            System.out.println(person2.getName() + " and " + person2.getName() + " are not of the same age");
        }
    }


}
