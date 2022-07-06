package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CEEmpleadoProducto;

public class CLVariacionEmpleado {

    public Object[][] convertHashSetArray(HashSet<CEEmpleadoProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][6];
        int iRow = 0;
        for (CEEmpleadoProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getCodiEmp();
            aDataResponse[iRow][1] = oItem.getNombEmp();
            aDataResponse[iRow][2] = oItem.getApaEmp();
            aDataResponse[iRow][3] = oItem.getAmaEmp();
            aDataResponse[iRow][4] = oItem.getDniEmp();
            aDataResponse[iRow][5] = oItem.getTelfEmp();

            iRow++;
        }
        return aDataResponse;
    }

}
