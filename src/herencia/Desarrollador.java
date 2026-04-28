/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Dell
 */
public class Desarrollador extends Empleado {
    String lenguaje;
    String nivel;
    String herramientas;
    int proyectos;

    public Desarrollador(String nombre, int edad, int identidad, String direccion, int telefono,
                         double salario, int idEmpleado, String fechaContratacion,
                         String tipoContrato, String area,
                         String lenguaje, String nivel, String herramientas, int proyectos) {

        super(nombre, edad, identidad, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, area);

        this.lenguaje = lenguaje;
        this.nivel = nivel;
        this.herramientas = herramientas;
        this.proyectos = proyectos;
    }
    @Override
    public void trabajar(){
        System.out.println("El desarrollador esta programando...");
    }
}
