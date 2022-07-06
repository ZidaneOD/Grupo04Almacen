package pe.unjfsc.almacen.java11.entity1;

public class CEUbicacion_Almacen {

    private String codiUbic;
    private String nombUbic;
    private String direcUbic;

    public CEUbicacion_Almacen() {
    }

    public CEUbicacion_Almacen(String codiUbic, String nombUbic, String direcUbic) {
        this.codiUbic = codiUbic;
        this.nombUbic = nombUbic;
        this.direcUbic = direcUbic;
    }

    public String getCodiUbic() {
        return codiUbic;
    }

    public void setCodiUbic(String codiUbic) {
        this.codiUbic = codiUbic;
    }

    public String getNombUbic() {
        return nombUbic;
    }

    public void setNombUbic(String nombUbic) {
        this.nombUbic = nombUbic;
    }

    public String getDirecUbic() {
        return direcUbic;
    }

    public void setDirecUbic(String direcUbic) {
        this.direcUbic = direcUbic;
    }

    @Override
    public String toString() {
        return "CEUbicacionAlmacen{" + "codiUbic=" + codiUbic + ", nombUbic=" + nombUbic + ", direcUbic=" + direcUbic + '}';
    }

}
