/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falcomillajosevicente_activitatavaluable;

/**
 *
 * @author nostromo
 */
public class ContactoEmpresa extends Contacto {
    private String web;
    
    public ContactoEmpresa(String nombre, String telefono, String web){
        super(nombre, telefono);
        
        this.web = web;
    }

    /**
     * @return the web
     */
    public String getWeb() {
        return web;
    }

    /**
     * @param web the web to set
     */
    public void setWeb(String web) {
        this.web = web;
    }
    
    @Override
    public void mostrarContacto(){
        System.out.println("Empresa: " + super.getNombre() + ", con número de teléfono: " + super.getTelefono() + ", con página web: " + this.web);
    }
}
