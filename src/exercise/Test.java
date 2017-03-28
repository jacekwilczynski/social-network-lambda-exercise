
package exercise;

import static exercise.Person.Gender.MALE;

public class Test {
    
    public static void main(String[] args) {
        
        People people = new People(20);
        
        // Print only males
        people.print(p -> p.getGender() == MALE);
       
    }
    
}
