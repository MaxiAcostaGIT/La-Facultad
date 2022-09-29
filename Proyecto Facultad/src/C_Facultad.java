public class C_Facultad implements I_Informacion{
    //ATRIBUTOS:
    private String nombre;
    private C_Carrera[] coleccionCarreras = new C_Carrera[0];

    //CONSTRUCTOR:
    public C_Facultad(String nombre, int numeroCarreras) {
        this.setNombre(nombre);
        this.setColeccionCarreras(new C_Carrera[numeroCarreras]);
    }

    //METODOS:
    public void agregarCarrera(C_Carrera carrera) {
        for (int i = 0; i < this.getColeccionCarreras().length; i++) {
            if (this.getColeccionCarreras()[i] == null) {
                this.getColeccionCarreras()[i] = carrera;
                break;
            }
        }
    }
    public void eliminarCarrera(C_Carrera carrera) {
        C_Carrera[] aux = new C_Carrera[this.getColeccionCarreras().length - 1];
        int j = 0;
        for (int i = 0; i < this.getColeccionCarreras().length; i++) {
            if (this.getColeccionCarreras()[i] != carrera) {
                aux[j] = this.getColeccionCarreras()[i];
                j++;
            }
        }
        this.setColeccionCarreras(aux);
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
    public void eliminarEstudiante(C_Estudiante estudiante) {
        // Eliminar Estudiantes de una facultad implica que se elimine el estudiante de cada una de las materias a las cuales se inscribió:
        for (int i = 0; i < this.getColeccionCarreras().length; i++) {
            if (this.getColeccionCarreras()[i] != null) {
                for (int j = 0; j < this.getColeccionCarreras()[i].getColeccionMaterias().length; j++) {
                    if (this.getColeccionCarreras()[i].getColeccionMaterias()[j] != null) {
                        for (int k = 0; k < this.getColeccionCarreras()[i].getColeccionMaterias()[j].getColeccionEstudiantes().length; k++) {
                            if (this.getColeccionCarreras()[i].getColeccionMaterias()[j].getColeccionEstudiantes()[k] != null) {
                                if (this.getColeccionCarreras()[i].getColeccionMaterias()[j].getColeccionEstudiantes()[k].getLegajo() == estudiante.getLegajo()) {
                                    this.getColeccionCarreras()[i].getColeccionMaterias()[j].eliminarEstudiante(k);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // INFORMACION:
    @Override
    public int verCantidad() {
        int cantidad = 0;
        for (int i = 0; i < this.getColeccionCarreras().length; i++) {
            if (this.getColeccionCarreras()[i] != null) {
                cantidad++;
            }
        }
        return cantidad;
    }
    @Override
    public String listarContenidos() {
        String lista = "";
        for (int i = 0; i < this.getColeccionCarreras().length; i++) {
            if (this.getColeccionCarreras()[i] != null) {
                lista += this.getColeccionCarreras()[i].getNombre() + " ";
            }
        }
        return lista;
    }
    @Override
    public String toString() {
        return "Facultad: " + this.getNombre() + " - Carreras: " + this.verCantidad() + " - " + this.listarContenidos();
    }
}
