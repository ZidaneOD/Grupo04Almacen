package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEUbicacionAlmacen;

public interface CICambioUbicacion {

    public void saveUbicacionCIC(CEUbicacionAlmacen poData);

    public void modificarUbicacionCIC(String pId, String nomb, String ubic);

    public void eliminarUbicacionCIC(String poData);

    public HashSet<CEUbicacionAlmacen> consultAllUbicacionCIC();

}
