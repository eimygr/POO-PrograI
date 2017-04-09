package biblioteca;
import java.util.Date;
import java.util.*;


public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private int telefono;
    private String bibliotecologo;
    private Date fechaActual;


    private Vector listaLibros =  new Vector();
    private Vector listaRevistas=  new Vector();
    private Vector listaClientes=  new Vector();

    private boolean validarTelefono(int _numTel) {
        String telefono = Integer.toString(_numTel);
        return telefono.length() == 8;
    }

    private boolean validarCorreo(String _correoE) {
        if (!this.validarString(_correoE))
            return false;
        
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
   // metodo utilizado para Nombre, Autor 
    private boolean validarString(String _string) {
        if (_string != null && _string.trim().length() > 0 )
            return true;
        return false;
        
    }
    private boolean validarTipoLibro(String _tipo){
        if (!this.validarString(_tipo))
            return false;
        
        switch (_tipo) {
            case "novela":
                return true;
                
            case "teatro":
                return true;
                
            case "poesia":
                return true;
               
            case "infantil":
                return true;
                
            case "ensayos":
                return true;
        }
        return false;
    }
    
    private boolean validarStringSinNumeros(String _string) {
        for (int i = 0; i < _string.length(); i++) {
            char letra = _string.charAt(i);
            switch (letra) {
                case '0':
                    return false;
                case '1':
                    return false;
                case '2':
                    return false;
                case '3':
                    return false;
                case '4':
                    return false;
                case '5':
                    return false;
                case '6':
                    return false;
                case '7':
                    return false;
                case '8':
                    return false;
                case '9':
                    return false;
            }   
        }
        return true;
    }
    public boolean existeCliente(int _cedula) {
        for (int i = 0; i < this.listaClientes.size(); i++) {
            Cliente cliente = this.listaClientes.elementAt(i);

   } 

} 
}

//public void validarDatos(String pNombre, String pCorreo, String pCedula)
