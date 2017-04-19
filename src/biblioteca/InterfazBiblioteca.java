/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CASA
 */
public class InterfazBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form InterfazBiblioteca
     */
    public InterfazBiblioteca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaRegistroManual = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        nombreLibroText = new javax.swing.JTextField();
        autorLibroText = new javax.swing.JTextField();
        categoriaListBox = new javax.swing.JComboBox<>();
        categoriaLabel = new javax.swing.JLabel();
        botonPantallaRegistrar = new javax.swing.JButton();
        editorialText = new javax.swing.JTextField();
        publicacionText = new javax.swing.JTextField();
        ventanaRegistrarCliente = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        clienteText = new javax.swing.JTextField();
        correoText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        botonVentanaRegistrarCliente = new javax.swing.JButton();
        ventanaRegistroRevista = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        revnombreText = new javax.swing.JTextField();
        revnumeroText = new javax.swing.JTextField();
        revanoText = new javax.swing.JTextField();
        revtipoBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        botonVentanaRegistrarRevista = new javax.swing.JButton();
        revcostoText = new javax.swing.JTextField();
        etiquetaApp = new javax.swing.JLabel();
        registrarBoton = new javax.swing.JButton();
        excelBoton = new javax.swing.JButton();
        botonRegistrarCliente = new javax.swing.JButton();
        botonRegistrarRevista = new javax.swing.JButton();

        ventanaRegistroManual.setMinimumSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar libro manualmente");

        nombreLibroText.setText("Nombre del libro ");
        nombreLibroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreLibroTextActionPerformed(evt);
            }
        });

        autorLibroText.setText("Autor");

        categoriaListBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novela", "Teatro", "Poesia", "Infantil", "Ensayo" }));

        categoriaLabel.setText("Categoria: ");

        botonPantallaRegistrar.setText("Registrar libro");
        botonPantallaRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPantallaRegistrarMouseClicked(evt);
            }
        });

        editorialText.setText("Editorial");

        publicacionText.setText("Año de publicacion");

        javax.swing.GroupLayout ventanaRegistroManualLayout = new javax.swing.GroupLayout(ventanaRegistroManual.getContentPane());
        ventanaRegistroManual.getContentPane().setLayout(ventanaRegistroManualLayout);
        ventanaRegistroManualLayout.setHorizontalGroup(
            ventanaRegistroManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRegistroManualLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(ventanaRegistroManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaRegistroManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRegistroManualLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78))
                        .addGroup(ventanaRegistroManualLayout.createSequentialGroup()
                            .addGroup(ventanaRegistroManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreLibroText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(autorLibroText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(ventanaRegistroManualLayout.createSequentialGroup()
                        .addGroup(ventanaRegistroManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonPantallaRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(editorialText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(ventanaRegistroManualLayout.createSequentialGroup()
                                .addComponent(categoriaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoriaListBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(publicacionText))
                        .addContainerGap())))
        );
        ventanaRegistroManualLayout.setVerticalGroup(
            ventanaRegistroManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRegistroManualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(nombreLibroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autorLibroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(publicacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editorialText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(ventanaRegistroManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLabel)
                    .addComponent(categoriaListBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(botonPantallaRegistrar)
                .addContainerGap())
        );

        ventanaRegistrarCliente.setMinimumSize(new java.awt.Dimension(400, 400));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar cliente");

        clienteText.setText("Nombre del cliente");
        clienteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteTextActionPerformed(evt);
            }
        });

        correoText.setText("Correo electronico");

        idText.setText("Cedula de identificacion");

        telefonoText.setText("Numero de telefono");

        botonVentanaRegistrarCliente.setText("Registrar cliente");
        botonVentanaRegistrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaRegistrarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventanaRegistrarClienteLayout = new javax.swing.GroupLayout(ventanaRegistrarCliente.getContentPane());
        ventanaRegistrarCliente.getContentPane().setLayout(ventanaRegistrarClienteLayout);
        ventanaRegistrarClienteLayout.setHorizontalGroup(
            ventanaRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(ventanaRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clienteText)
                    .addComponent(correoText)
                    .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(telefonoText)
                    .addComponent(botonVentanaRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );
        ventanaRegistrarClienteLayout.setVerticalGroup(
            ventanaRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(correoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(botonVentanaRegistrarCliente)
                .addGap(42, 42, 42))
        );

        ventanaRegistroRevista.setMinimumSize(new java.awt.Dimension(400, 400));

        jLabel3.setText("Nombre, numero, ano, tipo(Venta o Prestamo)");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar revista");

        revnombreText.setText("Nombre");

        revnumeroText.setText("Numero");

        revanoText.setText("Año");

        revtipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta", "Prestamo" }));

        jLabel5.setText("Tipo:");

        botonVentanaRegistrarRevista.setText("Registrar revista");
        botonVentanaRegistrarRevista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVentanaRegistrarRevistaMouseClicked(evt);
            }
        });

        revcostoText.setText("Costo");
        revcostoText.setToolTipText("Si la revista no es de venta, ingrese un 0");

        javax.swing.GroupLayout ventanaRegistroRevistaLayout = new javax.swing.GroupLayout(ventanaRegistroRevista.getContentPane());
        ventanaRegistroRevista.getContentPane().setLayout(ventanaRegistroRevistaLayout);
        ventanaRegistroRevistaLayout.setHorizontalGroup(
            ventanaRegistroRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRegistroRevistaLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(ventanaRegistroRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRegistroRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ventanaRegistroRevistaLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(revtipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(218, 218, 218))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRegistroRevistaLayout.createSequentialGroup()
                            .addGroup(ventanaRegistroRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(revcostoText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ventanaRegistroRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(revnombreText)
                                    .addComponent(revnumeroText)
                                    .addComponent(revanoText)))
                            .addGap(87, 87, 87)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRegistroRevistaLayout.createSequentialGroup()
                        .addComponent(botonVentanaRegistrarRevista)
                        .addGap(142, 142, 142))))
        );
        ventanaRegistroRevistaLayout.setVerticalGroup(
            ventanaRegistroRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRegistroRevistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(revnombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(revnumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(revanoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaRegistroRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revtipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(revcostoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(botonVentanaRegistrarRevista)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaApp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaApp.setText("Biblioteca");

        registrarBoton.setText("Registrar libro");
        registrarBoton.setToolTipText("Registrar un libro manualmente");
        registrarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarBotonMouseClicked(evt);
            }
        });
        registrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBotonActionPerformed(evt);
            }
        });

        excelBoton.setText("Registrar desde archivo Excel");
        excelBoton.setToolTipText("Buscar en el sistema un archivo de Excel para registrar libros y revistas");
        excelBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelBotonMouseClicked(evt);
            }
        });

        botonRegistrarCliente.setText("Registrar cliente");
        botonRegistrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarClienteMouseClicked(evt);
            }
        });

        botonRegistrarRevista.setText("Registrar revista");
        botonRegistrarRevista.setToolTipText("Registrar revista manualmente");
        botonRegistrarRevista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarRevistaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(excelBoton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(registrarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaApp)
                        .addComponent(botonRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistrarRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRegistrarRevista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(excelBoton)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarBotonActionPerformed

    private void nombreLibroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreLibroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreLibroTextActionPerformed

    private void registrarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBotonMouseClicked
        // TODO add your handling code here:
        System.out.println("CLICK!");
        ventanaRegistroManual.setVisible(true);
    }//GEN-LAST:event_registrarBotonMouseClicked

    private void excelBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelBotonMouseClicked
        // TODO add your handling code here:
        try{
        mainBiblioteca.LeerExcel();
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(rootPane, "Libros y revistas cargadas");
        }
        
    }//GEN-LAST:event_excelBotonMouseClicked

    private void botonPantallaRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPantallaRegistrarMouseClicked
        // TODO add your handling code here:
        try{
            Genero generoLibro=Genero.Ensayo;
            String nombre = nombreLibroText.getText();
            String autor = autorLibroText.getText();
            String publicacion = publicacionText.getText();
            String editorial = editorialText.getText();
            String categoria = categoriaListBox.getSelectedItem().toString();
            //System.out.println(categoria);
            int ano = Integer.parseInt(publicacion);
            
            switch(categoria){
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
            mainBiblioteca.registrarLibro(nombre, autor, ano, editorial, generoLibro);
            }
        catch (NullPointerException e){
            System.out.println("Errorsh");
            }
        catch (java.lang.NumberFormatException e){
            System.out.println("Errorsh");
        }
    JOptionPane.showMessageDialog(rootPane, "Libro registrado");
    ventanaRegistroManual.dispose();
    }//GEN-LAST:event_botonPantallaRegistrarMouseClicked

    private void clienteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteTextActionPerformed

    private void botonRegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarClienteMouseClicked
        // TODO add your handling code here:
        ventanaRegistrarCliente.setVisible(true);
    }//GEN-LAST:event_botonRegistrarClienteMouseClicked

    private void botonVentanaRegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRegistrarClienteMouseClicked
        // TODO add your handling code here:
        try{
            String nombre = clienteText.getText();
            String correo = correoText.getText();
            String id = idText.getText();
            String telefono = telefonoText.getText();
            //String categoria = categoriaListBox.getSelectedItem().toString();
            int _id = Integer.parseInt(id);
            int _telefono = Integer.parseInt(telefono);
            
            mainBiblioteca.registrarCliente(nombre, correo, _id, _telefono);
        }
        
        catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        }
    }//GEN-LAST:event_botonVentanaRegistrarClienteMouseClicked

    private void botonRegistrarRevistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarRevistaMouseClicked
        // TODO add your handling code here:
        ventanaRegistroRevista.setVisible(true);
    }//GEN-LAST:event_botonRegistrarRevistaMouseClicked

    private void botonVentanaRegistrarRevistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVentanaRegistrarRevistaMouseClicked
        // TODO add your handling code here:
        
        try{
            int _costo = 0;
            String nombre = revnombreText.getText();
            String num = revnumeroText.getText();
            int _num = Integer.parseInt(num);
            
            String ano = revanoText.getText();
            int _ano = Integer.parseInt(ano);
           
            String tipo = revtipoBox.getSelectedItem().toString();
            
            try{
                String costo = revcostoText.getText();
                _costo = Integer.parseInt(revcostoText.getText());
                }
            catch (java.lang.NumberFormatException e){
 
            }
            
            //if (tipo == "Venta"){
                //ventanaCosto.setVisible(true);
               // costo = Integer.parseInt(revcostoText.getText());
                //}
            //mainBiblioteca.re
            mainBiblioteca.registrarRevista(nombre, _num, _ano, tipo, _costo);
            ventanaRegistroRevista.dispose();
        } 
        
        catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        }
    }//GEN-LAST:event_botonVentanaRegistrarRevistaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazBiblioteca().setVisible(true);
            }
        });
    }
