package Utilidades;

public class Persona implements java.io.Serializable {
    private String m_nombre, m_apellidos, m_telefono, m_email;

    // CONSTRUCTORES
    public Persona() {}
    public Persona(String a, String b, String c, String d) {
        m_nombre = a;
        m_apellidos = b;
        m_telefono = c;
        m_email = d;
    }

    // METODOS
    public String obtener_nombre() {
        return m_nombre;
    }

    public String obtener_apellidos() {
        return m_apellidos;
    }

    public String obtener_telefono() {
        return m_telefono;
    }

    public String obtener_email() {
        return m_email;
    }
}
