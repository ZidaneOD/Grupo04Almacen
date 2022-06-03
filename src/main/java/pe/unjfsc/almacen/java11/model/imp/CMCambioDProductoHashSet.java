package pe.unjfsc.almacen.java11.model.imp;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEDetalleProducto;
import pe.unjfsc.almacen.java11.model.CICambioDProducto;

public class CMCambioDProductoHashSet implements CICambioDProducto {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambioDProductoHashSet.class);

    private HashSet<CEDetalleProducto> oHsData;

    private CEDetalleProducto oDProducto;

    public CMCambioDProductoHashSet() {
        LOG.info("FSI] Start CMCambioDProductoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();
        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEDetalleProducto("C0001", "Leche", "Descremada", "CA01", 12, 15, "UN10", "11/09/2022", "UB01", "T001", 39, 52, "EM01"));
        oHsData.add(new CEDetalleProducto("C0001", "Turbo", "D'Nofrio", "CA02", 102, 2.10, "UN11", "10/10/2024", "UB02", "T002", 25, 120, "EM02"));
        oHsData.add(new CEDetalleProducto("C0001", "Monta carga", "Caterpillar", "CA03", 3, 600, "UN12", "08/02/2025", "UB03", "T004", 95, 96, "EM03"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveDetallePCIC(CEDetalleProducto poData) {
        LOG.info("[FSI] Start saveDetallePCIC : ", poData);
        oHsData.add(new CEDetalleProducto(poData.getSkuProd(), poData.getNombProd(), poData.getDescProd(), poData.getCateProd(), poData.getStocProd(), poData.getPrecProd(), poData.getUnidProd(), poData.getCaduProd(), poData.getUbicProd(), poData.getTrazProd(), poData.getEntrPord(), poData.getSaliProd(), poData.getCodiEmpl()));

    }

    @Override
    public void modificarDetallePCIC(String skuProd, String nombProd, String descProd, String cateProd, int stocProd, double precProd, String unidProd, String caduProd, String ubicProd, String trazProd, int entrPord, int saliProd, String codiEmpl) {
        LOG.info("[FSI] Start modificarDetallePCIC : {}", skuProd);
        Iterator<CEDetalleProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oDProducto = new CEDetalleProducto();
            oDProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oDProducto);

            if (oDProducto.getSkuProd().equals(skuProd)) {
                LOG.info("[FSI] Objeto modificado : {}", oDProducto);
                oDProducto.setNombProd(nombProd);
                break;
            }
        }
    }

    @Override
    public void eliminarDetallePCIC(String poData) {
        LOG.info("[FSI] Start eliminarDetallePCIC : {}", poData);
        Iterator<CEDetalleProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oDProducto = new CEDetalleProducto();
            oDProducto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oDProducto);

            if (oDProducto.getSkuProd().equals(poData)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oDProducto);
                oHsData.remove(oDProducto);
                break;
            }
        }
    }

    @Override
    public HashSet<CEDetalleProducto> consultAllDetallePCIC() {
        LOG.info("[FSI] Start consultAllDetallePCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }
}
