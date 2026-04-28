/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Dell
 */
public class Gerente extends Empleado{
    
    String departamento;
    int personasCargo;
    double presupuesto;
    String reuniones;

    public Gerente(String nombre, int edad, int identidad, String direccion, int telefono,
                   double salario, int idEmpleado, String fechaContratacion,
                   String tipoContrato, String area,
                   String departamento, int personasCargo, double presupuesto, String reuniones) {

        super(nombre, edad, identidad, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, area);

        this.departamento = departamento;
        this.personasCargo = personasCargo;
        this.presupuesto = presupuesto;
        this.reuniones = reuniones;
    }
    
    @Override
    public void trabajar(){
        System.out.println("El gerente esta coordinando...");
    }
    
}
