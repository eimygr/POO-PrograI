package biblioteca;


public class Libro extends Articulo {
    private static String id;
    private Estado estado;
    private String autor;
    private String editorial;
    private Genero genero;
    private int diasPrestamo;
    private int año;
    private String nombre;
    private Cliente cliente;
    
    public Libro(String _nombre, String _autor, int _año, String _editorial, Genero _genero){
        nombre = _nombre;
        autor = _autor;
        año = _año;
        editorial = _editorial;
        genero = _genero;
        
        
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
}
