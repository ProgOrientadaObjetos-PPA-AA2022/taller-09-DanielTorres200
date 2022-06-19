/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author spart
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String userName;

    public Persona(String nom, String ape, String user) {
        nombre = nom;
        apellido = ape;
        userName = user;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerUsername(String user) {
        userName = user;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return userName;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n",
                nombre, apellido, userName);
        return cadena;
    }
}
