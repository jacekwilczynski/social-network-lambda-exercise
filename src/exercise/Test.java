package exercise;

import exercise.Person.Gender;

public class Test {

    public static void main(String[] args) {

        People people = new People(40);
        
        // Print e-mails of men between 20 and 35
        people.people
                .stream()
                .filter(
                    p -> p.getGender() == Gender.MALE &&
                            p.getAge() >= 20 &&
                            p.getAge() <= 35)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
        
    }

}
