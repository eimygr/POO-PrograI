package biblioteca;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Date;
import java.util.Properties;

/**
 * Clase Prestamo 
 * 
 * 
 */
public class Prestamo {
    private Date fechaInicial;
    private Articulo articulo;
    private int duracionPrestamo;
    private Date fechaDevuelto;
    private boolean prestActivo;
    private final long multaPorDia = 1000;
    private int diasDeAtraso;
     
    /**
     * Metodo constructor para la clase Prestamo
     * @param _fechaI tipo Date, recibe la fecha del prestamo creado
     * @param _articulo tipo Articulo, recibe el articulo, ya sea Libro o Revista
     * @param _duracion  la duracion es un entero que contiene la cantidad de dias
     */
    Prestamo(Date _fechaI, Articulo _articulo, int _duracion){
        fechaInicial = _fechaI;
        articulo = _articulo;
        duracionPrestamo = _duracion;
        fechaDevuelto = null;
        prestActivo = false;
        diasDeAtraso = 0;
    }
    

    //GETTERS Y SETTERS
    public void setFechaDevuelto(Date _fecha){fechaDevuelto = _fecha;}
    public void setPrestActivo(boolean estado){prestActivo = estado;}
    public boolean getPrestAvtivo(){return prestActivo;}
    public int getDuracionPrestamo(){return duracionPrestamo;}
    public Date getFechaInicial(){return fechaInicial;}
    public Date getFechaDevuelto(){return fechaDevuelto;}
    public Articulo getArticulo(){return articulo;}
    public long getMultaPorDia() {return multaPorDia;}
    public int getDiasAtraso() {return diasDeAtraso;}
    public void setDiasAtrso(int _dias) { diasDeAtraso = _dias;}

    /**
     * Metodo que toma una cantidad de dias y da la multa que tiene el cliente por
     * esos dias
     * 
     * @param _cantidadDias recibe una cantidad de dias
     * @return devuelve un la multa determinada por esa cantidad de dias
     */
    public long calcularMulta(int _cantidadDias) {
        return _cantidadDias*multaPorDia;
    }
    
    
    
    /**
     * 
     * Metodo creado para enviar un correo al usuario
     * 
     * @param _correoCliente string que contiene el Correo del cliente
     * @param _texto string Que contiene el mensaje que recibe el cliente
     */
    public static void EnviarCorreo(String _correoCliente, String _texto){
        // DATOS DEL CORREO DE SALIDA
        String from = "eimydanibetoser@gmail.com";
        String password = "programacion";
        String host = "smtp.gmail.com";

        // OBTIENE  LAS PROPIEDADES DEL SISTEMA
        Properties properties = System.getProperties();

        // AJUSTES DEL SERVIDOR
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.user",from);
        properties.put("mail.smtp.password",password);
        properties.put("mail.smtp.port",587);
        properties.put("mail.smtp.auth","true");

        // OBTIENE EL OBJETO Session POR DEFECTO
        Session session = Session.getDefaultInstance(properties, null);

        try {
            // CREA EL MENSAJE EN BLANCO
            MimeMessage message = new MimeMessage(session);

            // FIJA CORREO DE SALIDA
            message.setFrom(new InternetAddress(from));

            // AÑADE CORREO DESTINO
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(_correoCliente));

            // ESCRIBE ASUNTO
            message.setSubject("Prestamo Vencido");

            // ESCRIBE CUERPO DEL MENSAJE
            message.setText(_texto);

            // ENVIO DEL MENSAJE
            Transport transport = session.getTransport("smtp");
            transport.connect(host,from,password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Mensaje enviado satisfactoriamente");

        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
