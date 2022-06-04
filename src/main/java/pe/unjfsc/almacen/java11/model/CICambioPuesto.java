
package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;

import pe.unjfsc.almacen.java11.entity.CEPuestoAlmacen;

public interface CICambioPuesto {
    public void savePuestoCIC(CEPuestoAlmacen poData);

    public void modificarPuestoCIC(String pId, String nombPues);

    public void eliminarPuestoCIC(String poData);

    public HashSet<CEPuestoAlmacen> consultAllPuestoCIC();
}
