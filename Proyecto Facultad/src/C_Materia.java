public class C_Materia {
    //ATRIBUTOS:
    private String nombre;
    private C_Profesor titular;
    private C_Estudiante[] coleccionEstudiantes;

    //CONSTRUCTOR:
    public C_Materia(String nombre,C_Profesor profesor, int numeroEstudiantes) {
        this.nombre = nombre;
        this.titular = profesor;
        this.coleccionEstudiantes = new C_Estudiante[numeroEstudiantes];
    }

    //METODOS:
    public void agregarEstudiante(C_Estudiante estudiante) {
        //CODIGO...
    }

    public void eliminarEstudiante(C_Estudiante estudiante) {
        //CODIGO...
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
}
