/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Persona;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author Jibda
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola de nuevo");
        Silla s1 = new Silla();
        System.out.println( s1 ); //imprime dirección de memoria del objeto
                                  //si se tiene toString() lo invoca automáticamente
        System.out.println(s1.toString());
        
        //método constructor
        Automovil miBocho = new Automovil();
        System.out.println(miBocho);
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        //método constructor sobrecargado
        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAkura = new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);        
        
        Persona per1 = new Persona();
        //per1.edad = 200000; no se permite por seguridad
        per1.setEdad(22);
        System.out.println(per1);
        
        Alumno al = new Alumno(); //ctrl + espacio para import
        al.setNombre("Ana");
        al.setNumeroCuenta("31924363-9");
        al.setGrupo(2209);
        System.out.println(al);
        
    }
    
}
