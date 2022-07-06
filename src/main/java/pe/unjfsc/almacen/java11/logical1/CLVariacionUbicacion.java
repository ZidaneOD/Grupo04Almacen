package pe.unjfsc.almacen.java11.logical1;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CEUbicacion_Almacen;

public class CLVariacionUbicacion {

    public Object[][] convertHashSetArray(HashSet<CEUbicacion_Almacen> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][3];
        int iRow = 0;
        for (CEUbicacion_Almacen oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getCodiUbic();
            aDataResponse[iRow][1] = oItem.getNombUbic();
            aDataResponse[iRow][2] = oItem.getDirecUbic();
            iRow++;
        }
        return aDataResponse;
    }
}
