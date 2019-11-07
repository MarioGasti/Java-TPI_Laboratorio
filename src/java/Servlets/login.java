/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import DataAccess.JDBCConn;
import Models.*;

/**
 *
 * @author MarioGastonFerrufino
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

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
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        RequestDispatcher reqdis = getServletContext().getRequestDispatcher("/login.jsp");
        reqdis.forward(req, res);
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
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        int leg = 0;
        String pass = "";
        
        try {
            leg = Integer.parseInt(req.getParameter("txtLegajo"));
            pass = req.getParameter("txtPassword");
            Usuario user = new Usuario(leg, pass);
            JDBCConn conn = new JDBCConn();
            conn.login(user);
        } catch (Exception ex) {
            // 
            // ERROR. Alerta que no se pudo loggear.
            // 
        }
        RequestDispatcher reqdis = getServletContext().getNamedDispatcher("/index.jsp");
        reqdis.forward(req, res);
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
