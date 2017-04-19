package biblioteca;

import java.util.Date;
import java.util.Vector;

public class Venta {
    private Date fecha;
    private Vector<Revista> listaCompras =  new Vector<Revista>();
    private Cliente cliente;
    private String NombreArticulo;

    /**
     * Constructor para la clase Venta 
     * @param _fecha
     * @param _listaCompras
     * @param _cliente
     * @param _nombre 
     */
    Venta(Date _fecha, Vector<Revista> _listaCompras, Cliente _cliente,String _nombre){
        fecha = _fecha;
        listaCompras = _listaCompras;
        cliente = _cliente;
        this.NombreArticulo = _nombre; 
    }

}


