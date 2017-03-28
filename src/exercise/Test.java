package exercise;

import exercise.Person.Gender;

public class Test {

    public static void main(String[] args) {

        People people = new People(20);

        // Count males
        int sum = people.sum(p -> p.getAge());
        
        // Print all
        people.print();
        
        // Print sum
        System.out.println("Sum of life spans: " + sum);
        
    }

}
