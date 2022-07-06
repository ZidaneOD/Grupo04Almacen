package pe.unjfsc.almacen.java11.modela1.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CETrazabilidadProducto;
import pe.unjfsc.almacen.java11.modela1.CICambioTrazabilidad;

public class CMCambioTrazabilidadHashSet implements CICambioTrazabilidad {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambioTrazabilidadHashSet.class);

    private HashSet<CETrazabilidadProducto> oHsData;

    private CETrazabilidadProducto oTrazabilidad;

    public CMCambioTrazabilidadHashSet() {
        LOG.info("FSI] Start CMCambioTrazabilidadHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();
        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CETrazabilidadProducto("T001", "Almacen"));
        oHsData.add(new CETrazabilidadProducto("T002", "Picking"));
        oHsData.add(new CETrazabilidadProducto("T003", "Unitarización"));
        oHsData.add(new CETrazabilidadProducto("T004", "Transporte"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveTrazabilidadCIC(CETrazabilidadProducto poData) {
        LOG.info("[FSI] Start saveTrazabilidadCIC : ", poData);
        oHsData.add(new CETrazabilidadProducto(poData.getCodiTraz(), poData.getNombTraz()));

    }

    @Override
    public void modificarTrazabilidadCIC(String pId, String nombCate) {
        LOG.info("[FSI] Start modificarTrazabilidadCIC : {}", pId);
        Iterator<CETrazabilidadProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oTrazabilidad = new CETrazabilidadProducto();
            oTrazabilidad = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oTrazabilidad);

            if (oTrazabilidad.getCodiTraz().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oTrazabilidad);
                oTrazabilidad.setNombTraz(nombCate);
                break;
            }
        }

    }

    @Override
    public void eliminarTrazabilidadCIC(String pId) {
        LOG.info("[FSI] Start eliminarTrazabilidadCIC : {}", pId);
        Iterator<CETrazabilidadProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oTrazabilidad = new CETrazabilidadProducto();
            oTrazabilidad = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oTrazabilidad);

            if (oTrazabilidad.getCodiTraz().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oTrazabilidad);
                oHsData.remove(oTrazabilidad);
                break;
            }
        }
    }

    @Override
    public HashSet<CETrazabilidadProducto> consultAllTrazabilidadCIC() {
        LOG.info("[FSI] Start consultAllTrazabilidadCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }

}
