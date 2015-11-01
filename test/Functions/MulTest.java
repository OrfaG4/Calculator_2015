/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author georg_000
 */
public class MulTest {
    
    public MulTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of MulAction method, of class Mul.
     */
    @Test
    public void testMulAction() {
        System.out.println("MulAction");
        double Number1 = 2.0;
        double Number2 = 3.0;
        double expResult = 6.0;
        double result = Mul.MulAction(Number1, Number2);
        assertEquals(expResult, result, 6.0);
        
    }
    
}
