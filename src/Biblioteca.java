import java.util.Date;
package biblioteca;



public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private int telefono;
    private String bibliotecologo;
    private Date fechaActual;

    private Libro[] listaLibros;
    private Revista[] listaRevistas;
    private Cliente[] listaClientes;


    private boolean validarTelefono(int _numTel) {
        String telefono = Integer.toString(_numTel);
        return telefono.length() == 8;
    }

    private boolean validarCorreo(String _correoE) {

        if (_correoE.length() == 0 )
            return false;

        if (_correoE.charAt(0) == '@')
            return false;

        for (int i = 0; i < _correoE.length(); i++){
            char letra = _correoE.charAt(i);

            if (letra == '@'){
                if (_correoE.charAt(i + 1) == ' ') {
                    return false ;
                }   
            }
        }
        return true;
    }

}

//public void validarDatos(String pNombre, String pCorreo, String pCedula)
