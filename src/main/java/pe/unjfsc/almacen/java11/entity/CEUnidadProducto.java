package pe.unjfsc.almacen.java11.entity;

public class CEUnidadProducto {

    String codiUnid;
    String nombUnid;

    public CEUnidadProducto() {
    }

    public CEUnidadProducto(String codiUnid, String nombUnid) {
        this.codiUnid = codiUnid;
        this.nombUnid = nombUnid;
    }

    public String getCodiUnid() {
        return codiUnid;
    }

    public void setCodiUnid(String codiUnid) {
        this.codiUnid = codiUnid;
    }

    public String getNombUnid() {
        return nombUnid;
    }

    public void setNombUnid(String nombUnid) {
        this.nombUnid = nombUnid;
    }

    @Override
    public String toString() {
        return "CEUnidad{" + "codiUnid=" + codiUnid + ", nombUnid=" + nombUnid + '}';
    }


}
