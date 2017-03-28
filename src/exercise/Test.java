package exercise;

public class Test {

    public static void main(String[] args) {

        People people = new People(20);

        // Print people under 21
        people.process(p -> p.getAge() < 21, p -> p.print());

    }

}
