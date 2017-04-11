package biblioteca;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Eimy on 05/04/2017.
 */
public class Prestamo {
    private Date fechaInicial;
    private Articulo articulo;
    private int duracionPrestamo;
    private Date fechaDevuelto;
    private boolean prestActivo;

    Prestamo(Date _fechaI, Articulo _articulo, int _duracion){
        fechaInicial = _fechaI;
        articulo = _articulo;
        duracionPrestamo = _duracion;
        fechaDevuelto = null;
        prestActivo = false;
    }

    //GETTERS Y SETTERS
    public void setFechaDevuelto(Date _fecha){fechaDevuelto = _fecha;}
    public void setPrestActivo(boolean estado){prestActivo = estado;}
    public boolean getPrestAvtivo(){return prestActivo;}
    public int getDuracionPrestamo(){return duracionPrestamo;}
    public Date getFechaInicial(){return fechaInicial;}
    public Date getFechaDevuelto(){return fechaDevuelto;}
    public Articulo getArticulo(){return articulo;}


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
