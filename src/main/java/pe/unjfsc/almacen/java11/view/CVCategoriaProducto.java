package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CECategoria_Producto;
import pe.unjfsc.almacen.java11.model.CICambioCategoria;
import pe.unjfsc.almacen.java11.model.imp.CMCambioCategoriaHashSet;

public class CVCategoriaProducto {
    
    private static final Logger LOG = LoggerFactory.getLogger(CVCategoriaProducto.class);
    
    public void agregar(String a, String b) {
        CICambioCategoria oCrud = new CMCambioCategoriaHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CECategoria_Producto oCategoria = new CECategoria_Producto();
        oCategoria.setCodiCate(a);
        oCategoria.setNombCate(b);
        
        oCrud.saveCategoriaCIC(oCategoria);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllCategoriaCIC());;
        
    }
    
    public void elimnar(String a) {
        CICambioCategoria oCrud = new CMCambioCategoriaHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.eliminarCategoriaCIC(a);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllCategoriaCIC());;
    }
     public void modificar(String a, String b) {
        CICambioCategoria oCrud = new CMCambioCategoriaHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.modificarCategoriaCIC(a,b);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllCategoriaCIC());;
    }
    
    public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");
        
        String codi = "CA02";
        String nomb = "FREDDY";
        
        CVCategoriaProducto tmp = new CVCategoriaProducto();

        //tmp.agregar(codi, nomb);
        //tmp.elimnar(codi);
        tmp.modificar(codi, nomb);
        /*CICambioCategoria oCrud = new CMCambioCategoriaHashSet();
        oCrud.consultAllCategoriaCIC();*/
    }
}
