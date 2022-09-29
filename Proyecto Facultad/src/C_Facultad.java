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
    } // FALTAN ESTOS METODOS

    // INFORMACION:
    @Override
    public int verCantidad() {
        // Devuelve la cantidad de carreras cargadas en la facultad:
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
