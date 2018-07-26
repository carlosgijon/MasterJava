package packagejta;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Jugador implements Serializable {

    /**
     * @return the nombre_jugador
     */
    public String getNombre_jugador() {
        return nombre_jugador;
    }

    /**
     * @param nombre_jugador the nombre_jugador to set
     */
    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the calidad
     */
    public int getCalidad() {
        return calidad;
    }

    /**
     * @param calidad the calidad to set
     */
    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "packagejta.Jugador[ id=" + id + " ]";
    }
    
    // VARIABLES
    private String nombre_jugador;
    private String posicion;
    private int calidad;
    
    //CONSTRUCTORES
    public Jugador() {
        this.nombre_jugador = "";
        this.posicion = "";
        this.calidad = 0;
    }
    
    public Jugador(int id_jugador, String nombre_jugador, String posicion, int calidad) {
        this.id = id_jugador;
        this.nombre_jugador = nombre_jugador;
        this.posicion = posicion;
        this.calidad = calidad;
    }

}
