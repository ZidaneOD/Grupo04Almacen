package pe.unjfsc.almacen.java11.model.imp;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEmpleadoProducto;
import pe.unjfsc.almacen.java11.model.CICambioEmpleado;

public class CMCambiarEmpleadoHashSet  implements CICambioEmpleado{

    
      private static final Logger LOG = LoggerFactory.getLogger(CMCambiarEmpleadoHashSet.class);

    private HashSet<CEEmpleadoProducto> oHsData;

    private CEEmpleadoProducto oEmpleado;

    public CMCambiarEmpleadoHashSet() {
        LOG.info("FSI] Start CMCambiarEmpleadoHashSet before crear la instancia : ()", oHsData);
        oHsData = new HashSet<>();

        LOG.info("[FSI] Count del HashSet :", oHsData.isEmpty());
        oHsData.add(new CEEmpleadoProducto("EM01", "Andy","Fernandez","Erazo","44784","9635545"));
        oHsData.add(new CEEmpleadoProducto("EM02", "Gustavo","Duran","Erazo","44784","978545"));
        oHsData.add(new CEEmpleadoProducto("EM03", "Zidane","Ortiz","Erazo","4478465","969635545"));
        oHsData.add(new CEEmpleadoProducto("EM04", "Evelyn","Calixto","Erazo","4478784","9659525"));
        oHsData.add(new CEEmpleadoProducto("EM05", "Tatiana","Quesquen","Erazo","1544784","9774432"));
        LOG.info("[FSI] After - Count del HashSet : {}", oHsData.size());
    
    }
    
    @Override
    public void saveEmpleadoCIC(CEEmpleadoProducto poData) {

         LOG.info("[FSI] Start saveEmpleadoCIC : ", poData);
        oHsData.add(new CEEmpleadoProducto(poData.getCodiEmp(), poData.getNombEmp(),poData.getApaEmp(),poData.getAmaEmp(),poData.getDniEmp(),poData.getTelfEmp()));
    
    }

    @Override
    public void modificarEmpleadoCIC(String pId, String nomEmp,String apaEmp,String amaEmp,String dniEmp,String telfEmp) {
         LOG.info("[FSI] Start modificarEmpleadoCIC : {}", pId);
        Iterator<CEEmpleadoProducto> oIt = oHsData.iterator();
        while (oIt.hasNext()) {
            oEmpleado = new CEEmpleadoProducto();
            oEmpleado = oIt.next();
            LOG.info("[FSI] Objeto asignado : {}", oEmpleado);

            if (oEmpleado.getCodiEmp().equals(pId)) {
                LOG.info("[FSI] Objeto modificado : {}", oEmpleado);
                oEmpleado.setNombEmp(nomEmp);
                break;
            }
        }

    }

    @Override
    public void eliminarEmpleadoCIC(String pId) {

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

    @Override
    public HashSet<CEEmpleadoProducto> consultAllEmpleadoCIC() {
        LOG.info("[FSI] Start consultAllEmpleadoCIC : {}", oHsData.size());
        LOG.info(String.valueOf(oHsData));
        return oHsData;
    }

}
