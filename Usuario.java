/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.lamota.libro.modelo;

public class Usuario {
    private String cedula;
    private String nombre;
    private String tipo;

    public Usuario(String cedula, String nombre, String tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}
