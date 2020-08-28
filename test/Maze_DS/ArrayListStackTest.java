/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chidi
 * @version 2/23/2019
 */
public class ArrayListStackTest {
  

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        ArrayListStack instance = new ArrayListStack();
        instance.push(element);
        assertEquals(instance.size(), 1);
        instance.push("a");
        assertEquals(instance.size(), 2);
        
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of pop method, of class ArrayListStack.
     * @throws java.lang.Exception
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        ArrayListStack instance = new ArrayListStack();
        instance.push("a");
        assertFalse(instance.isEmpty());
        instance.pop();
        assertTrue(instance.isEmpty());
        
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of peek method, of class ArrayListStack.
     * @throws java.lang.Exception
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        instance.push("a"); 
        assertEquals(instance.peek(), "a");
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of toString method, of class ArrayListStack.
     */
   
    
}
