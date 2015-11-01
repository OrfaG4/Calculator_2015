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
public class DivTest {
    
    public DivTest() {
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
     * Test of DivAction method, of class Div.
     */
    @Test
    public void testDivAction() {
        System.out.println("DivAction");
        double Number1 = 9.0;
        double Number2 = 3.0;
        double expResult = 3.0;
        double result = Div.DivAction(Number1, Number2);
        assertEquals(expResult, result, 3.0);
       System.out.println(result);
    }
    
}
