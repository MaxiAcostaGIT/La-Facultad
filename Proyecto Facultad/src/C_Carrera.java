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
        C_Materia[] aux = new C_Materia[this.getColeccionMaterias().length + 1];
        for (int i = 0; i < this.getColeccionMaterias().length; i++) {
            aux[i] = this.getColeccionMaterias()[i];
        }
        aux[aux.length - 1] = materia;
        this.setColeccionMaterias(aux);
    }
    public void eliminarMateria(C_Materia materia) {
        C_Materia[] aux = new C_Materia[this.getColeccionMaterias().length - 1];
        int j = 0;
        for (int i = 0; i < this.getColeccionMaterias().length; i++) {
            if (this.getColeccionMaterias()[i] != materia) {
                aux[j] = this.getColeccionMaterias()[i];
                j++;
            }
        }
        this.setColeccionMaterias(aux);
    }
    public void encontrarMateria(String nombre) {
        for (int i = 0; i < this.getColeccionMaterias().length; i++) {
            if (this.getColeccionMaterias()[i].getNombre().equals(nombre)) {
                System.out.println("Materia encontrada: " + this.getColeccionMaterias()[i].getNombre());
            }
        }
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
