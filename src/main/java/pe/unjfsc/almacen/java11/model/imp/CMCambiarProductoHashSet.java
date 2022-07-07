package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEUbicacion_Almacen;
import pe.unjfsc.almacen.java11.model.CICambioDatos;
import pe.unjfsc.almacen.java11.modela1.imp.CMCambioUbicacionHashSet;

public class CMCambiarProductoHashSet implements CICambioDatos {

     private static final Logger LOG = LoggerFactory.getLogger(CMCambioUbicacionHashSet.class);

    private HashSet<CEUbicacion_Almacen> oHsData;

    private CEUbicacion_Almacen oUbicacion;

    public CMCambiarProductoHashSet() {
    
     LOG.info("FSI] Start CMCambioUbicacionHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEUbicacion_Almacen("UB01", "Huaral", "Av. Alfonso Ugarte #210"));
        oHsData.add(new CEUbicacion_Almacen("UB02", "Huaura", "Av. Blas de la Carrera #102"));
        oHsData.add(new CEUbicacion_Almacen("UB03", "Barranca", "Jr. Ramon Zavala #405"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    }
    
    
    @Override
    public void saveAlmacenCIC(Object poData) {
        
    }

    @Override
    public void modificarAlmacenCIC(Object poData) {
    }

    @Override
    public void eliminarAlmacenCIC(String poData) {
    }

    @Override
    public HashSet<Object> consultAllAlmacenCIC() {
        LOG.info("[FSI] Start consultAllUbicacionCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return (HashSet<Object>)(Object)oHsData;
    }

}
