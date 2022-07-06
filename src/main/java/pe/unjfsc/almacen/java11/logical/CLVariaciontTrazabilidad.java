package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CETrazabilidadProducto;

public class CLVariaciontTrazabilidad {

    public Object[][] convertHashSetArray(HashSet<CETrazabilidadProducto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CETrazabilidadProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getCodiTraz();
            aDataResponse[iRow][1] = oItem.getNombTraz();
            iRow++;
        }
        return aDataResponse;
    }
}
