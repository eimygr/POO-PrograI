package biblioteca;
import java.util.Date;
import java.util.*;
import static java.lang.System.*;


public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private int telefono;
    private String bibliotecologo;
    private Date fechaActual;
    
    private int diasPrestamoLibro;
    private int diasPrestamoRevista;


    private Vector listaLibros =  new Vector();
    private Vector listaRevistas=  new Vector();
    private Vector listaClientes=  new Vector();
    
    
    public Biblioteca(String _nombre, String _ubicacion, int _telefono
            , String _bibliotecologo, Date _fechaActual, int _diasPrestamoLibro,
            int _diasPrestamoRevista) {
        this.nombre = _nombre;
        this.ubicacion = _ubicacion;
        this.bibliotecologo = _bibliotecologo;
        this.telefono = _telefono;
        this.fechaActual = _fechaActual;
        
        this.diasPrestamoLibro = _diasPrestamoLibro;
        this.diasPrestamoRevista = _diasPrestamoRevista;
    }
    
    public Biblioteca(String _nombre, String _ubicacion, int _telefono
            , String _bibliotecologo, Date _fechaActual) {
        this( _nombre,  _ubicacion,  _telefono
            ,  _bibliotecologo,  _fechaActual,10,5);
    }
    
    // SETTERS Y GETTERS
    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setUbicacion(String _ubicacion) {
        this.ubicacion = _ubicacion;
    }
    
    public String getUbicacion() {
        return this.ubicacion;
    } 
    
    public void setBibliotecologo(String _biblio) {
        this.bibliotecologo = _biblio;
    }
    
    public String getBibliotecologo() {
        return this.bibliotecologo;
    }
    
    public void setTelefono(int _telefono) {
        this.telefono = _telefono;
    }
    
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setFechaActual(Date _fecha) {
        this.fechaActual = _fecha;
    }
    
    public Date getFechaActual() {
        return this.fechaActual;
    }
    
    public void setDiasPrestamoLibro(int _dias) {
        this.diasPrestamoLibro = _dias;
    }
    
    public int getDiasPrestamoLibro() {
        return this.diasPrestamoLibro;
    }
    
    public void setDiasPrestamoRevista(int _dias) {
        this.diasPrestamoRevista = _dias;
    }
    
    public int getDiasPrestamoRevista() {
        return this.diasPrestamoRevista;
    }
    
    //VALIDACIONES
    
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
   // metodo utilizado para Nombre, Autor etc. Cuando se encesita un String sin 
   // numeros 
    private boolean validarString(String _string) {
        if (_string != null && _string.trim().length() > 0 && 
        this.validarStringSinNumeros(_string))
            // si el string ingresado no es vacio, no es nullo y ademas no 
            // contiene numeros (por que es el nombre de un autor o un editor etc)
            return true;
        return false;
        
    }
    // este valida un string que puede contener numeros, asi como el nombre de 
    // de un libro
    private  boolean validarStringNumeros(String _string){
        if (_string != null && _string.trim().length() > 0)
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
    /*
    public boolean existeCliente(int _cedula) {
        for (int i = 0; i < this.listaClientes.size(); i++) {
            Cliente cliente = this.listaClientes.elementAt(i);

        } 
   }
    */
  
    // REGISTRA EL CLIENTE
    public void registrarCliente(String _nombre, String _correo, int _id, int 
            _telefono ){
        if (this.validarString(_nombre) && this.validarCorreo(_correo) && 
                this.validarTelefono(_telefono)){
            if (!this.clienteRegistrado(_id)) {
                // si no existe el cliente 
                // crea el cliente
                // Cliente clienteNuevo = new Cliente( _nombre, _correo, _ id, _telefono);
                this.listaClientes.add(clienteNuevo);
            
            }
            
        } else {
        
            out.println("Error al crear el cliente");
        }
    }
    
    public void registrarLibro(String _nombre, String _autor, int _anho, String 
            _editorial, String _tipo, boolean _prestado) {
        
        if (this.validarString(_autor) && this.validarString(_editorial) 
            && this.validarString(_tipo) && this.validarTipoLibro(_tipo) ) {
            // crear el Libro y lo agrega a la lista
            this.listaLibros.add(libroNuevo);
            
        } else {
            out.println("Error en los datos dados para registrar el Libro");
        
        }
    }
    
    public void registrarRevista(String _nombre, int _numero, int _anho, boolean
            _tipo, int _costo) {
      if (this.validarString(_nombre)){
          // crear la revista
          this.listaRevistas.add(revistaNueva);
      }  else {
          out.println("Error en los datos dados para registrar la Revista");
      }
    }
    
            
            
    // usado para verificar si el cliente ya esta registrado en el sistema
    public boolean clienteRegistrado(int _id) {
        int largo = this.listaClientes.size();
        for (int i = 0; i <= largo; i++) {
            if (this.listaClientes.get(i).getId() == _id) {
                return true;
            }
        }
        return false;
    }
    
    public void comprarRevista(int _idCliente) {
         if ( clienteRegistrado( _idCliente)) {
             // lista que va a contener las revistas 
             Vector listaVenta = new Vector();
         }
    }
 
    // antes de dar estos parametros se deben de ingresar un entero correcto
    public void cambiarParametros(Date _fechaActual, int _diasPrestamoLibro, 
            int _diasPrestamoRevista) {
        
        this.fechaActual = _fechaActual;
        this.diasPrestamoLibro = _diasPrestamoLibro;
        this.diasPrestamoRevista = _diasPrestamoRevista;
    }
    
    
    
}

//public void validarDatos(String pNombre, String pCorreo, String pCedula)
