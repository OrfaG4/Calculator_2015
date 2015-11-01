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
public class AddTest {
    
    public AddTest() {
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
     * Test of AddAction method, of class Add.
     */
    @Test
    public void testAddAction() {
        System.out.println("AddAction");
        double Number1 = 1.0;
        double Number2 = 1.0;
        double expResult = 2.0;
        double result = Add.AddAction(Number1, Number2);
        assertEquals(expResult, result, 2.0);
        System.out.println(result);
    }
    
}
