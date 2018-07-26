package packagejta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletJTA extends HttpServlet {
    
    EntityManagerFactory entidad_mf = Persistence.createEntityManagerFactory("AplicacionJTAPU");
    
    public void crearBBDD() {
        
        EntityManager entidad_manager = entidad_mf.createEntityManager();
        
        try {
            entidad_manager.getTransaction().begin();
            
            // Creamos un array de objetos de la clase jugador
            ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
            
            // Creamos un objeto de Jugador
            Jugador obj_jugador = new Jugador();
            
            // Añadimos datos de Iniesta
            obj_jugador.setId(1);
            obj_jugador.setNombre_jugador("Iniesta");
            obj_jugador.setCalidad(9);
            obj_jugador.setPosicion("Mediapunta");
            
            // Añadimos el jugador al array
            jugadores.add(obj_jugador);
            
            // Añadimos datos de Xavi Alonso
            obj_jugador = new Jugador();
            obj_jugador.setId(2);
            obj_jugador.setNombre_jugador("Xavi Alonso");
            obj_jugador.setCalidad(8);
            obj_jugador.setPosicion("Mediocentro");
            
            // Añadimos el jugador al array
            jugadores.add(obj_jugador);
            
            // Añadimos datos de Iker
            obj_jugador = new Jugador();
            obj_jugador.setId(3);
            obj_jugador.setNombre_jugador("Iker Casillas");
            obj_jugador.setCalidad(10);
            obj_jugador.setPosicion("Portero");
            
            // Añadimos el jugador al array
            jugadores.add(obj_jugador);
            
            // Hacemos todos los objetos de Jugador persistentes, para ello los recorremos con un bucle for
            for(Jugador jugador:jugadores) {
                entidad_manager.persist(jugador);
            } 
            entidad_manager.getTransaction().commit();  
        }
        catch(Exception exc) {
            entidad_manager.getTransaction().rollback();
        }
        finally {
            entidad_manager.close();
        }   
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
           throws ServletException, java.io.IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        try {
            this.crearBBDD();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletJTA</title>");
            out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css' />");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js'></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover\">");
            out.println("<h1>DATOS CREADOS CORRECTAMENTE</h1>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception exc) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletJTA</title>");
            out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/css/uikit.min.css' />");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit.min.js'></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.6/js/uikit-icons.min.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"uk-container uk-margin uk-card uk-card-default uk-card-body uk-card-hover\">");
            out.println("<h1>EXCEPCION!!!</h1>");
            out.println("<p>" +exc.toString()+ "</p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
        finally {
            out.close();
        }
    }
}