package pe.unjfsc.almacen.java11.modela1;

import java.util.HashSet;

public interface CICambioAlmacen<Objeto> {

    public void saveAlmacenCIC(Objeto objObjeto) throws Exception;

    public void modificarAlmacenCIC(Objeto objObjeto) throws Exception;

    public void eliminarAlmacenCIC(String poData) throws Exception;

    //public HashSet<Object> consultAllAlmacenCIC() throws Exception;
}
