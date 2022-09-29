public class C_Materia {
    //ATRIBUTOS:
    private String nombre;
    private C_Profesor titular;
    private C_Estudiante[] coleccionEstudiantes;

    //CONSTRUCTOR:
    public C_Materia(String nombre, int numeroEstudiantes) {
        this.nombre = nombre;
        this.coleccionEstudiantes = new C_Estudiante[numeroEstudiantes];
    }

    //METODOS:
    public void agregarEstudiante(C_Estudiante estudiante) {
        for (int i = 0; i < coleccionEstudiantes.length; i++) {
            if (coleccionEstudiantes[i] == null) {
                coleccionEstudiantes[i] = estudiante;
                break;
            }
        }
    }
    public void eliminarEstudiante(C_Estudiante estudiante) {
        for (int i = 0; i < coleccionEstudiantes.length; i++) {
            if (coleccionEstudiantes[i] == estudiante) {
                coleccionEstudiantes[i] = null;
                break;
            }
        }
    }
    public void modificarTitular(C_Profesor CProfesor) {
        this.setTitular(CProfesor);
    }

    //GETTERS Y SETTERS:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public C_Profesor getTitular() {
        return titular;
    }
    public void setTitular(C_Profesor titular) {
        this.titular = titular;
    }
    public C_Estudiante[] getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }
    public void setColeccionEstudiantes(C_Estudiante[] coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }
    public void setProfesor(C_Profesor profesor) {
        this.titular = profesor;
    }
}
