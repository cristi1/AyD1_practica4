/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import junit.framework.TestCase;

/**
 *
 * @author Usuario
 */
public class ServiciosDAOTest extends TestCase {
    
    public ServiciosDAOTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of existCuenta method, of class ServiciosDAO.
     */
    public void testExistCuenta() {
        System.out.println("existCuenta");
        String noCuenta = "600789";
        ServiciosDAO instance = new ServiciosDAO();
        boolean expResult = true;
        boolean result = instance.existCuenta(noCuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of disponibilidadSaldo method, of class ServiciosDAO.
     */
    public void testDisponibilidadSaldo() {
        System.out.println("disponibilidadSaldo");
        String noCuenta = "600789";
        int cantidad = 50;
        ServiciosDAO instance = new ServiciosDAO();
        boolean expResult = true;
        boolean result = instance.disponibilidadSaldo(noCuenta, cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pagoServicio method, of class ServiciosDAO.
     */
    public void testPagoServicio() {
        System.out.println("pagoServicio");
        String noCuentaCliente = "600789";
        String noCuentaServicio = "600789";
        int cantidad = 50;
        ServiciosDAO instance = new ServiciosDAO();
        boolean expResult = true;
        boolean result = instance.pagoServicio(noCuentaCliente, noCuentaServicio, cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
