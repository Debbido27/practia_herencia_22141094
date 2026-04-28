
package herencia;

import java.util.Scanner;

public class HERENCIA {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Empleado[]empleados=new Empleado[10];
        int contador=0;
        int opcion;
        
       do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar Desarrollador");
            System.out.println("2. Agregar Gerente");
            System.out.println("3. Agregar Desarrollador senior");
            System.out.println("4. Mostrar trabajo");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();
            
            if (opcion == 1) {
                empleados[contador] = new Desarrollador(
                        "David Medina", 20, 123, "Colonia", 9999,
                        1000, 101, "2024", "Full", "IT",
                        "Java", "Intermedio", "NetBeans", 31
                );
                contador++;
            }
            
            if (opcion == 2) {
                empleados[contador] = new Gerente(
                        "Maria", 40, 456, "Centro", 8888,
                        2000,102, "2020", "Full", "Admin",
                        "Ventas", 10, 50000, "Semanal"
                );
                contador++;
            }

            
            if (opcion == 3) {
                empleados[contador] = new DesarrolladorSenior(
                        "Carlos", 35, 789, "Zona C", 7777,
                        3000, 103, "2018", "Full", "IT",
                        "Python", "Avanzado", "VSCode", 10,
                        10, 3, "IA", true
                );
                contador++;
                System.out.println("Senior agregado");
            }

            
            
            if (opcion == 4) {
                for (int i = 0; i < contador; i++) {
                    empleados[i].trabajar(); 
                }
            }

        } while (opcion != 5);
    }
}
