public class C_Facultad {
    //ATRIBUTOS:
    private String nombre;
    private C_Carrera[] coleccionCarreras;

    //CONSTRUCTOR:
    public C_Facultad(String nombre, int numeroCarreras) {
        this.setNombre(nombre);
        this.setColeccionCarreras(new C_Carrera[numeroCarreras]);
    }

    //METODOS:
    public void agregarCarrera(C_Carrera carrera) {

    }
    public void eliminarCarrera(C_Carrera carrera) {
        //CODIGO...
    }
    public void eliminarEstudiante(C_Estudiante estudiante) {
        //CODIGO...
    }

    //GETTERS Y SETTERS:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public C_Carrera[] getColeccionCarreras() {
        return coleccionCarreras;
    }
    public void setColeccionCarreras(C_Carrera[] coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }
}
