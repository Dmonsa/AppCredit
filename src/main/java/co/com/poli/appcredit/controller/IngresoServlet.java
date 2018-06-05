/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcredit.controller;

import co.com.poli.appcredit.jpacontroller.TblusuariosJpaController;
import co.com.poli.appcredit.util.JPAFactory;
import co.com.poli.appcredit.model.Tblusuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dmons
 */
public class IngresoServlet extends HttpServlet {

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
        try {
            HttpSession session = request.getSession(true);
            RequestDispatcher rd = null;
            String credito = request.getParameter("txtcredito");
            String documento = request.getParameter("txtdocumento");
            String nombres = request.getParameter("txtnombres");
            String apellidos = request.getParameter("txtapellidos");
            String monto = request.getParameter("txtmonto");
            String tipotrabajador = request.getParameter("txttipotrabajador");
            String tipocredito = request.getParameter("txttipocredito");
            String tcompania = request.getParameter("txttcompania");
            String accion = request.getParameter("accion");

            TblusuariosJpaController jpaController
                    = new TblusuariosJpaController(JPAFactory.getFACTORY());

            switch (accion) {

                case "Guardar":
                    rd = request.getRequestDispatcher("/view/main.jsp");
                    Tblusuarios tblusuarios = new Tblusuarios(credito);
                    tblusuarios.setDocumento(documento);
                    tblusuarios.setNombres(nombres);
                    tblusuarios.setApellidos(apellidos);
                    tblusuarios.setMonto(monto);
                    tblusuarios.setTipotrabajador(tipotrabajador);
                    tblusuarios.setTipocredito(tipocredito);
                    tblusuarios.setTipocomp(tcompania);
                    jpaController.create(tblusuarios);
                    break;
            }
            rd.forward(request, response);

        } catch (Exception ex) {
            Logger.getLogger(IngresoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
