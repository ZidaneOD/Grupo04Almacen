package pe.unjfsc.almacen.java11.modela1;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CEEmpleadoProducto;

public interface CICambioEmpleado {

    public void saveEmpleadoCIC(CEEmpleadoProducto poData);

    public void modificarEmpleadoCIC(String pId, String nomEmp,String apaEmp,String amaEmp,String dniEmp,String telfEmp);

    public void eliminarEmpleadoCIC(String poData);

    public HashSet<CEEmpleadoProducto> consultAllEmpleadoCIC();
}
