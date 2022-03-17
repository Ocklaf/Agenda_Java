/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falcomillajosevicente_activitatavaluable;

/**
 *
 * @author nostromo
 */
public class ContactoPersona extends Contacto{
    private String fechaNacimiento;
    
    public ContactoPersona(String nombre, String telefono, String fechaNacimiento){
        super(nombre, telefono);
        
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public void mostrarContacto(){
        System.out.println("Persona: " + super.getNombre() + ", con número de teléfono: " + super.getTelefono() + ", con fecha de nacimiento el: " + this.fechaNacimiento);
    }
}
