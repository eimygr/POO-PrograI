package biblioteca;
/**
 * Codigo para la clase Cliente
 * 
 */
public class Cliente {
    private String nombre;
    private String correo;
    private int cedula;
    private int telefono;
    private boolean esta_moroso;
    
    /**
     * Metodo que crea el cliente, constructor
     * 
     * @param _nombre Nombre del cliente
     * @param _correo Correo del cliente    
     * @param _cedula Cedula del cliente
     * @param _telefono  Telefono int del cliente
     */
    Cliente(String _nombre, String _correo, int _cedula, int _telefono){
        nombre = _nombre;
        correo = _correo;
        cedula = _cedula;
        telefono = _telefono;
        esta_moroso = false;
    }

    //GETTERS Y SETTER
    public int getId(){return cedula;}
    public String getNombre(){return nombre;}
    public String getCorreo(){return correo;}
    public int getTelefono(){return telefono;}
    public void setMoroso(boolean estado){esta_moroso = estado;}
    public boolean getMoroso(){return esta_moroso;}

}
