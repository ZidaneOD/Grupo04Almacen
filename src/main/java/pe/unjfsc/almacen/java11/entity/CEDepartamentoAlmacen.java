package pe.unjfsc.almacen.java11.entity;

public class CEDepartamentoAlmacen {

    private String idDistrito;
    private String nombDepa;

    public CEDepartamentoAlmacen() {
    }

    public CEDepartamentoAlmacen(String idDistrito, String nombDepa) {
        this.idDistrito = idDistrito;
        this.nombDepa = nombDepa;
    }

    public String getNombDepa() {
        return nombDepa;
    }

    public void setNombDepa(String nombDepa) {
        this.nombDepa = nombDepa;
    }

    public String getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(String idDistrito) {
        this.idDistrito = idDistrito;
    }

    @Override
    public String toString() {
        return "CEDepartamentoAlmacen{" + "idDistrito=" + idDistrito + ", nombDepa=" + nombDepa + '}';
    }

}
