/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package oovv;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

/**
 *
 * @author alumno
 */
public class OrdenaArrayNGTest {

    String[] array = Utils.split("10,12,23,446,85,7,7,18,96,710", ",");

    /**
     * Test of ordenar method, of class OrdenaArray.
     */
    @Test
    public void testOrdenar() throws Exception {
        System.out.println("ordenar");
        String[] args = array;
        int[] expResult = {7, 7, 10, 12, 18, 23, 85, 96, 446, 710};
        int[] result = OrdenaArray.ordenar(args);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
