package biblioteca;

import java.util.Date;
import java.util.Vector;

public class Venta {
    private Date fecha;
    private Vector<Revista> listaCompras =  new Vector<Revista>();
    private Cliente cliente;

    Venta(Date _fecha, Vector<Revista> _listaCompras, Cliente _cliente){
        fecha = _fecha;
        listaCompras = _listaCompras;
        cliente = _cliente;
    }

}


