
package herencia;


public class DesarrolladorSenior extends Desarrollador {

    int yearsExperience;
    int projectsLed;
    String specialization;
    boolean isMentor;

    public DesarrolladorSenior(String nombre, int edad, int identidad, String direccion, int telefono,
                               double salario, int idEmpleado, String fechaContratacion,
                               String tipoContrato, String area,
                               String lenguaje, String nivel, String herramientas, int proyectos,
                               int yearsExperience, int projectsLed,
                               String specialization, boolean isMentor) {

        super(nombre, edad, identidad, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, area,
              lenguaje, nivel, herramientas, proyectos);

        this.yearsExperience = yearsExperience;
        this.projectsLed = projectsLed;
        this.specialization = specialization;
        this.isMentor = isMentor;
    }
    
    @Override
    public void trabajar(){
        System.out.println("El desarrollador senior programa y lidera");
    }
}