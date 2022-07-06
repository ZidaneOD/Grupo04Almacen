package pe.unjfsc.almacen.java11.entity1;

public class CEEmpleadoProducto {

    String codiEmp;
    String nombEmp;
    String apaEmp;
    String amaEmp;
    String dniEmp;
    String telfEmp;

    public CEEmpleadoProducto() {
    }

    public CEEmpleadoProducto(String codiEmp, String nombEmp, String apaEmp, String amaEmp, String dniEmp, String telfEmp) {
        this.codiEmp = codiEmp;
        this.nombEmp = nombEmp;
        this.apaEmp = apaEmp;
        this.amaEmp = amaEmp;
        this.dniEmp = dniEmp;
        this.telfEmp = telfEmp;
    }

    public String getCodiEmp() {
        return codiEmp;
    }

    public void setCodiEmp(String codiEmp) {
        this.codiEmp = codiEmp;
    }

    public String getNombEmp() {
        return nombEmp;
    }

    public void setNombEmp(String nombEmp) {
        this.nombEmp = nombEmp;
    }

    public String getApaEmp() {
        return apaEmp;
    }

    public void setApaEmp(String apaEmp) {
        this.apaEmp = apaEmp;
    }

    public String getAmaEmp() {
        return amaEmp;
    }

    public void setAmaEmp(String amaEmp) {
        this.amaEmp = amaEmp;
    }

    public String getDniEmp() {
        return dniEmp;
    }

    public void setDniEmp(String dniEmp) {
        this.dniEmp = dniEmp;
    }

    public String getTelfEmp() {
        return telfEmp;
    }

    public void setTelfEmp(String telfEmp) {
        this.telfEmp = telfEmp;
    }

    @Override
    public String toString() {
        return "CEEmpleadoProducto{" + "codiEmp=" + codiEmp + ", nombEmp=" + nombEmp + ", apaEmp=" + apaEmp + ", amaEmp=" + amaEmp + ", dniEmp=" + dniEmp + ", telfEmp=" + telfEmp + '}';
    }

}
