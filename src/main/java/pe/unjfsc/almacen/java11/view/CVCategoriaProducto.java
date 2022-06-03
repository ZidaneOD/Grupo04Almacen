package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CECategoriaProducto;
import pe.unjfsc.almacen.java11.model.CICambioCategoria;
import pe.unjfsc.almacen.java11.model.imp.CMCambioCategoriaHashSet;

public class CVCategoriaProducto {

    private static final Logger LOG = LoggerFactory.getLogger(CVCategoriaProducto.class);

    public void agregar(String a, String b) {
        CICambioCategoria oCrud = new CMCambioCategoriaHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CECategoriaProducto oCategoria = new CECategoriaProducto();
        oCategoria.setCodiCate(a);
        oCategoria.setNombCate(b);

        oCrud.saveCategoriaCIC(oCategoria);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllCategoriaCIC());;

    }

    public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");
        /* 
        String codi = "PRUEBA1";
        String nomb = "ZIDANE";
        
        CVCategoriaProducto tmp = new CVCategoriaProducto();
        
        tmp.agregar(nomb, nomb);
         */
        CICambioCategoria oCrud = new CMCambioCategoriaHashSet();
        oCrud.consultAllCategoriaCIC();

    }
}
