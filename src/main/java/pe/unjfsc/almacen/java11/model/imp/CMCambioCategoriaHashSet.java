package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CECategoria_Producto;
import pe.unjfsc.almacen.java11.model.CICambioCategoria;

public class CMCambioCategoriaHashSet implements CICambioCategoria {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambioCategoriaHashSet.class);

    private HashSet<CECategoria_Producto> oHsData;

    private CECategoria_Producto oCategoria;

    public CMCambioCategoriaHashSet() {
        LOG.info("FSI] Start CMCambioCategoriaHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CECategoria_Producto("CA01", "Insumo"));
        oHsData.add(new CECategoria_Producto("CA02", "Helado"));
        oHsData.add(new CECategoria_Producto("CA03", "Maquinaria"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    
    }

    @Override
    public void saveCategoriaCIC(CECategoria_Producto poData) {
        LOG.info("[FSI] Start saveCategoriaCIC : ", poData);
        oHsData.add(new CECategoria_Producto(poData.getCodiCate(), poData.getNombCate()));
    
    }

    @Override
    public void modificarCategoriaCIC(String pId, String nombCate) {
        LOG.info("[FSI] Start modificarCategoriaCIC : {}", pId);
        Iterator<CECategoria_Producto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoria = new CECategoria_Producto();
            oCategoria = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCategoria);

            if (oCategoria.getCodiCate().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oCategoria);
                oCategoria.setNombCate(nombCate);
                break;
            }
        }
    }

    @Override
    public void eliminarCategoriaCIC(String pId) {
        LOG.info("[FSI] Start eliminarCategoriaCIC : {}", pId);
        Iterator<CECategoria_Producto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoria = new CECategoria_Producto();
            oCategoria = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCategoria);

            if (oCategoria.getCodiCate().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oCategoria);
                oHsData.remove(oCategoria);
                break;
            }
        }
    }

    @Override
    public HashSet<CECategoria_Producto> consultAllCategoriaCIC() {
        LOG.info("[FSI] Start consultAllCategoriaCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }

}
