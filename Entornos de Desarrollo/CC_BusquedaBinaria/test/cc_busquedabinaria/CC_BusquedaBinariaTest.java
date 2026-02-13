/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cc_busquedabinaria;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CC_BusquedaBinariaTest {
    
    public CC_BusquedaBinariaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of busquedaBinaria method, of class CC_BusquedaBinaria.
     */
    @Test
    public void testBusquedaBinariaCajaNegra() {
        System.out.println("busquedaBinaria");
        int numero = 0;
        CC_BusquedaBinaria instance = new CC_BusquedaBinaria();
        int expResult = -1;
        int result = instance.busquedaBinaria(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBusquedaBinariaCajaBlanca() {
        System.out.println("busquedaBinaria");
        int numero = 1;
        CC_BusquedaBinaria instance = new CC_BusquedaBinaria();
        int expResult = 0;
        int result = instance.busquedaBinaria(numero);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class CC_BusquedaBinaria.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CC_BusquedaBinaria.main(args);
    }
    
}
