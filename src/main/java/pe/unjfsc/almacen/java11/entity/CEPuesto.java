package pe.unjfsc.almacen.java11.entity;

/**
 *
 * @author Freddy
 */
public class CEPuesto {

    String codiPues;
    String nombPues;

    public CEPuesto(String codiPues, String nombPues) {
        this.codiPues = codiPues;
        this.nombPues = nombPues;
    }

    public CEPuesto() {
    }
    
    

    public String getCodiPues() {
        return codiPues;
    }

    public void setCodiPues(String codiPues) {
        this.codiPues = codiPues;
    }

    public String getNombPues() {
        return nombPues;
    }

    public void setNombPues(String nombPues) {
        this.nombPues = nombPues;
    }
}
