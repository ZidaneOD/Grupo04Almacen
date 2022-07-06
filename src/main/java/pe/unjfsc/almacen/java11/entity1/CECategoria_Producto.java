package pe.unjfsc.almacen.java11.entity1;

public class CECategoria_Producto {

    private String codiCate;
    private String nombCate;

    public CECategoria_Producto() {
    }

    public CECategoria_Producto(String codiCate, String nombCate) {
        this.codiCate = codiCate;
        this.nombCate = nombCate;
    }

    public String getCodiCate() {
        return codiCate;
    }

    public void setCodiCate(String codiCate) {
        this.codiCate = codiCate;
    }

    public String getNombCate() {
        return nombCate;
    }

    public void setNombCate(String nombCate) {
        this.nombCate = nombCate;
    }

    @Override
    public String toString() {
        return "CECategoria{" + "codiCate=" + codiCate + ", nombCate=" + nombCate + '}';
    }

}
