package pe.unjfsc.almacen.java11.logical1;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CECategoria_Producto;

public class CLVariacionCategoria {

    public Object[][] convertHashSetArray(HashSet<CECategoria_Producto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CECategoria_Producto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getCodiCate();
            aDataResponse[iRow][1] = oItem.getNombCate();
            iRow++;
        }
        return aDataResponse;
    }
}
