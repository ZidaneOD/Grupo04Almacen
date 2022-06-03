
package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEPuesto;
import pe.unjfsc.almacen.java11.model.CICambioPuesto;

/**
 *
 * @author Freddy
 */
public class CMCambiarPuestoHashSet implements CICambioPuesto{

    
    
        private static final Logger LOG = LoggerFactory.getLogger(CMCambioCategoriaHashSet.class);

    private HashSet<CEPuesto> oHsData;

    private CEPuesto oCategoria;

    public CMCambiarPuestoHashSet() {
        LOG.info("FSI] Start CMCambiarPuesto before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEPuesto("CA01", "Insumo"));
        oHsData.add(new CEPuesto("CA02", "Helado"));
        oHsData.add(new CEPuesto("CA03", "Maquinaria"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    }
    
    
    @Override
    public void saveCategoriaCIC(CEPuesto poData) {

        LOG.info("[FSI] Start saveCategoriaCIC : ", poData);
        oHsData.add(new CEPuesto(poData.getCodiPues(), poData.getNombPues()));
    }

    @Override
    public void modificarCategoriaCIC(String pId, String nombCate) {
         LOG.info("[FSI] Start modificarCategoriaCIC : {}", pId);
        Iterator<CEPuesto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoria = new CEPuesto();
            oCategoria = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCategoria);

            if (oCategoria.getCodiPues().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oCategoria);
                oHsData.remove(oCategoria);

                CEPuesto tmp = new CEPuesto(nombCate, nombCate);

                oHsData.add(tmp);
                break;
            }
        }

    }

    @Override
    public void eliminarCategoriaCIC(String pId) {
        LOG.info("[FSI] Start eliminarCategoriaCIC : {}", pId);
        Iterator<CEPuesto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoria = new CEPuesto();
            oCategoria = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCategoria);

            if (oCategoria.getCodiPues().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oCategoria);
                oHsData.remove(oCategoria);
                break;
            }
        }

    }

    @Override
    public HashSet<CEPuesto> consultAllCategoriaCIC() {

         LOG.info("[FSI] Start consultAllCategoriaCIC : {}", oHsData.size());
        return oHsData;
    }
    
}
