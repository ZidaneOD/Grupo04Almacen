package pe.unjfsc.almacen.java11.modela1.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity1.CEEmpleadoProducto;
import pe.unjfsc.almacen.java11.modela1.CICambioAlmacen;

public class CMCambiarEmpleadoHashSet implements CICambioAlmacen<CEEmpleadoProducto> {

    private static final Logger LOG = LoggerFactory.getLogger(CMCambiarEmpleadoHashSet.class);

    private HashSet<CEEmpleadoProducto> oHsData;

    private CEEmpleadoProducto oEmpleado;

    public CMCambiarEmpleadoHashSet() {
        LOG.info("FSI] Start CMCambiarEmpleadoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEEmpleadoProducto("EM01", "Andy", "Fernandez", "Erazo", "44784", "9635545"));
        oHsData.add(new CEEmpleadoProducto("EM02", "Gustavo", "Duran", "Vasquez", "44784", "978545"));
        oHsData.add(new CEEmpleadoProducto("EM03", "Zidane", "Ortiz", "Diaz", "4478465", "969635545"));
        oHsData.add(new CEEmpleadoProducto("EM04", "Evelyn", "Calixto", "Huanca", "4478784", "9659525"));
        oHsData.add(new CEEmpleadoProducto("EM05", "Tatiana", "Quesquen", "Carvalo", "1544784", "9774432"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());

    }

    @Override
    public void saveAlmacenCIC(CEEmpleadoProducto poData) {

        LOG.info("[FSI] Start saveEmpleadoCIC : ", oEmpleado);
        oHsData.add(new CEEmpleadoProducto(poData.getCodiEmp(), poData.getNombEmp(), poData.getApaEmp(), poData.getAmaEmp(), poData.getDniEmp(), poData.getTelfEmp()));

    }

    @Override
    public void modificarAlmacenCIC(CEEmpleadoProducto poData) {
        LOG.info("[FSI] Start modificarEmpleadoCIC : {}", poData.getCodiEmp());
        Iterator<CEEmpleadoProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpleado = new CEEmpleadoProducto();
            oEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpleado);

            if (oEmpleado.getCodiEmp().equals(poData.getCodiEmp())) {
                LOG.info("[FSI] Objeto modificado : {}", oEmpleado);
                oEmpleado.setNombEmp(poData.getNombEmp());
                oEmpleado.setApaEmp(poData.getApaEmp());
                oEmpleado.setAmaEmp(poData.getAmaEmp());
                oEmpleado.setDniEmp(poData.getDniEmp());
                oEmpleado.setTelfEmp(poData.getTelfEmp());
                break;
            }
        }

    }

    @Override
    public void eliminarAlmacenCIC(String pId) {

        LOG.info("[FSI] Start eliminarEmpleadoCIC : {}", pId);
        Iterator<CEEmpleadoProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpleado = new CEEmpleadoProducto();
            oEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpleado);

            if (oEmpleado.getCodiEmp().equals(pId)) {
                LOG.info("[FSI] Objeto Elimnado : {}", oEmpleado);
                oHsData.remove(oEmpleado);
                break;
            }
        }
    }

    /*@Override
    public HashSet<CEEmpleadoProducto> consultAllAlmacenCIC() throws Exception {
        LOG.info("[FSI] Start consultAllPuestoCIC : {}", oHsData.size());
        return oHsData;
    }*/
    public HashSet<CEEmpleadoProducto> consultAllAlmacenCIC() {
        LOG.info("[FSI] Start consultAllPuestoCIC : {}", oHsData.size());
        return oHsData;
    }

}
