package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEUnidadProducto;

public interface CICambioUnidad {

    public void saveUnidadCIC(CEUnidadProducto poData);

    public void modificarUnidadCIC(String pId, String nombUnid);

    public void eliminarUnidadCIC(String poData);

    public HashSet<CEUnidadProducto> consultAllUnidadCIC();
}
