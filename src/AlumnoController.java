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
    
    public boolean ValidarDni(String DNI)
    {
        if (DNI == null) {
            return false;
        }
        return DNI.matches("\\d{8}");
    }
}
