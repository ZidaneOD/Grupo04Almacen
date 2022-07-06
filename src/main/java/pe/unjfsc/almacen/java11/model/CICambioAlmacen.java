package pe.unjfsc.almacen.java11.model;

import java.util.HashSet;

public interface CICambioAlmacen {

    public void saveAlmacenCIC(Object poData);

    public void modificarAlmacenCIC(Object poData);

    public void eliminarAlmacenCIC(String poData);

    public HashSet<Object> consultAllAlmacenCIC();
}
