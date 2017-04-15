package biblioteca;
import java.util.Date;
import java.util.*;
import static java.lang.System.*;

//Librerias y archivos para leer de Excel
import javax.swing.JFileChooser;
import java.io.FileInputStream;
import java.io.FileOutputStream;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
        return null; //Si no tiene un return por defecto, no compila
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
            _editorial, Genero _genero) {
        
        if (this.validarString(_autor) && this.validarString(_editorial) 
            && this.validarString(_nombre) ) {
            // crear el Libro y lo agrega a la lista
            Libro libroNuevo = new Libro(_nombre, _autor, _año, _editorial, _genero);
            this.listaLibros.add(libroNuevo);
            
        } else {
            out.println("Error en los datos dados para registrar el Libro");
        
        }
    }


    public void registrarRevista(String _nombre, int _numero, int _año, String
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

           Venta nuevaVenta = new Venta(fechaActual,this.listaRevistas, cliente, _revista.getNombre());
           listaVentas.add(nuevaVenta);

         }

    }


    public void prestarRevista(int _idCliente, Revista _revista) {
        if ( clienteRegistrado( _idCliente) ) {
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
        if ( clienteRegistrado( _idCliente)&& !retCliente( _idCliente).getMoroso()) {  //falta una segunda expresion despues del &&
            Cliente cliente = retCliente(_idCliente);
            if (!cliente.getMoroso()) {
                _libro.CambiarEstado();  //No estaba escrito el metodo en la clase libro
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
    
    public void consultarRevista(Estado _estado) {
        // crear la lista
        Vector<Revista> listaConsultada = new Vector<Revista>(); 
        
           for (int i = 0; i <= this.listaLibros.size(); i++) {
               // si el libro tiene el mismo estado que esta recibiendo el metodo
               if (this.listaRevistas.get(i).getEstado() == _estado) {

		// método get estado :)
                   listaConsultada.add(this.listaRevistas.get(i));
               }   
           }
           // aca se puede hacer una funcion que lo que hace es imprimir todo 
           // en la interfaz
    
    }

    //Pba
    public void LeerExcel() {
                String c1Val = "";
                String f1Val = "";
                double f1Val2 = 0.0;
                double c1Val2 = 0.0;
		try {
                        final JFileChooser fc = new JFileChooser();
                        fc.showOpenDialog(fc);
                        
                        java.io.File file = fc.getSelectedFile();
                        
                        String Filename = fc.getName(file);
                        
			FileInputStream fileInputStream = new FileInputStream(Filename);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet worksheet = workbook.getSheetAt(0);

			
                        int cont = 0;
                        while (true){
                            XSSFRow row1 = worksheet.getRow(cont);
                            XSSFCell cellA1 = row1.getCell((short) 0);
                            String a1Val = cellA1.getStringCellValue();

                            XSSFCell cellB1 = row1.getCell((short) 1);
                            String b1Val = cellB1.getStringCellValue();
                            
                            try{
                                XSSFCell cellC1 = row1.getCell((short) 2);
                                c1Val = cellC1.getStringCellValue();
                                
                            } catch(IllegalStateException e){
                                XSSFCell cellC1 = row1.getCell((short) 2);
                                c1Val2 = cellC1.getNumericCellValue();
                            }
                            
                            XSSFCell cellD1 = row1.getCell((short) 3);
                            double d1Val = cellD1.getNumericCellValue();

                            XSSFCell cellE1 = row1.getCell((short) 4);
                            String e1Val = cellE1.getStringCellValue();
                            
                            try{
                                XSSFCell cellF1 = row1.getCell((short) 5);
                                f1Val = cellF1.getStringCellValue();
                            } catch(IllegalStateException e){
                                XSSFCell cellF1 = row1.getCell((short) 5);
                                f1Val2 = cellF1.getNumericCellValue();
                            }
                            System.out.println("A1: " + a1Val);
                            System.out.println("B1: " + b1Val);
                            System.out.println("C1: " + c1Val);
                            System.out.println("C1: " + c1Val2);
                            System.out.println("D1: " + d1Val);
                            System.out.println("E1: " + e1Val);
                            System.out.println("F1: " + f1Val + "\n");
                            System.out.println("F1: " + f1Val2);
                            cont++;
                            Genero generoLibro = Genero.Ensayo;
                            
                            switch(f1Val){
                                case "Ensayo": generoLibro = Genero.Ensayo;
                                break;
                                case "Novela": generoLibro = Genero.Novela;
                                break;
                                case "Infantil": generoLibro = Genero.Infantil;
                                break;
                                case "Poesia": generoLibro = Genero.Poesia;
                                break;
                                case "Teatro": generoLibro = Genero.Teatro;
                                break;
                                
                            }
                            
                            int intd1Val = (int) d1Val;
                            
                            if (a1Val.equals("Libro")){
                                registrarLibro(b1Val, c1Val, intd1Val, e1Val, generoLibro);
                            }
                            else{
                                if (a1Val.equals("Revista")){
                                int intf1Val2 = (int) f1Val2;
                                int intc1Val2 = (int) c1Val2;
                                registrarRevista(b1Val, intc1Val2, intd1Val, e1Val, intf1Val2);
                                }
                            }
                        }
                        
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e){
                        System.out.println("Yap");
                }
                
	}
}
    //} //con estas llaves me pedia una clase, un enum o una interfaz y por ende error xq no habia nada


/* Bibliografia
https://poi.apache.org/apidocs/org/apache/poi/ss/usermodel/Row.html
https://docs.oracle.com/javase/7/docs/api/java/io/File.html
Para descargar xmlbeans: http://www.java2s.com/Code/Jar/x/Downloadxmlbeans230jar.htm
https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.0
*/
    
    
    
//}

//public void validarDatos(String pNombre, String pCorreo, String pCedula)
