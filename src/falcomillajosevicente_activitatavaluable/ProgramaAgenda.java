/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falcomillajosevicente_activitatavaluable;

/**
 *
 * @author nostromo
 */
public class ProgramaAgenda { //Clase Creada con el único fin de hacer todas las pruebas pertinentes a nuestra clase Agenda
    
    public static void main (String[] args){
        
        //Crear e instanciar Personas
        ContactoPersona p1 = new ContactoPersona("José Vicente Falcó Milla", "695959113", "07/03/1984");
        ContactoPersona p2 = new ContactoPersona("Ana Lopez Perez", "665332114", "21/02/2001");
        ContactoPersona p3 = new ContactoPersona("Luis Silvestre Estalone", "963322114", "17/02/1978");
        ContactoPersona p1Repetido = new ContactoPersona("José Vicente Falcó Milla", "961858980", "07/03/1984"); //Repetimos una con el mismo nombre

        //Crear e instanciar Empresas
        ContactoEmpresa e1 = new ContactoEmpresa("Coca-Cola", "900200300", "www.coca-cola.es");
        ContactoEmpresa e2 = new ContactoEmpresa("Ford", "965874123", "www.ford.es");
        ContactoEmpresa e3 = new ContactoEmpresa("Xiaomi", "87456321123", "www.xiaomi.com");
        ContactoEmpresa e1Repetido = new ContactoEmpresa("Coca-Cola", "900200300", "www.coca-cola.es"); //Repetimos el nombre de una

        //Creanis e instanciamos nuestra Agenda
        Agenda agenda = new Agenda();
        
        //Introducimos todos los contactos incluidos los repetidos para ver qué sucede y si hace lo que debe
        agenda.introducirContacto(p1);
        agenda.introducirContacto(p2);
        agenda.introducirContacto(p3);
        agenda.introducirContacto(p1Repetido);
        agenda.introducirContacto(e1);
        agenda.introducirContacto(e2);
        agenda.introducirContacto(e3);
        agenda.introducirContacto(e1Repetido);

        //Listamos los contactos para verificar que no ha introducido aquellos repetidos    
        agenda.listarContactos();

        //Probamos a buscar contactos que sí y que no existen
        agenda.existeContacto("Pepe");
        agenda.existeContacto("Luis Silvestre Estalone");
        agenda.existeContacto("Ana Lopez Perez");

        //Buscamos que nos devuelva la posición del contacto
        System.out.println(agenda.buscarContacto("Coca-Cola"));
        System.out.println(agenda.buscarContacto("Ford"));
        System.out.println(agenda.buscarContacto("Luis Silvestre Estalone"));
        
        //Eliminamos por nombre y probamos con uno que no existe
        agenda.eliminarContacto("Luis Silvestre Estalone");
        agenda.eliminarContacto("Ana Lopez Perez");
        agenda.eliminarContacto("Susanita Tiene Raton");
                
        //Volvemos a listar la agenda
        agenda.listarContactos();
}
}
