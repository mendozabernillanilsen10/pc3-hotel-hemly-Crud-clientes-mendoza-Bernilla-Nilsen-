/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import DAO.AreaDAO;
import DAO.ClienteDAO;
import DAO.EmpleadoDao;
import DAO.ReservaDAO;
import Modelo.Reserva;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author smith
 */
public class controladorHabitacion extends HttpServlet {

     ReservaDAO listaReservaDao=new ReservaDAO();
      EmpleadoDao daoempleado = new EmpleadoDao();
      ClienteDAO dao_clienrte = new ClienteDAO();
     AreaDAO areadao= new AreaDAO();
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String accion =request.getParameter("accion");
          
          if(accion.equalsIgnoreCase("editar")){
              String id=request.getParameter("id");;
              String fecha=request.getParameter("fecha");;
              String ID_HABITACION=request.getParameter("ID_HABITACION");;
              Reserva reserva = new Reserva();
              reserva.setId_reserva(id);
              reserva.setFecha_reservacion(fecha);
              reserva.setId_habitacion(ID_HABITACION);
              
              if(listaReservaDao.actualizar(reserva)){
                    List lista=listaReservaDao.Listar();
                    request.setAttribute("reservas", lista);
                    request.getRequestDispatcher("vistas/lista_reservas.jsp").include(request, response);  
              }else{
                    request.getRequestDispatcher("Principal.jsp").include(request, response);  

              }

            if(accion.equalsIgnoreCase("agregar")){
                
                
                
            }   
              
              
          }
        
        
    }


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
