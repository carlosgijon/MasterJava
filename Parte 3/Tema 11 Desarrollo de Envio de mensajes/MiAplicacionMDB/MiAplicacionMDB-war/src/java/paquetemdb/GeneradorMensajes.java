/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetemdb;

import javax.jms.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlos
 */
@WebServlet(name = "GeneradorMensajes", urlPatterns = {"/GeneradorMensajes"})
public class GeneradorMensajes extends HttpServlet {
    
    @Resource(mappedName="jms/QueueFactory")
    javax.jms.QueueConnectionFactory conexion_a_cola;
    
    @Resource(mappedName="jms/Queue")
    javax.jms.Queue cola;
    


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GeneradorMensajes</title>");  
            
            out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css\" />");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js\"></script>");

            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover\">");
            
            Connection conexion = conexion_a_cola.createConnection();
            Session sesion = conexion.createSession(false,Session.AUTO_ACKNOWLEDGE);
            
            // Se crea un productor y un mensaje de tipo Map
            MessageProducer productor = sesion.createProducer(cola);
            MapMessage mensaje = sesion.createMapMessage();
            
            // DATOS PARA EL MENSAJE
            String nombre = request.getParameter("txtnombre");
            String apellido = request.getParameter("txtapellido");
            String texto = request.getParameter("txttexto");
            
            // Se le asignan los datos al mensaje
            mensaje.setString("nombre", nombre);
            mensaje.setString("apellido", apellido);
            mensaje.setString("texto", texto);
            
            // Se envia el mensaje desde el productor y se cierra la conexion
            productor.send(mensaje);
            productor.close();
            sesion.close();
            conexion.close();
            
            
            out.println("<h1>Servlet GeneradorMensajes en " + request.getContextPath() + "</h1>");
            out.println("<p class=\"uk-text-success\">Mensaje enviado correctamente </p>");

        }
        catch(Exception exc) {
            out.println("<h1 class=\"uk-text-danger\">Excepcion al enviar el mensaje</h1>");
            out.println("<p class=\"uk-text-muted\">" + exc.toString() +"</p>");
        }
        finally {
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            
            // Cerramos el flujo de salida
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
