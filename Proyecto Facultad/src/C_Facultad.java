public class C_Facultad {
    //ATRIBUTOS:
    private String nombre;
    private C_Carrera[] coleccionCarreras = new C_Carrera[0];

    //CONSTRUCTOR:
    public C_Facultad(String nombre, int numeroCarreras) {
        this.setNombre(nombre);
        this.setColeccionCarreras(new C_Carrera[numeroCarreras]);
    }

    //METODOS:
    //metodo agregar carrera a coleccionCarreras:
    public void agregarCarrera(C_Carrera carrera) {
        C_Carrera[] aux = new C_Carrera[this.getColeccionCarreras().length + 1];
        for (int i = 0; i < this.getColeccionCarreras().length; i++) {
            aux[i] = this.getColeccionCarreras()[i];
        }
        aux[aux.length - 1] = carrera;
        this.setColeccionCarreras(aux);
    }
    public void eliminarCarrera(String carrera) {
        //metodo eliminar carrera de coleccionCarreras:
        C_Carrera[] aux = new C_Carrera[this.getColeccionCarreras().length - 1];
        int j = 0;
        for (int i = 0; i < this.getColeccionCarreras().length; i++) {
            if (this.getColeccionCarreras()[i].getNombre().equals(carrera)) {
                aux[j] = this.getColeccionCarreras()[i];
                j++;
            }
        }
        this.setColeccionCarreras(aux);
    }
    public void eliminarEstudiante(C_Estudiante estudiante) {


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
