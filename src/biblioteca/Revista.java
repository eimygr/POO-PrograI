package biblioteca;


/**
 * 
 * Clase Revista, que hereda de articulo
 * 
 */
 public class Revista extends Articulo{
    private static int idTotal;
    private String id;
    private Estado estado;
    private int num;
    private double costo;
    private Cliente cliente;
    private String tipo;
    private String nombre;
    private int año;

        
    /**
     * Metodo constructor para la revista
     * @param _nombre string con el nombre de la revistsa
     * @param _numero int numero
     * @param _año int año de la Revista
     * @param _tipo string del tipo de revista 
     * @param _costo  double el costo en colones de la revista
     */
    public Revista(String _nombre, int _numero, int _año, String _tipo
            , double _costo){
        idTotal ++;
        id = "R-" + Integer.toString(idTotal);
        nombre = _nombre;
        num = _numero;
        año = _año;
        tipo = _tipo;
        costo = _costo;
        estado = Estado.Disponible;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
    
    public void setEstado(Estado _estado){
        estado = _estado;
    }
    @Override
    public void CambiarEstado(){ //Este metodo hay que modificarlo
        if(estado == Estado.Disponible){
            estado = Estado.Prestada;
        }else{
            estado = Estado.Disponible;
        }
    }
    
    
    public Estado getEstado(){
        return estado;
    }
    
    public void setCliente(Cliente _cliente){
        cliente = _cliente;
    }
    
    @Override
    public Cliente getCliente() {return cliente;}
    
    public String getTipo(){
    return tipo;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public String getId() {return id;}
     
    //Falta el setCliente   :):)
    
}


