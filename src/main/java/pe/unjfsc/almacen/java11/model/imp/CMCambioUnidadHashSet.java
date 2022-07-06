package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEUnidadProducto;
import pe.unjfsc.almacen.java11.model.CICambioUnidad;

public class CMCambioUnidadHashSet implements CICambioUnidad {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambioUnidadHashSet.class);

    private HashSet<CEUnidadProducto> oHsData;

    private CEUnidadProducto oUnidad;

    public CMCambioUnidadHashSet() {
        LOG.info("FSI] Start CMCambioUnidadHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEUnidadProducto("UN01", "Lt"));
        oHsData.add(new CEUnidadProducto("UN02", "Kg"));

        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveUnidadCIC(CEUnidadProducto poData) {
        LOG.info("[FSI] Start saveUnidadCIC : ", poData);
        oHsData.add(new CEUnidadProducto(poData.getCodiUnid(), poData.getNombUnid()));

    }

    @Override
    public void modificarUnidadCIC(String pId, String nombUnid) {
        
          LOG.info("[FSI] Start modificarUnidadCIC : {}", pId);
        Iterator<CEUnidadProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUnidad = new CEUnidadProducto();
            oUnidad = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUnidad);

            if (oUnidad.getCodiUnid().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oUnidad);
                oUnidad.setNombUnid(nombUnid);
                break;
            }
        }
    }

    @Override
    public void eliminarUnidadCIC(String pId) {
       
          LOG.info("[FSI] Start eliminarUnidadCIC : {}", pId);
        Iterator<CEUnidadProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oUnidad = new CEUnidadProducto();
            oUnidad = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oUnidad);

            if (oUnidad.getCodiUnid().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oUnidad);
                oHsData.remove(oUnidad);
                break;
            }
        }
    }

    @Override
    public HashSet<CEUnidadProducto> consultAllUnidadCIC() {
     LOG.info("[FSI] consultAllUnidadCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }

}
