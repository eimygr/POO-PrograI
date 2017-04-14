package biblioteca;


 public class Revista extends Articulo{
    private static String id;
    private Estado estado;
    private int num;
    private double costo;
    //private String categoria;
    private Cliente cliente;
    private String tipo;
    private String nombre;
    private int año;

    public Revista(String _nombre, int _numero, int _año, String _tipo
            , double _costo){
        nombre = _nombre;
        num = _numero;
        año = _año;
        tipo = _tipo;
        costo = _costo;  
    }
    
    public String getNombre(){
        return nombre;
    }

    public void CambiarEstado(Estado _estado){
        estado = _estado;
    }
    
    public void setEstado(Estado _estado){
        estado = _estado;
    }
    
    public Estado getEstado(){
        return estado;
    }
    
    public void setCliente(Cliente _cliente){
        cliente = _cliente;
    }
     
    //Falta el setCliente   :):)
    
}


