
package exercise;

import exercise.Person.Gender;

public class Test {
    
    public static void main(String[] args) {
        
        People people = new People(20);
        
        class Tester implements Person.Tester {
            @Override
            public boolean test(Person p) {
                // Select females aged 18+
                return p.getAge() >= 18 && p.getGender() == Gender.FEMALE;
            }
        }
        
        people.print(new Tester());
       
    }
    
}
