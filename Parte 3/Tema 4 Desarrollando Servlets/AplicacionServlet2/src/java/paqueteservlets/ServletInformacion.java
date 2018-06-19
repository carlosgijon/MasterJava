/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlos
 */
public class ServletInformacion extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // VARIABLES CON LOS CAMPOS DE TEXTO DEL FORMULARIO
        String nombre, edad, direccion;
        
        // Se inicializan las variables con request.getParameter
        nombre = request.getParameter("txtnombre");
        edad = request.getParameter("txtedad");
        direccion = request.getParameter("txtdireccion");
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletInformación</title>");
            out.println("        <!-- UIkit CSS -->\n" +
                        "        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css\" />\n" +
                        "\n" +
                        "        <!-- UIkit JS -->\n" +
                        "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js\"></script>\n" +
                        "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js\"></script>");
            out.println("</head>");
            out.println("<body style='text-align: center;'>");
            out.println("<div class='uk-container'>");
            out.println("<h1>Datos recibidos</h1>");
            out.println("<h4>Nombre: " +nombre+"</h4>");
            out.println("<h4>Edad: " +edad+ "</h4>");
            out.println("<h4>Dirección: " +direccion+ "</h4>");
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
}
