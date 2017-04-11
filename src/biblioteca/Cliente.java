package biblioteca;

public class Cliente {
    private String nombre;
    private String correo;
    private int cedula;
    private int telefono;
    private boolean esta_moroso;

    Cliente(String _nombre, String _correo, int _cedula, int _telefono){
        nombre = _nombre;
        correo = _correo;
        cedula = _cedula;
        telefono = _telefono;
        esta_moroso = false;
    }

    //GETTERS Y SETTER
    public int getId(){return cedula;}
    public int getTelefono(){return telefono;}
    public void setMorosidad(boolean estado){esta_moroso = estado;}

    // por favor hacer un metodo get moroso :):)


}