Date fecha = new Date();
Biblioteca mainBiblioteca = new Biblioteca("Biblioteca Bonita", "Mercedes Norte", 22382118, "Maria del Carmen Mairena", fecha, 10, 8);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorLibroText;
    private javax.swing.JButton botonPantallaRegistrar;
    private javax.swing.JButton botonRegistrarCliente;
    private javax.swing.JButton botonRegistrarRevista;
    private javax.swing.JButton botonVentanaRegistrarCliente;
    private javax.swing.JButton botonVentanaRegistrarRevista;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JComboBox<String> categoriaListBox;
    private javax.swing.JTextField clienteText;
    private javax.swing.JTextField correoText;
    private javax.swing.JTextField editorialText;
    private javax.swing.JLabel etiquetaApp;
    private javax.swing.JButton excelBoton;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreLibroText;
    private javax.swing.JTextField publicacionText;
    private javax.swing.JButton registrarBoton;
    private javax.swing.JTextField revanoText;
    private javax.swing.JTextField revcostoText;
    private javax.swing.JTextField revnombreText;
    private javax.swing.JTextField revnumeroText;
    private javax.swing.JComboBox<String> revtipoBox;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JFrame ventanaRegistrarCliente;
    private javax.swing.JFrame ventanaRegistroManual;
    private javax.swing.JFrame ventanaRegistroRevista;
    // End of variables declaration//GEN-END:variables
}