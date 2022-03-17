/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package falcomillajosevicente_activitatavaluable;

import java.util.Scanner;

/**
 *
 * @author nostromo
 */
public class FalcoMillaJoseVicente_ActivitatAvaluable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        Agenda agenda = new Agenda();
        Scanner in = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elija una opcion");
            System.out.print("1. Añadir Contacto Persona\n2. Añadir Contacto Empresa\n3. Eliminar Contacto\n4. Verificar si existe\n5. Buscar contacto\n6. Mostrar todos los contactos\n7. Salir\n");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    agenda.introducirContacto(contactoPersona());
                    opcion = 0;
                    break;
                case 2:
                    agenda.introducirContacto(contactoEmpresa());
                    opcion = 0;
                    break;
                case 3:
                    agenda.eliminarContacto(eliminarContacto());
                    opcion = 0;
                    break;
                case 4:
                    agenda.existeContacto(existeContacto());
                    opcion = 0;
                    break;
                case 6:
                    agenda.listarContactos();
                    opcion = 0;
                    break;
                case 7:
                    System.out.println("AGENDA CERRADA");
                    break;
            }
        } while (opcion < 1 || opcion > 7);
    }

    public static Contacto contactoPersona() {
        Scanner in = new Scanner(System.in);
        String nombre, telefono, fechaNacimiento;

        System.out.println("Dime el nombre completo de la persona");
        nombre = in.nextLine();
        System.out.println("Dime el teléfono");
        telefono = in.nextLine();
        System.out.println("Dime su fecha de nacimiento");
        fechaNacimiento = in.nextLine();

        ContactoPersona p = new ContactoPersona(nombre, telefono, fechaNacimiento);

        return p;
    }

    public static Contacto contactoEmpresa() {
        Scanner in = new Scanner(System.in);
        String nombre, telefono, web;

        System.out.println("Dime el nombre completo de la empresa");
        nombre = in.nextLine();
        System.out.println("Dime el teléfono");
        telefono = in.nextLine();
        System.out.println("Dime su página web");
        web = in.nextLine();

        ContactoEmpresa e = new ContactoEmpresa(nombre, telefono, web);

        return e;
    }

    public static String eliminarContacto() {
        Scanner in = new Scanner(System.in);
        String nombre;

        System.out.println("Dime el nombre exacto del contacto");
        nombre = in.nextLine();

        return nombre;
    }

    public static String existeContacto() {
        Scanner in = new Scanner(System.in);
        String nombre;

        System.out.println("Dime el nombre exacto del contacto");
        nombre = in.nextLine();

        return nombre;
    }

}
