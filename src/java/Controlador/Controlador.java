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
import Modelo.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author smith
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})

public class Controlador extends HttpServlet {
      ReservaDAO listaReservaDao=new ReservaDAO();
      Reserva robjet = new Reserva();
      EmpleadoDao daoempleado = new EmpleadoDao();
      ClienteDAO dao_clienrte = new ClienteDAO();
     AreaDAO areadao= new AreaDAO();
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String menu= request.getParameter("menu");
         String accion =request.getParameter("accion");
         String valida =request.getParameter("editar_reserva");
         if(menu.equals("Principal")){
          
           request.getRequestDispatcher("Principal.jsp").include(request, response);
      
        }
           
        if(menu.equals("l_reserva1")){
            switch(accion){
                 case "listar": 
                     List lista=listaReservaDao.Listar();
                     request.setAttribute("reservas", lista);
                     request.getRequestDispatcher("vistas/lista_reservas.jsp").include(request, response);  break;
                 case "editar":
                        String  id =request.getParameter("id");
                        robjet = listaReservaDao.get_reserva(id);
                        request.setAttribute("reservas", robjet);
                        request.getRequestDispatcher("vistas/editarReserva.jsp").include(request, response); ;break;
                 
                 case "agregar_reserva": 
                                          
                     request.getRequestDispatcher("vistas/agregar_reserva.jsp").include(request, response); 
                     ;
                     break;

                    
            } 
            }
            if (menu.equals("Cliente")){
                switch(accion){
                     case "listar_cliente": 
                             List lista_clientes=dao_clienrte.Listar();
                              request.setAttribute("lista_Empleados", lista_clientes);
                              request.getRequestDispatcher("vistas/clientes/listar_cliente.jsp").include(request, response);  
                         break;
                }
                
                
            }
            
           if (menu.equals("Area")){
                switch(accion){
                     case "listar__area": 
                              List Lista_area=areadao.Listar();
                              request.setAttribute("listaArea", Lista_area);
                              request.getRequestDispatcher("vistas/area/listar_area.jsp").include(request, response);  
                         break;
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
