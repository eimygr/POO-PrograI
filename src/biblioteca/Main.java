package biblioteca;

public class Main {
    
    public static void main(String[] args) {
        //Prestamo.EnviarCorreo("eimygr@gmail.com", "Eimy, lesbiana");
        String[] archivo = new String[1];
        archivo[0] = "Libros";
        
        //Biblioteca.testCreateSampleSheet("Libros");
        //Biblioteca.registrarExcel(archivo);
        Biblioteca a = new Biblioteca();
        
        a.CrearExcel();
        
    }


}
