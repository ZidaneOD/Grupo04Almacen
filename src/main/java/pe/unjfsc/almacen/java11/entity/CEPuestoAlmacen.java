package pe.unjfsc.almacen.java11.entity;

public class CEPuestoAlmacen {

    String codiPues;
    String nombPues;

    public CEPuestoAlmacen(String codiPues, String nombPues) {
        this.codiPues = codiPues;
        this.nombPues = nombPues;
    }

    public CEPuestoAlmacen() {
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

    @Override
    public String toString() {
        return "CEPuestoAlmacen{" + "codiPues=" + codiPues + ", nombPues=" + nombPues + '}';
    }
    
    
}
