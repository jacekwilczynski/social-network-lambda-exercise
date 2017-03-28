package exercise;

import exercise.Person.Gender;

public class Test {

    public static void main(String[] args) {

        People people = new People(20);

        // For people of age 18+, print male e-mails in lower case and female in upper case
        people.process(p -> {
            if (p.getAge() >= 18) {
                String email = p.getEmailAddress();
                if (p.getGender() == Gender.FEMALE) {
                    email = email.toUpperCase();
                } else {
                    email = email.toLowerCase();
                }
                System.out.println(email);
            }
        });
        
    }

}
