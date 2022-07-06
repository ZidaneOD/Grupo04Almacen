package pe.unjfsc.almacen.java11.modela1;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CEUbicacion_Almacen;

public interface CICambioUbicacion {

    public void saveUbicacionCIC(CEUbicacion_Almacen poData);

    public void modificarUbicacionCIC(String pId, String nomb, String ubic);

    public void eliminarUbicacionCIC(String poData);

    public HashSet<CEUbicacion_Almacen> consultAllUbicacionCIC();

}
