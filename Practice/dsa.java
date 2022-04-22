package com.nfletcher;

import java.util.*;

public class DSA <T>{

    T printableItem;

    public DSA(T printableItem) {
        this.printableItem = printableItem;
    }

    public void print() {
        System.out.println(printableItem);
    }

    public static void main(String[] args) {

        DSA<Integer> printer = new DSA<>(22);
        printer.print();
        
        DSA<Double> printer2 = new DSA<>(99.2);
        printer2.print();

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue", 11));
        balls.add(new Ball("Green", 12));
        balls.add(new Ball("Red", 13));
        balls.add(new Ball("Yellow", 14));
        balls.forEach(System.out::println);
        balls.remove(new Ball("Red", 13));

        LinkedList<Person> listofPeople = new LinkedList<>();
        listofPeople.add(new Person("Scott", 29));
        listofPeople.add(new Person("Brennan", 25));
        // System.out.println(listofPeople.get(0));
        // System.out.println(listofPeople.getLast());
        // System.out.println(Arrays.toString(listofPeople.toArray()));
        listofPeople.addLast(new Person("TJ", 19));
        listofPeople.addFirst(new Person("Cameron", 18));


        Person person = new Person("Nesta", 19);
        Queue<Person> people = new LinkedList<>();
        people.add(new Person("Ben", 12));
        people.add(new Person("Roger", 17));
        people.add(new Person("Ken", 22));
        // System.out.println(people.peek());
        people.add(person);

        Map<Integer, Person> accounts = new HashMap<>();
        accounts.put(1102, new Person("Nesta", 19));
        accounts.put(9056, new Person("Bard", 19));
        accounts.put(555, new Person("Manny", 19));
        System.out.println(accounts.keySet());
        System.out.println(accounts.entrySet());
    }

    static record Ball(String color, int weight) {}

    static record Person(String name, int age) {

        public static final String DEFAULT_EMPLOYEE_NAME = "Ben";

        public void printName() {
            System.out.println(name);
        }

        public static void printDescription() {
            System.out.println("This is a print statement.");
        }

    }
}
