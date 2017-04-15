/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package biblioteca;
import javax.swing.*;
public class Interfaz extends JFrame {
    
    JPanel panel = new JPanel();
    JButton btn = new JButton();
    
    public static void main(String[] args) {
        new Interfaz();
    }
    
    public Interfaz() {
        super("Basic Swing App");
        
        setSize(400,300);
        setResizable(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
        
        
    }
}

    
