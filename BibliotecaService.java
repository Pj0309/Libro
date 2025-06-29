/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.lamota.libro.modelo;

import ec.edu.lamota.libro.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private List<Libro> libros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equalsIgnoreCase(codigo)) {
                return libro;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(String cedula) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCedula().equalsIgnoreCase(cedula)) {
                return usuario;
            }
        }
        return null;
    }

    public boolean prestarLibro(String cedula, String codigoLibro) {
        Usuario usuario = buscarUsuario(cedula);
        Libro libro = buscarLibro(codigoLibro);

        if (usuario != null && libro != null && libro.isDisponible()) {
            libro.prestar();
            prestamos.add(new Prestamo(usuario, libro));
            return true;
        }
        return false;
    }

    public boolean devolverLibro(String codigoLibro) {
        Libro libro = buscarLibro(codigoLibro);
        if (libro != null && !libro.isDisponible()) {
            libro.devolver();
            return true;
        }
        return false;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
