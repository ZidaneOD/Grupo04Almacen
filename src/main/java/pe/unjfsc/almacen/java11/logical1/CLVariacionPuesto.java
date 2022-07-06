
package pe.unjfsc.almacen.java11.logical1;

import java.util.HashSet;

import pe.unjfsc.almacen.java11.entity1.CEPuestoAlmacen;

public class CLVariacionPuesto {
      public Object[][] convertHashSetArray(HashSet<CEPuestoAlmacen> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEPuestoAlmacen oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getCodiPues();
            aDataResponse[iRow][1] = oItem.getNombPues();
            iRow++;
        }
        return aDataResponse;
    }
}
