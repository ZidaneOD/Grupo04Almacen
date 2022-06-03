package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEUbicacionAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioUbicacion;

public class CMCambioUbicacionHashSet implements CICambioUbicacion {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambioUbicacionHashSet.class);

    private HashSet<CEUbicacionAlmacen> oHsData;

    private CEUbicacionAlmacen oUbicacion;

    public CMCambioUbicacionHashSet() {
        LOG.info("FSI] Start CMCambioCategoriaHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEUbicacionAlmacen("UB01", "Huaral", "Av. Alfonso Ugarte #210"));
        oHsData.add(new CEUbicacionAlmacen("UB02", "Huaura", "Av. Blas de la Carrera #102"));
        oHsData.add(new CEUbicacionAlmacen("UB03", "Barranca", "Jr. Ramon Zavala #405"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveUbicacionCIC(CEUbicacionAlmacen poData) {
        LOG.info("[FSI] Start saveCategoriaCIC : ", poData);
        oHsData.add(new CEUbicacionAlmacen(poData.getCodiUbic(), poData.getNombUbic(), poData.getDirecUbic()));

    }

    @Override
    public void modificarUbicacionCIC(String pId, String nombCate) {
        LOG.info("[FSI] Start modificarCategoriaCIC : {}", pId);
        Iterator<CEUbicacionAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUbicacion = new CEUbicacionAlmacen();
            oUbicacion = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUbicacion);

            if (oUbicacion.getCodiUbic().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oUbicacion);
                oUbicacion.setNombUbic(nombCate);
                

                break;
            }
        }
    }

    @Override
    public void eliminarUbicacionCIC(String poData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HashSet<CEUbicacionAlmacen> consultAllUbicacionCIC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
