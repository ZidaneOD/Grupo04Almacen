
package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;

import pe.unjfsc.almacen.java11.entity.CEPuesto;

/**
 *
 * @author Freddy
 */
public interface CICambioPuesto {
    public void saveCategoriaCIC(CEPuesto poData);

    public void modificarCategoriaCIC(String pId, String nombCate);

    public void eliminarCategoriaCIC(String poData);

    public HashSet<CEPuesto> consultAllCategoriaCIC();
}
