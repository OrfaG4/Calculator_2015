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
public class MinTest {
    
    public MinTest() {
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
     * Test of MinAction method, of class Min.
     */
    @Test
    public void testMinAction() {
        System.out.println("MinAction");
        double Number1 = 10.0;
        double Number2 = 5.0;
        double expResult = 5.0;
        double result = Min.MinAction(Number1, Number2);
        assertEquals(expResult, result, 5.0);
        System.out.println(result);
    }
    
}
