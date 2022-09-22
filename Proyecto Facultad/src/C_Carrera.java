public class C_Carrera {
    //ATRIBUTOS:
    private String nombre;
    private C_Materia[] coleccionMaterias;

    //CONSTRUCTOR:
    public C_Carrera(String nombre, int numeroMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = new C_Materia[numeroMaterias];
    }

    //METODOS:
    public void agregarMateria(C_Materia materia) {

    }
    public void eliminarMateria(C_Materia materia) {
        //CODIGO...
    }
    public void encontrarMateria(String nombre) {
        //CODIGO...
    }

    //GETTERS Y SETTERS:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public C_Materia[] getColeccionMaterias() {
        return coleccionMaterias;
    }
    public void setColeccionMaterias(C_Materia[] coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }
}
