package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity.CEDetalleProducto;

public interface CICambioDProducto {

    public void saveDetallePCIC(CEDetalleProducto poData);

    public void modificarDetallePCIC(String skuProd, String nombProd, String descProd, String cateProd, int stocProd, double precProd, String unidProd, String caduProd, String ubicProd, String trazProd, int entrPord, int saliProd, String codiEmpl);

    public void eliminarDetallePCIC(String poData);

    public HashSet<CEDetalleProducto> consultAllDetallePCIC();
}
