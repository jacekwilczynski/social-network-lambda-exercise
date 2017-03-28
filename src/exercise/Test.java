package exercise;

public class Test {

    public static void main(String[] args) {

        People people = new People(20);

        // Print emails of people between 7 and 26
        people.processWithFunction(p -> p.getAge() >= 7 && p.getAge() <= 26,
                p -> p.getEmailAddress(), email -> System.out.println(email));

    }

}
