
import java.util.ArrayList;

public class AlumnoController 
{
    public void AgregarAlumno(String AlumnoNuevo) {
        if (AlumnoNuevo != null) {
            this.AgregarAlumno(AlumnoNuevo);
            System.out.println("Alumno agregado correctamente.");
        } else {
            System.out.println("Error: No hay nada.");
        }
    }
    
    public void ValidarDni()
    {

    }
}
