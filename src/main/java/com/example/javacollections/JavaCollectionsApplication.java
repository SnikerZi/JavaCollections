package com.example.javacollections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class JavaCollectionsApplication {

    public static void main(String[] args) {
        /*SpringApplication.run(JavaCollectionsApplication.class, args);
        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Robert"); // установка нового значения для 2-го объекта

        System.out.printf("ArrayList has %d elements \n", people.size());
        for (String person : people) {

            System.out.println(person);
        }
        // проверяем наличие элемента
        if (people.contains("Tom")) {

            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {

            System.out.println(person);
        }

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy

        System.out.printf("Queue size: %d \n", states.size());  // 5

        // перебор коллекции
        while (states.peek() != null) {
            // извлечение c начала
            System.out.println(states.pop());
        }

        // очередь из объектов Person
        ArrayDeque<Person> people2 = new ArrayDeque<Person>();
        people2.addFirst(new Person("Tom"));
        people2.addLast(new Person("Nick"));
        // перебор без извлечения
        for (Person p : people2) {

            System.out.println(p.getName());
        }*/
        /*LinkedList<String> states2 = new LinkedList<String>();

        // добавим в список ряд элементов
        states2.add("Germany");
        states2.add("France");
        states2.addLast("Great Britain"); // добавляем на последнее место
        states2.addFirst("Spain"); // добавляем на первое место
        states2.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("List has %d elements \n", states2.size());
        System.out.println(states2.get(1));
        states2.set(1, "Portugal");
        for (String state : states2) {

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if (states2.contains("Germany")) {

            System.out.println("List contains Germany");
        }

        states2.remove("Germany");
        states2.removeFirst(); // удаление первого элемента
        states2.removeLast(); // удаление последнего элемента

        LinkedList<Person> people3 = new LinkedList<Person>();
        people3.add(new Person("Mike"));
        people3.addFirst(new Person("Tom"));
        people3.addLast(new Person("Nick"));
        people3.remove(1); // удаление второго элемента

        for (Person p : people3) {

            System.out.println(p.getName());
        }
        Person first = people3.getFirst();
        System.out.println(first.getName()); // вывод первого элемента*/

        /*HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        for(String state : states){

            System.out.println(state);
        }
        // удаление элемента
        states.remove("Germany");

        // хеш-таблица объектов Person
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for(Person p : people){

            System.out.println(p.getName());
        }*/


        /*TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        System.out.printf("TreeSet contains %d elements \n", states.size());

        // удаление элемента
        states.remove("Germany");
        for(String state : states){

            System.out.println(state);
        }*/

        /*TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");

        System.out.println(states.first()); // получим первый - самый меньший элемент
        System.out.println(states.last()); // получим последний - самый больший элемент
        // получим поднабор от одного элемента до другого
        SortedSet<String> set = states.subSet("Germany", "Italy");
        System.out.println(set);
        // элемент из набора, который больше текущего
        String greater = states.higher("Germany");
        // элемент из набора, который меньше текущего
        String lower = states.lower("Germany");
        // возвращаем набор в обратном порядке
        NavigableSet<String> navSet = states.descendingSet();
        // возвращаем набор в котором все элементы меньше текущего
        SortedSet<String> setLower=states.headSet("Germany");
        // возвращаем набор в котором все элементы больше текущего
        SortedSet<String> setGreater=states.tailSet("Germany");
        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);*/


    }


}


class Person {

    private String name;

    public Person(String value) {

        name = value;
    }

    String getName() {
        return name;
    }
}
