/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falcomillajosevicente_activitatavaluable;

import java.util.ArrayList;

/**
 *
 * @author nostromo
 */
public class Agenda {

    private ArrayList<Contacto> agenda = new ArrayList(); //ArrayList que contendrá todos nuestros Contactos
    private String nombre; //Empleado para comparar con los datos que nos llegan a los métodos de búsqueda/eliminar/posición
    private boolean exito; //Utilizado en todos los métodos para saber del éxito o no de la operación
    private int indice; //Empleado para guardar la posición en el ArrayList

    public boolean introducirContacto(Contacto c) {
        if (agenda.isEmpty()) { //Si no tenemos ningún contacto todavía, no realizamos búsquedas para ver si existía de forma previa
            agenda.add(c); //Añadimos el primer contacto de la Agenda
            System.out.println("Contacto Agendado correctamente"); //Confirmamos con mensaje (también con el return, pero prefiero formatear la salida)
        } else { //Si ya tenemos contactos, evaluamos si está ya dentro
            exito = true;
            this.nombre = c.getNombre(); //Guardamos el nombre del contacto que nos mandan para almacenar
            for (Contacto p : agenda) { //Recorremos el ArrayList
                if (nombre.equals(p.getNombre())) { //Si el nombre del Contacto enviado es igual a algún nombre del ArrayList confirmamos que ya estaba
                    exito = false; //Ponemos a false
                    System.out.println("El contacto ya existía en la agenda y no ha sido almacenado"); //Indicamos al usuario que existía ya en la agenda
                }
            }

            if (exito) { //Si no ha coincidido con ningún nombre, será true
                agenda.add(c); //Lo añadimos a la Agenda
                System.out.println("Contacto Agendado correctamente"); //Confirmamos con salida formateada
            }
        }

        return exito; //Retornamos el booleano que se nos solicita
    }

    public boolean existeContacto(String nombre) {
        buscador(nombre);

        if (exito) { //Había un contacto con ese nombre
            System.out.println("El contacto ya se encuentra en la agenda"); //Formateamos salida
            return exito; //Retornamos lo que el enunciado nos pide, un booleano
        } else {
            System.out.println("El contacto no existe en la agenda"); //Formateamos salida si no ha existido coincidencia
            return exito; //Retornamos un booleano, que será false al no haber cambiado en el condicional del for
        }
    }

    public int buscarContacto(String nombre) { //Muy similar al método anterior
        buscador(nombre);//Método privado de búsqueda por nombre

        if (exito) {
            return indice; //Devolvemos el número entero de la posición donde se encontraba el contacto
        } else {
            System.out.println("El contacto que está buscando no se encuentra en la agenda y no podemos retornar su posición");
            return indice; //Si no hemos encontrado contacto, este valor será -1
        }
    }

    public boolean eliminarContacto(String nombre) {
        buscador(nombre); //Método privado de búsqueda por nombre

        if (exito) {
            System.out.println("El contacto ha sido eliminado con éxito");
            agenda.remove(indice);
        } else {
            System.out.println("No se ha encontrado el contacto para su borrado");
        }

        return exito;
    }

    public void listarContactos() { //Método para mostrar toda la agenda, recorriéndola con un forEach
        agenda.forEach((e) -> {
            e.mostrarContacto();
        });
    }

    private void buscador(String nombre) { //Método privado para buscar por nombre para los diversos métodos que lo requieren.
        exito = false;
        for (Contacto p : agenda) { //Recorremos
            if (nombre.equals(p.getNombre())) { //Si hemos encontrado coincidencia
                indice = agenda.indexOf(p); //Obtenemos el número del índice donde está la coincidencia (este valor sólo lo usará un método)
                exito = true;
            }
        }
        
    }

}
