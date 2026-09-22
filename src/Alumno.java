public class Alumno {
    private String codigo;
    private String nombre;
    private String ApellidoPat;
    private String ApellidoMat;
    private String DNI;
    private String carnet;
    private boolean beca;

    public Alumno() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return ApellidoPat;
    }

    public void setApellidoPat(String ApellidoPat) {
        this.ApellidoPat = ApellidoPat;
    }

    public String getApellidoMat() {
        return ApellidoMat;
    }

    public void setApellidoMat(String ApellidoMat) {
        this.ApellidoMat = ApellidoMat;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }
    
    public void VerDatos()
    {
        System.out.println("Codigo de Alumno: " + this.codigo + "Nombre del Alumno: " + this.nombre + "Apellido Paterno del Alumno: " 
                            + this.ApellidoPat + "Apellido Materno del Alumno: " + this.ApellidoMat + "Ingrese el DNI del ALumno: " + this.DNI
                            + "ingrese el carnet del alumno SI/NO: " +this.carnet + "El Alumno cuenta con beca?: " + this.beca);
    }
}
