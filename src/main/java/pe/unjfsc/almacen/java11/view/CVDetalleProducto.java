package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEDetalleProducto;
import pe.unjfsc.almacen.java11.modela1.CICambioDProducto;
import pe.unjfsc.almacen.java11.modela1.imp.CMCambioDProductoHashSet;

public class CVDetalleProducto {

    private static final Logger LOG = LoggerFactory.getLogger(CVDetalleProducto.class);

    public void agregar(String skuProd, String nombProd, String descProd, String cateProd, int stocProd, double precProd, String unidProd, String caduProd, String ubicProd, String trazProd, int entrPord, int saliProd, String codiEmpl) {
        CICambioDProducto oCrud = new CMCambioDProductoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CEDetalleProducto oDProducto = new CEDetalleProducto();
        oDProducto.setSkuProd(skuProd);
        oDProducto.setNombProd(nombProd);
        oDProducto.setDescProd(descProd);

        oCrud.saveDetallePCIC(oDProducto);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllDetallePCIC());;

    }

    public void elimnar(String a) {
        CICambioDProducto oCrud = new CMCambioDProductoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.eliminarDetallePCIC(a);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllDetallePCIC());;
    }

    public void modificar(String skuProd, String nombProd, String descProd, String cateProd, int stocProd, double precProd, String unidProd, String caduProd, String ubicProd, String trazProd, int entrPord, int saliProd, String codiEmpl) {
        CICambioDProducto oCrud = new CMCambioDProductoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.modificarDetallePCIC(skuProd, nombProd, descProd, cateProd, stocProd, precProd, unidProd, caduProd, ubicProd, trazProd, entrPord, saliProd, codiEmpl);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllDetallePCIC());;
    }

    public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");

        String codi = "UB04";
        String nomb = "Lambayeque";
        String direc = "Jr. 28 De Julio #125";

        CICambioDProducto tmp = new CMCambioDProductoHashSet();

        //tmp.agregar(codi, nomb);
        //tmp.elimnar(codi);
        tmp.modificarDetallePCIC(direc, nomb, direc, codi, 0, 0, direc, direc, direc, direc, 0, 0, codi);
        /*CICambioCategoria oCrud = new CMCambioCategoriaHashSet();
        oCrud.consultAllCategoriaCIC();*/
    }
}
