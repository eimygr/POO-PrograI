package biblioteca;


/**
 * 
 * Clase de Libro
 * 
 */
public class Libro extends Articulo {
    private static int idTotal;
    private String id;
    private Estado estado;
    private String autor;
    private String editorial;
    private Genero genero;
    private int diasPrestamo;
    private int año;
    private String nombre;
    private Cliente cliente;
    
    
    /**
     * Metodo constructor para la clase libro
     * @param _nombre string nombre del libro
     * @param _autor string nombre del autor de dicho Libro
     * @param _año int año del libro
     * @param _editorial String editorial del libro
     * @param _genero genero del libro (de la clase enumerate genero)
     * 
     * @see Genero
     */
    public Libro(String _nombre, String _autor, int _año, String _editorial, Genero _genero){
        idTotal ++;
        id = "L-"+Integer.toString(idTotal);
        nombre = _nombre;
        autor = _autor;
        año = _año;
        editorial = _editorial;
        genero = _genero;
        
        
    }
    /**
     * Metodo que cambia el estado del Libro, ya sea a Disponible o prestado.
     */
    public void CambiarEstado(){
        if(estado == Estado.Disponible){
            estado = Estado.Prestada;
        }else{
            estado = Estado.Disponible;
        }
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
    public String getNombre(){
    return nombre;
    }
}
