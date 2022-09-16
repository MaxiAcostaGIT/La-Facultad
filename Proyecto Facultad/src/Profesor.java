public class Profesor {
    double basico;
    int antiguedad;

    public double calcularSueldo() {
        return basico + (antiguedad * 100); // VALOR POR DEFECTO PARA QUE NO DE ERROR.
    }
}
