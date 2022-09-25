import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PERSONAS:
        C_Profesor profesor1 = new C_Profesor("Juan", "Perez", 123);
        C_Estudiante estudiante1 = new C_Estudiante("Maria", "Gomez", 456);

        // FACULTAD:
        C_Facultad facultad = new C_Facultad("UTN", 3);
        facultad.getColeccionCarreras()[0] = new C_Carrera("Ingenieria en Sistemas", 3);
        facultad.getColeccionCarreras()[0].getColeccionMaterias()[0] = new C_Materia("Programacion I", profesor1, 3);
        facultad.getColeccionCarreras()[0].getColeccionMaterias()[0].getColeccionEstudiantes()[0] = estudiante1;

        //TESTEO:
        System.out.println("Nombre de la facultad: " + facultad.getNombre());
        System.out.println("Nombre de la carrera: " + facultad.getColeccionCarreras()[0].getNombre());
        System.out.println("Nombre de la materia: " + facultad.getColeccionCarreras()[0].getColeccionMaterias()[0].getNombre());
        System.out.println("Nombre del profesor: " + facultad.getColeccionCarreras()[0].getColeccionMaterias()[0].getTitular().getNombre());
        System.out.println("Nombre del estudiante: " + facultad.getColeccionCarreras()[0].getColeccionMaterias()[0].getColeccionEstudiantes()[0].getNombre());

        // PROGRAMA:
        System.out.println("- GESTOR FACULTAD -");
        System.out.println();

        int opcion;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Modificar carreras");
            System.out.println("2. Modificar materias");
            System.out.println("3. Modificar profesores");
            System.out.println("4. Modificar estudiantes");
            System.out.println("5. Salir");
            System.out.println();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // CARRERAS
                    //MOSTRAMOS LAS CARRERAS:
                    System.out.println("Carreras:");
                    for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
                        if (facultad.getColeccionCarreras()[i] != null) {
                            System.out.println(i + ". " + facultad.getColeccionCarreras()[i].getNombre());
                        }
                    }
                    System.out.println();
                    System.out.println("Elija una opcion:");
                    System.out.println("1. Agregar carrera");
                    System.out.println("2. Eliminar carrera");
                    System.out.println("3. Volver");
                    System.out.println();
                    int opcionCarreras = scanner.nextInt();

                        switch (opcionCarreras) {
                            case 1: // AGREGAR CARRERA
                                if (opcionCarreras == 1 && facultad.getColeccionCarreras()[facultad.getColeccionCarreras().length - 1] != null) {
                                    System.out.println("No se pueden agregar mas carreras.");
                                    System.out.println();
                                } else {
                                    System.out.println("Ingrese el nombre de la carrera:");
                                    String nombreCarrera = scanner.next();
                                    System.out.println("Ingrese la cantidad de materias:");
                                    int cantidadMaterias = scanner.nextInt();
                                    C_Carrera carrera = new C_Carrera(nombreCarrera, cantidadMaterias);
                                    facultad.agregarCarrera(carrera);
                                    System.out.println("Carrera agregada.");
                                    System.out.println();
                                }
                                break;
                            case 2: // ELIMINAR CARRERA
                                System.out.println("Ingrese el numero de la carrera:");
                                int numeroCarrera = scanner.nextInt();
                                facultad.eliminarCarrera(facultad.getColeccionCarreras()[numeroCarrera]);
                                break;
                            case 3: // VOLVER
                                System.out.println("Volviendo...");
                                break;
                        }
                case 2: // MATERIAS

                    break;

                case 3: // PROFESORES

                    break;

                case 4: // ESTUDIANTES

                    break;

                case 5: // SALIR

                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 5);


        //mostrar coleccion de carreras:
        System.out.println();
        System.out.println("CARRERAS:");
        for (int i = 0; i < facultad.getColeccionCarreras().length; i++) {
            if (facultad.getColeccionCarreras()[i] != null) {
                System.out.println(facultad.getColeccionCarreras()[i].getNombre());
            }
        }


        System.out.println();
        System.out.println("Fin del programa");
    }
}
