/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package falcomillajosevicente_activitatavaluable;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nostromo
 */
public class FalcoMillaJoseVicente_ActivitatAvaluable {

    static Scanner in = new Scanner(System.in); //lo hago static para que pertenezca a la clase y no tener que instanciarlo constantemente

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() throws InputMismatchException { //Tratamos la posible excepción en la entrada del menú, aunque no podremos continuar
        Agenda agenda = new Agenda();
        int opcion;

        try {
            do {
                System.out.print("Elija una opción\n\n1. Añadir Contacto Persona\n2. Añadir Contacto Empresa\n3. Eliminar Contacto\n4. Existe contacto?\n"
                        + "5. Número posición del contacto en la agenda\n6. Mostrar todos los contactos\n7. Salir\n");
                opcion = in.nextInt();
                in.nextLine();

                switch (opcion) {
//pongo la salida sólo para que se vea que nos devuelve un true/false, he puesto un mensaje en cada caso, así que es sólo porque así se nos solicita                
                    case 1:
                        System.out.println(agenda.introducirContacto(contactoPersona()));//Quitando todos los println obtenemos sólo el mensaje establecido
                        opcion = 0;
                        break;
//pongo la salida sólo para que se vea que nos devuelve un true/false, he puesto un mensaje en cada caso, así que es sólo porque así se nos solicita                    
                    case 2:
                        System.out.println(agenda.introducirContacto(contactoEmpresa()));//Quitando todos los println obtenemos sólo el mensaje establecido
                        opcion = 0;
                        break;
//pongo la salida sólo para que se vea que nos devuelve un true/false, he puesto un mensaje en cada caso, así que es sólo porque así se nos solicita                    
                    case 3:
                        System.out.println(agenda.eliminarContacto(nombreContacto()));//Quitando todos los println obtenemos sólo el mensaje establecido
                        opcion = 0;
                        break;
//pongo la salida sólo para que se vea que nos devuelve un true/false, he puesto un mensaje en cada caso, así que es sólo porque así se nos solicita                    
                    case 4:
                        System.out.println(agenda.existeContacto(nombreContacto()));//Quitando todos los println obtenemos sólo el mensaje establecido
                        opcion = 0;
                        break;
                    case 5:
                        System.out.println(agenda.buscarContacto(nombreContacto()));//Aquí no hay salida establecida, así que el println es necesario para ver el número de la posición en la agenda
                        opcion = 0;
                        break;
                    case 6:
                        agenda.listarContactos(); //Listar todos los contactos
                        System.out.println("");
                        opcion = 0;
                        break;
                    case 7:
                        System.out.println("AGENDA CERRADA");
                        break;
                }
            } while (opcion < 1 || opcion > 7);
        } catch (InputMismatchException e) { //Lanzamos el mensaje del error cometido
            System.out.println("El valor introducido debe ser numérico y entero, no son válidos carácteres diferenctes ni letras");
        } finally{
            in.close(); //Cerramos el recurso de la consola siempre tras cada selección
        }
    }

    public static Contacto contactoPersona() { //Solicitamos datos para crear un objeto ContactoPersona
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

    public static Contacto contactoEmpresa() { //Solicitamos datos para crear un objeto ContactoEmpresa
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

    public static String nombreContacto() { //Utilizamos la misma función para todas las búsquedas en las que necesitamos el nombre del contacto en la Agenda
        String nombre;

        System.out.println("Dime el nombre exacto del contacto");
        nombre = in.nextLine();

        return nombre;
    }
}
