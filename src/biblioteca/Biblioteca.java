package biblioteca;
import java.io.File;
import java.util.Date;
import java.util.*;
import static java.lang.System.*;

//Librerias y archivos para leer de Excel
import java.io.FileInputStream;
import java.io.FileOutputStream;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//End Librerias y archivos para leer de Excel

public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private int telefono;
    private String bibliotecologo;
    private Date fechaActual;
    
    private int diasPrestamoLibro;
    private int diasPrestamoRevista;

    // listas dinamicas
    private Vector<Libro> listaLibros =  new Vector<Libro>();
    private Vector<Revista> listaRevistas=  new Vector<Revista>();
    private Vector<Cliente> listaClientes=  new Vector<Cliente>();
    private Vector<Venta> listaVentas =  new Vector<Venta>();
    private Vector<Prestamo> listaPrestamo =  new Vector<Prestamo>();
    
    public Biblioteca(){
    }
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
        String _telefono = Integer.toString(_numTel);
        return _telefono.length() == 8;
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


    public Cliente retCliente(int _id){  //Busca un cliente segun el Id y lo retorna

        int largo = listaClientes.size();
        for (int i = 0; i <= largo; i++) {

            Cliente cliente = listaClientes.get(i);

            if (cliente.getId() == _id) {
                return cliente;
            }

        }
    }

    // REGISTRA EL CLIENTE
    public void registrarCliente(String _nombre, String _correo, int _id, int 
            _telefono ){
        if (this.validarString(_nombre) && this.validarCorreo(_correo) && 
                this.validarTelefono(_telefono)){
            if (!this.clienteRegistrado(_id)) {
                // si no existe el cliente 
                // crea el cliente
                Cliente clienteNuevo = new Cliente( _nombre, _correo, _id, _telefono);
                this.listaClientes.add(clienteNuevo);
            
            }
            
        } else {
        
            out.println("Error al crear el cliente");
        }
    }
    
    public void registrarLibro(String _nombre, String _autor, int _año, String
            _editorial, String _tipo, Estado _estado) {
        
        if (this.validarString(_autor) && this.validarString(_editorial) 
            && this.validarString(_tipo) && this.validarTipoLibro(_tipo) ) {
            // crear el Libro y lo agrega a la lista
            Libro libroNuevo = new Libro(_nombre, _autor, _año, _editorial, _estado);
            this.listaLibros.add(libroNuevo);
            
        } else {
            out.println("Error en los datos dados para registrar el Libro");
        
        }
    }


    public void registrarRevista(String _nombre, int _numero, int _año, Categoria
            _categoria, int _costo) {
      if (this.validarString(_nombre)){
          Revista revistaNueva = new Revista(_nombre, _numero, _año, _categoria, _costo);
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



    public void venderRevista(int _idCliente, Revista _revista) {

         if ( clienteRegistrado( _idCliente) && _revista.getEstado() == Estado.Disponible) {
             Cliente cliente = retCliente(_idCliente);
             _revista.setEstado(Estado.Vendida);
             _revista.setCliente(cliente);

           Venta nuevaVenta = new Venta(fechaActual, _revista, cliente);
           listaVentas.add(nuevaVenta);

         }

    }


    public void prestarRevista(int _idCliente, Revista _revista) {
        if ( clienteRegistrado( _idCliente)&& ) {
            Cliente cliente = retCliente(_idCliente);
            if (!cliente.getMoroso()) {
                _revista.setEstado(Estado.Prestada);
                _revista.setCliente(cliente);

                Prestamo nuevoPrest = new Prestamo (fechaActual, _revista, diasPrestamoRevista);
                listaPrestamo.add(nuevoPrest);

            }
        }
    }


    public void prestarLibro(int _idCliente, Libro _libro) {
        if ( clienteRegistrado( _idCliente)&& ) {
            Cliente cliente = retCliente(_idCliente);
            if (!cliente.getMoroso()) {
                _libro.cambiarEstado();
                _libro.setCliente(cliente);

                Prestamo nuevoPrest = new Prestamo (fechaActual, _libro, diasPrestamoRevista);
                listaPrestamo.add(nuevoPrest);

            }
        }
    }

    
    // antes de dar estos parametros se deben de ingresar un entero correcto
    public void cambiarParametros(Date _fechaActual, int _diasPrestamoLibro, 
            int _diasPrestamoRevista) {
        
        this.fechaActual = _fechaActual;
        this.diasPrestamoLibro = _diasPrestamoLibro;
        this.diasPrestamoRevista = _diasPrestamoRevista;
    }
    
        
    public void consultarLibro(Estado _estado) {
        // crear la lista
        Vector<Libro> listaConsultada = new Vector<Libro>(); 
        
           for (int i = 0; i <= this.listaLibros.size(); i++) {
               // si el libro tiene el mismo estado que esta recibiendo el metodo
               if (this.listaLibros.get(i).getEstado() == _estado) {

		// método get estado :)
                   listaConsultada.add(this.listaLibros.get(i));
               }   
           }
           // aca se puede hacer una funcion que lo que hace es imprimir todo 
           // en la interfaz
    
    }
    
    public void CrearExcel() 
    {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook(); 
         
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");
          
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shukla"});
        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
        data.put("4", new Object[] {3, "John", "Adwards"});
        data.put("5", new Object[] {4, "Brian", "Schultz"});
          
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}


/* Bibliografia
https://poi.apache.org/apidocs/org/apache/poi/ss/usermodel/Row.html
https://docs.oracle.com/javase/7/docs/api/java/io/File.html

Para descargar xmlbeans: http://www.java2s.com/Code/Jar/x/Downloadxmlbeans230jar.htm
https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.0
*/
    
    
    
    
    
//}

//public void validarDatos(String pNombre, String pCorreo, String pCedula)
