/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package oovv;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author alumno
 */
public class ParImparNGTest {
    
    /**
     * Test of Par method, of class ParImpar.
     */
    int[] array = {1,2,3,4,5,6,7,8,9,10};

    @Test
    public void testPar() {
        System.out.println("Par");     
        String expResult = "2,4,6,8,10,";
        String result = ParImpar.Par(array);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of Impar method, of class ParImpar.
     */
    @Test
    public void testImpar() {
        System.out.println("Impar");
        String expResult = "1,3,5,7,9,";
        String result = ParImpar.Impar(array);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarNumeroMasAlto method, of class ParImpar.
     */
    @Test
    public void testMostrarNumeroMasAlto() {
        System.out.println("mostrarNumeroMasAlto");
        int expResult = 10;
        int result = ParImpar.mostrarNumeroMasAlto(array);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarNumeroMasBajo method, of class ParImpar.
     */
    @Test
    public void testMostrarNumeroMasBajo() {
        System.out.println("mostrarNumeroMasBajo");
        int expResult = 1;
        int result = ParImpar.mostrarNumeroMasBajo(array);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraArray method, of class ParImpar.
     */
//    @Test
    public void testMuestraArray() {
        System.out.println("muestraArray");
        int[] array = null;
        String expResult = "";
        String result = ParImpar.muestraArray(array);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
