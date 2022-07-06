package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEPuestoAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioPuesto;

public class CMCambiarPuestoHashSet implements CICambioPuesto {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarPuestoHashSet.class);

    private HashSet<CEPuestoAlmacen> oHsData;

    private CEPuestoAlmacen oPuesto;

    public CMCambiarPuestoHashSet() {
        LOG.info("FSI] Start CMCambiarPuesto before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEPuestoAlmacen("PU01", "Jefe Almacen"));
        oHsData.add(new CEPuestoAlmacen("PU02", "Despachador"));
        oHsData.add(new CEPuestoAlmacen("PU03", "Almacenero"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    }

    @Override
    public void savePuestoCIC(CEPuestoAlmacen poData) {

        LOG.info("[FSI] Start savePuestoCIC: ", poData);
        oHsData.add(new CEPuestoAlmacen(poData.getCodiPues(), poData.getNombPues()));
    }

    @Override
    public void modificarPuestoCIC(String pId, String nombCate) {
        LOG.info("[FSI] Start modificarPuestoCIC : {}", pId);
        Iterator<CEPuestoAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oPuesto = new CEPuestoAlmacen();
            oPuesto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oPuesto);

            if (oPuesto.getCodiPues().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oPuesto);
                oPuesto.setNombPues(nombCate);

                break;
            }
        }

    }

    @Override
    public void eliminarPuestoCIC(String pId) {
        LOG.info("[FSI] Start eliminarPuestoCIC : {}", pId);
        Iterator<CEPuestoAlmacen> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oPuesto = new CEPuestoAlmacen();
            oPuesto = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oPuesto);

            if (oPuesto.getCodiPues().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oPuesto);
                oHsData.remove(oPuesto);
                break;
            }
        }

    }

    @Override
    public HashSet<CEPuestoAlmacen> consultAllPuestoCIC() {

        LOG.info("[FSI] Start consultAllPuestoCIC : {}", oHsData.size());
        return oHsData;
    }

}
