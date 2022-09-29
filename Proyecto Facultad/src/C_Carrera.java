public class C_Carrera implements I_Informacion{
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
        // agergar materia a la coleccion de materias de la carrera en la primera posicion libre:
        for (int i = 0; i < coleccionMaterias.length; i++) {
            if (coleccionMaterias[i] == null) {
                coleccionMaterias[i] = materia;
                break;
            }
        }
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

    // INFORMACION:
    @Override
    public int verCantidad() {
        // Devuelve la cantidad de materias cargadas en la carrera:
        int cantidad = 0;
        for (int i = 0; i < this.getColeccionMaterias().length; i++) {
            if (this.getColeccionMaterias()[i] != null) {
                cantidad++;
            }
        }
        return cantidad;
    }
    @Override
    public String listarContenidos() {
        String cadena = "";
        for (int i = 0; i < this.getColeccionMaterias().length; i++) {
            if (this.getColeccionMaterias()[i] != null) {
                cadena += this.getColeccionMaterias()[i].getNombre() + " ";
            }
        }
        return cadena;
    }
    @Override
    public String toString() {
        return "Carrera: " + this.getNombre() + " - Cantidad de materias: " + this.verCantidad() + " - Materias: " + this.listarContenidos();
    }
}
