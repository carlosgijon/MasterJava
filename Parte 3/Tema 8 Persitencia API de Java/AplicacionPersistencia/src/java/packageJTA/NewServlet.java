/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageJTA;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlos
 */
public class NewServlet extends HttpServlet {

    private void Pintar(PrintWriter out, int iddept) {
        EntityManagerFactory entidad_mf = Persistence.createEntityManagerFactory("AplicacionPersistenciaPU");
        EntityManager entidad_manager = entidad_mf.createEntityManager();
        
        // Creamos una query con el texto de la consulta
        Query consulta = entidad_manager.createQuery("SELECT d FROM Dept d");
        
        // Creamos una lista con los departamentos con objetos de la clase POJO que se ha generado
        List<packageJTA.Dept> lista_departamentos = consulta.getResultList();
        
        // Creamos objetos para cada entidad de departamento
        Dept departamento = entidad_manager.find(Dept.class, iddept);
        
        if(departamento == null) {
            out.println("<h4>No se ha encontrado el departamento</h4>");
        }
        else {
            out.println("<h4 class=\"uk-text-success\">Departamento encontrado: " +departamento.getDname()+ "</h4>");
        }
        
        out.println("<h4>Lista de departamentos</h4>");
        out.println("<table class='uk-table uk-table-striped'>");
        for(packageJTA.Dept d : lista_departamentos) {
            out.println("<tr>");
            out.println("<td>" +d.getDeptno()+ "</td>");
            out.println("<td>" +d.getDname()+ "</td>");
            out.println("<td>" +d.getLoc()+ "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("<a href=\"index.jsp\" class=\"uk-button uk-button-primary uk-width-1-1\">Volver a la busqueda</a>");

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>"); 
            out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css' />");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js'></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover\">");
            out.println("<h1>DATO ENCONTRADO</h1>");
            
            String departamento = request.getParameter("txtnumero");
            int iddept = Integer.parseInt(departamento);
            
            this.Pintar(out, iddept);
            
            out.println("</div>");            
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception exc) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>"); 
            out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css' />");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js'></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover\">");
            out.println("<h1 class=\"uk-text-danger\">EXCEPCION</h1>");
            out.println(exc.toString());
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
        finally {
            out.close();
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
