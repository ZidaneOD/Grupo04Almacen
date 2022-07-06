package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CETrazabilidadProducto;
import pe.unjfsc.almacen.java11.model.CICambioTrazabilidad;
import pe.unjfsc.almacen.java11.model.imp.CMCambioTrazabilidadHashSet;

public class CVTrazabilidadProducto {

    private static final Logger LOG = LoggerFactory.getLogger(CVTrazabilidadProducto.class);

    public void agregar(String a, String b) {
        CICambioTrazabilidad oCrud = new CMCambioTrazabilidadHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CETrazabilidadProducto oTrazabilidad = new CETrazabilidadProducto();
        oTrazabilidad.setCodiTraz(a);
        oTrazabilidad.setNombTraz(b);

        oCrud.saveTrazabilidadCIC(oTrazabilidad);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllTrazabilidadCIC());;

    }

    public void elimnar(String a) {
        CICambioTrazabilidad oCrud = new CMCambioTrazabilidadHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.eliminarTrazabilidadCIC(a);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllTrazabilidadCIC());;
    }

    public void modificar(String a, String b) {
        CICambioTrazabilidad oCrud = new CMCambioTrazabilidadHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.modificarTrazabilidadCIC(a, b);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllTrazabilidadCIC());;
    }

    public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");

        String codi = "T005";
        String nomb = "SIN SERVICIO";

        CVTrazabilidadProducto tmp = new CVTrazabilidadProducto();

        //tmp.agregar(codi, nomb);
        //tmp.elimnar(codi);omb, no
        tmp.modificar(codi, nomb);
        /*CVTrazabilidadProducto oCrud = new CVTrazabilidadProducto();
        oCrud.consultAllCategoriaCIC();*/
    }
}
