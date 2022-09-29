import java.util.Scanner;

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

    public void eliminarMateriaPorNombre(String nombre) {
        for (int i = 0; i < this.getColeccionMaterias().length; i++) {
            if (this.getColeccionMaterias()[i].getNombre().equals(nombre)) {
                System.out.println("Materia encontrada: " + this.getColeccionMaterias()[i].getNombre());
                System.out.println("Desea eliminarla? (s/n)");
                Scanner sc = new Scanner(System.in);
                String respuesta = sc.nextLine();
                if (respuesta.equals("s")) {
                    this.eliminarMateria(this.getColeccionMaterias()[i]);
                    System.out.println("Materia eliminada.");
                }
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
