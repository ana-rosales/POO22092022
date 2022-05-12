/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jibda
 */
public class VentanaSwing extends JFrame{
    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    
    public VentanaSwing() throws HeadlessException {
        setTitle("Conversión de °C a °F");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        
        //System.getProperty("user.dir") obtiene la ubicación del proyecto
        //en windows utiliza "\\" para separar directorios
        ImageIcon icono = new ImageIcon( System.getProperty("user.dir") + "\\src\\ico\\fes\\swing\\car.png");
        
        boton = new JButton(icono);
        boton.setBackground(Color.GREEN);
        boton.setOpaque(true);        
        boton.setToolTipText("Clic para convertir en °F");
        resultado = new JLabel("°F");
        //agregando cosas al content pane
        //no se agregan cosas al JFrame directamente
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        //renderiza elementos en la ventana
        this.validate();
        //lo hace visible
        this.setVisible(true);
        
        this.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit = 0.0f;
                float celsius = 0.0f;
                try {
                    //convierte texto a float
                    celsius = Float.parseFloat( cuadro.getText());
                    gradosFarenheit = (celsius * (9.0f/5.0f)) + 32.0f;
                    resultado.setText(gradosFarenheit + " °F");
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            }
        
        });
        
    }
    
    
}
