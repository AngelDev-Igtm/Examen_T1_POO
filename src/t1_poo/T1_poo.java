package t1_poo;
import java.util.Scanner;

public class T1_poo {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese código del alumno: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese nombre del alunmo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido paterno: ");
        String ApellidoPat = scanner.nextLine();
        
        System.out.print("Ingrese el apellido materno: ");
        String ApellidoMat = scanner.nextLine();
        
        System.out.print("Ingrese el DNI del alumno: ");
        String DNI = scanner.nextLine();
        
        try {
            System.out.print("Ingrese el carnet si tuviese: ");
            String carnet = scanner.nextLine();
        }catch (Exception e) 
        {
            System.out.println("El alumno no cuenta con carnet");
        }
        
        System.out.print("Ingrese el apellido paterno: ");
        boolean  beca = scanner.hasNextDouble();
    }
}
