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
public class UsuarioDAOTest extends TestCase {
    
    public UsuarioDAOTest(String testName) {
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
     * Test of login method, of class UsuarioDAO.
     */
    public void testLogin() {
        System.out.println("login");
        String user = "lauralopez";
        String pass = "12345";
        int cod = 19;
        UsuarioDAO instance = new UsuarioDAO();
        String expResult = "190789"+","+"Laura Lopez"+","+"19";
        String result = instance.login(user, pass, cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of existUsuario method, of class UsuarioDAO.
     */
    public void testExistUsuario() {
        System.out.println("existUsuario");
        String user = "lauralopez";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.existUsuario(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertUsuario method, of class UsuarioDAO.
     */
    public void testInsertUsuario() {
        System.out.println("insertUsuario");
        String nombre = "Carminia Fuentes";
        String usuario = "carmiUnica80";
        String correo = "carmi123@gmail.com";
        String password = "carmi123";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.insertUsuario(nombre, usuario, correo, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
