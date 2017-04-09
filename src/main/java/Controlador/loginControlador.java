package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class loginControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("txtCode");
        String usuario = request.getParameter("txtUser");
        String password = request.getParameter("txtPassword");
        int code;
        Usuario temp = null;
        
        if(codigo.equals("") || usuario.equals("") || password.equals("")){
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }else{
             UsuarioDAO user = new UsuarioDAO();
             if(!user.existUsuario(usuario)){
                 request.getRequestDispatcher("error2.jsp").forward(request, response);
             }else{
                try{
                    //Hace Login 
                    code = Integer.parseInt(codigo);
                    String aux = user.login(usuario, password, code);
                    System.out.println(aux);
                    String[] arr = aux.split(",");
                    temp = new Usuario();
                    temp.setCuenta(arr[0]);
                    temp.setNombre(arr[1]);
                    temp.setCodigo(Integer.parseInt(arr[2]));
                    //creando session
                    request.getSession().setAttribute("actual", temp);
                    request.getRequestDispatcher("Menu.jsp").forward(request, response);
                }catch(Exception e){
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                    System.out.println("Ocurrio una exception: "+e.getMessage());
                }
             }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
