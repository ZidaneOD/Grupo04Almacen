package pe.unjfsc.almacen.java11.logical1;

import java.util.HashSet;
import pe.unjfsc.almacen.java11.entity1.CEDetalleProducto;

public class CLVariacionDProducto {

    public Object[][] convertHashSetArray(HashSet<CEDetalleProducto> poHsData) {
        
        String[][] aDataResponse = new String[poHsData.size()][13];
        int iRow = 0;
        for (CEDetalleProducto oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getSkuProd();
            aDataResponse[iRow][1] = oItem.getNombProd();
            aDataResponse[iRow][2] = oItem.getDescProd();
            aDataResponse[iRow][3] = oItem.getCateProd();
            aDataResponse[iRow][4] = String.valueOf(oItem.getStocProd());
            aDataResponse[iRow][5] = String.valueOf(oItem.getPrecProd());
            aDataResponse[iRow][6] = oItem.getUnidProd();
            aDataResponse[iRow][7] = String.valueOf(oItem.getCaduProd());
            aDataResponse[iRow][8] = oItem.getUbicProd();
            aDataResponse[iRow][9] = oItem.getTrazProd();
            aDataResponse[iRow][10] = String.valueOf(oItem.getEntrPord());
            aDataResponse[iRow][11] = String.valueOf(oItem.getSaliProd());
            aDataResponse[iRow][12] = oItem.getCodiEmpl();
            iRow++;
        }
        return aDataResponse;
    }
}
