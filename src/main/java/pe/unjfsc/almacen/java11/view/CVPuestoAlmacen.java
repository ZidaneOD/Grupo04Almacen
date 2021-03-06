package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEPuestoAlmacen;
import pe.unjfsc.almacen.java11.modela1.CICambioPuesto;
import pe.unjfsc.almacen.java11.modela1.imp.CMCambiarPuestoHashSet;

public class CVPuestoAlmacen {

    private static final Logger LOG = LoggerFactory.getLogger(CVDetalleProducto.class);

    public void agregar(String codi, String nomb) {
        CICambioPuesto oCrud = new CMCambiarPuestoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CEPuestoAlmacen oDProducto = new CEPuestoAlmacen();
        oDProducto.setCodiPues(codi);
        oDProducto.setNombPues(nomb);

        oCrud.savePuestoCIC(oDProducto);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllPuestoCIC());;

    }

    public void elimnar(String a) {
        CICambioPuesto oCrud = new CMCambiarPuestoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.eliminarPuestoCIC(a);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllPuestoCIC());;
    }

    public void modificar(String codi, String nomb) {
        CICambioPuesto oCrud = new CMCambiarPuestoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.modificarPuestoCIC(codi, nomb);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllPuestoCIC());;
    }
    
     public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");

        String codi = "PU04";
        String nomb = "Almacenera";
       

       CVPuestoAlmacen tmp = new CVPuestoAlmacen();

        tmp.agregar(codi, nomb);
        //tmp.elimnar(codi);
     // tmp.modificar(codi, nomb);
        CICambioPuesto oCrud = new CMCambiarPuestoHashSet();
       oCrud.consultAllPuestoCIC();
    }
}
