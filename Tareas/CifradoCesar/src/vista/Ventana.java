/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static vista.LetrasRaras.ENIE_MINUS;

/**
 *
 * @author Jibda
 */
public class Ventana extends JFrame implements LetrasRaras{
    private JTextField texto,key;
    private JButton boton;
    private JLabel resultado;

    public Ventana() {
        setTitle("Cifrado César");
        setSize(400,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        texto = new JTextField(5);
        key = new JTextField(5);
        boton = new JButton("Cifrar texto");
        resultado = new JLabel("Aquí va texto cifrado");
        
        this.getContentPane().add(texto);
        this.getContentPane().add(key);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                byte[] bytes;
                int llave;
                String fin = "";
                
                bytes = texto.getText().getBytes();
                llave = Integer.parseInt(key.getText());
                
                for (byte aByte : bytes) {
                    int num = aByte;
                    num += llave;
                    //Mayúscula
                    num = (num>=90)? (num%90)+64: num;
                    //Minúscula
                    num = (num>=122)? (num%122)+96: num;
                    
                    String s = Character.toString(num);
                    
                    System.out.println(num);
                    System.out.println(s);
                }
                
            }
        });
    }
    
    
}
