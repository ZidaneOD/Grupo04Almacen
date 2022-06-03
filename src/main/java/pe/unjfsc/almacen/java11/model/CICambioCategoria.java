package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CECategoriaProducto;

public interface CICambioCategoria {

    public void saveCategoriaCIC(CECategoriaProducto poData);

    public void modificarCategoriaCIC(String pId, String nombCate);

    public void eliminarCategoriaCIC(String poData);

    public HashSet<CECategoriaProducto> consultAllCategoriaCIC();

}
