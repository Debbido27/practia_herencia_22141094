
package herencia;


public class Empleado extends Persona {
    
    double salario;
    int idEmpleado;
    String fechaContratacion;
    String tipoContrato;
    String area;
    
    public Empleado(String nombre, int edad, int identidad, String direccion, int telefono,
                    double salario, int idEmpleado, String fechaContratacion,
                    String tipoContrato, String area) {
        super(nombre, edad, identidad, direccion, telefono);
        
        this.salario=salario;
        this.idEmpleado=idEmpleado;
        this.fechaContratacion=fechaContratacion;
        this.tipoContrato=tipoContrato;
        this.area=area;
    }
    
    
    
}
