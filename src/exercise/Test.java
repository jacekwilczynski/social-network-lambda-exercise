
package exercise;

import exercise.Person.Gender;

public class Test {
    
    public static void main(String[] args) {
        
        People people = new People(20);
        
        // Print pensioners
        people.print(p -> (p.getGender() == Gender.MALE && p.getAge() >= 65) ||
                (p.getGender() == Gender.FEMALE && p.getAge() >= 60));
       
    }
    
}
