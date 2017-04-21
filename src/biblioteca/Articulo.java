package biblioteca;

public abstract class Articulo {
    private String nombre;
    private int año;
    private boolean tipo;
    
    public abstract void CambiarEstado();
    public abstract Cliente getCliente();

}
