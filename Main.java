/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.lamota.libro.modelo;

import ec.edu.lamota.libro.modelo.*;
import ec.edu.lamota.libro.servicio.BibliotecaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaService servicio = new BibliotecaService();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Registrar Libro");
            System.out.println("2. Registrar Usuario");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Mostrar Libros");
            System.out.println("6. Mostrar Préstamos");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    String cod = sc.nextLine();
                    System.out.print("Título: ");
                    String tit = sc.nextLine();
                    System.out.print("Autor: ");
                    String aut = sc.nextLine();
                    servicio.registrarLibro(new Libro(cod, tit, aut));
                    break;
                case 2:
                    System.out.print("Cédula: ");
                    String ced = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Tipo (Estudiante/Profesor): ");
                    String tipo = sc.nextLine();
                    servicio.registrarUsuario(new Usuario(ced, nom, tipo));
                    break;
                case 3:
                    System.out.print("Cédula usuario: ");
                    String cu = sc.nextLine();
                    System.out.print("Código libro: ");
                    String cl = sc.nextLine();
                    if (servicio.prestarLibro(cu, cl)) {
                        System.out.println("¡Préstamo realizado!");
                    } else {
                        System.out.println("No se pudo realizar el préstamo.");
                    }
                    break;
                case 4:
                    System.out.print("Código libro: ");
                    String cd = sc.nextLine();
                    if (servicio.devolverLibro(cd)) {
                        System.out.println("¡Libro devuelto!");
                    } else {
                        System.out.println("Error al devolver el libro.");
                    }
                    break;
                case 5:
                    servicio.mostrarLibros();
                    break;
                case 6:
                    servicio.mostrarPrestamos();
                    break;
                case 0:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
