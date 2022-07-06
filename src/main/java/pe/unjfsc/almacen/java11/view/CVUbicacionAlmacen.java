package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEUbicacion_Almacen;
import pe.unjfsc.almacen.java11.modela1.CICambioUbicacion;
import pe.unjfsc.almacen.java11.modela1.imp.CMCambioUbicacionHashSet;

public class CVUbicacionAlmacen {
    
    private static final Logger LOG = LoggerFactory.getLogger(CVUbicacionAlmacen.class);
    
    public void agregar(String id, String nomb, String direc) {
        CICambioUbicacion oCrud = new CMCambioUbicacionHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CEUbicacion_Almacen oUbicacion = new CEUbicacion_Almacen();
        oUbicacion.setCodiUbic(id);
        oUbicacion.setNombUbic(nomb);
        oUbicacion.setDirecUbic(direc);
        
        oCrud.saveUbicacionCIC(oUbicacion);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllUbicacionCIC());;
        
    }
    
    public void elimnar(String a) {
        CICambioUbicacion oCrud = new CMCambioUbicacionHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.eliminarUbicacionCIC(a);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllUbicacionCIC());;
    }
    
    public void modificar(String id, String nomb, String direc) {
        CICambioUbicacion oCrud = new CMCambioUbicacionHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.modificarUbicacionCIC(id, nomb, direc);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllUbicacionCIC());;
    }
    
    public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");
        
        String codi = "UB04";
        String nomb = "Lambayeque";
        String direc = "Jr. 28 De Julio #125";
        
        CVUbicacionAlmacen tmp = new CVUbicacionAlmacen();

        //tmp.agregar(codi, nomb);
        //tmp.elimnar(codi);
        tmp.modificar(codi, nomb, direc);
        /*CVUbicacionAlmacen oCrud = new CVUbicacionAlmacen();
        oCrud.consultAllCategoriaCIC();*/
    }
}
