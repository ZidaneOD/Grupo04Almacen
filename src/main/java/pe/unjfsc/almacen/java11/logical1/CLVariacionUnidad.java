package pe.unjfsc.almacen.java11.logical1;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CEUnidadProducto;

public class CLVariacionUnidad {

    public Object[][] convertHashSetArray(HashSet<CEUnidadProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEUnidadProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getCodiUnid();
            aDataResponse[iRow][1] = oItem.getNombUnid();

            iRow++;
        }
        return aDataResponse;
    }
}
