package pe.unjfsc.almacen.java11.modela1;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CECategoria_Producto;

public interface CICambioCategoria {

    public void saveCategoriaCIC(CECategoria_Producto poData);

    public void modificarCategoriaCIC(String pId, String nombCate);

    public void eliminarCategoriaCIC(String poData);

    public HashSet<CECategoria_Producto> consultAllCategoriaCIC();

}
