/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.lamota.libro.modelo;

public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ") - " + (disponible ? "Disponible" : "Prestado");
    }
}
