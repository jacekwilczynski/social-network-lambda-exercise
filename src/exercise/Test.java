package exercise;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        People people = new People(20);
        List<Integer> numbers = fillListWithNumbers(15);
        
        Processor<Person> personProcessor = new Processor<>();
        Processor<Integer> numberProcessor = new Processor<>();
        
        // Print all people's names
        personProcessor.processElements(people, p -> System.out.println(p.getName()));
        // Print all numbers and their doubles
        numberProcessor.processElements(numbers, n -> System.out.printf("%4d * 2 = %4d\n", n, n * 2));

    }

    private static List<Integer> fillListWithNumbers(int howMany) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            list.add(randomInt(-100, 100));
        }
        return list;
    }

    private static int randomInt(int min, int max) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

}
