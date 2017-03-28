package exercise;

import exercise.Person.Gender;

public class Test {

    public static void main(String[] args) {

        People people = new People(20);

        // For people of age 18+, print male e-mails in lower case and female in upper case
        people.processWithFunction(p -> p.getAge() >= 18, p -> {
            String email = p.getEmailAddress();
            if (p.getGender() == Gender.FEMALE) {
                return email.toUpperCase();
            } else {
                return email.toLowerCase();
            }
        }, email -> System.out.println(email));
        
    }

}
