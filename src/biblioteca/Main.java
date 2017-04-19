package biblioteca;
import java.util.Date;
public class Main {
    
    public static void main(String[] args) {
        //Biblioteca mainBiblioteca = new Biblioteca();
    
      ///*
      Date fecha = new Date();
      
        Biblioteca a = new Biblioteca("Biblioteca Bonita", "Mercedes Norte", 22382118, "Maria del Carmen Mairena", fecha, 10, 8);
        
              /*  
                Biblioteca(String _nombre, String _ubicacion, int _telefono
            , String _bibliotecologo, Date _fechaActual, int _diasPrestamoLibro,
            int _diasPrestamoRevista)
        //a.registrarCliente("Hola", "asd@hotmail.com", 402380478, 86582179);
        //a.LeerExcel();
      //*/  
      InterfazBiblioteca GUI = new InterfazBiblioteca();
      GUI.setVisible(true);
      
    }

    

    