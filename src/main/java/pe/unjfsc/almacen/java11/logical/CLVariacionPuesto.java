
package pe.unjfsc.almacen.java11.logical;

import java.util.HashSet;

import pe.unjfsc.almacen.java11.entity.CEPuesto;

public class CLVariacionPuesto {
      public Object[][] convertHashSetArray(HashSet<CEPuesto> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][2];
        int iRow = 0;
        for (CEPuesto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getCodiPues();
            aDataResponse[iRow][1] = oItem.getNombPues();
            iRow++;
        }
        return aDataResponse;
    }
}
