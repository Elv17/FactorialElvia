/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elvia Nunez
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    @Test(expected=ArithmeticException.class)
    public void testNmenorcero(){
        System.out.println("n_menor_cero");
        int n = -2;
        int expResult = -2;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
    };
    
   /*@Test(expected=ArithmeticException.class)
    public void testOver(){
        System.out.println("overflow");
        int n = 24;
        int expResult = 620448401733239439360000;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
    };*/
    
    @Test
    public void testCalculo() {
        System.out.println("Factorial4");
        int n = 4;
        int expResult = 24;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
