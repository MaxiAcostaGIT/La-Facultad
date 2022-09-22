public class C_Profesor extends A_Persona{
    double basico;
    int antiguedad;

    //CONSTRUCTOR:

    public C_Profesor(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    public double calcularSueldo() {
        return basico + (antiguedad * 100);
    }
}
