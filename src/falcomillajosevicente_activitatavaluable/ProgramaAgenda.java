/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falcomillajosevicente_activitatavaluable;

/**
 *
 * @author nostromo
 */
public class ProgramaAgenda {
    
    public static void main (String[] args){
        ContactoPersona p1 = new ContactoPersona("José Vicente Falcó Milla", "695959113", "07/03/1984");
        ContactoPersona p2 = new ContactoPersona("Ana Lopez Perez", "665332114", "21/02/2001");
        ContactoPersona p3 = new ContactoPersona("Luis Silvestre Estalone", "963322114", "17/02/1978");
        ContactoPersona p1Repetido = new ContactoPersona("José Vicente Falcó Milla", "961858980", "07/03/1984");

        ContactoEmpresa e1 = new ContactoEmpresa("Coca-Cola", "900200300", "www.coca-cola.es");
        ContactoEmpresa e2 = new ContactoEmpresa("Ford", "965874123", "www.ford.es");
        ContactoEmpresa e3 = new ContactoEmpresa("Xiaomi", "87456321123", "www.xiaomi.com");
        ContactoEmpresa e1Repetido = new ContactoEmpresa("Coca-Cola", "900200300", "www.coca-cola.es");

        Agenda agenda = new Agenda();

        agenda.introducirContacto(p1);
        agenda.introducirContacto(p2);
        agenda.introducirContacto(p3);
        agenda.introducirContacto(p1Repetido);
        agenda.introducirContacto(e1);
        agenda.introducirContacto(e2);
        agenda.introducirContacto(e3);
        agenda.introducirContacto(e1Repetido);

        agenda.listarContactos();

        agenda.existeContacto("Pepe");
        agenda.existeContacto("Luis Silvestre Estalone");
        agenda.existeContacto("Ana Lopez Perez");

        agenda.eliminarContacto("Luis Silvestre Estalone");
        agenda.eliminarContacto("Ana Lopez Perez");

        agenda.listarContactos();
}
}
