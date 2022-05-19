/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Jibda
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    private ArrayList<Persona> datos; //de preferencia indicar el tipo de dato a guardar
    private Persona selected;
    
    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o; //parcing
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size(); //la cantidad de personas en el arreglo
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    
    public void consultarBaseDatos(){
        //simula consulta a base de datos
        datos = new ArrayList<Persona>(); //inicializar
        //conexión a bd
        //consulta SQL
        datos.add(new Persona("José", 19));
        datos.add(new Persona("María", 21));
        datos.add(new Persona("Jesús",33));
        datos.add(new Persona("Diana",22));
        
    }
    
}
