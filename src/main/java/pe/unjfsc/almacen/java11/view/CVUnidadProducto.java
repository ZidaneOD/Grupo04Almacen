
package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEUnidadProducto;
import pe.unjfsc.almacen.java11.model.CICambioUnidad;
import pe.unjfsc.almacen.java11.model.imp.CMCambioUnidadHashSet;


public class CVUnidadProducto {
  
      private static final Logger LOG = LoggerFactory.getLogger(CVUnidadProducto.class);
    
    public void agregar(String a, String b) {
        CICambioUnidad oCrud = new CMCambioUnidadHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CEUnidadProducto oUnidad = new CEUnidadProducto();
        oUnidad.setCodiUnid(a);
        oUnidad.setNombUnid(b);
        
        oCrud.saveUnidadCIC(oUnidad);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllUnidadCIC());;
        
    }
    
    public void elimnar(String a) {
        CICambioUnidad oCrud = new CMCambioUnidadHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.eliminarUnidadCIC(a);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllUnidadCIC());;
    }
     public void modificar(String a, String b) {
        CICambioUnidad oCrud = new CMCambioUnidadHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.modificarUnidadCIC(a,b);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllUnidadCIC());;
    }
    
    public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");
        
        String codi = "UN03";
        String nomb = "Lb";
        
        CVUnidadProducto tmp = new CVUnidadProducto();

        tmp.agregar(codi, nomb);
        //tmp.elimnar(codi);
        //tmp.modificar(codi, nomb);
       
    }
    
}
