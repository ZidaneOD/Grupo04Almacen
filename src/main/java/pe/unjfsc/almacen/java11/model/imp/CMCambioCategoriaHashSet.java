package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CECategoriaProducto;
import pe.unjfsc.almacen.java11.model.CICambioCategoria;

public class CMCambioCategoriaHashSet implements CICambioCategoria {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambioCategoriaHashSet.class);

    private HashSet<CECategoriaProducto> oHsData;

    private CECategoriaProducto oCategoria;

    public CMCambioCategoriaHashSet() {
        LOG.info("FSI] Start CMCambioCategoriaHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CECategoriaProducto("CA01", "Insumo"));
        oHsData.add(new CECategoriaProducto("CA02", "Helado"));
        oHsData.add(new CECategoriaProducto("CA03", "Maquinaria"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    
    }

    @Override
    public void saveCategoriaCIC(CECategoriaProducto poData) {
        LOG.info("[FSI] Start saveCategoriaCIC : ", poData);
        oHsData.add(new CECategoriaProducto(poData.getCodiCate(), poData.getNombCate()));
    
    }

    @Override
    public void modificarCategoriaCIC(String pId, String nombCate) {
        LOG.info("[FSI] Start modificarCategoriaCIC : {}", pId);
        Iterator<CECategoriaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoria = new CECategoriaProducto();
            oCategoria = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oCategoria);

            if (oCategoria.getCodiCate().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oCategoria);
                oCategoria.setCodiCate(nombCate);
                

                break;
            }
        }
    }

    @Override
    public void eliminarCategoriaCIC(String pId) {
        LOG.info("[FSI] Start eliminarCategoriaCIC : {}", pId);
        Iterator<CECategoriaProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oCategoria = new CECategoriaProducto();
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
    public HashSet<CECategoriaProducto> consultAllCategoriaCIC() {
        LOG.info("[FSI] Start consultAllCategoriaCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }

}
