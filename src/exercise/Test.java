
package exercise;

import static exercise.Person.Gender.MALE;
import exercise.Person.Tester;

public class Test {
    
    public static void main(String[] args) {
        
        People people = new People(20);
        
        people.print(new Tester() {
            @Override
            public boolean test(Person p) {
                // Select only boys under 18
                return p.getGender() == MALE && p.getAge() < 18;
            }
        });
       
    }
    
}
