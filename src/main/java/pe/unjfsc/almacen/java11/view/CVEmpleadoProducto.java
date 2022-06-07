package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEmpleadoProducto;
import pe.unjfsc.almacen.java11.model.CICambioEmpleado;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarEmpleadoHashSet;

public class CVEmpleadoProducto {

    private static final Logger LOG = LoggerFactory.getLogger(CVEmpleadoProducto.class);

    public void agregar(String pId, String nomEmp,String apaEmp,String amaEmp,String dniEmp,String telfEmp) {
        CICambioEmpleado oCrud = new CMCambiarEmpleadoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        CEEmpleadoProducto oEmpleado = new CEEmpleadoProducto();
        oEmpleado.setCodiEmp(pId);
        oEmpleado.setNombEmp(nomEmp);
        oEmpleado.setApaEmp(apaEmp);
        oEmpleado.setAmaEmp(amaEmp);
        oEmpleado.setDniEmp(dniEmp);
        oEmpleado.setTelfEmp(telfEmp);

        oCrud.saveEmpleadoCIC(oEmpleado);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllEmpleadoCIC());;

    }

    public void elimnar(String a) {
        CICambioEmpleado oCrud = new CMCambiarEmpleadoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.eliminarEmpleadoCIC(a);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllEmpleadoCIC());;
    }

    public void modificar(String pId,String nomEmp,String apaEmp,String amaEmp,String dniEmp,String telfEmp) {
        CICambioEmpleado oCrud = new CMCambiarEmpleadoHashSet();
        LOG.info("[FSI] Creado objeto de collection : {} ", oCrud);
        oCrud.modificarEmpleadoCIC( pId,nomEmp,apaEmp,amaEmp, dniEmp, telfEmp);
        LOG.info("[FSI] Creando objeto de collection : {}", oCrud.consultAllEmpleadoCIC());;
    }

    public static void main(String[] args) {
        LOG.info("[FSI] Star main : ");

        String codiEmp = "EM01";
        String nomb = "Lucho";
        String apaEMp = "Diaz";
        String amaEmp = "Suarez";
        String dniEmp = "154545";
        String teflemp = "962654333";
        

        CVEmpleadoProducto tmp = new CVEmpleadoProducto();

        tmp.agregar(codiEmp,nomb,apaEMp,amaEmp,dniEmp,teflemp);
        //tmp.elimnar(codi);omb, no
       // tmp.modificar(codi, nomb);
       // CICambioEmpleado oCrud = new CMCambiarEmpleadoHashSet();
        //oCrud.consultAllEmpleadoCIC();//
    }
}
