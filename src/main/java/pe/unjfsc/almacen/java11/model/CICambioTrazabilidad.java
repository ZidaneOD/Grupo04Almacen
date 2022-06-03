package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CETrazabilidadProducto;

public interface CICambioTrazabilidad {

    public void saveTrazabilidadCIC(CETrazabilidadProducto poData);

    public void modificarTrazabilidadCIC(String pId, String nombCate);

    public void eliminarTrazabilidadCIC(String poData);

    public HashSet<CETrazabilidadProducto> consultAllTrazabilidadCIC();
}
