public class Persona {
    private String nombre;
    private int telefono, codigo_persona;

    // CONSTRUCTOR
    public Persona(String nom, int tel, int cp) {
        this.nombre = nom;
        this.telefono = tel;
        this.codigo_persona = cp;
    }

    // SETTERs y GETTERs
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setTelefono(int tel) {
        this.telefono = tel;
    }

    public void setCodigo_persona(int cp) {
        this.codigo_persona = cp;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public int getCodigo_persona() {
        return this.codigo_persona;
    }

}
