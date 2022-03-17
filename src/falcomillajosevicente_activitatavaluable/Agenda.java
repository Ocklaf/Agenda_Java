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

    private ArrayList<Contacto> agenda = new ArrayList();
    private String nombre;
    private boolean exito;
    private int indice;

    public boolean introducirContacto(Contacto c) {
        if (agenda.isEmpty()) {
            agenda.add(c);
            System.out.println("Contacto Agendado correctamente");
        } else {
            exito=true;            
            this.nombre = c.getNombre();
            for (Contacto p : agenda) {
                if (nombre.equals(p.getNombre())) {
                    exito = false;
                    System.out.println("El contacto ya existía en la agenda");
                }
            }
                
            if(exito){
                    agenda.add(c);
                    System.out.println("Contacto Agendado correctamente");
                }
        }

        return exito;
    }

    public boolean existeContacto(String nombre) {
            exito=false;
            for (Contacto p : agenda) {
                if (nombre.equals(p.getNombre())) {
                    exito = true;
                }
            }

        if (exito) {
            System.out.println("El contacto ya se encuentra en la agenda");
            return exito;
        } else {
            System.out.println("El contacto no existe en la agenda");
            return exito;
        }
    }

    public boolean eliminarContacto(String nombre) {
        exito = false;
        for (Contacto p : agenda) {
            if (nombre.equals(p.getNombre())) {
                indice = agenda.indexOf(p);
                exito = true;
        }
        }

        if (exito) {
            System.out.println("El contacto ha sido eliminado con éxito");
            agenda.remove(indice);
        } else {
            System.out.println("No se ha encontrado el contacto para su borrado");
        }

        return exito;
    }

    public void listarContactos() {
        agenda.forEach((e) -> {
            e.mostrarContacto();
        });
    }

}
