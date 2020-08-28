/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import ADTs.StackADT;
import Exceptions.EmptyCollectionException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chidi
 * @param <T>
 * @version 2/23/2019
 */
public class ArrayListStack<T> implements StackADT<T> {
    
    private List stack;
    
    /**
    This method creates the 
    */
    public ArrayListStack() {
        stack = new ArrayList(); 
    }

    @Override
    public void push(T element) {
        stack.add(0, element);
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if (!isEmpty()) {
            T result = (T)stack.get(0);
            stack.remove(0);
            return result;
        } else {
            throw new EmptyCollectionException("Stack is empty");
        }
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack is empty");
        } else {
            T result = (T) stack.get(0);
            return result;
        }
      
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < size(); i++) {
            if (stack.get(size()) != null) {
                sb.append(stack.get(i).toString());
                sb.append(", ");
            }
        }
        return "ArrayListStack{" + '}';
    }
    
}

