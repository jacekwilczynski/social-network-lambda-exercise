package exercise;

import exercise.Person.Gender;

public class Test {

    public static void main(String[] args) {

        People people = new People(20);

        // Count males
        int sum = people.sum(p -> {
            if (p.getGender() == Gender.MALE) {
                return 1;
            } else {
                return 0;
            }
        });
        
        // Print all
        people.print();
        
        // Print sum
        System.out.println("Males: " + sum);
        
    }

}
