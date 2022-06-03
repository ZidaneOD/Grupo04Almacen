
package pe.unjfsc.almacen.java11.entity;

public class CETrazabilidadProducto {
    private String codiTraz;
    private String nombTraz;

    public CETrazabilidadProducto(String codiTraz, String nombTraz) {
        this.codiTraz = codiTraz;
        this.nombTraz = nombTraz;
    }

    public CETrazabilidadProducto() {
    }

    public String getCodiTraz() {
        return codiTraz;
    }

    public void setCodiTraz(String codiTraz) {
        this.codiTraz = codiTraz;
    }

    public String getNombTraz() {
        return nombTraz;
    }

    public void setNombTraz(String nombTraz) {
        this.nombTraz = nombTraz;
    }

    @Override
    public String toString() {
        return "CETrazabilidadProducto{" + "codiTraz=" + codiTraz + ", nombTraz=" + nombTraz + '}';
    }
    
    
    
}
