/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author Jibda
 */
public class VentanaVersion2 extends Frame{
    private TextField cuadroTexto;
    private Button boton1;
    private Label etiqueta;
    private FlowLayout layout;

    public VentanaVersion2() throws HeadlessException {
        this.setTitle("Ventana oon eventos v2");
        this.setSize(300,220);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        cuadroTexto = new TextField( 15 );
        this.add(cuadroTexto);
        boton1 = new Button("Presioname!");
        this.add(boton1);
        etiqueta = new Label("Texto inicial");
        this.add(etiqueta);
        
        
        
        this.setVisible(true);
    }
    
    
}
