package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEUbicacion_Almacen;
import pe.unjfsc.almacen.java11.model.CICambioUbicacion;

public class CMCambioUbicacionHashSet implements CICambioUbicacion {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambioUbicacionHashSet.class);

    private HashSet<CEUbicacion_Almacen> oHsData;

    private CEUbicacion_Almacen oUbicacion;

    public CMCambioUbicacionHashSet() {
        LOG.info("FSI] Start CMCambioUbicacionHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEUbicacion_Almacen("UB01", "Huaral", "Av. Alfonso Ugarte #210"));
        oHsData.add(new CEUbicacion_Almacen("UB02", "Huaura", "Av. Blas de la Carrera #102"));
        oHsData.add(new CEUbicacion_Almacen("UB03", "Barranca", "Jr. Ramon Zavala #405"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveUbicacionCIC(CEUbicacion_Almacen poData) {
        LOG.info("[FSI] Start saveUbicacionCIC : ", poData);
        oHsData.add(new CEUbicacion_Almacen(poData.getCodiUbic(), poData.getNombUbic(), poData.getDirecUbic()));

    }

    @Override
    public void modificarUbicacionCIC(String pId, String nomb, String dire) {
        LOG.info("[FSI] Start modificarUbicacionCIC : {}", pId);
        Iterator<CEUbicacion_Almacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUbicacion = new CEUbicacion_Almacen();
            oUbicacion = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUbicacion);

            if (oUbicacion.getCodiUbic().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oUbicacion);
                oUbicacion.setNombUbic(nomb);
                oUbicacion.setDirecUbic(dire);
                break;
            }
        }
    }

    @Override
    public void eliminarUbicacionCIC(String pId) {
        LOG.info("[FSI] Start eliminarUbicacionCIC : {}", pId);
        Iterator<CEUbicacion_Almacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUbicacion = new CEUbicacion_Almacen();
            oUbicacion = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUbicacion);

            if (oUbicacion.getCodiUbic().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oUbicacion);
                oHsData.remove(oUbicacion);
                break;
            }
        }
    }

    @Override
    public HashSet<CEUbicacion_Almacen> consultAllUbicacionCIC() {
        LOG.info("[FSI] Start consultAllUbicacionCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }
}
