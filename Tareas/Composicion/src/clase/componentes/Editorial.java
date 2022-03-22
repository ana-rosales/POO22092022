/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.componentes;

/**
 *
 * @author Jibda
 */
public class Editorial {
    private String pais;
    private int libros;

    public Editorial() {
    }

    public Editorial(String pais, int libros) {
        this.pais = pais;
        this.libros = libros;
    }

    public int getLibros() {
        return libros;
    }

    public void setLibros(int libros) {
        this.libros = libros;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" + "pais=" + pais + ", libros=" + libros + '}';
    }
    
    public String editar(int libros){
        libros = libros + 1;
        String mensaje = "Se han editado " + libros + " hasta hoy.";
        return mensaje;        
    }
}
