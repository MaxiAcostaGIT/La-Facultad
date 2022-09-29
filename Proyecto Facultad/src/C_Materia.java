public class C_Materia implements I_Informacion{
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
    public void eliminarEstudiante(int estudiante) {
        C_Estudiante[] aux = new C_Estudiante[coleccionEstudiantes.length - 1];
        int j = 0;
        for (int i = 0; i < coleccionEstudiantes.length; i++) {
            if (coleccionEstudiantes[i] != coleccionEstudiantes[estudiante]) {
                aux[j] = coleccionEstudiantes[i];
                j++;
            }
        }
        coleccionEstudiantes = aux;
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

    // INFORMACION:
    @Override
    public int verCantidad() {
        int cantidad = 0;
        for (int i = 0; i < coleccionEstudiantes.length; i++) {
            if (coleccionEstudiantes[i] != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    @Override
    public String listarContenidos() {
        String contenido = "";
        for (int i = 0; i < coleccionEstudiantes.length; i++) {
            if (coleccionEstudiantes[i] != null) {
                contenido += coleccionEstudiantes[i].getNombre() + " " + coleccionEstudiantes[i].getApellido() + " " + coleccionEstudiantes[i].getLegajo() + "";
            }
        }
        return contenido;
    }
    @Override
    public String toString() {
        return "Materia: " + this.getNombre() + " - Cantidad de estudiantes: " + this.verCantidad() + " - Estudiantes: " + this.listarContenidos();
    }
}
