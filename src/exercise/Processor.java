/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.function.Consumer;

/**
 *
 * @author Jacek
 */
public class Processor<T> {
    
    public void processElements(Iterable<T> data, Consumer<T> action) {
        for (T object : data) {
            action.accept(object);
        }
    }
    
}
